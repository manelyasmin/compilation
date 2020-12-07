// Generated from C:/Users/hammo/IdeaProjects/tpCompil3\SmallLanguage.g4 by ANTLR 4.7.2
package gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SmallLanguageParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, IMPORT=4, KWCLASS=5, KWMAIN=6, KWPUB=7, KWPRT=8, 
		KWINT=9, KWFLOAT=10, KWSTRING=11, KWREAD=12, KWWRITE=13, KWSI=14, KWALORS=15, 
		KWSINON=16, KWLANG=17, KWIO=18, OR=19, AND=20, NOT=21, EQ=22, EQQ=23, 
		NEQ=24, GT=25, LT=26, GTEQ=27, LTEQ=28, PLUS=29, MINUS=30, MULT=31, DIV=32, 
		VR=33, PVR=34, PARF=35, PARO=36, ACF=37, ACO=38, ID=39, INTEGER=40, FLOAT=41, 
		STRING=42, STR=43, WHITESPACE=44, ONELINE=45, MULLINE=46;
	public static final int
		RULE_parse = 0, RULE_block = 1, RULE_prog = 2, RULE_bib = 3, RULE_modificateur = 4, 
		RULE_variable = 5, RULE_id1 = 6, RULE_typevar = 7, RULE_instruction = 8, 
		RULE_read = 9, RULE_write = 10, RULE_condition = 11, RULE_assignmet = 12, 
		RULE_signe = 13, RULE_cond_block = 14, RULE_exp = 15, RULE_atom = 16, 
		RULE_sentier = 17, RULE_sfloat = 18, RULE_sstring = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"parse", "block", "prog", "bib", "modificateur", "variable", "id1", "typevar", 
			"instruction", "read", "write", "condition", "assignmet", "signe", "cond_block", 
			"exp", "atom", "sentier", "sfloat", "sstring"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'%d'", "'%f'", "'%s'", "'import'", "'class_sj'", "'main_SJ'", 
			"'public'", "'protected'", "'int_SJ'", "'float_SJ'", "'string_SJ'", "'In_SJ'", 
			"'Out_SJ'", "'Si'", "'Alors'", "'Sinon'", "'Small_Java.lang'", "'Small_Java.io'", 
			"'|'", "'&'", "'!'", "':='", "'='", "'!='", "'>'", "'<'", "'>='", "'<='", 
			"'+'", "'-'", "'*'", "'/'", "','", "';'", "')'", "'('", "'}'", "'{'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "IMPORT", "KWCLASS", "KWMAIN", "KWPUB", "KWPRT", 
			"KWINT", "KWFLOAT", "KWSTRING", "KWREAD", "KWWRITE", "KWSI", "KWALORS", 
			"KWSINON", "KWLANG", "KWIO", "OR", "AND", "NOT", "EQ", "EQQ", "NEQ", 
			"GT", "LT", "GTEQ", "LTEQ", "PLUS", "MINUS", "MULT", "DIV", "VR", "PVR", 
			"PARF", "PARO", "ACF", "ACO", "ID", "INTEGER", "FLOAT", "STRING", "STR", 
			"WHITESPACE", "ONELINE", "MULLINE"
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
	public String getGrammarFileName() { return "SmallLanguage.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SmallLanguageParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ParseContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SmallLanguageParser.EOF, 0); }
		public ParseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmallLanguageListener ) ((SmallLanguageListener)listener).enterParse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmallLanguageListener ) ((SmallLanguageListener)listener).exitParse(this);
		}
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			block();
			setState(41);
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

	public static class BlockContext extends ParserRuleContext {
		public List<ProgContext> prog() {
			return getRuleContexts(ProgContext.class);
		}
		public ProgContext prog(int i) {
			return getRuleContext(ProgContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmallLanguageListener ) ((SmallLanguageListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmallLanguageListener ) ((SmallLanguageListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IMPORT) | (1L << KWCLASS) | (1L << KWPUB) | (1L << KWPRT))) != 0)) {
				{
				{
				setState(43);
				prog();
				}
				}
				setState(48);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class ProgContext extends ParserRuleContext {
		public BibContext bib() {
			return getRuleContext(BibContext.class,0);
		}
		public ModificateurContext modificateur() {
			return getRuleContext(ModificateurContext.class,0);
		}
		public TerminalNode KWCLASS() { return getToken(SmallLanguageParser.KWCLASS, 0); }
		public TerminalNode ID() { return getToken(SmallLanguageParser.ID, 0); }
		public List<TerminalNode> ACO() { return getTokens(SmallLanguageParser.ACO); }
		public TerminalNode ACO(int i) {
			return getToken(SmallLanguageParser.ACO, i);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode KWMAIN() { return getToken(SmallLanguageParser.KWMAIN, 0); }
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
		}
		public List<TerminalNode> ACF() { return getTokens(SmallLanguageParser.ACF); }
		public TerminalNode ACF(int i) {
			return getToken(SmallLanguageParser.ACF, i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmallLanguageListener ) ((SmallLanguageListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmallLanguageListener ) ((SmallLanguageListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			bib();
			setState(50);
			modificateur();
			setState(51);
			match(KWCLASS);
			setState(52);
			match(ID);
			setState(53);
			match(ACO);
			setState(54);
			variable();
			setState(55);
			match(KWMAIN);
			setState(56);
			match(ACO);
			setState(57);
			instruction();
			setState(58);
			match(ACF);
			setState(59);
			match(ACF);
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

	public static class BibContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(SmallLanguageParser.IMPORT, 0); }
		public TerminalNode KWLANG() { return getToken(SmallLanguageParser.KWLANG, 0); }
		public TerminalNode PVR() { return getToken(SmallLanguageParser.PVR, 0); }
		public BibContext bib() {
			return getRuleContext(BibContext.class,0);
		}
		public TerminalNode KWIO() { return getToken(SmallLanguageParser.KWIO, 0); }
		public BibContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bib; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmallLanguageListener ) ((SmallLanguageListener)listener).enterBib(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmallLanguageListener ) ((SmallLanguageListener)listener).exitBib(this);
		}
	}

	public final BibContext bib() throws RecognitionException {
		BibContext _localctx = new BibContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_bib);
		try {
			setState(70);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(61);
				match(IMPORT);
				setState(62);
				match(KWLANG);
				setState(63);
				match(PVR);
				setState(64);
				bib();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(65);
				match(IMPORT);
				setState(66);
				match(KWIO);
				setState(67);
				match(PVR);
				setState(68);
				bib();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
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

	public static class ModificateurContext extends ParserRuleContext {
		public TerminalNode KWPUB() { return getToken(SmallLanguageParser.KWPUB, 0); }
		public TerminalNode KWPRT() { return getToken(SmallLanguageParser.KWPRT, 0); }
		public ModificateurContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modificateur; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmallLanguageListener ) ((SmallLanguageListener)listener).enterModificateur(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmallLanguageListener ) ((SmallLanguageListener)listener).exitModificateur(this);
		}
	}

	public final ModificateurContext modificateur() throws RecognitionException {
		ModificateurContext _localctx = new ModificateurContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_modificateur);
		try {
			setState(75);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KWPUB:
				enterOuterAlt(_localctx, 1);
				{
				setState(72);
				match(KWPUB);
				}
				break;
			case KWPRT:
				enterOuterAlt(_localctx, 2);
				{
				setState(73);
				match(KWPRT);
				}
				break;
			case KWCLASS:
				enterOuterAlt(_localctx, 3);
				{
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

	public static class VariableContext extends ParserRuleContext {
		public TypevarContext typevar() {
			return getRuleContext(TypevarContext.class,0);
		}
		public Id1Context id1() {
			return getRuleContext(Id1Context.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmallLanguageListener ) ((SmallLanguageListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmallLanguageListener ) ((SmallLanguageListener)listener).exitVariable(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_variable);
		try {
			setState(82);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KWINT:
			case KWFLOAT:
			case KWSTRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(77);
				typevar();
				setState(78);
				id1();
				setState(79);
				variable();
				}
				break;
			case KWMAIN:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Id1Context extends ParserRuleContext {
		public Token ID;
		public TerminalNode ID() { return getToken(SmallLanguageParser.ID, 0); }
		public TerminalNode PVR() { return getToken(SmallLanguageParser.PVR, 0); }
		public TerminalNode VR() { return getToken(SmallLanguageParser.VR, 0); }
		public Id1Context id1() {
			return getRuleContext(Id1Context.class,0);
		}
		public Id1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmallLanguageListener ) ((SmallLanguageListener)listener).enterId1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmallLanguageListener ) ((SmallLanguageListener)listener).exitId1(this);
		}
	}

	public final Id1Context id1() throws RecognitionException {
		Id1Context _localctx = new Id1Context(_ctx, getState());
		enterRule(_localctx, 12, RULE_id1);
		try {
			setState(90);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(84);
				((Id1Context)_localctx).ID = match(ID);
				setState(85);
				match(PVR);
				if((((Id1Context)_localctx).ID!=null?((Id1Context)_localctx).ID.getText():null).length()>10 ) System.out.println("ERRREUR LEXICAL:la taille de  identifier doit etre infeuriure a 10");
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(87);
				match(ID);
				setState(88);
				match(VR);
				setState(89);
				id1();
				}
				break;
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

	public static class TypevarContext extends ParserRuleContext {
		public TerminalNode KWINT() { return getToken(SmallLanguageParser.KWINT, 0); }
		public TerminalNode KWFLOAT() { return getToken(SmallLanguageParser.KWFLOAT, 0); }
		public TerminalNode KWSTRING() { return getToken(SmallLanguageParser.KWSTRING, 0); }
		public TypevarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typevar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmallLanguageListener ) ((SmallLanguageListener)listener).enterTypevar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmallLanguageListener ) ((SmallLanguageListener)listener).exitTypevar(this);
		}
	}

	public final TypevarContext typevar() throws RecognitionException {
		TypevarContext _localctx = new TypevarContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_typevar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KWINT) | (1L << KWFLOAT) | (1L << KWSTRING))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class InstructionContext extends ParserRuleContext {
		public AssignmetContext assignmet() {
			return getRuleContext(AssignmetContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public ReadContext read() {
			return getRuleContext(ReadContext.class,0);
		}
		public WriteContext write() {
			return getRuleContext(WriteContext.class,0);
		}
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmallLanguageListener ) ((SmallLanguageListener)listener).enterInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmallLanguageListener ) ((SmallLanguageListener)listener).exitInstruction(this);
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_instruction);
		try {
			setState(98);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				assignmet();
				}
				break;
			case KWSI:
				enterOuterAlt(_localctx, 2);
				{
				setState(95);
				condition();
				}
				break;
			case KWREAD:
				enterOuterAlt(_localctx, 3);
				{
				setState(96);
				read();
				}
				break;
			case KWWRITE:
				enterOuterAlt(_localctx, 4);
				{
				setState(97);
				write();
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

	public static class ReadContext extends ParserRuleContext {
		public TerminalNode KWREAD() { return getToken(SmallLanguageParser.KWREAD, 0); }
		public TerminalNode PARO() { return getToken(SmallLanguageParser.PARO, 0); }
		public SigneContext signe() {
			return getRuleContext(SigneContext.class,0);
		}
		public TerminalNode VR() { return getToken(SmallLanguageParser.VR, 0); }
		public TerminalNode ID() { return getToken(SmallLanguageParser.ID, 0); }
		public TerminalNode PARF() { return getToken(SmallLanguageParser.PARF, 0); }
		public TerminalNode PVR() { return getToken(SmallLanguageParser.PVR, 0); }
		public ReadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmallLanguageListener ) ((SmallLanguageListener)listener).enterRead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmallLanguageListener ) ((SmallLanguageListener)listener).exitRead(this);
		}
	}

	public final ReadContext read() throws RecognitionException {
		ReadContext _localctx = new ReadContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_read);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(KWREAD);
			setState(101);
			match(PARO);
			setState(102);
			signe();
			setState(103);
			match(VR);
			setState(104);
			match(ID);
			setState(105);
			match(PARF);
			setState(106);
			match(PVR);
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

	public static class WriteContext extends ParserRuleContext {
		public TerminalNode KWWRITE() { return getToken(SmallLanguageParser.KWWRITE, 0); }
		public TerminalNode PARO() { return getToken(SmallLanguageParser.PARO, 0); }
		public TerminalNode STR() { return getToken(SmallLanguageParser.STR, 0); }
		public TerminalNode VR() { return getToken(SmallLanguageParser.VR, 0); }
		public TerminalNode ID() { return getToken(SmallLanguageParser.ID, 0); }
		public TerminalNode PARF() { return getToken(SmallLanguageParser.PARF, 0); }
		public TerminalNode PVR() { return getToken(SmallLanguageParser.PVR, 0); }
		public WriteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_write; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmallLanguageListener ) ((SmallLanguageListener)listener).enterWrite(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmallLanguageListener ) ((SmallLanguageListener)listener).exitWrite(this);
		}
	}

	public final WriteContext write() throws RecognitionException {
		WriteContext _localctx = new WriteContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_write);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(KWWRITE);
			setState(109);
			match(PARO);
			setState(110);
			match(STR);
			setState(111);
			match(VR);
			setState(112);
			match(ID);
			setState(113);
			match(PARF);
			setState(114);
			match(PVR);
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

	public static class ConditionContext extends ParserRuleContext {
		public TerminalNode KWSI() { return getToken(SmallLanguageParser.KWSI, 0); }
		public Cond_blockContext cond_block() {
			return getRuleContext(Cond_blockContext.class,0);
		}
		public TerminalNode KWALORS() { return getToken(SmallLanguageParser.KWALORS, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode KWSINON() { return getToken(SmallLanguageParser.KWSINON, 0); }
		public TerminalNode PVR() { return getToken(SmallLanguageParser.PVR, 0); }
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmallLanguageListener ) ((SmallLanguageListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmallLanguageListener ) ((SmallLanguageListener)listener).exitCondition(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(KWSI);
			setState(117);
			cond_block();
			setState(118);
			match(KWALORS);
			setState(119);
			exp(0);
			setState(120);
			match(KWSINON);
			setState(121);
			exp(0);
			setState(122);
			match(PVR);
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

	public static class AssignmetContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SmallLanguageParser.ID, 0); }
		public TerminalNode EQ() { return getToken(SmallLanguageParser.EQ, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode PVR() { return getToken(SmallLanguageParser.PVR, 0); }
		public AssignmetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmallLanguageListener ) ((SmallLanguageListener)listener).enterAssignmet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmallLanguageListener ) ((SmallLanguageListener)listener).exitAssignmet(this);
		}
	}

	public final AssignmetContext assignmet() throws RecognitionException {
		AssignmetContext _localctx = new AssignmetContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_assignmet);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(ID);
			setState(125);
			match(EQ);
			setState(126);
			exp(0);
			setState(127);
			match(PVR);
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

	public static class SigneContext extends ParserRuleContext {
		public SentierContext sentier() {
			return getRuleContext(SentierContext.class,0);
		}
		public SfloatContext sfloat() {
			return getRuleContext(SfloatContext.class,0);
		}
		public SstringContext sstring() {
			return getRuleContext(SstringContext.class,0);
		}
		public SigneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signe; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmallLanguageListener ) ((SmallLanguageListener)listener).enterSigne(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmallLanguageListener ) ((SmallLanguageListener)listener).exitSigne(this);
		}
	}

	public final SigneContext signe() throws RecognitionException {
		SigneContext _localctx = new SigneContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_signe);
		try {
			setState(132);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(129);
				sentier();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(130);
				sfloat();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 3);
				{
				setState(131);
				sstring();
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

	public static class Cond_blockContext extends ParserRuleContext {
		public TerminalNode PARO() { return getToken(SmallLanguageParser.PARO, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode PARF() { return getToken(SmallLanguageParser.PARF, 0); }
		public TerminalNode GT() { return getToken(SmallLanguageParser.GT, 0); }
		public TerminalNode NEQ() { return getToken(SmallLanguageParser.NEQ, 0); }
		public TerminalNode LTEQ() { return getToken(SmallLanguageParser.LTEQ, 0); }
		public TerminalNode LT() { return getToken(SmallLanguageParser.LT, 0); }
		public TerminalNode EQ() { return getToken(SmallLanguageParser.EQ, 0); }
		public Cond_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmallLanguageListener ) ((SmallLanguageListener)listener).enterCond_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmallLanguageListener ) ((SmallLanguageListener)listener).exitCond_block(this);
		}
	}

	public final Cond_blockContext cond_block() throws RecognitionException {
		Cond_blockContext _localctx = new Cond_blockContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_cond_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(PARO);
			setState(135);
			exp(0);
			setState(136);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << NEQ) | (1L << GT) | (1L << LT) | (1L << LTEQ))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(137);
			exp(0);
			setState(138);
			match(PARF);
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

	public static class ExpContext extends ParserRuleContext {
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
	 
		public ExpContext() { }
		public void copyFrom(ExpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NegationExprContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode NOT() { return getToken(SmallLanguageParser.NOT, 0); }
		public NegationExprContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmallLanguageListener ) ((SmallLanguageListener)listener).enterNegationExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmallLanguageListener ) ((SmallLanguageListener)listener).exitNegationExpr(this);
		}
	}
	public static class AdditionExprContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode MINUS() { return getToken(SmallLanguageParser.MINUS, 0); }
		public TerminalNode PLUS() { return getToken(SmallLanguageParser.PLUS, 0); }
		public AdditionExprContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmallLanguageListener ) ((SmallLanguageListener)listener).enterAdditionExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmallLanguageListener ) ((SmallLanguageListener)listener).exitAdditionExpr(this);
		}
	}
	public static class MultiplicationExprContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode MULT() { return getToken(SmallLanguageParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(SmallLanguageParser.DIV, 0); }
		public MultiplicationExprContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmallLanguageListener ) ((SmallLanguageListener)listener).enterMultiplicationExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmallLanguageListener ) ((SmallLanguageListener)listener).exitMultiplicationExpr(this);
		}
	}
	public static class AtomExprContext extends ExpContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public AtomExprContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmallLanguageListener ) ((SmallLanguageListener)listener).enterAtomExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmallLanguageListener ) ((SmallLanguageListener)listener).exitAtomExpr(this);
		}
	}
	public static class OrExprContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode OR() { return getToken(SmallLanguageParser.OR, 0); }
		public OrExprContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmallLanguageListener ) ((SmallLanguageListener)listener).enterOrExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmallLanguageListener ) ((SmallLanguageListener)listener).exitOrExpr(this);
		}
	}
	public static class EqualiteExprContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode EQ() { return getToken(SmallLanguageParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(SmallLanguageParser.NEQ, 0); }
		public EqualiteExprContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmallLanguageListener ) ((SmallLanguageListener)listener).enterEqualiteExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmallLanguageListener ) ((SmallLanguageListener)listener).exitEqualiteExpr(this);
		}
	}
	public static class RelationExprContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode GT() { return getToken(SmallLanguageParser.GT, 0); }
		public TerminalNode NEQ() { return getToken(SmallLanguageParser.NEQ, 0); }
		public TerminalNode LTEQ() { return getToken(SmallLanguageParser.LTEQ, 0); }
		public TerminalNode LT() { return getToken(SmallLanguageParser.LT, 0); }
		public RelationExprContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmallLanguageListener ) ((SmallLanguageListener)listener).enterRelationExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmallLanguageListener ) ((SmallLanguageListener)listener).exitRelationExpr(this);
		}
	}
	public static class AndExprContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode AND() { return getToken(SmallLanguageParser.AND, 0); }
		public AndExprContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmallLanguageListener ) ((SmallLanguageListener)listener).enterAndExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmallLanguageListener ) ((SmallLanguageListener)listener).exitAndExpr(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		return exp(0);
	}

	private ExpContext exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpContext _localctx = new ExpContext(_ctx, _parentState);
		ExpContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_exp, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new AtomExprContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(141);
			atom();
			}
			_ctx.stop = _input.LT(-1);
			setState(166);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(164);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicationExprContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(143);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(144);
						_la = _input.LA(1);
						if ( !(_la==MULT || _la==DIV) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(145);
						exp(9);
						}
						break;
					case 2:
						{
						_localctx = new AdditionExprContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(146);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(147);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(148);
						exp(8);
						}
						break;
					case 3:
						{
						_localctx = new RelationExprContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(149);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(150);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEQ) | (1L << GT) | (1L << LT) | (1L << LTEQ))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(151);
						exp(7);
						}
						break;
					case 4:
						{
						_localctx = new EqualiteExprContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(152);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(153);
						_la = _input.LA(1);
						if ( !(_la==EQ || _la==NEQ) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(154);
						exp(6);
						}
						break;
					case 5:
						{
						_localctx = new NegationExprContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(155);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(156);
						match(NOT);
						setState(157);
						exp(5);
						}
						break;
					case 6:
						{
						_localctx = new AndExprContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(158);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(159);
						match(AND);
						setState(160);
						exp(4);
						}
						break;
					case 7:
						{
						_localctx = new OrExprContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(161);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(162);
						match(OR);
						setState(163);
						exp(3);
						}
						break;
					}
					} 
				}
				setState(168);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AtomContext extends ParserRuleContext {
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
	 
		public AtomContext() { }
		public void copyFrom(AtomContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ParExprContext extends AtomContext {
		public TerminalNode PARO() { return getToken(SmallLanguageParser.PARO, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode PARF() { return getToken(SmallLanguageParser.PARF, 0); }
		public ParExprContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmallLanguageListener ) ((SmallLanguageListener)listener).enterParExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmallLanguageListener ) ((SmallLanguageListener)listener).exitParExpr(this);
		}
	}
	public static class IdAtomContext extends AtomContext {
		public TerminalNode ID() { return getToken(SmallLanguageParser.ID, 0); }
		public IdAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmallLanguageListener ) ((SmallLanguageListener)listener).enterIdAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmallLanguageListener ) ((SmallLanguageListener)listener).exitIdAtom(this);
		}
	}
	public static class StringAtomContext extends AtomContext {
		public TerminalNode STRING() { return getToken(SmallLanguageParser.STRING, 0); }
		public StringAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmallLanguageListener ) ((SmallLanguageListener)listener).enterStringAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmallLanguageListener ) ((SmallLanguageListener)listener).exitStringAtom(this);
		}
	}
	public static class NumberAtomContext extends AtomContext {
		public TerminalNode INTEGER() { return getToken(SmallLanguageParser.INTEGER, 0); }
		public TerminalNode FLOAT() { return getToken(SmallLanguageParser.FLOAT, 0); }
		public NumberAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmallLanguageListener ) ((SmallLanguageListener)listener).enterNumberAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmallLanguageListener ) ((SmallLanguageListener)listener).exitNumberAtom(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_atom);
		int _la;
		try {
			setState(176);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PARO:
				_localctx = new ParExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(169);
				match(PARO);
				setState(170);
				exp(0);
				setState(171);
				match(PARF);
				}
				break;
			case INTEGER:
			case FLOAT:
				_localctx = new NumberAtomContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(173);
				_la = _input.LA(1);
				if ( !(_la==INTEGER || _la==FLOAT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case ID:
				_localctx = new IdAtomContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(174);
				match(ID);
				}
				break;
			case STRING:
				_localctx = new StringAtomContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(175);
				match(STRING);
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

	public static class SentierContext extends ParserRuleContext {
		public SentierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmallLanguageListener ) ((SmallLanguageListener)listener).enterSentier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmallLanguageListener ) ((SmallLanguageListener)listener).exitSentier(this);
		}
	}

	public final SentierContext sentier() throws RecognitionException {
		SentierContext _localctx = new SentierContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_sentier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(T__0);
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

	public static class SfloatContext extends ParserRuleContext {
		public SfloatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sfloat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmallLanguageListener ) ((SmallLanguageListener)listener).enterSfloat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmallLanguageListener ) ((SmallLanguageListener)listener).exitSfloat(this);
		}
	}

	public final SfloatContext sfloat() throws RecognitionException {
		SfloatContext _localctx = new SfloatContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_sfloat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(T__1);
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

	public static class SstringContext extends ParserRuleContext {
		public SstringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sstring; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmallLanguageListener ) ((SmallLanguageListener)listener).enterSstring(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmallLanguageListener ) ((SmallLanguageListener)listener).exitSstring(this);
		}
	}

	public final SstringContext sstring() throws RecognitionException {
		SstringContext _localctx = new SstringContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_sstring);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			match(T__2);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 15:
			return exp_sempred((ExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 8);
		case 1:
			return precpred(_ctx, 7);
		case 2:
			return precpred(_ctx, 6);
		case 3:
			return precpred(_ctx, 5);
		case 4:
			return precpred(_ctx, 4);
		case 5:
			return precpred(_ctx, 3);
		case 6:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\60\u00bb\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\3\7\3/\n\3\f\3\16\3\62\13"+
		"\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\5\5I\n\5\3\6\3\6\3\6\5\6N\n\6\3\7\3\7\3\7\3\7\3\7\5\7"+
		"U\n\7\3\b\3\b\3\b\3\b\3\b\3\b\5\b]\n\b\3\t\3\t\3\n\3\n\3\n\3\n\5\ne\n"+
		"\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17"+
		"\3\17\5\17\u0087\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u00a7\n\21\f\21\16\21\u00aa\13\21"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00b3\n\22\3\23\3\23\3\24\3\24"+
		"\3\25\3\25\3\25\2\3 \26\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(\2"+
		"\t\3\2\13\r\5\2\30\30\32\34\36\36\3\2!\"\3\2\37 \4\2\32\34\36\36\4\2\30"+
		"\30\32\32\3\2*+\2\u00bc\2*\3\2\2\2\4\60\3\2\2\2\6\63\3\2\2\2\bH\3\2\2"+
		"\2\nM\3\2\2\2\fT\3\2\2\2\16\\\3\2\2\2\20^\3\2\2\2\22d\3\2\2\2\24f\3\2"+
		"\2\2\26n\3\2\2\2\30v\3\2\2\2\32~\3\2\2\2\34\u0086\3\2\2\2\36\u0088\3\2"+
		"\2\2 \u008e\3\2\2\2\"\u00b2\3\2\2\2$\u00b4\3\2\2\2&\u00b6\3\2\2\2(\u00b8"+
		"\3\2\2\2*+\5\4\3\2+,\7\2\2\3,\3\3\2\2\2-/\5\6\4\2.-\3\2\2\2/\62\3\2\2"+
		"\2\60.\3\2\2\2\60\61\3\2\2\2\61\5\3\2\2\2\62\60\3\2\2\2\63\64\5\b\5\2"+
		"\64\65\5\n\6\2\65\66\7\7\2\2\66\67\7)\2\2\678\7(\2\289\5\f\7\29:\7\b\2"+
		"\2:;\7(\2\2;<\5\22\n\2<=\7\'\2\2=>\7\'\2\2>\7\3\2\2\2?@\7\6\2\2@A\7\23"+
		"\2\2AB\7$\2\2BI\5\b\5\2CD\7\6\2\2DE\7\24\2\2EF\7$\2\2FI\5\b\5\2GI\3\2"+
		"\2\2H?\3\2\2\2HC\3\2\2\2HG\3\2\2\2I\t\3\2\2\2JN\7\t\2\2KN\7\n\2\2LN\3"+
		"\2\2\2MJ\3\2\2\2MK\3\2\2\2ML\3\2\2\2N\13\3\2\2\2OP\5\20\t\2PQ\5\16\b\2"+
		"QR\5\f\7\2RU\3\2\2\2SU\3\2\2\2TO\3\2\2\2TS\3\2\2\2U\r\3\2\2\2VW\7)\2\2"+
		"WX\7$\2\2X]\b\b\1\2YZ\7)\2\2Z[\7#\2\2[]\5\16\b\2\\V\3\2\2\2\\Y\3\2\2\2"+
		"]\17\3\2\2\2^_\t\2\2\2_\21\3\2\2\2`e\5\32\16\2ae\5\30\r\2be\5\24\13\2"+
		"ce\5\26\f\2d`\3\2\2\2da\3\2\2\2db\3\2\2\2dc\3\2\2\2e\23\3\2\2\2fg\7\16"+
		"\2\2gh\7&\2\2hi\5\34\17\2ij\7#\2\2jk\7)\2\2kl\7%\2\2lm\7$\2\2m\25\3\2"+
		"\2\2no\7\17\2\2op\7&\2\2pq\7-\2\2qr\7#\2\2rs\7)\2\2st\7%\2\2tu\7$\2\2"+
		"u\27\3\2\2\2vw\7\20\2\2wx\5\36\20\2xy\7\21\2\2yz\5 \21\2z{\7\22\2\2{|"+
		"\5 \21\2|}\7$\2\2}\31\3\2\2\2~\177\7)\2\2\177\u0080\7\30\2\2\u0080\u0081"+
		"\5 \21\2\u0081\u0082\7$\2\2\u0082\33\3\2\2\2\u0083\u0087\5$\23\2\u0084"+
		"\u0087\5&\24\2\u0085\u0087\5(\25\2\u0086\u0083\3\2\2\2\u0086\u0084\3\2"+
		"\2\2\u0086\u0085\3\2\2\2\u0087\35\3\2\2\2\u0088\u0089\7&\2\2\u0089\u008a"+
		"\5 \21\2\u008a\u008b\t\3\2\2\u008b\u008c\5 \21\2\u008c\u008d\7%\2\2\u008d"+
		"\37\3\2\2\2\u008e\u008f\b\21\1\2\u008f\u0090\5\"\22\2\u0090\u00a8\3\2"+
		"\2\2\u0091\u0092\f\n\2\2\u0092\u0093\t\4\2\2\u0093\u00a7\5 \21\13\u0094"+
		"\u0095\f\t\2\2\u0095\u0096\t\5\2\2\u0096\u00a7\5 \21\n\u0097\u0098\f\b"+
		"\2\2\u0098\u0099\t\6\2\2\u0099\u00a7\5 \21\t\u009a\u009b\f\7\2\2\u009b"+
		"\u009c\t\7\2\2\u009c\u00a7\5 \21\b\u009d\u009e\f\6\2\2\u009e\u009f\7\27"+
		"\2\2\u009f\u00a7\5 \21\7\u00a0\u00a1\f\5\2\2\u00a1\u00a2\7\26\2\2\u00a2"+
		"\u00a7\5 \21\6\u00a3\u00a4\f\4\2\2\u00a4\u00a5\7\25\2\2\u00a5\u00a7\5"+
		" \21\5\u00a6\u0091\3\2\2\2\u00a6\u0094\3\2\2\2\u00a6\u0097\3\2\2\2\u00a6"+
		"\u009a\3\2\2\2\u00a6\u009d\3\2\2\2\u00a6\u00a0\3\2\2\2\u00a6\u00a3\3\2"+
		"\2\2\u00a7\u00aa\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9"+
		"!\3\2\2\2\u00aa\u00a8\3\2\2\2\u00ab\u00ac\7&\2\2\u00ac\u00ad\5 \21\2\u00ad"+
		"\u00ae\7%\2\2\u00ae\u00b3\3\2\2\2\u00af\u00b3\t\b\2\2\u00b0\u00b3\7)\2"+
		"\2\u00b1\u00b3\7,\2\2\u00b2\u00ab\3\2\2\2\u00b2\u00af\3\2\2\2\u00b2\u00b0"+
		"\3\2\2\2\u00b2\u00b1\3\2\2\2\u00b3#\3\2\2\2\u00b4\u00b5\7\3\2\2\u00b5"+
		"%\3\2\2\2\u00b6\u00b7\7\4\2\2\u00b7\'\3\2\2\2\u00b8\u00b9\7\5\2\2\u00b9"+
		")\3\2\2\2\f\60HMT\\d\u0086\u00a6\u00a8\u00b2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}