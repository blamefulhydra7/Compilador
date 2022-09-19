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
    private int tipoDato;
}

regla : sentencias+ EOF;

sentencias : declaracion | condicionIf | operacion | imprimir;

declaracion:
    TipoDato Identificador Igual
    (Digitos {
        if($TipoDato.text.equals("int"))
        {
            if(!mapa.agregarSimbolo(new Simbolo($Identificador.text, Integer.parseInt($Digitos.text))))
            {
                mapa.addError("Attempted to add an already existing variable. Line: " + $Identificador.line);
            }
        }
        else
        {
            mapa.addError("Integer value not compatible with Boolean variable, line: " + $Digitos.line);
        }
    }
    | Bools {
        if($TipoDato.text.equals("boolean"))
        {
            if(!mapa.agregarSimbolo(new Simbolo($Identificador.text, ($Bools.text.equals("true")) ? true : false)))
            {
                mapa.addError("Attempted to add an already existing variable. Line: " + $Bools.line);
            }
        }
        else
        {
            mapa.addError("Boolean value not compatible with Integer variable. Line: " + $Bools.line);
        }
    })
    PuntoComa;

condicionIf : If ParentesisA (
    auxOp
    {
        if(Integer.parseInt($auxOp.identificador[1] + "") > 0)
        {
            if(Integer.parseInt($auxOp.identificador[1] + "") != 2)
            {
                mapa.addError("Expecting boolean value, received Integer. Line: " + $If.line);
            }
        }
    }
    | auxOp
    {
        if(Integer.parseInt($auxOp.identificador[1] + "") > 0)
        {
            if(Integer.parseInt($auxOp.identificador[1] + "") != 1)
            {
                mapa.addError("Expecting Integer value, received Boolean. Line: " + $If.line);
            }
        }
    }OperadorLogico auxOpB
    {
        if(Integer.parseInt($auxOpB.identificador[1] + "") > 0)
        {
            if(Integer.parseInt($auxOpB.identificador[1] + "") != 1)
            {
                mapa.addError("Expecting Integer value, received Boolean. Line: " + $If.line);
            }
        }
    }) ParentesisB LlaveA sentencias* LlaveB;

operacion :  Identificador Igual
    (auxOp {
        if(mapa.existe($Identificador.text))
        {
            if(mapa.getSimbolo($Identificador.text).getTipo() == 1)
            {
                if(Integer.parseInt($auxOp.identificador[1] + "") == 1)
                {
                    mapa.modificarSimbolo(new Simbolo($Identificador.text, Integer.parseInt($auxOp.identificador[0] + "")));
                }
                else
                {
                    mapa.addError("Expecting Integer and received Boolean. Line: " + $Identificador.line);
                }
            }
            else
            {
                if(Integer.parseInt($auxOp.identificador[1] + "") == 2)
                {
                    mapa.modificarSimbolo(new Simbolo($Identificador.text, Boolean.parseBoolean($auxOp.identificador[0] + "")));
                }
                else
                {
                    mapa.addError("Expecting Boolean and received Integer. Line: " + $Identificador.line);
                }
            }
        }
        else
        {
            mapa.addError("Attempted access to unknown variable. Line: " + $Identificador.line);
        }

    } | operacionAritmetica {
        if(mapa.existe($Identificador.text))
        {
            if(mapa.getSimbolo($Identificador.text).getTipo() == 1)
            {
               if($operacionAritmetica.valores[2] != null)
               {
                   mapa.modificarSimbolo(new Simbolo($Identificador.text, Integer.parseInt($operacionAritmetica.valores[2] + "")));
               }
            }
            else
            {
                mapa.addError("Arithmetic operations are not allowed for Boolean variables. Line: " + $Identificador.line);
            }
        }
        else
        {
            mapa.addError("Attempted access on unknown variable. Line: " + $Identificador.line);
        }
    }) PuntoComa;

