package chapter.three;

/* Generated By:JavaCC: Do not edit this line. MiniJavaParser.java */
  public class MiniJavaParser implements MiniJavaParserConstants {

// The following is a simple grammar that will allow you
// to test the generated lexer.
/*
void Goal() :
{}
{
  ( MiniJavaToken() )*
  <EOF>
}

void MiniJavaToken():
{}
{
  "class"  |  <IDENTIFIER> | "{" | "public" | "static" | "void" |
  "main" | "(" | "String"  | "[" | "]" | ")" | "}" | "extends" | ";"
  | "return" | "," | "int" | "boolean" | "=" | "if" | "else" | "while"
  | "System.out.println" | "&&" | "<" | "+" | "-" | "*" | "." |
  "length" | <INTEGER_LITERAL> | "true" | "false" | "this" | "new" |
  "!"
}
*/
//adding parser
  static final public void Program() throws ParseException {
    MainClass();
    label_1:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case CLASS:
        ;
        break;
      default:
        jj_la1[0] = jj_gen;
        break label_1;
      }
      ClassDecl();
    }
    jj_consume_token(0);
  }

//rule for main class
  static final public void MainClass() throws ParseException {
    jj_consume_token(CLASS);
    jj_consume_token(IDENTIFIER);
    jj_consume_token(28);
    jj_consume_token(PUBLIC);
    jj_consume_token(STATIC);
    jj_consume_token(VOID);
    jj_consume_token(MAIN);
    jj_consume_token(29);
    jj_consume_token(STRING);
    jj_consume_token(30);
    jj_consume_token(31);
    jj_consume_token(IDENTIFIER);
    jj_consume_token(32);
    jj_consume_token(28);
    label_2:
    while (true) {
      if (jj_2_1(2)) {
        ;
      } else {
        break label_2;
      }
      VarDecl();
    }
    label_3:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case IF:
      case WHILE:
      case IDENTIFIER:
      case 28:
      case 36:
        ;
        break;
      default:
        jj_la1[1] = jj_gen;
        break label_3;
      }
      Statement();
    }
    jj_consume_token(33);
    jj_consume_token(33);
  }

