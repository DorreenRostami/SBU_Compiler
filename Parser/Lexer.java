// DO NOT EDIT
// Generated by JFlex 1.8.1 http://jflex.de/
// source: scanner.flex

import java_cup.runtime.*;


// See https://github.com/jflex-de/jflex/issues/222
@SuppressWarnings("FallThrough")
public class Lexer implements java_cup.runtime.Scanner {

  /** This character denotes the end of file. */
  public static final int YYEOF = -1;

  /** Initial size of the lookahead buffer. */
  private static final int ZZ_BUFFERSIZE = 16384;

  // Lexical states.
  public static final int YYINITIAL = 0;
  public static final int STRING = 2;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = {
     0,  0,  1, 1
  };

  /**
   * Top-level table for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_TOP = zzUnpackcmap_top();

  private static final String ZZ_CMAP_TOP_PACKED_0 =
    "\1\0\u10ff\u0100";

  private static int [] zzUnpackcmap_top() {
    int [] result = new int[4352];
    int offset = 0;
    offset = zzUnpackcmap_top(ZZ_CMAP_TOP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_top(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Second-level tables for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_BLOCKS = zzUnpackcmap_blocks();

  private static final String ZZ_CMAP_BLOCKS_PACKED_0 =
    "\11\0\1\1\1\2\1\0\1\1\1\3\22\0\1\1"+
    "\1\4\1\5\2\0\1\6\1\7\1\10\1\11\1\12"+
    "\1\13\1\14\1\15\1\16\1\17\1\20\1\21\11\22"+
    "\1\0\1\23\1\24\1\25\1\26\2\0\1\27\3\30"+
    "\1\31\1\30\2\32\1\33\2\32\1\34\1\32\1\35"+
    "\1\32\1\36\1\32\1\37\5\32\1\40\2\32\1\41"+
    "\1\42\1\43\1\0\1\44\1\0\1\45\1\46\1\47"+
    "\1\50\1\51\1\52\1\53\1\54\1\55\1\32\1\56"+
    "\1\57\1\60\1\61\1\62\1\63\1\32\1\64\1\65"+
    "\1\66\1\67\1\70\1\71\1\72\1\73\1\32\1\74"+
    "\1\75\1\76\u0182\0";

  private static int [] zzUnpackcmap_blocks() {
    int [] result = new int[512];
    int offset = 0;
    offset = zzUnpackcmap_blocks(ZZ_CMAP_BLOCKS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_blocks(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /**
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\2\2\1\3\1\4\1\5\1\0\1\6"+
    "\1\7\1\10\1\11\1\12\1\13\1\14\1\15\2\16"+
    "\1\17\1\20\1\21\1\22\4\23\1\24\1\25\15\23"+
    "\1\26\1\0\1\27\1\1\1\30\1\31\1\32\1\33"+
    "\1\0\1\2\1\34\1\0\1\35\1\36\1\37\16\23"+
    "\1\40\15\23\1\41\1\42\1\43\1\44\1\45\1\46"+
    "\1\47\2\0\1\16\15\23\1\50\1\23\1\51\1\23"+
    "\1\52\12\23\1\0\1\34\3\23\1\53\1\23\1\54"+
    "\3\23\1\55\1\56\4\23\1\57\1\60\1\61\5\23"+
    "\1\62\1\63\1\64\2\23\1\65\2\23\1\66\1\67"+
    "\3\23\1\70\7\23\1\71\4\23\1\72\5\23\1\73"+
    "\1\74\1\75\4\23\1\76\2\23\1\77\1\23\1\100"+
    "\1\23\1\101\1\102\5\23\1\103\1\104\1\23\1\105"+
    "\1\106";

  private static int [] zzUnpackAction() {
    int [] result = new int[205];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\77\0\176\0\275\0\374\0\176\0\176\0\u013b"+
    "\0\176\0\176\0\176\0\176\0\176\0\176\0\176\0\u017a"+
    "\0\u01b9\0\u01f8\0\176\0\u0237\0\u0276\0\u02b5\0\u02f4\0\u0333"+
    "\0\u0372\0\u03b1\0\176\0\176\0\u03f0\0\u042f\0\u046e\0\u04ad"+
    "\0\u04ec\0\u052b\0\u056a\0\u05a9\0\u05e8\0\u0627\0\u0666\0\u06a5"+
    "\0\u06e4\0\176\0\u0723\0\176\0\u0762\0\176\0\u07a1\0\176"+
    "\0\176\0\u07e0\0\u081f\0\u085e\0\u089d\0\176\0\176\0\176"+
    "\0\u08dc\0\u091b\0\u095a\0\u0999\0\u09d8\0\u0a17\0\u0a56\0\u0a95"+
    "\0\u0ad4\0\u0b13\0\u0b52\0\u0b91\0\u0bd0\0\u0c0f\0\u02f4\0\u0c4e"+
    "\0\u0c8d\0\u0ccc\0\u0d0b\0\u0d4a\0\u0d89\0\u0dc8\0\u0e07\0\u0e46"+
    "\0\u0e85\0\u0ec4\0\u0f03\0\u0f42\0\176\0\176\0\176\0\176"+
    "\0\176\0\176\0\176\0\u0f81\0\u0fc0\0\u089d\0\u0fff\0\u103e"+
    "\0\u107d\0\u10bc\0\u10fb\0\u113a\0\u1179\0\u11b8\0\u11f7\0\u1236"+
    "\0\u1275\0\u12b4\0\u12f3\0\u02f4\0\u1332\0\u1371\0\u13b0\0\u02f4"+
    "\0\u13ef\0\u142e\0\u146d\0\u14ac\0\u14eb\0\u152a\0\u1569\0\u15a8"+
    "\0\u15e7\0\u1626\0\u1665\0\u1665\0\u16a4\0\u16e3\0\u1722\0\u02f4"+
    "\0\u1761\0\u02f4\0\u17a0\0\u17df\0\u181e\0\u02f4\0\u02f4\0\u185d"+
    "\0\u189c\0\u18db\0\u191a\0\u02f4\0\u02f4\0\u02f4\0\u1959\0\u1998"+
    "\0\u19d7\0\u1a16\0\u1a55\0\u02f4\0\u02f4\0\u02f4\0\u1a94\0\u1ad3"+
    "\0\u02f4\0\u1b12\0\u1b51\0\u02f4\0\u02f4\0\u1b90\0\u1bcf\0\u1c0e"+
    "\0\u02f4\0\u1c4d\0\u1c8c\0\u1ccb\0\u1d0a\0\u1d49\0\u1d88\0\u1dc7"+
    "\0\u02f4\0\u1e06\0\u1e45\0\u1e84\0\u1ec3\0\u02f4\0\u1f02\0\u1f41"+
    "\0\u1f80\0\u1fbf\0\u1ffe\0\u02f4\0\u02f4\0\u02f4\0\u203d\0\u207c"+
    "\0\u20bb\0\u20fa\0\u02f4\0\u2139\0\u2178\0\u02f4\0\u21b7\0\u02f4"+
    "\0\u21f6\0\u02f4\0\u02f4\0\u2235\0\u2274\0\u22b3\0\u22f2\0\u2331"+
    "\0\u02f4\0\u02f4\0\u2370\0\u02f4\0\u02f4";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[205];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /**
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\0\2\3\1\4\1\5\1\6\1\7\1\10\1\0"+
    "\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20"+
    "\1\21\1\22\1\23\1\24\1\25\1\26\6\27\1\30"+
    "\1\31\1\32\1\27\1\33\1\0\1\34\1\0\1\27"+
    "\1\35\1\36\1\37\1\40\1\41\2\27\1\42\3\27"+
    "\1\43\1\27\1\44\1\45\1\46\1\47\1\27\1\50"+
    "\1\51\2\27\1\52\1\53\1\54\2\55\2\0\1\55"+
    "\1\56\34\55\1\57\34\55\101\0\1\3\121\0\1\60"+
    "\60\0\1\61\102\0\1\62\4\0\1\63\75\0\1\64"+
    "\1\0\2\22\15\0\1\65\31\0\1\65\23\0\1\64"+
    "\1\0\2\22\101\0\1\66\76\0\1\67\76\0\1\70"+
    "\72\0\2\27\4\0\12\27\3\0\30\27\24\0\2\27"+
    "\4\0\12\27\3\0\5\27\1\71\22\27\24\0\2\27"+
    "\4\0\12\27\3\0\20\27\1\72\7\27\24\0\2\27"+
    "\4\0\12\27\3\0\5\27\1\73\22\27\24\0\2\27"+
    "\4\0\12\27\3\0\16\27\1\74\1\27\1\75\1\27"+
    "\1\76\5\27\24\0\2\27\4\0\12\27\3\0\13\27"+
    "\1\77\2\27\1\100\11\27\24\0\2\27\4\0\12\27"+
    "\3\0\16\27\1\101\3\27\1\102\5\27\24\0\2\27"+
    "\4\0\12\27\3\0\13\27\1\103\12\27\1\104\1\27"+
    "\24\0\2\27\4\0\12\27\3\0\1\27\1\105\14\27"+
    "\1\106\11\27\24\0\2\27\4\0\12\27\3\0\6\27"+
    "\1\107\5\27\1\110\1\111\4\27\1\112\5\27\24\0"+
    "\2\27\4\0\12\27\3\0\5\27\1\113\15\27\1\114"+
    "\4\27\24\0\2\27\4\0\12\27\3\0\20\27\1\115"+
    "\2\27\1\116\4\27\24\0\2\27\4\0\12\27\3\0"+
    "\5\27\1\117\22\27\24\0\2\27\4\0\12\27\3\0"+
    "\22\27\1\120\5\27\24\0\2\27\4\0\12\27\3\0"+
    "\10\27\1\121\7\27\1\122\7\27\24\0\2\27\4\0"+
    "\12\27\3\0\16\27\1\123\11\27\24\0\2\27\4\0"+
    "\12\27\3\0\10\27\1\124\17\27\100\0\1\125\1\0"+
    "\2\55\2\0\1\55\1\0\34\55\1\0\34\55\5\0"+
    "\1\126\2\0\1\127\10\0\1\130\24\0\1\131\3\0"+
    "\1\132\13\0\1\133\10\0\13\62\1\134\63\62\2\63"+
    "\2\0\73\63\21\0\2\64\6\0\1\135\17\0\1\135"+
    "\46\0\2\136\4\0\3\136\13\0\6\136\45\0\2\27"+
    "\4\0\12\27\3\0\25\27\1\137\2\27\24\0\2\27"+
    "\4\0\12\27\3\0\11\27\1\140\16\27\24\0\2\27"+
    "\4\0\12\27\3\0\1\27\1\141\26\27\24\0\2\27"+
    "\4\0\12\27\3\0\16\27\1\142\11\27\24\0\2\27"+
    "\4\0\12\27\3\0\5\27\1\143\22\27\24\0\2\27"+
    "\4\0\12\27\3\0\16\27\1\144\11\27\24\0\2\27"+
    "\4\0\12\27\3\0\1\27\1\145\26\27\24\0\2\27"+
    "\4\0\12\27\3\0\15\27\1\146\12\27\24\0\2\27"+
    "\4\0\12\27\3\0\23\27\1\147\4\27\24\0\2\27"+
    "\4\0\12\27\3\0\16\27\1\150\11\27\24\0\2\27"+
    "\4\0\12\27\3\0\21\27\1\151\6\27\24\0\2\27"+
    "\4\0\12\27\3\0\22\27\1\152\5\27\24\0\2\27"+
    "\4\0\12\27\3\0\13\27\1\153\14\27\24\0\2\27"+
    "\4\0\12\27\3\0\20\27\1\154\7\27\24\0\2\27"+
    "\4\0\12\27\3\0\17\27\1\155\10\27\24\0\2\27"+
    "\4\0\12\27\3\0\22\27\1\156\5\27\24\0\2\27"+
    "\4\0\12\27\3\0\16\27\1\157\11\27\24\0\2\27"+
    "\4\0\12\27\3\0\25\27\1\160\2\27\24\0\2\27"+
    "\4\0\12\27\3\0\13\27\1\161\14\27\24\0\2\27"+
    "\4\0\12\27\3\0\11\27\1\162\4\27\1\163\11\27"+
    "\24\0\2\27\4\0\12\27\3\0\2\27\1\164\25\27"+
    "\24\0\2\27\4\0\12\27\3\0\22\27\1\165\5\27"+
    "\24\0\2\27\4\0\12\27\3\0\20\27\1\166\7\27"+
    "\24\0\2\27\4\0\12\27\3\0\11\27\1\167\16\27"+
    "\24\0\2\27\4\0\12\27\3\0\23\27\1\170\4\27"+
    "\24\0\2\27\4\0\12\27\3\0\11\27\1\171\16\27"+
    "\24\0\2\27\4\0\12\27\3\0\11\27\1\172\16\27"+
    "\3\0\13\62\1\134\4\62\1\3\56\62\14\0\1\173"+
    "\1\0\1\173\2\0\2\174\75\0\2\27\4\0\1\175"+
    "\11\27\3\0\30\27\24\0\2\27\4\0\12\27\3\0"+
    "\15\27\1\176\12\27\24\0\2\27\4\0\12\27\3\0"+
    "\4\27\1\177\23\27\24\0\2\27\4\0\12\27\3\0"+
    "\13\27\1\200\14\27\24\0\2\27\4\0\12\27\3\0"+
    "\1\27\1\201\26\27\24\0\2\27\4\0\12\27\3\0"+
    "\11\27\1\202\16\27\24\0\2\27\4\0\12\27\3\0"+
    "\21\27\1\203\6\27\24\0\2\27\4\0\12\27\3\0"+
    "\22\27\1\204\5\27\24\0\2\27\4\0\12\27\3\0"+
    "\2\27\1\205\25\27\24\0\2\27\4\0\12\27\3\0"+
    "\11\27\1\206\16\27\24\0\2\27\4\0\12\27\3\0"+
    "\5\27\1\207\22\27\24\0\2\27\4\0\12\27\3\0"+
    "\5\27\1\210\22\27\24\0\2\27\4\0\12\27\3\0"+
    "\21\27\1\211\6\27\24\0\2\27\4\0\12\27\3\0"+
    "\13\27\1\212\14\27\24\0\2\27\4\0\12\27\3\0"+
    "\5\27\1\213\22\27\24\0\2\27\4\0\12\27\3\0"+
    "\2\27\1\214\1\27\1\215\23\27\24\0\2\27\4\0"+
    "\12\27\3\0\13\27\1\216\14\27\24\0\2\27\4\0"+
    "\12\27\3\0\24\27\1\217\3\27\24\0\2\27\4\0"+
    "\12\27\3\0\22\27\1\220\5\27\24\0\2\27\4\0"+
    "\12\27\3\0\13\27\1\221\14\27\24\0\2\27\4\0"+
    "\12\27\3\0\23\27\1\222\4\27\24\0\2\27\4\0"+
    "\12\27\3\0\11\27\1\223\16\27\24\0\2\27\4\0"+
    "\12\27\3\0\21\27\1\224\6\27\24\0\2\27\4\0"+
    "\12\27\3\0\5\27\1\225\22\27\24\0\2\27\4\0"+
    "\12\27\3\0\4\27\1\226\23\27\24\0\2\27\4\0"+
    "\12\27\3\0\13\27\1\227\14\27\24\0\2\174\75\0"+
    "\2\27\4\0\12\27\3\0\20\27\1\230\7\27\24\0"+
    "\2\27\4\0\12\27\3\0\22\27\1\231\5\27\24\0"+
    "\2\27\4\0\4\27\1\232\1\233\4\27\3\0\30\27"+
    "\24\0\2\27\4\0\12\27\3\0\12\27\1\234\15\27"+
    "\24\0\2\27\4\0\12\27\3\0\21\27\1\235\6\27"+
    "\24\0\2\27\4\0\12\27\3\0\11\27\1\236\16\27"+
    "\24\0\2\27\4\0\12\27\3\0\13\27\1\237\14\27"+
    "\24\0\2\27\4\0\12\27\3\0\15\27\1\240\12\27"+
    "\24\0\2\27\4\0\12\27\3\0\5\27\1\241\22\27"+
    "\24\0\2\27\4\0\12\27\3\0\5\27\1\242\22\27"+
    "\24\0\2\27\4\0\12\27\3\0\20\27\1\243\7\27"+
    "\24\0\2\27\4\0\12\27\3\0\1\27\1\244\26\27"+
    "\24\0\2\27\4\0\12\27\3\0\5\27\1\245\22\27"+
    "\24\0\2\27\4\0\12\27\3\0\11\27\1\246\16\27"+
    "\24\0\2\27\4\0\12\27\3\0\20\27\1\247\7\27"+
    "\24\0\2\27\4\0\12\27\3\0\15\27\1\250\12\27"+
    "\24\0\2\27\4\0\12\27\3\0\5\27\1\251\22\27"+
    "\24\0\2\27\4\0\12\27\3\0\20\27\1\252\7\27"+
    "\24\0\2\27\4\0\12\27\3\0\15\27\1\253\12\27"+
    "\24\0\2\27\4\0\12\27\3\0\11\27\1\254\16\27"+
    "\24\0\2\27\4\0\12\27\3\0\15\27\1\255\12\27"+
    "\24\0\2\27\4\0\12\27\3\0\5\27\1\256\22\27"+
    "\24\0\2\27\4\0\12\27\3\0\4\27\1\257\23\27"+
    "\24\0\2\27\4\0\12\27\3\0\14\27\1\260\13\27"+
    "\24\0\2\27\4\0\12\27\3\0\6\27\1\261\21\27"+
    "\24\0\2\27\4\0\12\27\3\0\22\27\1\262\5\27"+
    "\24\0\2\27\4\0\12\27\3\0\3\27\1\263\24\27"+
    "\24\0\2\27\4\0\12\27\3\0\3\27\1\264\24\27"+
    "\24\0\2\27\4\0\12\27\3\0\15\27\1\265\12\27"+
    "\24\0\2\27\4\0\12\27\3\0\7\27\1\266\20\27"+
    "\24\0\2\27\4\0\12\27\3\0\1\27\1\267\26\27"+
    "\24\0\2\27\4\0\12\27\3\0\22\27\1\270\5\27"+
    "\24\0\2\27\4\0\12\27\3\0\15\27\1\271\12\27"+
    "\24\0\2\27\4\0\12\27\3\0\23\27\1\272\4\27"+
    "\24\0\2\27\4\0\12\27\3\0\21\27\1\273\6\27"+
    "\24\0\2\27\4\0\12\27\3\0\5\27\1\274\22\27"+
    "\24\0\2\27\4\0\12\27\3\0\1\27\1\275\26\27"+
    "\24\0\2\27\4\0\12\27\3\0\5\27\1\276\22\27"+
    "\24\0\2\27\4\0\12\27\3\0\22\27\1\277\5\27"+
    "\24\0\2\27\4\0\12\27\3\0\27\27\1\300\24\0"+
    "\2\27\4\0\12\27\3\0\5\27\1\301\22\27\24\0"+
    "\2\27\4\0\12\27\3\0\5\27\1\302\22\27\24\0"+
    "\2\27\4\0\12\27\3\0\5\27\1\303\22\27\24\0"+
    "\2\27\4\0\12\27\3\0\15\27\1\304\12\27\24\0"+
    "\2\27\4\0\12\27\3\0\3\27\1\305\24\27\24\0"+
    "\2\27\4\0\12\27\3\0\5\27\1\306\22\27\24\0"+
    "\2\27\4\0\12\27\3\0\7\27\1\307\20\27\24\0"+
    "\2\27\4\0\12\27\3\0\22\27\1\310\5\27\24\0"+
    "\2\27\4\0\12\27\3\0\5\27\1\311\22\27\24\0"+
    "\2\27\4\0\12\27\3\0\4\27\1\312\23\27\24\0"+
    "\2\27\4\0\12\27\3\0\5\27\1\313\22\27\24\0"+
    "\2\27\4\0\12\27\3\0\21\27\1\314\6\27\24\0"+
    "\2\27\4\0\12\27\3\0\20\27\1\315\7\27\3\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[9135];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** Error code for "Unknown internal scanner error". */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  /** Error code for "could not match input". */
  private static final int ZZ_NO_MATCH = 1;
  /** Error code for "pushback value was too large". */
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /**
   * Error messages for {@link #ZZ_UNKNOWN_ERROR}, {@link #ZZ_NO_MATCH}, and
   * {@link #ZZ_PUSHBACK_2BIG} respectively.
   */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state {@code aState}
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\1\1\11\2\1\2\11\1\0\7\11\3\1"+
    "\1\11\7\1\2\11\15\1\1\11\1\0\1\11\1\1"+
    "\1\11\1\1\2\11\1\0\2\1\1\0\3\11\34\1"+
    "\7\11\2\0\35\1\1\0\122\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[205];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** Input device. */
  private java.io.Reader zzReader;

