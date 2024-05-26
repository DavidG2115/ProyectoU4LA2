package proyectounidad2;

    import java.util.ArrayList;
    import java.util.List;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class TParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ALFABETO", "CANTIDAD", "CREAR", 
		"FECHA", "FIN", "ID", "INICIO", "LLAVE_FORANEA", "REFERENCIA", "TABLA", 
		"TERMINAR", "UTILIZAR", "WS"
	};
        public javax.swing.JTextArea salida;
        public javax.swing.JTextArea salidasql;
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
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators
        public void setSalida(javax.swing.JTextArea _salida) {
            salida=_salida;
        }
        public void setSalidasql(javax.swing.JTextArea _salidasql) {
            salidasql=_salidasql;
        }

	public TParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public TParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return TParser.tokenNames; }
	@Override public String getGrammarFileName() { return "T.g"; }


	    public void displayRecognitionError(String[] tokenNames, RecognitionException e) {
	        String hdr = getErrorHeader(e);
	        String msg = getErrorMessage(e, tokenNames);
	        salida.append("Te equivocaste en: " + hdr + " " + msg);
	        throw new RuntimeException("Fijate aqui: " + hdr + " " + msg);
	    }

	    List<Tabla> tablas = new ArrayList<>();
	    Tabla tablaActual = null;
	    String nombreLlaveForanea; // Declaración de la variable como atributo
	    String nombreBaseDeDatosActual;




	// $ANTLR start "inicio"
	// T.g:24:1: inicio : creacion utilizar ( tabla )+ terminar ;
	public final void inicio() throws RecognitionException {
		try {
			// T.g:24:8: ( creacion utilizar ( tabla )+ terminar )
			// T.g:24:10: creacion utilizar ( tabla )+ terminar
			{
			pushFollow(FOLLOW_creacion_in_inicio23);
			creacion();
			state._fsp--;

			pushFollow(FOLLOW_utilizar_in_inicio25);
			utilizar();
			state._fsp--;

			// T.g:24:28: ( tabla )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==TABLA) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// T.g:24:28: tabla
					{
					pushFollow(FOLLOW_tabla_in_inicio27);
					tabla();
					state._fsp--;

					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			pushFollow(FOLLOW_terminar_in_inicio30);
			terminar();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "inicio"



	// $ANTLR start "creacion"
	// T.g:26:1: creacion : CREAR idDB ;
	public final void creacion() throws RecognitionException {
		ParserRuleReturnScope idDB1 =null;

		try {
			// T.g:26:10: ( CREAR idDB )
			// T.g:26:12: CREAR idDB
			{
			match(input,CREAR,FOLLOW_CREAR_in_creacion38); 
			pushFollow(FOLLOW_idDB_in_creacion40);
			idDB1=idDB();
			state._fsp--;


			    salidasql.append("CREATE DATABASE " + (idDB1!=null?input.toString(idDB1.start,idDB1.stop):null) + ";" +"\n");

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "creacion"



	// $ANTLR start "utilizar"
	// T.g:30:1: utilizar : UTILIZAR idDB ;
	public final void utilizar() throws RecognitionException {
		ParserRuleReturnScope idDB2 =null;

		try {
			// T.g:30:10: ( UTILIZAR idDB )
			// T.g:30:12: UTILIZAR idDB
			{
			match(input,UTILIZAR,FOLLOW_UTILIZAR_in_utilizar50); 
			pushFollow(FOLLOW_idDB_in_utilizar52);
			idDB2=idDB();
			state._fsp--;


			    nombreBaseDeDatosActual = (idDB2!=null?input.toString(idDB2.start,idDB2.stop):null);
			    salidasql.append("USE " + (idDB2!=null?input.toString(idDB2.start,idDB2.stop):null) + ";" +"\n");

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "utilizar"



	// $ANTLR start "tabla"
	// T.g:35:1: tabla : TABLA idTabla INICIO ( campo )+ ( llavefor )? FIN ;
	public final void tabla() throws RecognitionException {
		ParserRuleReturnScope idTabla3 =null;

		try {
			// T.g:35:7: ( TABLA idTabla INICIO ( campo )+ ( llavefor )? FIN )
			// T.g:35:9: TABLA idTabla INICIO ( campo )+ ( llavefor )? FIN
			{
			match(input,TABLA,FOLLOW_TABLA_in_tabla62); 
			pushFollow(FOLLOW_idTabla_in_tabla64);
			idTabla3=idTabla();
			state._fsp--;

			match(input,INICIO,FOLLOW_INICIO_in_tabla66); 

			    salidasql.append("CREATE TABLE " + (idTabla3!=null?input.toString(idTabla3.start,idTabla3.stop):null));
			    salidasql.append(" (" + (idTabla3!=null?input.toString(idTabla3.start,idTabla3.stop):null) + "_key INT AUTO_INCREMENT PRIMARY KEY");
			    Tabla t = new Tabla();
			    t.nombre = (idTabla3!=null?input.toString(idTabla3.start,idTabla3.stop):null);
			    tablas.add(t);
			    tablaActual = t;

			// T.g:42:3: ( campo )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==ID) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// T.g:42:3: campo
					{
					pushFollow(FOLLOW_campo_in_tabla70);
					campo();
					state._fsp--;

					}
					break;

				default :
					if ( cnt2 >= 1 ) break loop2;
					EarlyExitException eee = new EarlyExitException(2, input);
					throw eee;
				}
				cnt2++;
			}

			// T.g:42:10: ( llavefor )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==LLAVE_FORANEA) ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// T.g:42:11: llavefor
					{
					pushFollow(FOLLOW_llavefor_in_tabla74);
					llavefor();
					state._fsp--;

					}
					break;

			}

			match(input,FIN,FOLLOW_FIN_in_tabla78); 

			    salidasql.append(" );\n");

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "tabla"



	// $ANTLR start "campo"
	// T.g:46:1: campo : ID (t= CANTIDAD |t= ALFABETO |t= FECHA ) ;
	public final void campo() throws RecognitionException {
		Token t=null;
		Token ID4=null;

		try {
			// T.g:46:7: ( ID (t= CANTIDAD |t= ALFABETO |t= FECHA ) )
			// T.g:46:9: ID (t= CANTIDAD |t= ALFABETO |t= FECHA )
			{
			ID4=(Token)match(input,ID,FOLLOW_ID_in_campo88); 
			// T.g:46:12: (t= CANTIDAD |t= ALFABETO |t= FECHA )
			int alt4=3;
			switch ( input.LA(1) ) {
			case CANTIDAD:
				{
				alt4=1;
				}
				break;
			case ALFABETO:
				{
				alt4=2;
				}
				break;
			case FECHA:
				{
				alt4=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}
			switch (alt4) {
				case 1 :
					// T.g:46:13: t= CANTIDAD
					{
					t=(Token)match(input,CANTIDAD,FOLLOW_CANTIDAD_in_campo93); 
					}
					break;
				case 2 :
					// T.g:46:26: t= ALFABETO
					{
					t=(Token)match(input,ALFABETO,FOLLOW_ALFABETO_in_campo99); 
					}
					break;
				case 3 :
					// T.g:46:39: t= FECHA
					{
					t=(Token)match(input,FECHA,FOLLOW_FECHA_in_campo105); 
					}
					break;

			}


			    String tipoSQL;
			    if ((t!=null?t.getText():null).equals("cantidad")) {
			        tipoSQL = "INT";
			    } else if ((t!=null?t.getText():null).equals("alfabeto")) {
			        tipoSQL = "VARCHAR(255)";
			    } else if ((t!=null?t.getText():null).equals("fecha")) {
			        tipoSQL = "DATE";
			    } else {
			        salida.append("Tipo de dato no reconocido: " + (t!=null?t.getText():null));
			        tipoSQL = "";
			    }

			    if (!tipoSQL.isEmpty()) {
			        salidasql.append(", " + (ID4!=null?ID4.getText():null) + " " + tipoSQL +"\n");
			        Atributo a = new Atributo();
			        a.nombreAtributo = (ID4!=null?ID4.getText():null);
			        a.tipoAtributo = (t!=null?t.getText():null);
			        a.tipoSQL = tipoSQL;
			        tablaActual.atributos.add(a);
			    }

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "campo"



	// $ANTLR start "llavefor"
	// T.g:69:1: llavefor : LLAVE_FORANEA ID REFERENCIA idTabla ;
	public final void llavefor() throws RecognitionException {
		Token ID5=null;
		ParserRuleReturnScope idTabla6 =null;

		try {
			// T.g:69:10: ( LLAVE_FORANEA ID REFERENCIA idTabla )
			// T.g:69:12: LLAVE_FORANEA ID REFERENCIA idTabla
			{
			match(input,LLAVE_FORANEA,FOLLOW_LLAVE_FORANEA_in_llavefor116); 
			ID5=(Token)match(input,ID,FOLLOW_ID_in_llavefor118); 
			match(input,REFERENCIA,FOLLOW_REFERENCIA_in_llavefor120); 
			pushFollow(FOLLOW_idTabla_in_llavefor122);
			idTabla6=idTabla();
			state._fsp--;


			    nombreLlaveForanea = (ID5!=null?ID5.getText():null); // Asignación del valor
			    salidasql.append(", FOREIGN KEY (" + nombreLlaveForanea + ") REFERENCES " + (idTabla6!=null?input.toString(idTabla6.start,idTabla6.stop):null) + "(" + (idTabla6!=null?input.toString(idTabla6.start,idTabla6.stop):null) + "_key)" +"\n");

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "llavefor"



	// $ANTLR start "terminar"
	// T.g:74:1: terminar : TERMINAR ;
	public final void terminar() throws RecognitionException {
		try {
			// T.g:74:10: ( TERMINAR )
			// T.g:74:12: TERMINAR
			{
			match(input,TERMINAR,FOLLOW_TERMINAR_in_terminar132); 

			    salida.append("Base de datos actual: " + nombreBaseDeDatosActual +"\n");
			    for (Tabla tabla : tablas) {
			        salida.append("Nombre de la tabla: " + tabla.nombre +"\n");
			        for (Atributo atributo : tabla.atributos) {
			            salida.append("Atributo: " + atributo.nombreAtributo + " Tipo de Atributo: " + atributo.tipoSQL +"\n");
			        }
			    }

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "terminar"


	public static class idDB_return extends ParserRuleReturnScope {
	};


	// $ANTLR start "idDB"
	// T.g:98:1: idDB : ID ;
	public final TParser.idDB_return idDB() throws RecognitionException {
		TParser.idDB_return retval = new TParser.idDB_return();
		retval.start = input.LT(1);

		try {
			// T.g:98:6: ( ID )
			// T.g:98:8: ID
			{
			match(input,ID,FOLLOW_ID_in_idDB265); 
			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "idDB"


	public static class idTabla_return extends ParserRuleReturnScope {
	};


	// $ANTLR start "idTabla"
	// T.g:99:1: idTabla : ID ;
	public final TParser.idTabla_return idTabla() throws RecognitionException {
		TParser.idTabla_return retval = new TParser.idTabla_return();
		retval.start = input.LT(1);

		try {
			// T.g:99:9: ( ID )
			// T.g:99:11: ID
			{
			match(input,ID,FOLLOW_ID_in_idTabla272); 
			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "idTabla"

	// Delegated rules



	public static final BitSet FOLLOW_creacion_in_inicio23 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_utilizar_in_inicio25 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_tabla_in_inicio27 = new BitSet(new long[]{0x0000000000006000L});
	public static final BitSet FOLLOW_terminar_in_inicio30 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CREAR_in_creacion38 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_idDB_in_creacion40 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_UTILIZAR_in_utilizar50 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_idDB_in_utilizar52 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TABLA_in_tabla62 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_idTabla_in_tabla64 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_INICIO_in_tabla66 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_campo_in_tabla70 = new BitSet(new long[]{0x0000000000000B00L});
	public static final BitSet FOLLOW_llavefor_in_tabla74 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_FIN_in_tabla78 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_campo88 = new BitSet(new long[]{0x00000000000000B0L});
	public static final BitSet FOLLOW_CANTIDAD_in_campo93 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ALFABETO_in_campo99 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FECHA_in_campo105 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LLAVE_FORANEA_in_llavefor116 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_ID_in_llavefor118 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_REFERENCIA_in_llavefor120 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_idTabla_in_llavefor122 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TERMINAR_in_terminar132 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_idDB265 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_idTabla272 = new BitSet(new long[]{0x0000000000000002L});
}
