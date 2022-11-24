import Interpreter.InterpreterBaseVisitor;
import Interpreter.InterpreterLexer;
import Interpreter.InterpreterParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.misc.ParseCancellationException;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class Compilador extends JFrame implements ActionListener {
    JMenuBar barra;
    JMenu mnArchivo, mnGramatica, mnScanner, mnParser, mnLimpiar, mnCodigoIntermedio, mnCodigoObjeto;
    JMenuItem mniAbrir, mniImprimirG, mniScan, mniParse, mniLimpiar, mniCodigoIntermedio,mniCodigoObjeto;
    JTextArea txtPrograma, txtTokens, txtMensaje, txtIntermedio, txtObjeto;
    JScrollPane scPrograma, scMensaje, scTokens, scIntermedio, scObjeto;
    JLabel lblPrograma, lblLexico, lblMensaje, lblIntermedio, lblObjeto;
    CommonTokenStream tokens;
    InterpreterParser parser;
    InterpreterLexer lexer;
    ErrorCatcher errores;
    InterpreterParser producciones;
    Boolean codInt=false;
    String codigo;

    public Compilador() {
        super("Compilador");
        hazInterfaz();
        hazEscuchas();

        setVisible(true);
    }

    private void hazInterfaz() {
        setSize(1135, 650);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(null);

        errores = new ErrorCatcher();

        barra = new JMenuBar();
        setJMenuBar(barra);

        mnArchivo = new JMenu("Archivo");
        mnArchivo.setMnemonic('A');
        barra.add(mnArchivo);

        mnGramatica = new JMenu("Gramática");
        mnGramatica.setMnemonic('G');
        barra.add(mnGramatica);

        mnScanner = new JMenu("Scanner");
        mnScanner.setMnemonic('S');
        barra.add(mnScanner);

        mnParser = new JMenu("Parser");
        mnParser.setMnemonic('P');
        barra.add(mnParser);

        mnLimpiar = new JMenu("Limpiar");
        mnLimpiar.setMnemonic('L');
        barra.add(mnLimpiar);

        mnCodigoIntermedio = new JMenu("Código Intermedio");
        mnLimpiar.setMnemonic('C');
        barra.add(mnCodigoIntermedio);

        mnCodigoObjeto = new JMenu("Código Objeto");
        mnLimpiar.setMnemonic('O');
        barra.add(mnCodigoObjeto);

        mniAbrir = new JMenuItem("Abrir archivo");
        mnArchivo.add(mniAbrir);

        mniLimpiar = new JMenuItem("Limpiar textos");
        mnLimpiar.add(mniLimpiar);

        mniScan = new JMenuItem("Escanear programa");
        mnScanner.add(mniScan);

        mniImprimirG = new JMenuItem("Imprimir grmática");
        mnGramatica.add(mniImprimirG);

        mniParse = new JMenuItem("Analizar sintaxis");
        mnParser.add(mniParse);

        mniCodigoIntermedio = new JMenuItem("Generar código intermedio");
        mnCodigoIntermedio.add(mniCodigoIntermedio);

        mniCodigoObjeto = new JMenuItem("Generar código objeto");
        mnCodigoObjeto.add(mniCodigoObjeto);

        lblPrograma = new JLabel("Programa:");
        lblPrograma.setBounds(30, 15, 100, 15);
        add(lblPrograma);

        lblLexico = new JLabel("Analísis Léxico:");
        lblLexico.setBounds(300, 15, 100, 15);
        add(lblLexico);

        lblIntermedio = new JLabel("Codigo Intermedio");
        lblIntermedio.setBounds(570, 15, 130, 15);
        add(lblIntermedio);

        lblObjeto = new JLabel("Codigo Objeto");
        lblObjeto.setBounds(840, 15, 130, 15);
        add(lblObjeto);

        lblMensaje = new JLabel("Output:");
        lblMensaje.setBounds(30, 435, 100, 15);
        add(lblMensaje);

        txtPrograma = new JTextArea();
        scPrograma = new JScrollPane(txtPrograma);
        scPrograma.setBounds(30, 30, 250, 400);

        txtMensaje = new JTextArea();
        txtMensaje.setEditable(false);
        scMensaje = new JScrollPane(txtMensaje);
        scMensaje.setBounds(30, 450, 1060, 120);

        txtTokens = new JTextArea();
        txtTokens.setEditable(false);
        scTokens = new JScrollPane(txtTokens);
        scTokens.setBounds(300, 30, 250, 400);

        txtIntermedio = new JTextArea();
        txtIntermedio.setEditable(false);
        scIntermedio = new JScrollPane(txtIntermedio);
        scIntermedio.setBounds(570, 30, 250, 400);

        txtObjeto = new JTextArea();
        txtObjeto.setEditable(false);
        scObjeto = new JScrollPane(txtObjeto);
        scObjeto.setBounds(840, 30, 250, 400);

        add(scObjeto);
        add(scIntermedio);
        add(scPrograma);
        add(scMensaje);
        add(scTokens);
    }

    private void hazEscuchas() {
        mniParse.addActionListener(this);
        mniScan.addActionListener(this);
        mniLimpiar.addActionListener(this);
        mniAbrir.addActionListener(this);
        mniImprimirG.addActionListener(this);
        mniCodigoIntermedio.addActionListener(this);
        mniCodigoObjeto.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == mniAbrir) {
            JFileChooser chooser = new JFileChooser();
            chooser.showOpenDialog(null);
            File archivo = new File(chooser.getSelectedFile().getAbsolutePath());

            try {
                String ST = new String(Files.readAllBytes(archivo.toPath()));
                txtPrograma.setText(ST);
                mnScanner.setEnabled(true);
                mnParser.setEnabled(true);
            } catch (IOException ex) {
                System.err.println(ex.getMessage());
            }
            return;
        }
        if (e.getSource() == mniImprimirG) {
            txtTokens.setText("");
            txtMensaje.setText("");
            mnParser.setEnabled(false);
            mnScanner.setEnabled(false);
            mnCodigoIntermedio.setEnabled(false);
            File archivo = new File("./src/gramatica.txt");
            try {
                String ST = new String(Files.readAllBytes(archivo.toPath()));
                txtPrograma.setText(ST);

            } catch (IOException ex) {
                System.err.println(ex.getMessage());
            }
            return;
        }
        if (e.getSource() == mniScan) {
            if (txtPrograma.getText().trim().equals("")) {
                txtMensaje.setForeground(Color.red);
                txtMensaje.setText("No escribió nada en el texto del programa.");
                return;
            }
            txtTokens.setText("");
            txtMensaje.setText("");
            errores.clean();
            try {
                CharStream in = CharStreams.fromString(txtPrograma.getText());
                lexer = new InterpreterLexer(in);
                lexer.removeErrorListeners();
                lexer.addErrorListener(errores);
                tokens = new CommonTokenStream(lexer);
                parser = new InterpreterParser(tokens);
                parser.removeErrorListeners();
                InterpreterParser.ReglaContext tree = parser.regla();
                InterpreterBaseVisitor<Object> visitor = new InterpreterBaseVisitor<>();
                visitor.visit(tree);
                txtMensaje.setForeground(Color.green);
                txtMensaje.setText("Análisis correcto.");
            } catch (ParseCancellationException ex) {
                txtMensaje.setForeground(Color.red);
                txtMensaje.setText(errores.getErrorInfo());
            } finally {

                txtTokens.setText(lexer.tokens);
                txtIntermedio.setText("");
            }
            return;
        }
        if (e.getSource() == mniParse) {
            if (txtPrograma.getText().trim().equals("")) {
                txtMensaje.setForeground(Color.red);
                txtMensaje.setText("No escribió nada en el texto del programa.");
                return;
            }
            txtTokens.setText("");
            txtMensaje.setText("");
            errores.clean();
            try {
                CharStream in = CharStreams.fromString(txtPrograma.getText());
                lexer = new InterpreterLexer(in);
                lexer.removeErrorListeners();
                tokens = new CommonTokenStream(lexer);
                parser = new InterpreterParser(tokens);
                parser.removeErrorListeners();
                parser.addErrorListener(errores);
                InterpreterParser.ReglaContext tree = parser.regla();
                InterpreterBaseVisitor<Object> visitor = new InterpreterBaseVisitor<>();
                visitor.visit(tree);
                txtMensaje.setText("Análisis correcto.");
                txtMensaje.setForeground(Color.green);
                codInt=true;
            } catch (ParseCancellationException ex) {
                txtMensaje.setText(errores.getErrorInfo());
                txtMensaje.setForeground(Color.red);

            } finally {
                txtTokens.setText(lexer.tokens + "\n" + parser.mapa.imprimirMapa());

                if (!parser.mapa.errores.equals("")) {
                    txtMensaje.setText(errores.getErrorInfo() + "\n" + parser.mapa.errores);
                    txtMensaje.setForeground(Color.red);
                    codInt=false;
                }
                txtIntermedio.setText("");
            }
            return;
        }

        if (e.getSource() == mniCodigoIntermedio) {
            if (txtPrograma.getText().trim().equals("")) {
                txtMensaje.setForeground(Color.red);
                txtMensaje.setText("No escribió nada en el texto del programa.");
                return;
            }
            txtTokens.setText("");
            txtMensaje.setText("");
            errores.clean();
            try {
                CharStream in = CharStreams.fromString(txtPrograma.getText());
                lexer = new InterpreterLexer(in);
                lexer.removeErrorListeners();
                tokens = new CommonTokenStream(lexer);
                parser = new InterpreterParser(tokens);
                parser.removeErrorListeners();
                parser.addErrorListener(errores);
                InterpreterParser.ReglaContext tree = parser.regla();
                InterpreterBaseVisitor<Object> visitor = new InterpreterBaseVisitor<>();
                visitor.visit(tree);
                txtMensaje.setText("Análisis correcto.");
                txtMensaje.setForeground(Color.green);
                codInt=true;
            } catch (ParseCancellationException ex) {
                txtMensaje.setText(errores.getErrorInfo());
                txtMensaje.setForeground(Color.red);
                codInt=false;
            } finally {
                txtTokens.setText(lexer.tokens + "\n" + parser.mapa.imprimirMapa());

                if (!parser.mapa.errores.equals("")) {
                    txtMensaje.setText(errores.getErrorInfo() + "\n" + parser.mapa.errores);
                    txtMensaje.setForeground(Color.red);
                    codInt = false;
                }
                if(codInt) {

                    txtIntermedio.setForeground(Color.BLACK);
                    txtIntermedio.setText(generadorCodigoIntermedio());

                }
                else {
                    txtIntermedio.setForeground(Color.RED);
                    txtIntermedio.setText("No se pudo generar el codigo intermedio,\nhay errores en el codigo fuente");
                }
            }


        }
        if (e.getSource() == mniCodigoObjeto) {
            txtObjeto.setText("Hola, soy el campo de codigo objeto \n" +
                    "Se necesita programa aun mi parte");
        }
        if (e.getSource() == mniLimpiar) {
            txtPrograma.setText("");
            txtTokens.setText("");
            txtMensaje.setText("");
            mnParser.setEnabled(true);
            mnScanner.setEnabled(true);
            txtIntermedio.setText("");
            mnCodigoIntermedio.setEnabled(true);
        }

    }

    public String generadorCodigoIntermedio() {


        codigo =
                "\t .MODEL\t small\n"
                        + parser.data + "\n" + "\n"
                        + parser.code + "\n"
                        + "Main\t ENDP";
        return codigo;
    }
    public String generadorCodigoObjeto() {


        codigo =
                "\t 00101110 01101101 01101111 01100100 01100101 01101100 00100000 01110011 01101101 01100001 01101100 01101100\n"
                        + parser.binData + "\n" + "\n"
                        + parser.binCode + "\n"
                        + "01001101 01100001 01101001 01101110 00100000 01000101 01101110 01100100 01010000 01110010 01101111 01100011";
        return codigo;
    }


}
