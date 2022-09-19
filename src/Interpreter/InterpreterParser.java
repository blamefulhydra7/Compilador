// Generated from C:/Users/Leonardo/IdeaProjects/Analizador/src\Interpreter.g4 by ANTLR 4.10.1
package Interpreter;

	import recursos.Simbolo;
	import recursos.Mapa;
	import java.util.InputMismatchException;

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
		LlaveB=8, PuntoComa=9, OperadorLogico=10, OperadorAritmetico=11, Bools=12, 
		Identificador=13, Digitos=14, WHITE_SPACE=15;
	public static final int
		RULE_regla = 0, RULE_sentencias = 1, RULE_declaracion = 2, RULE_condicionIf = 3, 
		RULE_operacion = 4, RULE_operacionAritmetica = 5, RULE_imprimir = 6, RULE_auxOp = 7, 
		RULE_auxOpB = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"regla", "sentencias", "declaracion", "condicionIf", "operacion", "operacionAritmetica", 
			"imprimir", "auxOp", "auxOpB"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'if'", null, "'print'", "'='", "'('", "')'", "'{'", "'}'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "If", "TipoDato", "Print", "Igual", "ParentesisA", "ParentesisB", 
			"LlaveA", "LlaveB", "PuntoComa", "OperadorLogico", "OperadorAritmetico", 
			"Bools", "Identificador", "Digitos", "WHITE_SPACE"
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
	    private int tipoDato;

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
			setState(19); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(18);
				sentencias();
				}
				}
				setState(21); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << If) | (1L << TipoDato) | (1L << Print) | (1L << Identificador))) != 0) );
			setState(23);
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
			setState(29);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TipoDato:
				enterOuterAlt(_localctx, 1);
				{
				setState(25);
				declaracion();
				}
				break;
			case If:
				enterOuterAlt(_localctx, 2);
				{
				setState(26);
				condicionIf();
				}
				break;
			case Identificador:
				enterOuterAlt(_localctx, 3);
				{
				setState(27);
				operacion();
				}
				break;
			case Print:
				enterOuterAlt(_localctx, 4);
				{
				setState(28);
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
		public Token TipoDato;
		public Token Identificador;
		public Token Digitos;
		public Token Bools;
		public TerminalNode TipoDato() { return getToken(InterpreterParser.TipoDato, 0); }
		public TerminalNode Identificador() { return getToken(InterpreterParser.Identificador, 0); }
		public TerminalNode Igual() { return getToken(InterpreterParser.Igual, 0); }
		public TerminalNode PuntoComa() { return getToken(InterpreterParser.PuntoComa, 0); }
		public TerminalNode Digitos() { return getToken(InterpreterParser.Digitos, 0); }
		public TerminalNode Bools() { return getToken(InterpreterParser.Bools, 0); }
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
			setState(31);
			((DeclaracionContext)_localctx).TipoDato = match(TipoDato);
			setState(32);
			((DeclaracionContext)_localctx).Identificador = match(Identificador);
			setState(33);
			match(Igual);
			setState(38);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Digitos:
				{
				setState(34);
				((DeclaracionContext)_localctx).Digitos = match(Digitos);

				        if((((DeclaracionContext)_localctx).TipoDato!=null?((DeclaracionContext)_localctx).TipoDato.getText():null).equals("int"))
				        {
				            if(!mapa.agregarSimbolo(new Simbolo((((DeclaracionContext)_localctx).Identificador!=null?((DeclaracionContext)_localctx).Identificador.getText():null), Integer.parseInt((((DeclaracionContext)_localctx).Digitos!=null?((DeclaracionContext)_localctx).Digitos.getText():null)))))
				            {
				                mapa.addError("Attempted to add an already existing variable. Line: " + (((DeclaracionContext)_localctx).Identificador!=null?((DeclaracionContext)_localctx).Identificador.getLine():0));
				            }
				        }
				        else
				        {
				            mapa.addError("Integer value not compatible with Boolean variable, line: " + (((DeclaracionContext)_localctx).Digitos!=null?((DeclaracionContext)_localctx).Digitos.getLine():0));
				        }
				    
				}
				break;
			case Bools:
				{
				setState(36);
				((DeclaracionContext)_localctx).Bools = match(Bools);

				        if((((DeclaracionContext)_localctx).TipoDato!=null?((DeclaracionContext)_localctx).TipoDato.getText():null).equals("boolean"))
				        {
				            if(!mapa.agregarSimbolo(new Simbolo((((DeclaracionContext)_localctx).Identificador!=null?((DeclaracionContext)_localctx).Identificador.getText():null), ((((DeclaracionContext)_localctx).Bools!=null?((DeclaracionContext)_localctx).Bools.getText():null).equals("true")) ? true : false)))
				            {
				                mapa.addError("Attempted to add an already existing variable. Line: " + (((DeclaracionContext)_localctx).Bools!=null?((DeclaracionContext)_localctx).Bools.getLine():0));
				            }
				        }
				        else
				        {
				            mapa.addError("Boolean value not compatible with Integer variable. Line: " + (((DeclaracionContext)_localctx).Bools!=null?((DeclaracionContext)_localctx).Bools.getLine():0));
				        }
				    
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(40);
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
		public Token If;
		public AuxOpContext auxOp;
		public AuxOpBContext auxOpB;
		public TerminalNode If() { return getToken(InterpreterParser.If, 0); }
		public TerminalNode ParentesisA() { return getToken(InterpreterParser.ParentesisA, 0); }
		public TerminalNode ParentesisB() { return getToken(InterpreterParser.ParentesisB, 0); }
		public TerminalNode LlaveA() { return getToken(InterpreterParser.LlaveA, 0); }
		public TerminalNode LlaveB() { return getToken(InterpreterParser.LlaveB, 0); }
		public AuxOpContext auxOp() {
			return getRuleContext(AuxOpContext.class,0);
		}
		public TerminalNode OperadorLogico() { return getToken(InterpreterParser.OperadorLogico, 0); }
		public AuxOpBContext auxOpB() {
			return getRuleContext(AuxOpBContext.class,0);
		}
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
			setState(42);
			((CondicionIfContext)_localctx).If = match(If);
			setState(43);
			match(ParentesisA);
			setState(53);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(44);
				((CondicionIfContext)_localctx).auxOp = auxOp();

				        if(Integer.parseInt(((CondicionIfContext)_localctx).auxOp.identificador[1] + "") > 0)
				        {
				            if(Integer.parseInt(((CondicionIfContext)_localctx).auxOp.identificador[1] + "") != 2)
				            {
				                mapa.addError("Expecting boolean value, received Integer. Line: " + (((CondicionIfContext)_localctx).If!=null?((CondicionIfContext)_localctx).If.getLine():0));
				            }
				        }
				    
				}
				break;
			case 2:
				{
				setState(47);
				((CondicionIfContext)_localctx).auxOp = auxOp();

				        if(Integer.parseInt(((CondicionIfContext)_localctx).auxOp.identificador[1] + "") > 0)
				        {
				            if(Integer.parseInt(((CondicionIfContext)_localctx).auxOp.identificador[1] + "") != 1)
				            {
				                mapa.addError("Expecting Integer value, received Boolean. Line: " + (((CondicionIfContext)_localctx).If!=null?((CondicionIfContext)_localctx).If.getLine():0));
				            }
				        }
				    
				setState(49);
				match(OperadorLogico);
				setState(50);
				((CondicionIfContext)_localctx).auxOpB = auxOpB();

				        if(Integer.parseInt(((CondicionIfContext)_localctx).auxOpB.identificador[1] + "") > 0)
				        {
				            if(Integer.parseInt(((CondicionIfContext)_localctx).auxOpB.identificador[1] + "") != 1)
				            {
				                mapa.addError("Expecting Integer value, received Boolean. Line: " + (((CondicionIfContext)_localctx).If!=null?((CondicionIfContext)_localctx).If.getLine():0));
				            }
				        }
				    
				}
				break;
			}
			setState(55);
			match(ParentesisB);
			setState(56);
			match(LlaveA);
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << If) | (1L << TipoDato) | (1L << Print) | (1L << Identificador))) != 0)) {
				{
				{
				setState(57);
				sentencias();
				}
				}
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(63);
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
			setState(65);
			((OperacionContext)_localctx).Identificador = match(Identificador);
			setState(66);
			match(Igual);
			setState(73);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(67);
				((OperacionContext)_localctx).auxOp = auxOp();

				        if(mapa.existe((((OperacionContext)_localctx).Identificador!=null?((OperacionContext)_localctx).Identificador.getText():null)))
				        {
				            if(mapa.getSimbolo((((OperacionContext)_localctx).Identificador!=null?((OperacionContext)_localctx).Identificador.getText():null)).getTipo() == 1)
				            {
				                if(Integer.parseInt(((OperacionContext)_localctx).auxOp.identificador[1] + "") == 1)
				                {
				                    mapa.modificarSimbolo(new Simbolo((((OperacionContext)_localctx).Identificador!=null?((OperacionContext)_localctx).Identificador.getText():null), Integer.parseInt(((OperacionContext)_localctx).auxOp.identificador[0] + "")));
				                }
				                else
				                {
				                    mapa.addError("Expecting Integer and received Boolean. Line: " + (((OperacionContext)_localctx).Identificador!=null?((OperacionContext)_localctx).Identificador.getLine():0));
				                }
				            }
				            else
				            {
				                if(Integer.parseInt(((OperacionContext)_localctx).auxOp.identificador[1] + "") == 2)
				                {
				                    System.out.println("Debería estar cambiando el símbolo " + (((OperacionContext)_localctx).Identificador!=null?((OperacionContext)_localctx).Identificador.getText():null) + " " + Boolean.parseBoolean(((OperacionContext)_localctx).auxOp.identificador[0] + ""));
				                    mapa.modificarSimbolo(new Simbolo((((OperacionContext)_localctx).Identificador!=null?((OperacionContext)_localctx).Identificador.getText():null), Boolean.parseBoolean(((OperacionContext)_localctx).auxOp.identificador[0] + "")));
				                }
				                else
				                {
				                    mapa.addError("Expecting Boolean and received Integer. Line: " + (((OperacionContext)_localctx).Identificador!=null?((OperacionContext)_localctx).Identificador.getLine():0));
				                }
				            }
				        }
				        else
				        {
				            mapa.addError("Attempted access to unknown variable. Line: " + (((OperacionContext)_localctx).Identificador!=null?((OperacionContext)_localctx).Identificador.getLine():0));
				        }

				    
				}
				break;
			case 2:
				{
				setState(70);
				((OperacionContext)_localctx).operacionAritmetica = operacionAritmetica();

				        if(mapa.existe((((OperacionContext)_localctx).Identificador!=null?((OperacionContext)_localctx).Identificador.getText():null)))
				        {
				            if(mapa.getSimbolo((((OperacionContext)_localctx).Identificador!=null?((OperacionContext)_localctx).Identificador.getText():null)).getTipo() == 1)
				            {
				               if(((OperacionContext)_localctx).operacionAritmetica.valores[2] != null)
				               {
				                   mapa.modificarSimbolo(new Simbolo((((OperacionContext)_localctx).Identificador!=null?((OperacionContext)_localctx).Identificador.getText():null), Integer.parseInt(((OperacionContext)_localctx).operacionAritmetica.valores[2] + "")));
				               }
				            }
				            else
				            {
				                mapa.addError("Arithmetic operations are not allowed for Boolean variables. Line: " + (((OperacionContext)_localctx).Identificador!=null?((OperacionContext)_localctx).Identificador.getLine():0));
				            }
				        }
				        else
				        {
				            mapa.addError("Attempted access on unknown variable. Line: " + (((OperacionContext)_localctx).Identificador!=null?((OperacionContext)_localctx).Identificador.getLine():0));
				        }
				    
				}
				break;
			}
			setState(75);
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
			setState(77);
			((OperacionAritmeticaContext)_localctx).auxOp = auxOp();
			setState(78);
			((OperacionAritmeticaContext)_localctx).OperadorAritmetico = match(OperadorAritmetico);
			setState(83);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identificador:
				{
				setState(79);
				((OperacionAritmeticaContext)_localctx).Identificador = match(Identificador);

				    ((OperacionAritmeticaContext)_localctx).valores =  new Object[3];
				    if(Integer.parseInt(((OperacionAritmeticaContext)_localctx).auxOp.identificador[1] + "") == 1)
				    {
				        _localctx.valores[0] = ((OperacionAritmeticaContext)_localctx).auxOp.identificador[0];
				        if(mapa.getSimbolo((((OperacionAritmeticaContext)_localctx).Identificador!=null?((OperacionAritmeticaContext)_localctx).Identificador.getText():null)) != null)
				        {
				            if(mapa.getSimbolo((((OperacionAritmeticaContext)_localctx).Identificador!=null?((OperacionAritmeticaContext)_localctx).Identificador.getText():null)).getTipo() == 1)
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
				                mapa.addError("Expecting Integer and received Boolean value. Line: " + (((OperacionAritmeticaContext)_localctx).Identificador!=null?((OperacionAritmeticaContext)_localctx).Identificador.getLine():0));
				            }
				        }
				        else
				        {
				            mapa.addError("Attempted access on an unknown variable. Line: " + (((OperacionAritmeticaContext)_localctx).Identificador!=null?((OperacionAritmeticaContext)_localctx).Identificador.getLine():0));
				            _localctx.valores[2] = null;
				        }
				    }
				    else
				    {
				        mapa.addError("Expecting Integer value and received Boolean. Line: " + (((OperacionAritmeticaContext)_localctx).Identificador!=null?((OperacionAritmeticaContext)_localctx).Identificador.getLine():0));
				        _localctx.valores[2] = null;
				    }

				}
				break;
			case Digitos:
				{
				setState(81);
				((OperacionAritmeticaContext)_localctx).Digitos = match(Digitos);

				    ((OperacionAritmeticaContext)_localctx).valores =  new Object[3];
				    if(Integer.parseInt(((OperacionAritmeticaContext)_localctx).auxOp.identificador[1] + "") == 1)
				    {
				        _localctx.valores[0] = ((OperacionAritmeticaContext)_localctx).auxOp.identificador[0];
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
				    else
				    {
				        mapa.addError("Expecting Integer value and received Boolean. Line: " + (((OperacionAritmeticaContext)_localctx).Digitos!=null?((OperacionAritmeticaContext)_localctx).Digitos.getLine():0));
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
			setState(85);
			match(Print);
			setState(86);
			match(Identificador);
			setState(87);
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
		public Object [] identificador;
		public Token Identificador;
		public Token Digitos;
		public Token Bools;
		public TerminalNode Identificador() { return getToken(InterpreterParser.Identificador, 0); }
		public TerminalNode Digitos() { return getToken(InterpreterParser.Digitos, 0); }
		public TerminalNode Bools() { return getToken(InterpreterParser.Bools, 0); }
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
			setState(95);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identificador:
				enterOuterAlt(_localctx, 1);
				{
				setState(89);
				((AuxOpContext)_localctx).Identificador = match(Identificador);

					    if(mapa.existe((((AuxOpContext)_localctx).Identificador!=null?((AuxOpContext)_localctx).Identificador.getText():null)))
					    {
					        ((AuxOpContext)_localctx).identificador =  new Object[2];
				            _localctx.identificador[0] = mapa.getSimbolo((((AuxOpContext)_localctx).Identificador!=null?((AuxOpContext)_localctx).Identificador.getText():null)).getValor();
				            _localctx.identificador[1] = mapa.getSimbolo((((AuxOpContext)_localctx).Identificador!=null?((AuxOpContext)_localctx).Identificador.getText():null)).getTipo();
					    }
					    else
					    {
					        mapa.addError("Attempted access to unknown variable. Line: " + (((AuxOpContext)_localctx).Identificador!=null?((AuxOpContext)_localctx).Identificador.getLine():0));
					        _localctx.identificador[1] = -1;
					    }
					
				}
				break;
			case Digitos:
				enterOuterAlt(_localctx, 2);
				{
				setState(91);
				((AuxOpContext)_localctx).Digitos = match(Digitos);

					    ((AuxOpContext)_localctx).identificador =  new Object[2];
					    _localctx.identificador[0] = (((AuxOpContext)_localctx).Digitos!=null?((AuxOpContext)_localctx).Digitos.getText():null);
					    _localctx.identificador[1] = 1;
					
				}
				break;
			case Bools:
				enterOuterAlt(_localctx, 3);
				{
				setState(93);
				((AuxOpContext)_localctx).Bools = match(Bools);

					    ((AuxOpContext)_localctx).identificador =  new Object[2];
				        _localctx.identificador[0] = (((AuxOpContext)_localctx).Bools!=null?((AuxOpContext)_localctx).Bools.getText():null);
				        _localctx.identificador[1] = 2;
					
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

	public static class AuxOpBContext extends ParserRuleContext {
		public Object [] identificador;
		public Token Identificador;
		public Token Digitos;
		public Token Bools;
		public TerminalNode Identificador() { return getToken(InterpreterParser.Identificador, 0); }
		public TerminalNode Digitos() { return getToken(InterpreterParser.Digitos, 0); }
		public TerminalNode Bools() { return getToken(InterpreterParser.Bools, 0); }
		public AuxOpBContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_auxOpB; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).enterAuxOpB(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterpreterListener ) ((InterpreterListener)listener).exitAuxOpB(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterpreterVisitor ) return ((InterpreterVisitor<? extends T>)visitor).visitAuxOpB(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AuxOpBContext auxOpB() throws RecognitionException {
		AuxOpBContext _localctx = new AuxOpBContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_auxOpB);
		try {
			setState(103);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identificador:
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				((AuxOpBContext)_localctx).Identificador = match(Identificador);

				        if(mapa.existe((((AuxOpBContext)_localctx).Identificador!=null?((AuxOpBContext)_localctx).Identificador.getText():null)))
				        {
				            ((AuxOpBContext)_localctx).identificador =  new Object[2];
				            _localctx.identificador[0] = mapa.getSimbolo((((AuxOpBContext)_localctx).Identificador!=null?((AuxOpBContext)_localctx).Identificador.getText():null)).getValor();
				            _localctx.identificador[1] = mapa.getSimbolo((((AuxOpBContext)_localctx).Identificador!=null?((AuxOpBContext)_localctx).Identificador.getText():null)).getTipo();
				        }
				        else
				        {
				            mapa.addError("Attempted access to unknown variable. Line: " + (((AuxOpBContext)_localctx).Identificador!=null?((AuxOpBContext)_localctx).Identificador.getLine():0));
				            _localctx.identificador[0] = -1;
				        }
				    
				}
				break;
			case Digitos:
				enterOuterAlt(_localctx, 2);
				{
				setState(99);
				((AuxOpBContext)_localctx).Digitos = match(Digitos);

				        ((AuxOpBContext)_localctx).identificador =  new Object[2];
				        _localctx.identificador[0] = (((AuxOpBContext)_localctx).Digitos!=null?((AuxOpBContext)_localctx).Digitos.getText():null);
				        _localctx.identificador[1] = 1;
				    
				}
				break;
			case Bools:
				enterOuterAlt(_localctx, 3);
				{
				setState(101);
				((AuxOpBContext)_localctx).Bools = match(Bools);

				        ((AuxOpBContext)_localctx).identificador =  new Object[2];
				        _localctx.identificador[0] = (((AuxOpBContext)_localctx).Bools!=null?((AuxOpBContext)_localctx).Bools.getText():null);
				        _localctx.identificador[1] = 2;
				    
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
		"\u0004\u0001\u000fj\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0001\u0000\u0004\u0000\u0014\b\u0000\u000b\u0000\f\u0000\u0015"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001\u001e\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002\'\b\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0003\u00036\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003"+
		";\b\u0003\n\u0003\f\u0003>\t\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0003\u0004J\b\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005"+
		"T\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007"+
		"`\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\bh\b\b"+
		"\u0001\b\u0000\u0000\t\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0000"+
		"\u0000m\u0000\u0013\u0001\u0000\u0000\u0000\u0002\u001d\u0001\u0000\u0000"+
		"\u0000\u0004\u001f\u0001\u0000\u0000\u0000\u0006*\u0001\u0000\u0000\u0000"+
		"\bA\u0001\u0000\u0000\u0000\nM\u0001\u0000\u0000\u0000\fU\u0001\u0000"+
		"\u0000\u0000\u000e_\u0001\u0000\u0000\u0000\u0010g\u0001\u0000\u0000\u0000"+
		"\u0012\u0014\u0003\u0002\u0001\u0000\u0013\u0012\u0001\u0000\u0000\u0000"+
		"\u0014\u0015\u0001\u0000\u0000\u0000\u0015\u0013\u0001\u0000\u0000\u0000"+
		"\u0015\u0016\u0001\u0000\u0000\u0000\u0016\u0017\u0001\u0000\u0000\u0000"+
		"\u0017\u0018\u0005\u0000\u0000\u0001\u0018\u0001\u0001\u0000\u0000\u0000"+
		"\u0019\u001e\u0003\u0004\u0002\u0000\u001a\u001e\u0003\u0006\u0003\u0000"+
		"\u001b\u001e\u0003\b\u0004\u0000\u001c\u001e\u0003\f\u0006\u0000\u001d"+
		"\u0019\u0001\u0000\u0000\u0000\u001d\u001a\u0001\u0000\u0000\u0000\u001d"+
		"\u001b\u0001\u0000\u0000\u0000\u001d\u001c\u0001\u0000\u0000\u0000\u001e"+
		"\u0003\u0001\u0000\u0000\u0000\u001f \u0005\u0002\u0000\u0000 !\u0005"+
		"\r\u0000\u0000!&\u0005\u0004\u0000\u0000\"#\u0005\u000e\u0000\u0000#\'"+
		"\u0006\u0002\uffff\uffff\u0000$%\u0005\f\u0000\u0000%\'\u0006\u0002\uffff"+
		"\uffff\u0000&\"\u0001\u0000\u0000\u0000&$\u0001\u0000\u0000\u0000\'(\u0001"+
		"\u0000\u0000\u0000()\u0005\t\u0000\u0000)\u0005\u0001\u0000\u0000\u0000"+
		"*+\u0005\u0001\u0000\u0000+5\u0005\u0005\u0000\u0000,-\u0003\u000e\u0007"+
		"\u0000-.\u0006\u0003\uffff\uffff\u0000.6\u0001\u0000\u0000\u0000/0\u0003"+
		"\u000e\u0007\u000001\u0006\u0003\uffff\uffff\u000012\u0005\n\u0000\u0000"+
		"23\u0003\u0010\b\u000034\u0006\u0003\uffff\uffff\u000046\u0001\u0000\u0000"+
		"\u00005,\u0001\u0000\u0000\u00005/\u0001\u0000\u0000\u000067\u0001\u0000"+
		"\u0000\u000078\u0005\u0006\u0000\u00008<\u0005\u0007\u0000\u00009;\u0003"+
		"\u0002\u0001\u0000:9\u0001\u0000\u0000\u0000;>\u0001\u0000\u0000\u0000"+
		"<:\u0001\u0000\u0000\u0000<=\u0001\u0000\u0000\u0000=?\u0001\u0000\u0000"+
		"\u0000><\u0001\u0000\u0000\u0000?@\u0005\b\u0000\u0000@\u0007\u0001\u0000"+
		"\u0000\u0000AB\u0005\r\u0000\u0000BI\u0005\u0004\u0000\u0000CD\u0003\u000e"+
		"\u0007\u0000DE\u0006\u0004\uffff\uffff\u0000EJ\u0001\u0000\u0000\u0000"+
		"FG\u0003\n\u0005\u0000GH\u0006\u0004\uffff\uffff\u0000HJ\u0001\u0000\u0000"+
		"\u0000IC\u0001\u0000\u0000\u0000IF\u0001\u0000\u0000\u0000JK\u0001\u0000"+
		"\u0000\u0000KL\u0005\t\u0000\u0000L\t\u0001\u0000\u0000\u0000MN\u0003"+
		"\u000e\u0007\u0000NS\u0005\u000b\u0000\u0000OP\u0005\r\u0000\u0000PT\u0006"+
		"\u0005\uffff\uffff\u0000QR\u0005\u000e\u0000\u0000RT\u0006\u0005\uffff"+
		"\uffff\u0000SO\u0001\u0000\u0000\u0000SQ\u0001\u0000\u0000\u0000T\u000b"+
		"\u0001\u0000\u0000\u0000UV\u0005\u0003\u0000\u0000VW\u0005\r\u0000\u0000"+
		"WX\u0005\t\u0000\u0000X\r\u0001\u0000\u0000\u0000YZ\u0005\r\u0000\u0000"+
		"Z`\u0006\u0007\uffff\uffff\u0000[\\\u0005\u000e\u0000\u0000\\`\u0006\u0007"+
		"\uffff\uffff\u0000]^\u0005\f\u0000\u0000^`\u0006\u0007\uffff\uffff\u0000"+
		"_Y\u0001\u0000\u0000\u0000_[\u0001\u0000\u0000\u0000_]\u0001\u0000\u0000"+
		"\u0000`\u000f\u0001\u0000\u0000\u0000ab\u0005\r\u0000\u0000bh\u0006\b"+
		"\uffff\uffff\u0000cd\u0005\u000e\u0000\u0000dh\u0006\b\uffff\uffff\u0000"+
		"ef\u0005\f\u0000\u0000fh\u0006\b\uffff\uffff\u0000ga\u0001\u0000\u0000"+
		"\u0000gc\u0001\u0000\u0000\u0000ge\u0001\u0000\u0000\u0000h\u0011\u0001"+
		"\u0000\u0000\u0000\t\u0015\u001d&5<IS_g";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}