operacionAritmetica returns [Object[] valores] : auxOp OperadorAritmetico (Identificador  {
    $valores = new Object[3];
    if(Integer.parseInt($auxOp.identificador[1] + "") == 1)
    {
        $valores[0] = $auxOp.identificador[0];
        if(mapa.getSimbolo($Identificador.text) != null)
        {
            if(mapa.getSimbolo($Identificador.text).getTipo() == 1)
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
                mapa.addError("Expecting Integer and received Boolean value. Line: " + $Identificador.line);
            }
        }
        else
        {
            mapa.addError("Attempted access on an unknown variable. Line: " + $Identificador.line);
            $valores[2] = null;
        }
    }
    else
    {
        mapa.addError("Expecting Integer value and received Boolean. Line: " + $Identificador.line);
        $valores[2] = null;
    }
} | Digitos {
    $valores = new Object[3];
    if(Integer.parseInt($auxOp.identificador[1] + "") == 1)
    {
        $valores[0] = $auxOp.identificador[0];
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
    }
    else
    {
        mapa.addError("Expecting Integer value and received Boolean. Line: " + $Digitos.line);
    }
});

imprimir : Print Identificador PuntoComa;

auxOp returns [Object identificador[]]:
	Identificador {
	    if(mapa.existe($Identificador.text))
	    {
	        $identificador = new Object[2];
            $identificador[0] = mapa.getSimbolo($Identificador.text).getValor();
            $identificador[1] = mapa.getSimbolo($Identificador.text).getTipo();
	    }
	    else
	    {
	        mapa.addError("Attempted access to unknown variable. Line: " + $Identificador.line);
	        $identificador[1] = -1;
	    }
	}
	| Digitos {
	    $identificador = new Object[2];
	    $identificador[0] = $Digitos.text;
	    $identificador[1] = 1;
	}
	| Bools {
	    $identificador = new Object[2];
        $identificador[0] = $Bools.text;
        $identificador[1] = 2;
	};

auxOpB returns [Object identificador[]]:
    Identificador {
        if(mapa.existe($Identificador.text))
        {
            $identificador = new Object[2];
            $identificador[0] = mapa.getSimbolo($Identificador.text).getValor();
            $identificador[1] = mapa.getSimbolo($Identificador.text).getTipo();
        }
        else
        {
            mapa.addError("Attempted access to unknown variable. Line: " + $Identificador.line);
            $identificador[0] = -1;
        }
    }
    | Digitos {
        $identificador = new Object[2];
        $identificador[0] = $Digitos.text;
        $identificador[1] = 1;
    }
    | Bools {
        $identificador = new Object[2];
        $identificador[0] = $Bools.text;
        $identificador[1] = 2;
    };

If : 'if' {tokens = tokens + getText() + "\tIf\n";};
TipoDato : 'int' {tokens = tokens + getText() + "\tTipo de dato\n";} | 'boolean' {tokens = tokens + getText() + "\tTipo de dato\n";};
Print : 'print' {tokens = tokens + getText() + "\tPrint\n";};
Igual : '=' {tokens = tokens + getText() + "\tIgual\n";};
ParentesisA : '(' {tokens = tokens + getText() + "\tParéntesis apertura\n";};
ParentesisB : ')' {tokens = tokens + getText() + "\tParéntesis Cierre\n";};
LlaveA : '{' {tokens = tokens + getText() + "\tLlave apertura\n";};
LlaveB : '}' {tokens = tokens + getText() + "\tLlave cierre\n";};
PuntoComa : ';' {tokens = tokens + getText() + "\tPunto y coma\n";};
OperadorLogico : '==' {tokens = tokens + getText() + "\tOperador Lógico\n";} | '!=' {tokens = tokens + getText() + "\tOperador Lógico\n";} | '>=' {tokens = tokens + getText() + "\tOperador Lógico\n";} | '<=' {tokens = tokens + getText() + "\tOperador Lógico\n";} | '<' {tokens = tokens + getText() + "\tOperador Lógico\n";} | '>' {tokens = tokens + getText() + "\tOperador Lógico\n";};
OperadorAritmetico : '+' {tokens = tokens + getText() + "\tOperador Aritmético\n";} | '-' {tokens = tokens + getText() + "\tOperador Aritmético\n";} | '/' {tokens = tokens + getText() + "\tOperador Aritmético\n";} | '*' {tokens = tokens + getText() + "\tOperador Aritmético\n";};
Bools : 'true' {tokens = tokens + getText() + "\tBoleanos\n";} | 'false' {tokens = tokens + getText() + "\tBoleanos\n";};
Identificador: [a-zA-Z_]([a-zA-Z0-9_])* {tokens = tokens + getText() + "\tIdentificador\n";};
Digitos : [0-9]+ {tokens = tokens + getText() + "\tDigitos\n";};
WHITE_SPACE : [ \t\r\n]+ -> skip;