grammar Interpreter;
@parser::header{
	import recursos.Simbolo;
	import recursos.Mapa;
	import java.util.InputMismatchException;
}
@lexer::members{
	public String tokens = "\tTokens\n";
}

@parser::members{
    public Mapa mapa = new Mapa();
}

regla : sentencias+ EOF;

sentencias : declaracion | condicionIf | operacion | imprimir;

declaracion : TipoDato Identificador Igual Digitos {if(!mapa.agregarSimbolo(new Simbolo($Identificador.text, Integer.parseInt($Digitos.text)))) System.err.println("Error en la línea: " + $Identificador.line);} PuntoComa ;

condicionIf : If ParentesisA  auxOp OperadorLogico auxOp ParentesisB LlaveA sentencias* LlaveB;

operacion :  Identificador Igual  (auxOp {
    if(!mapa.modificarSimbolo(new Simbolo($Identificador.text, Integer.parseInt($auxOp.identificador + "")))) System.err.println("Error en la línea: " + $Identificador.line);
} | operacionAritmetica {
    if($operacionAritmetica.valores[2] != null)
    {
        if(!mapa.modificarSimbolo(new Simbolo($Identificador.text, Integer.parseInt($operacionAritmetica.valores[2] + "")))) System.err.println("Error en la línea: " + $Identificador.line);
    }
}) PuntoComa;

operacionAritmetica returns [Object[] valores] : auxOp OperadorAritmetico (Identificador  {
    $valores = new Object[3];
    $valores[0] = $auxOp.identificador;
    $valores[1] = mapa.getSimbolo($Identificador.text);
    if($valores[1] != null)
    {
        $valores[1] = mapa.getSimbolo($Identificador.text).getValor();
        int v1 = Integer.parseInt($valores[0] + "");
        int v2 = Integer.parseInt($valores[1] + "");
        String op = $OperadorAritmetico.text;
        switch(op)
        {
            case "+" -> {
                $valores[2] = v1 + v2;
            }
            case "-" -> {
                $valores[2] = v1 - v2;
            }
            case "*" -> {
                $valores[2] = v1 * v2;
            }
            default -> {
                $valores[2] = v1 / v2;
            }
        }
    }
    else
    {
        $valores[2] = null;
        System.err.println("Error en línea: " + $Identificador.line);
    }
} | Digitos {
    $valores = new Object[3];
    $valores[0] = $auxOp.identificador;
    int v1 = Integer.parseInt($valores[0] + "");
    int v2 = Integer.parseInt($Digitos.text);
    String op = $OperadorAritmetico.text;
    switch(op)
    {
        case "+" -> {
            $valores[2] = v1 + v2;
        }
        case "-" -> {
            $valores[2] = v1 - v2;
        }
        case "*" -> {
            $valores[2] = v1 * v2;
        }
        default -> {
            $valores[2] = v1 / v2;
        }
    }
});

imprimir : Print Identificador PuntoComa;

auxOp returns [Object identificador]:
	Identificador {
	    if(mapa.existe($Identificador.text))
	    {
		    $identificador = mapa.getSimbolo($Identificador.text).getValor();
	    }
	    else
	    {
	        System.err.println("Se intentó acceder a símbolo inexistente en la línea: " + $Identificador.line);
	        $identificador = -1;
	    }
	}
	| Digitos {
	    $identificador = $Digitos.text;
	}
;

If : 'if' {tokens = tokens + getText() + "\tIf\n";};
TipoDato : 'int' | 'boolean' {tokens = tokens + getText() + "\tTipo de dato\n";};
Print : 'print' {tokens = tokens + getText() + "\tPrint\n";};
Igual : '=' {tokens = tokens + getText() + "\tIgual\n";};
ParentesisA : '(' {tokens = tokens + getText() + "\tParéntesis apertura\n";};
ParentesisB : ')' {tokens = tokens + getText() + "\tParéntesis Cierre\n";};
LlaveA : '{' {tokens = tokens + getText() + "\tLlave apertura\n";};
LlaveB : '}' {tokens = tokens + getText() + "\tLlave cierre\n";};
PuntoComa : ';' {tokens = tokens + getText() + "\tPunto y coma\n";};
OperadorLogico : '==' | '!=' | '>=' | '<=' | '<' | '>' {tokens = tokens + getText() + "\tOperador Lógico\n";};
OperadorAritmetico : '+' | '-' | '/' | '*' {tokens = tokens + getText() + "\tOperador Aritmético\n";};
Identificador: [a-zA-Z_]([a-zA-Z0-9_])* {tokens = tokens + getText() + "\tIdentificador\n";};
Digitos : [0-9]+ {tokens = tokens + getText() + "\tDigitos\n";};
Bools : 'true' | 'false';
WHITE_SPACE : [ \t\r\n]+ -> skip;