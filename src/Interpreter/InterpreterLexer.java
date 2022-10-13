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
		LlaveB=8, PuntoComa=9, OperadorLogico=10, OperadorAritmetico=11, Bools=12, 
		Identificador=13, Digitos=14, WHITE_SPACE=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"If", "TipoDato", "Print", "Igual", "ParentesisA", "ParentesisB", "LlaveA", 
			"LlaveB", "PuntoComa", "OperadorLogico", "OperadorAritmetico", "Bools", 
			"Identificador", "Digitos", "WHITE_SPACE"
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
			Bools_action((RuleContext)_localctx, actionIndex);
			break;
		case 12:
			Identificador_action((RuleContext)_localctx, actionIndex);
			break;
		case 13:
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
		case 2:
			tokens = tokens + getText() + "\tTipo de dato\n";
			break;
		}
	}
	private void Print_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3:
			tokens = tokens + getText() + "\tPrint\n";
			break;
		}
	}
	private void Igual_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 4:
			tokens = tokens + getText() + "\tIgual\n";
			break;
		}
	}
	private void ParentesisA_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 5:
			tokens = tokens + getText() + "\tParéntesis apertura\n";
			break;
		}
	}
	private void ParentesisB_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 6:
			tokens = tokens + getText() + "\tParéntesis Cierre\n";
			break;
		}
	}
	private void LlaveA_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 7:
			tokens = tokens + getText() + "\tLlave apertura\n";
			break;
		}
	}
	private void LlaveB_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 8:
			tokens = tokens + getText() + "\tLlave cierre\n";
			break;
		}
	}
	private void PuntoComa_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 9:
			tokens = tokens + getText() + "\tPunto y coma\n";
			break;
		}
	}
	private void OperadorLogico_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 10:
			tokens = tokens + getText() + "\tOperador Lógico\n";
			break;
		case 11:
			tokens = tokens + getText() + "\tOperador Lógico\n";
			break;
		case 12:
			tokens = tokens + getText() + "\tOperador Lógico\n";
			break;
		case 13:
			tokens = tokens + getText() + "\tOperador Lógico\n";
			break;
		case 14:
			tokens = tokens + getText() + "\tOperador Lógico\n";
			break;
		case 15:
			tokens = tokens + getText() + "\tOperador Lógico\n";
			break;
		}
	}
	private void OperadorAritmetico_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 16:
			tokens = tokens + getText() + "\tOperador Aritmético\n";
			break;
		case 17:
			tokens = tokens + getText() + "\tOperador Aritmético\n";
			break;
		case 18:
			tokens = tokens + getText() + "\tOperador Aritmético\n";
			break;
		case 19:
			tokens = tokens + getText() + "\tOperador Aritmético\n";
			break;
		}
	}
	private void Bools_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 20:
			tokens = tokens + getText() + "\tBoleanos\n";
			break;
		case 21:
			tokens = tokens + getText() + "\tBoleanos\n";
			break;
		}
	}
	private void Identificador_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 22:
			tokens = tokens + getText() + "\tIdentificador\n";
			break;
		}
	}
	private void Digitos_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 23:
			tokens = tokens + getText() + "\tDigitos\n";
			break;
		}
	}

	public static final String _serializedATN =
		"\u0004\u0000\u000f\u0094\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u00013\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003"+
		"\tc\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0003\nm\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0003\u000b|\b\u000b\u0001\f\u0001\f\u0005"+
		"\f\u0080\b\f\n\f\f\f\u0083\t\f\u0001\f\u0001\f\u0001\r\u0004\r\u0088\b"+
		"\r\u000b\r\f\r\u0089\u0001\r\u0001\r\u0001\u000e\u0004\u000e\u008f\b\u000e"+
		"\u000b\u000e\f\u000e\u0090\u0001\u000e\u0001\u000e\u0000\u0000\u000f\u0001"+
		"\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007"+
		"\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d"+
		"\u000f\u0001\u0000\u0004\u0003\u0000AZ__az\u0004\u000009AZ__az\u0001\u0000"+
		"09\u0003\u0000\t\n\r\r  \u00a0\u0000\u0001\u0001\u0000\u0000\u0000\u0000"+
		"\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000"+
		"\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b"+
		"\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001"+
		"\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001"+
		"\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001"+
		"\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001"+
		"\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0001\u001f\u0001"+
		"\u0000\u0000\u0000\u00032\u0001\u0000\u0000\u0000\u00054\u0001\u0000\u0000"+
		"\u0000\u0007<\u0001\u0000\u0000\u0000\t?\u0001\u0000\u0000\u0000\u000b"+
		"B\u0001\u0000\u0000\u0000\rE\u0001\u0000\u0000\u0000\u000fH\u0001\u0000"+
		"\u0000\u0000\u0011K\u0001\u0000\u0000\u0000\u0013b\u0001\u0000\u0000\u0000"+
		"\u0015l\u0001\u0000\u0000\u0000\u0017{\u0001\u0000\u0000\u0000\u0019}"+
		"\u0001\u0000\u0000\u0000\u001b\u0087\u0001\u0000\u0000\u0000\u001d\u008e"+
		"\u0001\u0000\u0000\u0000\u001f \u0005i\u0000\u0000 !\u0005f\u0000\u0000"+
		"!\"\u0001\u0000\u0000\u0000\"#\u0006\u0000\u0000\u0000#\u0002\u0001\u0000"+
		"\u0000\u0000$%\u0005i\u0000\u0000%&\u0005n\u0000\u0000&\'\u0005t\u0000"+
		"\u0000\'(\u0001\u0000\u0000\u0000(3\u0006\u0001\u0001\u0000)*\u0005b\u0000"+
		"\u0000*+\u0005o\u0000\u0000+,\u0005o\u0000\u0000,-\u0005l\u0000\u0000"+
		"-.\u0005e\u0000\u0000./\u0005a\u0000\u0000/0\u0005n\u0000\u000001\u0001"+
		"\u0000\u0000\u000013\u0006\u0001\u0002\u00002$\u0001\u0000\u0000\u0000"+
		"2)\u0001\u0000\u0000\u00003\u0004\u0001\u0000\u0000\u000045\u0005p\u0000"+
		"\u000056\u0005r\u0000\u000067\u0005i\u0000\u000078\u0005n\u0000\u0000"+
		"89\u0005t\u0000\u00009:\u0001\u0000\u0000\u0000:;\u0006\u0002\u0003\u0000"+
		";\u0006\u0001\u0000\u0000\u0000<=\u0005=\u0000\u0000=>\u0006\u0003\u0004"+
		"\u0000>\b\u0001\u0000\u0000\u0000?@\u0005(\u0000\u0000@A\u0006\u0004\u0005"+
		"\u0000A\n\u0001\u0000\u0000\u0000BC\u0005)\u0000\u0000CD\u0006\u0005\u0006"+
		"\u0000D\f\u0001\u0000\u0000\u0000EF\u0005{\u0000\u0000FG\u0006\u0006\u0007"+
		"\u0000G\u000e\u0001\u0000\u0000\u0000HI\u0005}\u0000\u0000IJ\u0006\u0007"+
		"\b\u0000J\u0010\u0001\u0000\u0000\u0000KL\u0005;\u0000\u0000LM\u0006\b"+
		"\t\u0000M\u0012\u0001\u0000\u0000\u0000NO\u0005=\u0000\u0000OP\u0005="+
		"\u0000\u0000PQ\u0001\u0000\u0000\u0000Qc\u0006\t\n\u0000RS\u0005!\u0000"+
		"\u0000ST\u0005=\u0000\u0000TU\u0001\u0000\u0000\u0000Uc\u0006\t\u000b"+
		"\u0000VW\u0005>\u0000\u0000WX\u0005=\u0000\u0000XY\u0001\u0000\u0000\u0000"+
		"Yc\u0006\t\f\u0000Z[\u0005<\u0000\u0000[\\\u0005=\u0000\u0000\\]\u0001"+
		"\u0000\u0000\u0000]c\u0006\t\r\u0000^_\u0005<\u0000\u0000_c\u0006\t\u000e"+
		"\u0000`a\u0005>\u0000\u0000ac\u0006\t\u000f\u0000bN\u0001\u0000\u0000"+
		"\u0000bR\u0001\u0000\u0000\u0000bV\u0001\u0000\u0000\u0000bZ\u0001\u0000"+
		"\u0000\u0000b^\u0001\u0000\u0000\u0000b`\u0001\u0000\u0000\u0000c\u0014"+
		"\u0001\u0000\u0000\u0000de\u0005+\u0000\u0000em\u0006\n\u0010\u0000fg"+
		"\u0005-\u0000\u0000gm\u0006\n\u0011\u0000hi\u0005/\u0000\u0000im\u0006"+
		"\n\u0012\u0000jk\u0005*\u0000\u0000km\u0006\n\u0013\u0000ld\u0001\u0000"+
		"\u0000\u0000lf\u0001\u0000\u0000\u0000lh\u0001\u0000\u0000\u0000lj\u0001"+
		"\u0000\u0000\u0000m\u0016\u0001\u0000\u0000\u0000no\u0005t\u0000\u0000"+
		"op\u0005r\u0000\u0000pq\u0005u\u0000\u0000qr\u0005e\u0000\u0000rs\u0001"+
		"\u0000\u0000\u0000s|\u0006\u000b\u0014\u0000tu\u0005f\u0000\u0000uv\u0005"+
		"a\u0000\u0000vw\u0005l\u0000\u0000wx\u0005s\u0000\u0000xy\u0005e\u0000"+
		"\u0000yz\u0001\u0000\u0000\u0000z|\u0006\u000b\u0015\u0000{n\u0001\u0000"+
		"\u0000\u0000{t\u0001\u0000\u0000\u0000|\u0018\u0001\u0000\u0000\u0000"+
		"}\u0081\u0007\u0000\u0000\u0000~\u0080\u0007\u0001\u0000\u0000\u007f~"+
		"\u0001\u0000\u0000\u0000\u0080\u0083\u0001\u0000\u0000\u0000\u0081\u007f"+
		"\u0001\u0000\u0000\u0000\u0081\u0082\u0001\u0000\u0000\u0000\u0082\u0084"+
		"\u0001\u0000\u0000\u0000\u0083\u0081\u0001\u0000\u0000\u0000\u0084\u0085"+
		"\u0006\f\u0016\u0000\u0085\u001a\u0001\u0000\u0000\u0000\u0086\u0088\u0007"+
		"\u0002\u0000\u0000\u0087\u0086\u0001\u0000\u0000\u0000\u0088\u0089\u0001"+
		"\u0000\u0000\u0000\u0089\u0087\u0001\u0000\u0000\u0000\u0089\u008a\u0001"+
		"\u0000\u0000\u0000\u008a\u008b\u0001\u0000\u0000\u0000\u008b\u008c\u0006"+
		"\r\u0017\u0000\u008c\u001c\u0001\u0000\u0000\u0000\u008d\u008f\u0007\u0003"+
		"\u0000\u0000\u008e\u008d\u0001\u0000\u0000\u0000\u008f\u0090\u0001\u0000"+
		"\u0000\u0000\u0090\u008e\u0001\u0000\u0000\u0000\u0090\u0091\u0001\u0000"+
		"\u0000\u0000\u0091\u0092\u0001\u0000\u0000\u0000\u0092\u0093\u0006\u000e"+
		"\u0018\u0000\u0093\u001e\u0001\u0000\u0000\u0000\b\u00002bl{\u0081\u0089"+
		"\u0090\u0019\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001"+
		"\u0002\u0003\u0001\u0003\u0004\u0001\u0004\u0005\u0001\u0005\u0006\u0001"+
		"\u0006\u0007\u0001\u0007\b\u0001\b\t\u0001\t\n\u0001\t\u000b\u0001\t\f"+
		"\u0001\t\r\u0001\t\u000e\u0001\t\u000f\u0001\n\u0010\u0001\n\u0011\u0001"+
		"\n\u0012\u0001\n\u0013\u0001\u000b\u0014\u0001\u000b\u0015\u0001\f\u0016"+
		"\u0001\r\u0017\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}