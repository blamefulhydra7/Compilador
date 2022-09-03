// Generated from C:/Users/Leonardo/IdeaProjects/Analizador/src\Interpreter.g4 by ANTLR 4.10.1
package Interpreter;

	import recursos.Simbolo;
	import recursos.Mapa;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class InterpreterParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		If=1, TipoDato=2, Print=3, Igual=4, ParentesisA=5, ParentesisB=6, LlaveA=7, 
		LlaveB=8, PuntoComa=9, OperadorLogico=10, OperadorAritmetico=11, Identificador=12, 
		Digitos=13, WHITE_SPACE=14;
	public static final int
		RULE_regla = 0, RULE_sentencias = 1, RULE_declaracion = 2, RULE_condicionIf = 3, 
		RULE_operacion = 4, RULE_operacionAritmetica = 5, RULE_imprimir = 6, RULE_auxOp = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"regla", "sentencias", "declaracion", "condicionIf", "operacion", "operacionAritmetica", 
			"imprimir", "auxOp"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'if'", "'int'", "'print'", "'='", "'('", "')'", "'{'", "'}'", 
			"';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "If", "TipoDato", "Print", "Igual", "ParentesisA", "ParentesisB", 
			"LlaveA", "LlaveB", "PuntoComa", "OperadorLogico", "OperadorAritmetico", 
			"Identificador", "Digitos", "WHITE_SPACE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Interpreter.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    public Mapa mapa = new Mapa();

	public InterpreterParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ReglaContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(InterpreterParser.EOF, 0); }
		public List<SentenciasContext> sentencias() {
			return getRuleContexts(SentenciasContext.class);
		}
		public SentenciasContext sentencias(int i) {
			return getRuleContext(SentenciasContext.class,i);
		}
		public ReglaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regla; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).enterRegla(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).exitRegla(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreterVisitor ) return ((InterpreterVisitor<? extends T>)visitor).visitRegla(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReglaContext regla() throws RecognitionException {
		ReglaContext _localctx = new ReglaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_regla);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(17); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(16);
				sentencias();
				}
				}
				setState(19); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << If) | (1L << TipoDato) | (1L << Print) | (1L << Identificador))) != 0) );
			setState(21);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SentenciasContext extends ParserRuleContext {
		public DeclaracionContext declaracion() {
			return getRuleContext(DeclaracionContext.class,0);
		}
		public CondicionIfContext condicionIf() {
			return getRuleContext(CondicionIfContext.class,0);
		}
		public OperacionContext operacion() {
			return getRuleContext(OperacionContext.class,0);
		}
		public ImprimirContext imprimir() {
			return getRuleContext(ImprimirContext.class,0);
		}
		public SentenciasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).enterSentencias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).exitSentencias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreterVisitor ) return ((InterpreterVisitor<? extends T>)visitor).visitSentencias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenciasContext sentencias() throws RecognitionException {
		SentenciasContext _localctx = new SentenciasContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sentencias);
		try {
			setState(27);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TipoDato:
				enterOuterAlt(_localctx, 1);
				{
				setState(23);
				declaracion();
				}
				break;
			case If:
				enterOuterAlt(_localctx, 2);
				{
				setState(24);
				condicionIf();
				}
				break;
			case Identificador:
				enterOuterAlt(_localctx, 3);
				{
				setState(25);
				operacion();
				}
				break;
			case Print:
				enterOuterAlt(_localctx, 4);
				{
				setState(26);
				imprimir();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclaracionContext extends ParserRuleContext {
		public Token Identificador;
		public Token Digitos;
		public TerminalNode TipoDato() { return getToken(InterpreterParser.TipoDato, 0); }
		public TerminalNode Identificador() { return getToken(InterpreterParser.Identificador, 0); }
		public TerminalNode Igual() { return getToken(InterpreterParser.Igual, 0); }
		public TerminalNode Digitos() { return getToken(InterpreterParser.Digitos, 0); }
		public TerminalNode PuntoComa() { return getToken(InterpreterParser.PuntoComa, 0); }
		public DeclaracionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).enterDeclaracion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).exitDeclaracion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreterVisitor ) return ((InterpreterVisitor<? extends T>)visitor).visitDeclaracion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracionContext declaracion() throws RecognitionException {
		DeclaracionContext _localctx = new DeclaracionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaracion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			match(TipoDato);
			setState(30);
			((DeclaracionContext)_localctx).Identificador = match(Identificador);
			setState(31);
			match(Igual);
			setState(32);
			((DeclaracionContext)_localctx).Digitos = match(Digitos);
			if(!mapa.agregarSimbolo(new Simbolo((((DeclaracionContext)_localctx).Identificador!=null?((DeclaracionContext)_localctx).Identificador.getText():null), Integer.parseInt((((DeclaracionContext)_localctx).Digitos!=null?((DeclaracionContext)_localctx).Digitos.getText():null))))) System.err.println("Error en la línea: " + (((DeclaracionContext)_localctx).Identificador!=null?((DeclaracionContext)_localctx).Identificador.getLine():0));
			setState(34);
			match(PuntoComa);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CondicionIfContext extends ParserRuleContext {
		public TerminalNode If() { return getToken(InterpreterParser.If, 0); }
		public TerminalNode ParentesisA() { return getToken(InterpreterParser.ParentesisA, 0); }
		public List<AuxOpContext> auxOp() {
			return getRuleContexts(AuxOpContext.class);
		}
		public AuxOpContext auxOp(int i) {
			return getRuleContext(AuxOpContext.class,i);
		}
		public TerminalNode OperadorLogico() { return getToken(InterpreterParser.OperadorLogico, 0); }
		public TerminalNode ParentesisB() { return getToken(InterpreterParser.ParentesisB, 0); }
		public TerminalNode LlaveA() { return getToken(InterpreterParser.LlaveA, 0); }
		public TerminalNode LlaveB() { return getToken(InterpreterParser.LlaveB, 0); }
		public List<SentenciasContext> sentencias() {
			return getRuleContexts(SentenciasContext.class);
		}
		public SentenciasContext sentencias(int i) {
			return getRuleContext(SentenciasContext.class,i);
		}
		public CondicionIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicionIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).enterCondicionIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).exitCondicionIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreterVisitor ) return ((InterpreterVisitor<? extends T>)visitor).visitCondicionIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicionIfContext condicionIf() throws RecognitionException {
		CondicionIfContext _localctx = new CondicionIfContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_condicionIf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			match(If);
			setState(37);
			match(ParentesisA);
			setState(38);
			auxOp();
			setState(39);
			match(OperadorLogico);
			setState(40);
			auxOp();
			setState(41);
			match(ParentesisB);
			setState(42);
			match(LlaveA);
			setState(46);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << If) | (1L << TipoDato) | (1L << Print) | (1L << Identificador))) != 0)) {
				{
				{
				setState(43);
				sentencias();
				}
				}
				setState(48);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(49);
			match(LlaveB);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperacionContext extends ParserRuleContext {
		public Token Identificador;
		public AuxOpContext auxOp;
		public OperacionAritmeticaContext operacionAritmetica;
		public TerminalNode Identificador() { return getToken(InterpreterParser.Identificador, 0); }
		public TerminalNode Igual() { return getToken(InterpreterParser.Igual, 0); }
		public TerminalNode PuntoComa() { return getToken(InterpreterParser.PuntoComa, 0); }
		public AuxOpContext auxOp() {
			return getRuleContext(AuxOpContext.class,0);
		}
		public OperacionAritmeticaContext operacionAritmetica() {
			return getRuleContext(OperacionAritmeticaContext.class,0);
		}
		public OperacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).enterOperacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).exitOperacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreterVisitor ) return ((InterpreterVisitor<? extends T>)visitor).visitOperacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperacionContext operacion() throws RecognitionException {
		OperacionContext _localctx = new OperacionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_operacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			((OperacionContext)_localctx).Identificador = match(Identificador);
			setState(52);
			match(Igual);
			setState(59);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(53);
				((OperacionContext)_localctx).auxOp = auxOp();

				    if(!mapa.modificarSimbolo(new Simbolo((((OperacionContext)_localctx).Identificador!=null?((OperacionContext)_localctx).Identificador.getText():null), Integer.parseInt(((OperacionContext)_localctx).auxOp.identificador + "")))) System.err.println("Error en la línea: " + (((OperacionContext)_localctx).Identificador!=null?((OperacionContext)_localctx).Identificador.getLine():0));

				}
				break;
			case 2:
				{
				setState(56);
				((OperacionContext)_localctx).operacionAritmetica = operacionAritmetica();

				    if(((OperacionContext)_localctx).operacionAritmetica.valores[2] != null)
				    {
				        if(!mapa.modificarSimbolo(new Simbolo((((OperacionContext)_localctx).Identificador!=null?((OperacionContext)_localctx).Identificador.getText():null), Integer.parseInt(((OperacionContext)_localctx).operacionAritmetica.valores[2] + "")))) System.err.println("Error en la línea: " + (((OperacionContext)_localctx).Identificador!=null?((OperacionContext)_localctx).Identificador.getLine():0));
				    }

				}
				break;
			}
			setState(61);
			match(PuntoComa);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperacionAritmeticaContext extends ParserRuleContext {
		public Object[] valores;
		public AuxOpContext auxOp;
		public Token OperadorAritmetico;
		public Token Identificador;
		public Token Digitos;
		public AuxOpContext auxOp() {
			return getRuleContext(AuxOpContext.class,0);
		}
		public TerminalNode OperadorAritmetico() { return getToken(InterpreterParser.OperadorAritmetico, 0); }
		public TerminalNode Identificador() { return getToken(InterpreterParser.Identificador, 0); }
		public TerminalNode Digitos() { return getToken(InterpreterParser.Digitos, 0); }
		public OperacionAritmeticaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operacionAritmetica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).enterOperacionAritmetica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).exitOperacionAritmetica(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreterVisitor ) return ((InterpreterVisitor<? extends T>)visitor).visitOperacionAritmetica(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperacionAritmeticaContext operacionAritmetica() throws RecognitionException {
		OperacionAritmeticaContext _localctx = new OperacionAritmeticaContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_operacionAritmetica);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			((OperacionAritmeticaContext)_localctx).auxOp = auxOp();
			setState(64);
			((OperacionAritmeticaContext)_localctx).OperadorAritmetico = match(OperadorAritmetico);
			setState(69);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identificador:
				{
				setState(65);
				((OperacionAritmeticaContext)_localctx).Identificador = match(Identificador);

				    ((OperacionAritmeticaContext)_localctx).valores =  new Object[3];
				    _localctx.valores[0] = ((OperacionAritmeticaContext)_localctx).auxOp.identificador;
				    _localctx.valores[1] = mapa.getSimbolo((((OperacionAritmeticaContext)_localctx).Identificador!=null?((OperacionAritmeticaContext)_localctx).Identificador.getText():null));
				    if(_localctx.valores[1] != null)
				    {
				        _localctx.valores[1] = mapa.getSimbolo((((OperacionAritmeticaContext)_localctx).Identificador!=null?((OperacionAritmeticaContext)_localctx).Identificador.getText():null)).getValor();
				        int v1 = Integer.parseInt(_localctx.valores[0] + "");
				        int v2 = Integer.parseInt(_localctx.valores[1] + "");
				        String op = (((OperacionAritmeticaContext)_localctx).OperadorAritmetico!=null?((OperacionAritmeticaContext)_localctx).OperadorAritmetico.getText():null);
				        switch(op)
				        {
				            case "+" -> {
				                _localctx.valores[2] = v1 + v2;
				            }
				            case "-" -> {
				                _localctx.valores[2] = v1 - v2;
				            }
				            case "*" -> {
				                _localctx.valores[2] = v1 * v2;
				            }
				            default -> {
				                _localctx.valores[2] = v1 / v2;
				            }
				        }
				    }
				    else
				    {
				        _localctx.valores[2] = null;
				        System.err.println("Error en línea: " + (((OperacionAritmeticaContext)_localctx).Identificador!=null?((OperacionAritmeticaContext)_localctx).Identificador.getLine():0));
				    }

				}
				break;
			case Digitos:
				{
				setState(67);
				((OperacionAritmeticaContext)_localctx).Digitos = match(Digitos);

				    ((OperacionAritmeticaContext)_localctx).valores =  new Object[3];
				    _localctx.valores[0] = ((OperacionAritmeticaContext)_localctx).auxOp.identificador;
				    int v1 = Integer.parseInt(_localctx.valores[0] + "");
				    int v2 = Integer.parseInt((((OperacionAritmeticaContext)_localctx).Digitos!=null?((OperacionAritmeticaContext)_localctx).Digitos.getText():null));
				    String op = (((OperacionAritmeticaContext)_localctx).OperadorAritmetico!=null?((OperacionAritmeticaContext)_localctx).OperadorAritmetico.getText():null);
				    switch(op)
				    {
				        case "+" -> {
				            _localctx.valores[2] = v1 + v2;
				        }
				        case "-" -> {
				            _localctx.valores[2] = v1 - v2;
				        }
				        case "*" -> {
				            _localctx.valores[2] = v1 * v2;
				        }
				        default -> {
				            _localctx.valores[2] = v1 / v2;
				        }
				    }

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImprimirContext extends ParserRuleContext {
		public TerminalNode Print() { return getToken(InterpreterParser.Print, 0); }
		public TerminalNode Identificador() { return getToken(InterpreterParser.Identificador, 0); }
		public TerminalNode PuntoComa() { return getToken(InterpreterParser.PuntoComa, 0); }
		public ImprimirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imprimir; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).enterImprimir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).exitImprimir(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreterVisitor ) return ((InterpreterVisitor<? extends T>)visitor).visitImprimir(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImprimirContext imprimir() throws RecognitionException {
		ImprimirContext _localctx = new ImprimirContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_imprimir);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(Print);
			setState(72);
			match(Identificador);
			setState(73);
			match(PuntoComa);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AuxOpContext extends ParserRuleContext {
		public Object identificador;
		public Token Identificador;
		public Token Digitos;
		public TerminalNode Identificador() { return getToken(InterpreterParser.Identificador, 0); }
		public TerminalNode Digitos() { return getToken(InterpreterParser.Digitos, 0); }
		public AuxOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_auxOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).enterAuxOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).exitAuxOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreterVisitor ) return ((InterpreterVisitor<? extends T>)visitor).visitAuxOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AuxOpContext auxOp() throws RecognitionException {
		AuxOpContext _localctx = new AuxOpContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_auxOp);
		try {
			setState(79);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identificador:
				enterOuterAlt(_localctx, 1);
				{
				setState(75);
				((AuxOpContext)_localctx).Identificador = match(Identificador);

					    if(mapa.existe((((AuxOpContext)_localctx).Identificador!=null?((AuxOpContext)_localctx).Identificador.getText():null)))
					    {
						    ((AuxOpContext)_localctx).identificador =  mapa.getSimbolo((((AuxOpContext)_localctx).Identificador!=null?((AuxOpContext)_localctx).Identificador.getText():null)).getValor();
					    }
					    else
					    {
					        System.err.println("Se intentó acceder a símbolo inexistente en la línea: " + (((AuxOpContext)_localctx).Identificador!=null?((AuxOpContext)_localctx).Identificador.getLine():0));
					        ((AuxOpContext)_localctx).identificador =  -1;
					    }
					
				}
				break;
			case Digitos:
				enterOuterAlt(_localctx, 2);
				{
				setState(77);
				((AuxOpContext)_localctx).Digitos = match(Digitos);

					    ((AuxOpContext)_localctx).identificador =  (((AuxOpContext)_localctx).Digitos!=null?((AuxOpContext)_localctx).Digitos.getText():null);
					
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u000eR\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0001"+
		"\u0000\u0004\u0000\u0012\b\u0000\u000b\u0000\f\u0000\u0013\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"\u001c\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003-\b\u0003"+
		"\n\u0003\f\u00030\t\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0003\u0004<\b\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005F\b\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0003\u0007P\b\u0007\u0001\u0007\u0000\u0000"+
		"\b\u0000\u0002\u0004\u0006\b\n\f\u000e\u0000\u0000Q\u0000\u0011\u0001"+
		"\u0000\u0000\u0000\u0002\u001b\u0001\u0000\u0000\u0000\u0004\u001d\u0001"+
		"\u0000\u0000\u0000\u0006$\u0001\u0000\u0000\u0000\b3\u0001\u0000\u0000"+
		"\u0000\n?\u0001\u0000\u0000\u0000\fG\u0001\u0000\u0000\u0000\u000eO\u0001"+
		"\u0000\u0000\u0000\u0010\u0012\u0003\u0002\u0001\u0000\u0011\u0010\u0001"+
		"\u0000\u0000\u0000\u0012\u0013\u0001\u0000\u0000\u0000\u0013\u0011\u0001"+
		"\u0000\u0000\u0000\u0013\u0014\u0001\u0000\u0000\u0000\u0014\u0015\u0001"+
		"\u0000\u0000\u0000\u0015\u0016\u0005\u0000\u0000\u0001\u0016\u0001\u0001"+
		"\u0000\u0000\u0000\u0017\u001c\u0003\u0004\u0002\u0000\u0018\u001c\u0003"+
		"\u0006\u0003\u0000\u0019\u001c\u0003\b\u0004\u0000\u001a\u001c\u0003\f"+
		"\u0006\u0000\u001b\u0017\u0001\u0000\u0000\u0000\u001b\u0018\u0001\u0000"+
		"\u0000\u0000\u001b\u0019\u0001\u0000\u0000\u0000\u001b\u001a\u0001\u0000"+
		"\u0000\u0000\u001c\u0003\u0001\u0000\u0000\u0000\u001d\u001e\u0005\u0002"+
		"\u0000\u0000\u001e\u001f\u0005\f\u0000\u0000\u001f \u0005\u0004\u0000"+
		"\u0000 !\u0005\r\u0000\u0000!\"\u0006\u0002\uffff\uffff\u0000\"#\u0005"+
		"\t\u0000\u0000#\u0005\u0001\u0000\u0000\u0000$%\u0005\u0001\u0000\u0000"+
		"%&\u0005\u0005\u0000\u0000&\'\u0003\u000e\u0007\u0000\'(\u0005\n\u0000"+
		"\u0000()\u0003\u000e\u0007\u0000)*\u0005\u0006\u0000\u0000*.\u0005\u0007"+
		"\u0000\u0000+-\u0003\u0002\u0001\u0000,+\u0001\u0000\u0000\u0000-0\u0001"+
		"\u0000\u0000\u0000.,\u0001\u0000\u0000\u0000./\u0001\u0000\u0000\u0000"+
		"/1\u0001\u0000\u0000\u00000.\u0001\u0000\u0000\u000012\u0005\b\u0000\u0000"+
		"2\u0007\u0001\u0000\u0000\u000034\u0005\f\u0000\u00004;\u0005\u0004\u0000"+
		"\u000056\u0003\u000e\u0007\u000067\u0006\u0004\uffff\uffff\u00007<\u0001"+
		"\u0000\u0000\u000089\u0003\n\u0005\u00009:\u0006\u0004\uffff\uffff\u0000"+
		":<\u0001\u0000\u0000\u0000;5\u0001\u0000\u0000\u0000;8\u0001\u0000\u0000"+
		"\u0000<=\u0001\u0000\u0000\u0000=>\u0005\t\u0000\u0000>\t\u0001\u0000"+
		"\u0000\u0000?@\u0003\u000e\u0007\u0000@E\u0005\u000b\u0000\u0000AB\u0005"+
		"\f\u0000\u0000BF\u0006\u0005\uffff\uffff\u0000CD\u0005\r\u0000\u0000D"+
		"F\u0006\u0005\uffff\uffff\u0000EA\u0001\u0000\u0000\u0000EC\u0001\u0000"+
		"\u0000\u0000F\u000b\u0001\u0000\u0000\u0000GH\u0005\u0003\u0000\u0000"+
		"HI\u0005\f\u0000\u0000IJ\u0005\t\u0000\u0000J\r\u0001\u0000\u0000\u0000"+
		"KL\u0005\f\u0000\u0000LP\u0006\u0007\uffff\uffff\u0000MN\u0005\r\u0000"+
		"\u0000NP\u0006\u0007\uffff\uffff\u0000OK\u0001\u0000\u0000\u0000OM\u0001"+
		"\u0000\u0000\u0000P\u000f\u0001\u0000\u0000\u0000\u0006\u0013\u001b.;"+
		"EO";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}