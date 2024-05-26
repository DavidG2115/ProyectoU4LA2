// $ANTLR 3.5.2 T.g 2024-04-28 14:57:26
package proyectounidad2;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class TLexer extends Lexer {
	public static final int EOF=-1;
	public static final int ALFABETO=4;
	public static final int CANTIDAD=5;
	public static final int CREAR=6;
	public static final int FECHA=7;
	public static final int FIN=8;
	public static final int ID=9;
	public static final int INICIO=10;
	public static final int LLAVE_FORANEA=11;
	public static final int REFERENCIA=12;
	public static final int TABLA=13;
	public static final int TERMINAR=14;
	public static final int UTILIZAR=15;
	public static final int WS=16;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public TLexer() {} 
	public TLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public TLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "T.g"; }

	// $ANTLR start "CREAR"
	public final void mCREAR() throws RecognitionException {
		try {
			int _type = CREAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// T.g:86:7: ( 'crear' )
			// T.g:86:9: 'crear'
			{
			match("crear"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CREAR"

	// $ANTLR start "UTILIZAR"
	public final void mUTILIZAR() throws RecognitionException {
		try {
			int _type = UTILIZAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// T.g:87:10: ( 'utilizar' )
			// T.g:87:12: 'utilizar'
			{
			match("utilizar"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "UTILIZAR"

	// $ANTLR start "TABLA"
	public final void mTABLA() throws RecognitionException {
		try {
			int _type = TABLA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// T.g:88:7: ( 'tabla' )
			// T.g:88:9: 'tabla'
			{
			match("tabla"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TABLA"

	// $ANTLR start "INICIO"
	public final void mINICIO() throws RecognitionException {
		try {
			int _type = INICIO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// T.g:89:8: ( 'inicio' )
			// T.g:89:10: 'inicio'
			{
			match("inicio"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INICIO"

	// $ANTLR start "TERMINAR"
	public final void mTERMINAR() throws RecognitionException {
		try {
			int _type = TERMINAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// T.g:90:10: ( 'terminar' )
			// T.g:90:12: 'terminar'
			{
			match("terminar"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TERMINAR"

	// $ANTLR start "FIN"
	public final void mFIN() throws RecognitionException {
		try {
			int _type = FIN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// T.g:91:5: ( 'fin' )
			// T.g:91:7: 'fin'
			{
			match("fin"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FIN"

	// $ANTLR start "LLAVE_FORANEA"
	public final void mLLAVE_FORANEA() throws RecognitionException {
		try {
			int _type = LLAVE_FORANEA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// T.g:92:15: ( 'relacion' )
			// T.g:92:17: 'relacion'
			{
			match("relacion"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LLAVE_FORANEA"

	// $ANTLR start "REFERENCIA"
	public final void mREFERENCIA() throws RecognitionException {
		try {
			int _type = REFERENCIA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// T.g:93:12: ( 'referencia' )
			// T.g:93:14: 'referencia'
			{
			match("referencia"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "REFERENCIA"

	// $ANTLR start "CANTIDAD"
	public final void mCANTIDAD() throws RecognitionException {
		try {
			int _type = CANTIDAD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// T.g:94:10: ( 'cantidad' )
			// T.g:94:12: 'cantidad'
			{
			match("cantidad"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CANTIDAD"

	// $ANTLR start "ALFABETO"
	public final void mALFABETO() throws RecognitionException {
		try {
			int _type = ALFABETO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// T.g:95:10: ( 'alfabeto' )
			// T.g:95:12: 'alfabeto'
			{
			match("alfabeto"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ALFABETO"

	// $ANTLR start "FECHA"
	public final void mFECHA() throws RecognitionException {
		try {
			int _type = FECHA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// T.g:96:7: ( 'fecha' )
			// T.g:96:9: 'fecha'
			{
			match("fecha"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FECHA"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// T.g:97:4: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
			// T.g:97:6: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// T.g:97:34: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// T.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop1;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ID"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// T.g:100:4: ( ( ' ' | '\\n' | '\\t' | '\\r' )+ )
			// T.g:100:6: ( ' ' | '\\n' | '\\t' | '\\r' )+
			{
			// T.g:100:6: ( ' ' | '\\n' | '\\t' | '\\r' )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '\t' && LA2_0 <= '\n')||LA2_0=='\r'||LA2_0==' ') ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// T.g:
					{
					if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt2 >= 1 ) break loop2;
					EarlyExitException eee = new EarlyExitException(2, input);
					throw eee;
				}
				cnt2++;
			}

			_channel = HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	@Override
	public void mTokens() throws RecognitionException {
		// T.g:1:8: ( CREAR | UTILIZAR | TABLA | INICIO | TERMINAR | FIN | LLAVE_FORANEA | REFERENCIA | CANTIDAD | ALFABETO | FECHA | ID | WS )
		int alt3=13;
		alt3 = dfa3.predict(input);
		switch (alt3) {
			case 1 :
				// T.g:1:10: CREAR
				{
				mCREAR(); 

				}
				break;
			case 2 :
				// T.g:1:16: UTILIZAR
				{
				mUTILIZAR(); 

				}
				break;
			case 3 :
				// T.g:1:25: TABLA
				{
				mTABLA(); 

				}
				break;
			case 4 :
				// T.g:1:31: INICIO
				{
				mINICIO(); 

				}
				break;
			case 5 :
				// T.g:1:38: TERMINAR
				{
				mTERMINAR(); 

				}
				break;
			case 6 :
				// T.g:1:47: FIN
				{
				mFIN(); 

				}
				break;
			case 7 :
				// T.g:1:51: LLAVE_FORANEA
				{
				mLLAVE_FORANEA(); 

				}
				break;
			case 8 :
				// T.g:1:65: REFERENCIA
				{
				mREFERENCIA(); 

				}
				break;
			case 9 :
				// T.g:1:76: CANTIDAD
				{
				mCANTIDAD(); 

				}
				break;
			case 10 :
				// T.g:1:85: ALFABETO
				{
				mALFABETO(); 

				}
				break;
			case 11 :
				// T.g:1:94: FECHA
				{
				mFECHA(); 

				}
				break;
			case 12 :
				// T.g:1:100: ID
				{
				mID(); 

				}
				break;
			case 13 :
				// T.g:1:103: WS
				{
				mWS(); 

				}
				break;

		}
	}


	protected DFA3 dfa3 = new DFA3(this);
	static final String DFA3_eotS =
		"\1\uffff\7\10\2\uffff\20\10\1\45\12\10\1\uffff\4\10\1\64\2\10\1\67\2\10"+
		"\1\72\3\10\1\uffff\2\10\1\uffff\1\10\1\101\1\uffff\6\10\1\uffff\3\10\1"+
		"\113\1\114\1\115\1\116\1\10\1\120\4\uffff\1\10\1\uffff\1\122\1\uffff";
	static final String DFA3_eofS =
		"\123\uffff";
	static final String DFA3_minS =
		"\1\11\1\141\1\164\1\141\1\156\2\145\1\154\2\uffff\1\145\1\156\1\151\1"+
		"\142\1\162\1\151\1\156\1\143\2\146\1\141\1\164\2\154\1\155\1\143\1\60"+
		"\1\150\1\141\1\145\1\141\1\162\2\151\1\141\2\151\1\uffff\1\141\1\143\1"+
		"\162\1\142\1\60\1\144\1\172\1\60\1\156\1\157\1\60\1\151\2\145\1\uffff"+
		"\2\141\1\uffff\1\141\1\60\1\uffff\1\157\1\156\1\164\1\144\2\162\1\uffff"+
		"\1\156\1\143\1\157\4\60\1\151\1\60\4\uffff\1\141\1\uffff\1\60\1\uffff";
	static final String DFA3_maxS =
		"\1\172\1\162\1\164\1\145\1\156\1\151\1\145\1\154\2\uffff\1\145\1\156\1"+
		"\151\1\142\1\162\1\151\1\156\1\143\1\154\1\146\1\141\1\164\2\154\1\155"+
		"\1\143\1\172\1\150\1\141\1\145\1\141\1\162\2\151\1\141\2\151\1\uffff\1"+
		"\141\1\143\1\162\1\142\1\172\1\144\2\172\1\156\1\157\1\172\1\151\2\145"+
		"\1\uffff\2\141\1\uffff\1\141\1\172\1\uffff\1\157\1\156\1\164\1\144\2\162"+
		"\1\uffff\1\156\1\143\1\157\4\172\1\151\1\172\4\uffff\1\141\1\uffff\1\172"+
		"\1\uffff";
	static final String DFA3_acceptS =
		"\10\uffff\1\14\1\15\33\uffff\1\6\16\uffff\1\1\2\uffff\1\3\2\uffff\1\13"+
		"\6\uffff\1\4\11\uffff\1\11\1\2\1\5\1\7\1\uffff\1\12\1\uffff\1\10";
	static final String DFA3_specialS =
		"\123\uffff}>";
	static final String[] DFA3_transitionS = {
			"\2\11\2\uffff\1\11\22\uffff\1\11\40\uffff\32\10\4\uffff\1\10\1\uffff"+
			"\1\7\1\10\1\1\2\10\1\5\2\10\1\4\10\10\1\6\1\10\1\3\1\2\5\10",
			"\1\13\20\uffff\1\12",
			"\1\14",
			"\1\15\3\uffff\1\16",
			"\1\17",
			"\1\21\3\uffff\1\20",
			"\1\22",
			"\1\23",
			"",
			"",
			"\1\24",
			"\1\25",
			"\1\26",
			"\1\27",
			"\1\30",
			"\1\31",
			"\1\32",
			"\1\33",
			"\1\35\5\uffff\1\34",
			"\1\36",
			"\1\37",
			"\1\40",
			"\1\41",
			"\1\42",
			"\1\43",
			"\1\44",
			"\12\10\7\uffff\32\10\4\uffff\1\10\1\uffff\32\10",
			"\1\46",
			"\1\47",
			"\1\50",
			"\1\51",
			"\1\52",
			"\1\53",
			"\1\54",
			"\1\55",
			"\1\56",
			"\1\57",
			"",
			"\1\60",
			"\1\61",
			"\1\62",
			"\1\63",
			"\12\10\7\uffff\32\10\4\uffff\1\10\1\uffff\32\10",
			"\1\65",
			"\1\66",
			"\12\10\7\uffff\32\10\4\uffff\1\10\1\uffff\32\10",
			"\1\70",
			"\1\71",
			"\12\10\7\uffff\32\10\4\uffff\1\10\1\uffff\32\10",
			"\1\73",
			"\1\74",
			"\1\75",
			"",
			"\1\76",
			"\1\77",
			"",
			"\1\100",
			"\12\10\7\uffff\32\10\4\uffff\1\10\1\uffff\32\10",
			"",
			"\1\102",
			"\1\103",
			"\1\104",
			"\1\105",
			"\1\106",
			"\1\107",
			"",
			"\1\110",
			"\1\111",
			"\1\112",
			"\12\10\7\uffff\32\10\4\uffff\1\10\1\uffff\32\10",
			"\12\10\7\uffff\32\10\4\uffff\1\10\1\uffff\32\10",
			"\12\10\7\uffff\32\10\4\uffff\1\10\1\uffff\32\10",
			"\12\10\7\uffff\32\10\4\uffff\1\10\1\uffff\32\10",
			"\1\117",
			"\12\10\7\uffff\32\10\4\uffff\1\10\1\uffff\32\10",
			"",
			"",
			"",
			"",
			"\1\121",
			"",
			"\12\10\7\uffff\32\10\4\uffff\1\10\1\uffff\32\10",
			""
	};

	static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
	static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
	static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
	static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
	static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
	static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
	static final short[][] DFA3_transition;

	static {
		int numStates = DFA3_transitionS.length;
		DFA3_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
		}
	}

	protected class DFA3 extends DFA {

		public DFA3(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 3;
			this.eot = DFA3_eot;
			this.eof = DFA3_eof;
			this.min = DFA3_min;
			this.max = DFA3_max;
			this.accept = DFA3_accept;
			this.special = DFA3_special;
			this.transition = DFA3_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( CREAR | UTILIZAR | TABLA | INICIO | TERMINAR | FIN | LLAVE_FORANEA | REFERENCIA | CANTIDAD | ALFABETO | FECHA | ID | WS );";
		}
	}

}