  /** Current state of the DFA. */
  private int zzState;

  /** Current lexical state. */
  private int zzLexicalState = YYINITIAL;

  /**
   * This buffer contains the current text to be matched and is the source of the {@link #yytext()}
   * string.
   */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** Text position at the last accepting state. */
  private int zzMarkedPos;

  /** Current text position in the buffer. */
  private int zzCurrentPos;

  /** Marks the beginning of the {@link #yytext()} string in the buffer. */
  private int zzStartRead;

  /** Marks the last character in the buffer, that has been read from input. */
  private int zzEndRead;

  /**
   * Whether the scanner is at the end of file.
   * @see #yyatEOF
   */
  private boolean zzAtEOF;

  /**
   * The number of occupied positions in {@link #zzBuffer} beyond {@link #zzEndRead}.
   *
   * <p>When a lead/high surrogate has been read from the input stream into the final
   * {@link #zzBuffer} position, this will have a value of 1; otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /** Number of newlines encountered up to the start of the matched text. */
  @SuppressWarnings("unused")
  private int yyline;

  /** Number of characters from the last newline up to the start of the matched text. */
  @SuppressWarnings("unused")
  private int yycolumn;

  /** Number of characters up to the start of the matched text. */
  private long yychar;

  /** Whether the scanner is currently at the beginning of a line. */
  @SuppressWarnings("unused")
  private boolean zzAtBOL = true;

