import Interpreter.InterpreterBaseVisitor;
import Interpreter.InterpreterLexer;
import Interpreter.InterpreterParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.ParseCancellationException;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.util.InputMismatchException;

public class Compilador extends JFrame implements ActionListener {
    JMenuBar barra;
    JMenu mnArchivo, mnGramatica, mnScanner, mnParser, mnLimpiar;
    JMenuItem mniAbrir, mniImprimirG, mniScan, mniParse, mniLimpiar;
    JTextArea txtPrograma, txtTokens, txtMensaje;
    JScrollPane scPrograma, scMensaje, scTokens;
    JLabel lblPrograma, lblMensaje;
    CommonTokenStream tokens;
    InterpreterParser parser;
    InterpreterLexer lexer;
    ErrorCatcher errores;

    public Compilador ()
    {
        super("Compilador");
        hazInterfaz();
        hazEscuchas();

        setVisible(true);
    }
    private void hazInterfaz()
    {
        setSize(600, 700);
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

        lblPrograma = new JLabel("Programa:");
        lblPrograma.setBounds(30, 15, 100, 15);
        add(lblPrograma);

        lblMensaje = new JLabel("Output:");
        lblMensaje.setBounds(30, 435, 100, 15);
        add(lblMensaje);

        txtPrograma = new JTextArea();
        scPrograma = new JScrollPane(txtPrograma);
        scPrograma.setBounds(30, 30, 250, 400);

        txtMensaje = new JTextArea();
        txtMensaje.setEditable(false);
        scMensaje = new JScrollPane(txtMensaje);
        scMensaje.setBounds(30, 450, 525, 100);

        txtTokens = new JTextArea();
        txtTokens.setEditable(false);
        scTokens = new JScrollPane(txtTokens);
        scTokens.setBounds(300, 30, 250, 400);

        add(scPrograma);
        add(scMensaje);
        add(scTokens);
    }

    private void hazEscuchas()
    {
        mniParse.addActionListener(this);
        mniScan.addActionListener(this);
        mniLimpiar.addActionListener(this);
        mniAbrir.addActionListener(this);
        mniImprimirG.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == mniAbrir)
        {
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
        if (e.getSource() == mniImprimirG)
        {
            txtTokens.setText("");
            txtMensaje.setText("");
            mnParser.setEnabled(false);
            mnScanner.setEnabled(false);
            File archivo = new File("./src/gramatica.txt");
            try {
                String ST = new String(Files.readAllBytes(archivo.toPath()));
                txtPrograma.setText(ST);

            } catch (IOException ex) {
                System.err.println(ex.getMessage());
            }
            return;
        }
        if (e.getSource() == mniScan)
        {
            if (txtPrograma.getText().trim().equals(""))
            {
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
                txtMensaje.setText("Análisis correcto.");
                txtMensaje.setForeground(Color.green);
            }
            catch (ParseCancellationException ex)
            {
                txtMensaje.setText(errores.getErrorInfo());
                txtMensaje.setForeground(Color.red);
            }
            finally {
                txtTokens.setText(lexer.tokens);
            }
            return;
        }
        if (e.getSource() == mniParse)
        {
            if (txtPrograma.getText().trim().equals(""))
            {
                txtMensaje.setText("No escribió nada en el texto del programa.");
                txtMensaje.setForeground(Color.red);
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
            }
            catch (ParseCancellationException ex)
            {
                txtMensaje.setText(errores.getErrorInfo());
                txtMensaje.setForeground(Color.red);
            }
            finally {
                txtTokens.setText(lexer.tokens + "\n" + parser.mapa.imprimirMapa());
                if(!parser.mapa.errores.equals(""))
                {
                    txtMensaje.setText(errores.getErrorInfo() + "\n" + parser.mapa.errores);
                    txtMensaje.setForeground(Color.red);
                }
            }
            return;
        }
        if (e.getSource() == mniLimpiar)
        {
            txtPrograma.setText("");
            txtTokens.setText("");
            txtMensaje.setText("");
            mnParser.setEnabled(true);
            mnScanner.setEnabled(true);
        }
    }
}
