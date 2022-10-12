import Interpreter.InterpreterLexer;
import Interpreter.InterpreterParser;
import org.antlr.v4.runtime.CommonTokenStream;
import recursos.Mapa;
import recursos.Simbolo;

import java.awt.*;

public class Intermedio
{
    CommonTokenStream tokens;
    InterpreterParser parser;
    InterpreterLexer lexer;
    ErrorCatcher errores;


    String codigo;
    public String generadorCodigoIntermedio()
    {
            codigo =
                    "\t .MODEL\t small\n" +
                            ".DATA\n\n"
                            + "lsajdsa" +"\n"
                            + ".CODE\n\n"
                            + "Main\t PROC\n"
                            + "\t  .STARTUP\n\n"
                            + "Main\t ENDP";
        return codigo;
    }

    public String tipoVariable()
    {

        String tipoDato;
        /*
        if(parser.mapa.getSimbolo()== "Boolean")
        {
            tipoDato()= "DB"
        }
        else if(parser.mapa.getSimbolo()== "Int")
        {
        tipoDato()= "DW"
        }
        * */
        return tipoDato="parser.getGrammarFileName()";
    }
    public String getOperaciones() {
    String Operacion;
       /* if()
        {

        }
        else if ()
        {

        } else if ()
        {

        }
        else if()
        {

        }
        */
        return Operacion="";
    }


}