  /** Whether the user-EOF-code has already been executed. */
  private boolean zzEOFDone;

  /* user code: */
    StringBuilder string;
//    private String addPlus(String str)
//    {
//        int i = str.indexOf('e');
//        return str.substring(0, i + 1) + "+" + str.substring(i + 1);
//    }

    private Symbol token(int tokenType) {
        return new Symbol(tokenType);
    }

    private Symbol token(int tokenType, Object value) {
        return new Symbol(tokenType, value);
    }


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public Lexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Translates raw input code points to DFA table row
   */
  private static int zzCMap(int input) {
    int offset = input & 255;
    return offset == input ? ZZ_CMAP_BLOCKS[offset] : ZZ_CMAP_BLOCKS[ZZ_CMAP_TOP[input >> 8] | offset];
  }

  /**
   * Refills the input buffer.
   *
   * @return {@code false} iff there was new input.
   * @exception java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead - zzStartRead);

      /* translate stored positions */
      zzEndRead -= zzStartRead;
      zzCurrentPos -= zzStartRead;
      zzMarkedPos -= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length * 2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException(
          "Reader returned 0 characters. See JFlex examples/zero-reader for a workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
        if (numRead == requested) { // We requested too few chars to encode a full Unicode character
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        } else {                    // There is room in the buffer for at least one more char
          int c = zzReader.read();  // Expecting to read a paired low surrogate char
          if (c == -1) {
            return true;
          } else {
            zzBuffer[zzEndRead++] = (char)c;
          }
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }


  /**
   * Closes the input reader.
   *
   * @throws java.io.IOException if the reader could not be closed.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true; // indicate end of file
    zzEndRead = zzStartRead; // invalidate buffer

    if (zzReader != null) {
      zzReader.close();
    }
  }


  /**
   * Resets the scanner to read from a new input stream.
   *
   * <p>Does not close the old reader.
   *
   * <p>All internal variables are reset, the old input stream <b>cannot</b> be reused (internal
   * buffer is discarded and lost). Lexical state is set to {@code ZZ_INITIAL}.
   *
   * <p>Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader The new input stream.
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzEOFDone = false;
    yyResetPosition();
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE) {
      zzBuffer = new char[ZZ_BUFFERSIZE];
    }
  }

  /**
   * Resets the input position.
   */
  private final void yyResetPosition() {
      zzAtBOL  = true;
      zzAtEOF  = false;
      zzCurrentPos = 0;
      zzMarkedPos = 0;
      zzStartRead = 0;
      zzEndRead = 0;
      zzFinalHighSurrogate = 0;
      yyline = 0;
      yycolumn = 0;
      yychar = 0L;
  }


  /**
   * Returns whether the scanner has reached the end of the reader it reads from.
   *
   * @return whether the scanner has reached EOF.
   */
  public final boolean yyatEOF() {
    return zzAtEOF;
  }


  /**
   * Returns the current lexical state.
   *
   * @return the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state.
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   *
   * @return the matched text.
   */
  public final String yytext() {
    return new String(zzBuffer, zzStartRead, zzMarkedPos-zzStartRead);
  }


  /**
   * Returns the character at the given position from the matched text.
   *
   * <p>It is equivalent to {@code yytext().charAt(pos)}, but faster.
   *
   * @param position the position of the character to fetch. A value from 0 to {@code yylength()-1}.
   *
   * @return the character at {@code position}.
   */
  public final char yycharat(int position) {
    return zzBuffer[zzStartRead + position];
  }


  /**
   * How many characters were matched.
   *
   * @return the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * <p>In a well-formed scanner (no or only correct usage of {@code yypushback(int)} and a
   * match-all fallback rule) this method will only be called with things that
   * "Can't Possibly Happen".
   *
   * <p>If this method is called, something is seriously wrong (e.g. a JFlex bug producing a faulty
   * scanner etc.).
   *
   * <p>Usual syntax/scanner level error handling should be done in error fallback rules.
   *
   * @param errorCode the code of the error message to display.
   */
  private static void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    } catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * <p>They will be read again by then next call of the scanning method.
   *
   * @param number the number of characters to be read again. This number must not be greater than
   *     {@link #yylength()}.
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
    
  yyclose();    }
  }




  /**
   * Resumes scanning until the next regular expression is matched, the end of input is encountered
   * or an I/O-Error occurs.
   *
   * @return the next token.
   * @exception java.io.IOException if any I/O-Error occurs.
   */
  @Override  public Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char[] zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      yychar+= zzMarkedPosL-zzStartRead;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMap(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
            zzDoEOF();
          { return new java_cup.runtime.Symbol(sym.EOF); }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1:
            { string.append(yytext());
            }
            // fall through
          case 71: break;
          case 2:
            { 
            }
            // fall through
          case 72: break;
          case 3:
            { return token(sym.NOT);
            }
            // fall through
          case 73: break;
          case 4:
            { string = new StringBuilder("\""); yybegin(STRING);
            }
            // fall through
          case 74: break;
          case 5:
            { return token(sym.MOD);
            }
            // fall through
          case 75: break;
          case 6:
            { return token(sym.LPAREN);
            }
            // fall through
          case 76: break;
          case 7:
            { return token(sym.RPAREN);
            }
            // fall through
          case 77: break;
          case 8:
            { return token(sym.PROD);
            }
            // fall through
          case 78: break;
          case 9:
            { return token(sym.PLUS);
            }
            // fall through
          case 79: break;
          case 10:
            { return token(sym.COMMA);
            }
            // fall through
          case 80: break;
          case 11:
            { return token(sym.MINUS);
            }
            // fall through
          case 81: break;
          case 12:
            { return token(sym.DOT);
            }
            // fall through
          case 82: break;
          case 13:
            { return token(sym.DIV);
            }
            // fall through
          case 83: break;
          case 14:
            { return token(sym.INTLITERAL);
            }
            // fall through
          case 84: break;
          case 15:
            { return token(sym.SEMICOLON);
            }
            // fall through
          case 85: break;
          case 16:
            { return token(sym.LT);
            }
            // fall through
          case 86: break;
          case 17:
            { return token(sym.ASSIGN);
            }
            // fall through
          case 87: break;
          case 18:
            { return token(sym.GT);
            }
            // fall through
          case 88: break;
          case 19:
            { return token(sym.IDENT);
            }
            // fall through
          case 89: break;
          case 20:
            { return token(sym.LBRACK);
            }
            // fall through
          case 90: break;
          case 21:
            { return token(sym.RBRACK);
            }
            // fall through
          case 91: break;
          case 22:
            { return token(sym.LCURLY);
            }
            // fall through
          case 92: break;
          case 23:
            { return token(sym.RCURLY);
            }
            // fall through
          case 93: break;
          case 24:
            { string.append("\"");
	    yybegin(YYINITIAL);
	    return token(sym.STRINGLITERAL, string);
            }
            // fall through
          case 94: break;
          case 25:
            { string.append('\\');
            }
            // fall through
          case 95: break;
          case 26:
            { return token(sym.NE);
            }
            // fall through
          case 96: break;
          case 27:
            { return token(sym.AND);
            }
            // fall through
          case 97: break;
          case 28:
            { return token(sym.DOUBLELITERAL);
            }
            // fall through
          case 98: break;
          case 29:
            { return token(sym.LE);
            }
            // fall through
          case 99: break;
          case 30:
            { return token(sym.EQ);
            }
            // fall through
          case 100: break;
          case 31:
            { return token(sym.GE);
            }
            // fall through
          case 101: break;
          case 32:
            { return token(sym.IF);
            }
            // fall through
          case 102: break;
          case 33:
            { return token(sym.OR);
            }
            // fall through
          case 103: break;
          case 34:
            { string.append('\"');
            }
            // fall through
          case 104: break;
          case 35:
            { string.append('\'');
            }
            // fall through
          case 105: break;
          case 36:
            { string.append('\0');
            }
            // fall through
          case 106: break;
          case 37:
            { string.append('\b');
            }
            // fall through
          case 107: break;
          case 38:
            { string.append('\f');
            }
            // fall through
          case 108: break;
          case 39:
            { string.append('\t');
            }
            // fall through
          case 109: break;
          case 40:
            { return token(sym.FOR);
            }
            // fall through
          case 110: break;
          case 41:
            { return token(sym.INT);
            }
            // fall through
          case 111: break;
          case 42:
            { return token(sym.NEW);
            }
            // fall through
          case 112: break;
          case 43:
            { return token(sym.BOOL);
            }
            // fall through
          case 113: break;
          case 44:
            { return token(sym.BTOI);
            }
            // fall through
          case 114: break;
          case 45:
            { return token(sym.DTOI);
            }
            // fall through
          case 115: break;
          case 46:
            { return token(sym.ELSE);
            }
            // fall through
          case 116: break;
          case 47:
            { return token(sym.ITOB);
            }
            // fall through
          case 117: break;
          case 48:
            { return token(sym.ITOD);
            }
            // fall through
          case 118: break;
          case 49:
            { return token(sym.NULL);
            }
            // fall through
          case 119: break;
          case 50:
            { return token(sym.THIS);
            }
            // fall through
          case 120: break;
          case 51:
            { return token(sym.TRUE);
            }
            // fall through
          case 121: break;
          case 52:
            { return token(sym.VOID);
            }
            // fall through
          case 122: break;
          case 53:
            { return token(sym.PRINT);
            }
            // fall through
          case 123: break;
          case 54:
            { return token(sym.BREAK);
            }
            // fall through
          case 124: break;
          case 55:
            { return token(sym.CLASS);
            }
            // fall through
          case 125: break;
          case 56:
            { return token(sym.FALSE);
            }
            // fall through
          case 126: break;
          case 57:
            { return token(sym.WHILE);
            }
            // fall through
          case 127: break;
          case 58:
            { return token(sym.DOUBLE);
            }
            // fall through
          case 128: break;
          case 59:
            { return token(sym.PUBLIC);
            }
            // fall through
          case 129: break;
          case 60:
            { return token(sym.RETURN);
            }
            // fall through
          case 130: break;
          case 61:
            { return token(sym.STRING);
            }
            // fall through
          case 131: break;
          case 62:
            { return token(sym.EXTENDS);
            }
            // fall through
          case 132: break;
          case 63:
            { return token(sym.PRIVATE);
            }
            // fall through
          case 133: break;
          case 64:
            { return token(sym.NEWARRAY);
            }
            // fall through
          case 134: break;
          case 65:
            { return token(sym.READLINE);
            }
            // fall through
          case 135: break;
          case 66:
            { return token(sym.CONTINUE);
            }
            // fall through
          case 136: break;
          case 67:
            { return token(sym.INTERFACE);
            }
            // fall through
          case 137: break;
          case 68:
            { return token(sym.PROTECTED);
            }
            // fall through
          case 138: break;
          case 69:
            { return token(sym.IMPLEMENTS);
            }
            // fall through
          case 139: break;
          case 70:
            { return token(sym.READINTEGER);
            }
            // fall through
          case 140: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}