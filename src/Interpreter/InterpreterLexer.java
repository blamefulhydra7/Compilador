// Generated from C:/Users/Leonardo/IdeaProjects/Analizador/src\Interpreter.g4 by ANTLR 4.10.1
package Interpreter;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class InterpreterLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		If=1, TipoDato=2, Print=3, Igual=4, ParentesisA=5, ParentesisB=6, LlaveA=7, 
		LlaveB=8, PuntoComa=9, OperadorLogico=10, OperadorAritmetico=11, Identificador=12, 
		Digitos=13, WHITE_SPACE=14;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"If", "TipoDato", "Print", "Igual", "ParentesisA", "ParentesisB", "LlaveA", 
			"LlaveB", "PuntoComa", "OperadorLogico", "OperadorAritmetico", "Identificador", 
			"Digitos", "WHITE_SPACE"
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


		public String tokens = "\tTokens\n";


	public InterpreterLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Interpreter.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 0:
			If_action((RuleContext)_localctx, actionIndex);
			break;
		case 1:
			TipoDato_action((RuleContext)_localctx, actionIndex);
			break;
		case 2:
			Print_action((RuleContext)_localctx, actionIndex);
			break;
		case 3:
			Igual_action((RuleContext)_localctx, actionIndex);
			break;
		case 4:
			ParentesisA_action((RuleContext)_localctx, actionIndex);
			break;
		case 5:
			ParentesisB_action((RuleContext)_localctx, actionIndex);
			break;
		case 6:
			LlaveA_action((RuleContext)_localctx, actionIndex);
			break;
		case 7:
			LlaveB_action((RuleContext)_localctx, actionIndex);
			break;
		case 8:
			PuntoComa_action((RuleContext)_localctx, actionIndex);
			break;
		case 9:
			OperadorLogico_action((RuleContext)_localctx, actionIndex);
			break;
		case 10:
			OperadorAritmetico_action((RuleContext)_localctx, actionIndex);
			break;
		case 11:
			Identificador_action((RuleContext)_localctx, actionIndex);
			break;
		case 12:
			Digitos_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void If_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			tokens = tokens + getText() + "\tIf\n";
			break;
		}
	}
	private void TipoDato_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			tokens = tokens + getText() + "\tTipo de dato\n";
			break;
		}
	}
	private void Print_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:
			tokens = tokens + getText() + "\tPrint\n";
			break;
		}
	}
	private void Igual_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3:
			tokens = tokens + getText() + "\tIgual\n";
			break;
		}
	}
	private void ParentesisA_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 4:
			tokens = tokens + getText() + "\tParéntesis apertura\n";
			break;
		}
	}
	private void ParentesisB_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 5:
			tokens = tokens + getText() + "\tParéntesis Cierre\n";
			break;
		}
	}
	private void LlaveA_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 6:
			tokens = tokens + getText() + "\tLlave apertura\n";
			break;
		}
	}
	private void LlaveB_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 7:
			tokens = tokens + getText() + "\tLlave cierre\n";
			break;
		}
	}
	private void PuntoComa_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 8:
			tokens = tokens + getText() + "\tPunto y coma\n";
			break;
		}
	}
	private void OperadorLogico_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 9:
			tokens = tokens + getText() + "\tOperador Lógico\n";
			break;
		}
	}
	private void OperadorAritmetico_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 10:
			tokens = tokens + getText() + "\tOperador Aritmético\n";
			break;
		}
	}
	private void Identificador_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 11:
			tokens = tokens + getText() + "\tIdentificador\n";
			break;
		}
	}
	private void Digitos_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 12:
			tokens = tokens + getText() + "\tDigitos\n";
			break;
		}
	}

	public static final String _serializedATN =
		"\u0004\u0000\u000ek\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\tN\b"+
		"\t\u0001\n\u0001\n\u0001\n\u0003\nS\b\n\u0001\u000b\u0001\u000b\u0005"+
		"\u000bW\b\u000b\n\u000b\f\u000bZ\t\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0004\f_\b\f\u000b\f\f\f`\u0001\f\u0001\f\u0001\r\u0004\rf\b\r\u000b"+
		"\r\f\rg\u0001\r\u0001\r\u0000\u0000\u000e\u0001\u0001\u0003\u0002\u0005"+
		"\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n"+
		"\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u0001\u0000\u0005\u0003\u0000"+
		"++--//\u0003\u0000AZ__az\u0004\u000009AZ__az\u0001\u000009\u0003\u0000"+
		"\t\n\r\r  s\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000"+
		"\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000"+
		"\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000"+
		"\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000"+
		"\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000"+
		"\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000"+
		"\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000"+
		"\u0001\u001d\u0001\u0000\u0000\u0000\u0003\"\u0001\u0000\u0000\u0000\u0005"+
		"(\u0001\u0000\u0000\u0000\u00070\u0001\u0000\u0000\u0000\t3\u0001\u0000"+
		"\u0000\u0000\u000b6\u0001\u0000\u0000\u0000\r9\u0001\u0000\u0000\u0000"+
		"\u000f<\u0001\u0000\u0000\u0000\u0011?\u0001\u0000\u0000\u0000\u0013M"+
		"\u0001\u0000\u0000\u0000\u0015R\u0001\u0000\u0000\u0000\u0017T\u0001\u0000"+
		"\u0000\u0000\u0019^\u0001\u0000\u0000\u0000\u001be\u0001\u0000\u0000\u0000"+
		"\u001d\u001e\u0005i\u0000\u0000\u001e\u001f\u0005f\u0000\u0000\u001f "+
		"\u0001\u0000\u0000\u0000 !\u0006\u0000\u0000\u0000!\u0002\u0001\u0000"+
		"\u0000\u0000\"#\u0005i\u0000\u0000#$\u0005n\u0000\u0000$%\u0005t\u0000"+
		"\u0000%&\u0001\u0000\u0000\u0000&\'\u0006\u0001\u0001\u0000\'\u0004\u0001"+
		"\u0000\u0000\u0000()\u0005p\u0000\u0000)*\u0005r\u0000\u0000*+\u0005i"+
		"\u0000\u0000+,\u0005n\u0000\u0000,-\u0005t\u0000\u0000-.\u0001\u0000\u0000"+
		"\u0000./\u0006\u0002\u0002\u0000/\u0006\u0001\u0000\u0000\u000001\u0005"+
		"=\u0000\u000012\u0006\u0003\u0003\u00002\b\u0001\u0000\u0000\u000034\u0005"+
		"(\u0000\u000045\u0006\u0004\u0004\u00005\n\u0001\u0000\u0000\u000067\u0005"+
		")\u0000\u000078\u0006\u0005\u0005\u00008\f\u0001\u0000\u0000\u00009:\u0005"+
		"{\u0000\u0000:;\u0006\u0006\u0006\u0000;\u000e\u0001\u0000\u0000\u0000"+
		"<=\u0005}\u0000\u0000=>\u0006\u0007\u0007\u0000>\u0010\u0001\u0000\u0000"+
		"\u0000?@\u0005;\u0000\u0000@A\u0006\b\b\u0000A\u0012\u0001\u0000\u0000"+
		"\u0000BC\u0005=\u0000\u0000CN\u0005=\u0000\u0000DE\u0005!\u0000\u0000"+
		"EN\u0005=\u0000\u0000FG\u0005>\u0000\u0000GN\u0005=\u0000\u0000HI\u0005"+
		"<\u0000\u0000IN\u0005=\u0000\u0000JN\u0005<\u0000\u0000KL\u0005>\u0000"+
		"\u0000LN\u0006\t\t\u0000MB\u0001\u0000\u0000\u0000MD\u0001\u0000\u0000"+
		"\u0000MF\u0001\u0000\u0000\u0000MH\u0001\u0000\u0000\u0000MJ\u0001\u0000"+
		"\u0000\u0000MK\u0001\u0000\u0000\u0000N\u0014\u0001\u0000\u0000\u0000"+
		"OS\u0007\u0000\u0000\u0000PQ\u0005*\u0000\u0000QS\u0006\n\n\u0000RO\u0001"+
		"\u0000\u0000\u0000RP\u0001\u0000\u0000\u0000S\u0016\u0001\u0000\u0000"+
		"\u0000TX\u0007\u0001\u0000\u0000UW\u0007\u0002\u0000\u0000VU\u0001\u0000"+
		"\u0000\u0000WZ\u0001\u0000\u0000\u0000XV\u0001\u0000\u0000\u0000XY\u0001"+
		"\u0000\u0000\u0000Y[\u0001\u0000\u0000\u0000ZX\u0001\u0000\u0000\u0000"+
		"[\\\u0006\u000b\u000b\u0000\\\u0018\u0001\u0000\u0000\u0000]_\u0007\u0003"+
		"\u0000\u0000^]\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000`^\u0001"+
		"\u0000\u0000\u0000`a\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000"+
		"bc\u0006\f\f\u0000c\u001a\u0001\u0000\u0000\u0000df\u0007\u0004\u0000"+
		"\u0000ed\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000ge\u0001\u0000"+
		"\u0000\u0000gh\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000ij\u0006"+
		"\r\r\u0000j\u001c\u0001\u0000\u0000\u0000\u0006\u0000MRX`g\u000e\u0001"+
		"\u0000\u0000\u0001\u0001\u0001\u0001\u0002\u0002\u0001\u0003\u0003\u0001"+
		"\u0004\u0004\u0001\u0005\u0005\u0001\u0006\u0006\u0001\u0007\u0007\u0001"+
		"\b\b\u0001\t\t\u0001\n\n\u0001\u000b\u000b\u0001\f\f\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}