//rule for class other than main
  static final public void ClassDecl() throws ParseException {
    if (jj_2_2(3)) {
      jj_consume_token(CLASS);
      jj_consume_token(IDENTIFIER);
      jj_consume_token(28);
      label_4:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case INT:
        case BOOLEAN:
        case IDENTIFIER:
          ;
          break;
        default:
          jj_la1[2] = jj_gen;
          break label_4;
        }
        VarDecl();
      }
      label_5:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case PUBLIC:
          ;
          break;
        default:
          jj_la1[3] = jj_gen;
          break label_5;
        }
        MethodDecl();
      }
      jj_consume_token(33);
    } else {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case CLASS:
        jj_consume_token(CLASS);
        jj_consume_token(IDENTIFIER);
        jj_consume_token(EXTENDS);
        jj_consume_token(IDENTIFIER);
        jj_consume_token(28);
        label_6:
        while (true) {
          switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
          case INT:
          case BOOLEAN:
          case IDENTIFIER:
            ;
            break;
          default:
            jj_la1[4] = jj_gen;
            break label_6;
          }
          VarDecl();
        }
        label_7:
        while (true) {
          switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
          case PUBLIC:
            ;
            break;
          default:
            jj_la1[5] = jj_gen;
            break label_7;
          }
          MethodDecl();
        }
        jj_consume_token(33);
        break;
      default:
        jj_la1[6] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    }
  }

  static final public void VarDecl() throws ParseException {
    Type();
    jj_consume_token(IDENTIFIER);
    jj_consume_token(34);
  }

  static final public void MethodDecl() throws ParseException {
    jj_consume_token(PUBLIC);
    Type();
    jj_consume_token(IDENTIFIER);
    jj_consume_token(29);
    FormalList();
    jj_consume_token(32);
    jj_consume_token(28);
    label_8:
    while (true) {
      if (jj_2_3(2)) {
        ;
      } else {
        break label_8;
      }
      VarDecl();
    }
    label_9:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case IF:
      case WHILE:
      case IDENTIFIER:
      case 28:
      case 36:
        ;
        break;
      default:
        jj_la1[7] = jj_gen;
        break label_9;
      }
      Statement();
    }
    jj_consume_token(RETURN);
    Exp();
    jj_consume_token(34);
    jj_consume_token(33);
  }

  static final public void FormalList() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case INT:
    case BOOLEAN:
    case IDENTIFIER:
      Type();
      jj_consume_token(IDENTIFIER);
      label_10:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case 35:
          ;
          break;
        default:
          jj_la1[8] = jj_gen;
          break label_10;
        }
        FormalRest();
      }
      break;
    default:
      jj_la1[9] = jj_gen;
      ;
    }
  }

  static final public void FormalRest() throws ParseException {
    jj_consume_token(35);
    Type();
    jj_consume_token(IDENTIFIER);
  }

  static final public void Type() throws ParseException {
    if (jj_2_4(2)) {
      jj_consume_token(INT);
      jj_consume_token(30);
      jj_consume_token(31);
    } else {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case BOOLEAN:
        jj_consume_token(BOOLEAN);
        break;
      case INT:
        jj_consume_token(INT);
        break;
      case IDENTIFIER:
        jj_consume_token(IDENTIFIER);
        break;
      default:
        jj_la1[10] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    }
  }

  static final public void Statement() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case 28:
      jj_consume_token(28);
      label_11:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case IF:
        case WHILE:
        case IDENTIFIER:
        case 28:
        case 36:
          ;
          break;
        default:
          jj_la1[11] = jj_gen;
          break label_11;
        }
        Statement();
      }
      jj_consume_token(33);
      break;
    case IF:
      jj_consume_token(IF);
      jj_consume_token(29);
      Exp();
      jj_consume_token(32);
      Statement();
      jj_consume_token(ELSE);
      Statement();
      break;
    case WHILE:
      jj_consume_token(WHILE);
      jj_consume_token(29);
      Exp();
      jj_consume_token(32);
      Statement();
      break;
    case 36:
      jj_consume_token(36);
      jj_consume_token(29);
      Exp();
      jj_consume_token(32);
      jj_consume_token(34);
      break;
    default:
      jj_la1[12] = jj_gen;
      if (jj_2_5(2)) {
        jj_consume_token(IDENTIFIER);
        jj_consume_token(37);
        Exp();
        jj_consume_token(34);
      } else {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case IDENTIFIER:
          jj_consume_token(IDENTIFIER);
          jj_consume_token(30);
          Exp();
          jj_consume_token(31);
          jj_consume_token(37);
          Exp();
          jj_consume_token(34);
          break;
        default:
          jj_la1[13] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
      }
    }
  }

  static final public void Exp() throws ParseException {
    if (jj_2_6(2)) {
      jj_consume_token(INTEGER_LITERAL);
      jj_consume_token(38);
      jj_consume_token(INTEGER_LITERAL);
    } else if (jj_2_7(2)) {
      jj_consume_token(IDENTIFIER);
      jj_consume_token(30);
      Exp();
      jj_consume_token(31);
    } else if (jj_2_8(3)) {
      jj_consume_token(IDENTIFIER);
      jj_consume_token(39);
      jj_consume_token(LENGTH);
    } else if (jj_2_9(3)) {
      jj_consume_token(IDENTIFIER);
      jj_consume_token(39);
      jj_consume_token(IDENTIFIER);
      jj_consume_token(29);
      ExpList();
      jj_consume_token(32);
    } else {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case INTEGER_LITERAL:
        jj_consume_token(INTEGER_LITERAL);
        break;
      case TRUE:
        jj_consume_token(TRUE);
        break;
      case FALSE:
        jj_consume_token(FALSE);
        break;
      case IDENTIFIER:
        jj_consume_token(IDENTIFIER);
        break;
      case THIS:
        jj_consume_token(THIS);
        break;
      default:
        jj_la1[14] = jj_gen;
        if (jj_2_10(2)) {
          jj_consume_token(NEW);
          jj_consume_token(INT);
          jj_consume_token(30);
          Exp();
          jj_consume_token(31);
        } else {
          switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
          case NEW:
            jj_consume_token(NEW);
            jj_consume_token(IDENTIFIER);
            jj_consume_token(29);
            jj_consume_token(32);
            break;
          case 40:
            jj_consume_token(40);
            Exp();
            break;
          case 29:
            jj_consume_token(29);
            Exp();
            jj_consume_token(32);
            break;
          default:
            jj_la1[15] = jj_gen;
            jj_consume_token(-1);
            throw new ParseException();
          }
        }
      }
    }
  }

  static final public void ExpList() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case NEW:
    case TRUE:
    case THIS:
    case FALSE:
    case IDENTIFIER:
    case INTEGER_LITERAL:
    case 29:
    case 40:
      Exp();
      label_12:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case 35:
          ;
          break;
        default:
          jj_la1[16] = jj_gen;
          break label_12;
        }
        ExpRest();
      }
      break;
    default:
      jj_la1[17] = jj_gen;
      ;
    }
  }

  static final public void ExpRest() throws ParseException {
    jj_consume_token(35);
    Exp();
  }

  static private boolean jj_2_1(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_1(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(0, xla); }
  }

  static private boolean jj_2_2(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_2(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(1, xla); }
  }

  static private boolean jj_2_3(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_3(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(2, xla); }
  }

  static private boolean jj_2_4(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_4(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(3, xla); }
  }

  static private boolean jj_2_5(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_5(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(4, xla); }
  }

  static private boolean jj_2_6(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_6(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(5, xla); }
  }

  static private boolean jj_2_7(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_7(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(6, xla); }
  }

  static private boolean jj_2_8(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_8(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(7, xla); }
  }

  static private boolean jj_2_9(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_9(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(8, xla); }
  }

  static private boolean jj_2_10(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_10(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(9, xla); }
  }

  static private boolean jj_3_3() {
    if (jj_3R_13()) return true;
    return false;
  }

  static private boolean jj_3_9() {
    if (jj_scan_token(IDENTIFIER)) return true;
    if (jj_scan_token(39)) return true;
    if (jj_scan_token(IDENTIFIER)) return true;
    return false;
  }

  static private boolean jj_3_8() {
    if (jj_scan_token(IDENTIFIER)) return true;
    if (jj_scan_token(39)) return true;
    if (jj_scan_token(LENGTH)) return true;
    return false;
  }

  static private boolean jj_3_7() {
    if (jj_scan_token(IDENTIFIER)) return true;
    if (jj_scan_token(30)) return true;
    return false;
  }

  static private boolean jj_3R_14() {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3_4()) {
    jj_scanpos = xsp;
    if (jj_scan_token(22)) {
    jj_scanpos = xsp;
    if (jj_scan_token(8)) {
    jj_scanpos = xsp;
    if (jj_scan_token(26)) return true;
    }
    }
    }
    return false;
  }

  static private boolean jj_3_4() {
    if (jj_scan_token(INT)) return true;
    if (jj_scan_token(30)) return true;
    return false;
  }

  static private boolean jj_3R_13() {
    if (jj_3R_14()) return true;
    if (jj_scan_token(IDENTIFIER)) return true;
    return false;
  }

  static private boolean jj_3_6() {
    if (jj_scan_token(INTEGER_LITERAL)) return true;
    if (jj_scan_token(38)) return true;
    return false;
  }

  static private boolean jj_3_5() {
    if (jj_scan_token(IDENTIFIER)) return true;
    if (jj_scan_token(37)) return true;
    return false;
  }

  static private boolean jj_3_10() {
    if (jj_scan_token(NEW)) return true;
    if (jj_scan_token(INT)) return true;
    return false;
  }

  static private boolean jj_3_2() {
    if (jj_scan_token(CLASS)) return true;
    if (jj_scan_token(IDENTIFIER)) return true;
    if (jj_scan_token(28)) return true;
    return false;
  }

  static private boolean jj_3_1() {
    if (jj_3R_13()) return true;
    return false;
  }

  static private boolean jj_initialized_once = false;
  /** Generated Token Manager. */
  static public MiniJavaParserTokenManager token_source;
  static JavaCharStream jj_input_stream;
  /** Current token. */
  static public Token token;
  /** Next token. */
  static public Token jj_nt;
  static private int jj_ntk;
  static private Token jj_scanpos, jj_lastpos;
  static private int jj_la;
  static private int jj_gen;
  static final private int[] jj_la1 = new int[18];
  static private int[] jj_la1_0;
  static private int[] jj_la1_1;
  static {
      jj_la1_init_0();
      jj_la1_init_1();
   }
   private static void jj_la1_init_0() {
      jj_la1_0 = new int[] {0x40,0x14008080,0x4400100,0x20000,0x4400100,0x20000,0x40,0x14008080,0x0,0x4400100,0x4400100,0x14008080,0x10008080,0x4000000,0xc015000,0x20000200,0x0,0x2c015200,};
   }
   private static void jj_la1_init_1() {
      jj_la1_1 = new int[] {0x0,0x10,0x0,0x0,0x0,0x0,0x0,0x10,0x8,0x0,0x0,0x10,0x10,0x0,0x0,0x100,0x8,0x100,};
   }
  static final private JJCalls[] jj_2_rtns = new JJCalls[10];
  static private boolean jj_rescan = false;
  static private int jj_gc = 0;

  /** Constructor with InputStream. */
  public MiniJavaParser(java.io.InputStream stream) {
     this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public MiniJavaParser(java.io.InputStream stream, String encoding) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser.  ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    try { jj_input_stream = new JavaCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source = new MiniJavaParserTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 18; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Reinitialise. */
  static public void ReInit(java.io.InputStream stream) {
     ReInit(stream, null);
  }
  /** Reinitialise. */
  static public void ReInit(java.io.InputStream stream, String encoding) {
    try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 18; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Constructor. */
  public MiniJavaParser(java.io.Reader stream) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser. ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    jj_input_stream = new JavaCharStream(stream, 1, 1);
    token_source = new MiniJavaParserTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 18; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Reinitialise. */
  static public void ReInit(java.io.Reader stream) {
    jj_input_stream.ReInit(stream, 1, 1);
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 18; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Constructor with generated Token Manager. */
  public MiniJavaParser(MiniJavaParserTokenManager tm) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser. ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 18; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Reinitialise. */
  public void ReInit(MiniJavaParserTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 18; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  static private Token jj_consume_token(int kind) throws ParseException {
    Token oldToken;
    if ((oldToken = token).next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    if (token.kind == kind) {
      jj_gen++;
      if (++jj_gc > 100) {
        jj_gc = 0;
        for (int i = 0; i < jj_2_rtns.length; i++) {
          JJCalls c = jj_2_rtns[i];
          while (c != null) {
            if (c.gen < jj_gen) c.first = null;
            c = c.next;
          }
        }
      }
      return token;
    }
    token = oldToken;
    jj_kind = kind;
    throw generateParseException();
  }

  static private final class LookaheadSuccess extends java.lang.Error { }
  static final private LookaheadSuccess jj_ls = new LookaheadSuccess();
  static private boolean jj_scan_token(int kind) {
    if (jj_scanpos == jj_lastpos) {
      jj_la--;
      if (jj_scanpos.next == null) {
        jj_lastpos = jj_scanpos = jj_scanpos.next = token_source.getNextToken();
      } else {
        jj_lastpos = jj_scanpos = jj_scanpos.next;
      }
    } else {
      jj_scanpos = jj_scanpos.next;
    }
    if (jj_rescan) {
      int i = 0; Token tok = token;
      while (tok != null && tok != jj_scanpos) { i++; tok = tok.next; }
      if (tok != null) jj_add_error_token(kind, i);
    }
    if (jj_scanpos.kind != kind) return true;
    if (jj_la == 0 && jj_scanpos == jj_lastpos) throw jj_ls;
    return false;
  }


/** Get the next Token. */
  static final public Token getNextToken() {
    if (token.next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    jj_gen++;
    return token;
  }

/** Get the specific Token. */
  static final public Token getToken(int index) {
    Token t = token;
    for (int i = 0; i < index; i++) {
      if (t.next != null) t = t.next;
      else t = t.next = token_source.getNextToken();
    }
    return t;
  }

  static private int jj_ntk() {
    if ((jj_nt=token.next) == null)
      return (jj_ntk = (token.next=token_source.getNextToken()).kind);
    else
      return (jj_ntk = jj_nt.kind);
  }

  static private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
  static private int[] jj_expentry;
  static private int jj_kind = -1;
  static private int[] jj_lasttokens = new int[100];
  static private int jj_endpos;

  static private void jj_add_error_token(int kind, int pos) {
    if (pos >= 100) return;
    if (pos == jj_endpos + 1) {
      jj_lasttokens[jj_endpos++] = kind;
    } else if (jj_endpos != 0) {
      jj_expentry = new int[jj_endpos];
      for (int i = 0; i < jj_endpos; i++) {
        jj_expentry[i] = jj_lasttokens[i];
      }
      boolean exists = false;
      for (java.util.Iterator<?> it = jj_expentries.iterator(); it.hasNext();) {
        exists = true;
        int[] oldentry = (int[])(it.next());
        if (oldentry.length == jj_expentry.length) {
          for (int i = 0; i < jj_expentry.length; i++) {
            if (oldentry[i] != jj_expentry[i]) {
              exists = false;
              break;
            }
          }
          if (exists) break;
        }
      }
      if (!exists) jj_expentries.add(jj_expentry);
      if (pos != 0) jj_lasttokens[(jj_endpos = pos) - 1] = kind;
    }
  }

  /** Generate ParseException. */
  static public ParseException generateParseException() {
    jj_expentries.clear();
    boolean[] la1tokens = new boolean[41];
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 18; i++) {
      if (jj_la1[i] == jj_gen) {
        for (int j = 0; j < 32; j++) {
          if ((jj_la1_0[i] & (1<<j)) != 0) {
            la1tokens[j] = true;
          }
          if ((jj_la1_1[i] & (1<<j)) != 0) {
            la1tokens[32+j] = true;
          }
        }
      }
    }
    for (int i = 0; i < 41; i++) {
      if (la1tokens[i]) {
        jj_expentry = new int[1];
        jj_expentry[0] = i;
        jj_expentries.add(jj_expentry);
      }
    }
    jj_endpos = 0;
    jj_rescan_token();
    jj_add_error_token(0, 0);
    int[][] exptokseq = new int[jj_expentries.size()][];
    for (int i = 0; i < jj_expentries.size(); i++) {
      exptokseq[i] = jj_expentries.get(i);
    }
    return new ParseException(token, exptokseq, tokenImage);
  }

  /** Enable tracing. */
  static final public void enable_tracing() {
  }

  /** Disable tracing. */
  static final public void disable_tracing() {
  }

  static private void jj_rescan_token() {
    jj_rescan = true;
    for (int i = 0; i < 10; i++) {
    try {
      JJCalls p = jj_2_rtns[i];
      do {
        if (p.gen > jj_gen) {
          jj_la = p.arg; jj_lastpos = jj_scanpos = p.first;
          switch (i) {
            case 0: jj_3_1(); break;
            case 1: jj_3_2(); break;
            case 2: jj_3_3(); break;
            case 3: jj_3_4(); break;
            case 4: jj_3_5(); break;
            case 5: jj_3_6(); break;
            case 6: jj_3_7(); break;
            case 7: jj_3_8(); break;
            case 8: jj_3_9(); break;
            case 9: jj_3_10(); break;
          }
        }
        p = p.next;
      } while (p != null);
      } catch(LookaheadSuccess ls) { }
    }
    jj_rescan = false;
  }

  static private void jj_save(int index, int xla) {
    JJCalls p = jj_2_rtns[index];
    while (p.gen > jj_gen) {
      if (p.next == null) { p = p.next = new JJCalls(); break; }
      p = p.next;
    }
    p.gen = jj_gen + xla - jj_la; p.first = token; p.arg = xla;
  }

  static final class JJCalls {
    int gen;
    Token first;
    int arg;
    JJCalls next;
  }

                               }
