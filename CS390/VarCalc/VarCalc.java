// Output created by jacc on Tue Sep 22 15:56:20 CDT 2020


class VarCalc implements VarCalcTokens {
    private int yyss = 100;
    private int yytok;
    private int yysp = 0;
    private int[] yyst;
    protected int yyerrno = (-1);
    private Object[] yysv;
    private Object yyrv;

    public boolean parse() {
        int yyn = 0;
        yysp = 0;
        yyst = new int[yyss];
        yysv = new Object[yyss];
        yytok = (lexer.getToken()
                 );
    loop:
        for (;;) {
            switch (yyn) {
                case 0:
                    yyst[yysp] = 0;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 28:
                    switch (yytok) {
                        case ID:
                            yyn = 8;
                            continue;
                        case LITERAL:
                            yyn = 9;
                            continue;
                        case LPAREN:
                            yyn = 10;
                            continue;
                    }
                    yyn = 59;
                    continue;

                case 1:
                    yyst[yysp] = 1;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 29:
                    switch (yytok) {
                        case ENDINPUT:
                            yyn = 56;
                            continue;
                        case SEMI:
                            yyn = 11;
                            continue;
                    }
                    yyn = 59;
                    continue;

                case 2:
                    yyst[yysp] = 2;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 30:
                    switch (yytok) {
                        case ENDINPUT:
                        case SEMI:
                            yyn = yyr3();
                            continue;
                    }
                    yyn = 59;
                    continue;

                case 3:
                    yyst[yysp] = 3;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 31:
                    switch (yytok) {
                        case LITERAL:
                        case LPAREN:
                        case ID:
                        case error:
                        case EQUAL:
                            yyn = 59;
                            continue;
                    }
                    yyn = yyr12();
                    continue;

                case 4:
                    yyst[yysp] = 4;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 32:
                    switch (yytok) {
                        case ADD:
                            yyn = 12;
                            continue;
                        case SUB:
                            yyn = 13;
                            continue;
                        case ENDINPUT:
                        case SEMI:
                            yyn = yyr4();
                            continue;
                    }
                    yyn = 59;
                    continue;

                case 5:
                    yyst[yysp] = 5;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 33:
                    yyn = yys5();
                    continue;

                case 6:
                    yyst[yysp] = 6;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 34:
                    switch (yytok) {
                        case ENDINPUT:
                        case SEMI:
                            yyn = yyr2();
                            continue;
                    }
                    yyn = 59;
                    continue;

                case 7:
                    yyst[yysp] = 7;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 35:
                    yyn = yys7();
                    continue;

                case 8:
                    yyst[yysp] = 8;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (next()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 36:
                    yyn = yys8();
                    continue;

                case 9:
                    yyst[yysp] = 9;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (next()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 37:
                    switch (yytok) {
                        case LITERAL:
                        case LPAREN:
                        case ID:
                        case error:
                        case EQUAL:
                            yyn = 59;
                            continue;
                    }
                    yyn = yyr16();
                    continue;

                case 10:
                    yyst[yysp] = 10;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (next()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 38:
                    switch (yytok) {
                        case LITERAL:
                            yyn = 9;
                            continue;
                        case LPAREN:
                            yyn = 10;
                            continue;
                        case ID:
                            yyn = 19;
                            continue;
                    }
                    yyn = 59;
                    continue;

                case 11:
                    yyst[yysp] = 11;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (next()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 39:
                    switch (yytok) {
                        case ID:
                            yyn = 8;
                            continue;
                        case LITERAL:
                            yyn = 9;
                            continue;
                        case LPAREN:
                            yyn = 10;
                            continue;
                    }
                    yyn = 59;
                    continue;

                case 12:
                    yyst[yysp] = 12;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (next()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 40:
                    switch (yytok) {
                        case LITERAL:
                            yyn = 9;
                            continue;
                        case LPAREN:
                            yyn = 10;
                            continue;
                        case ID:
                            yyn = 19;
                            continue;
                    }
                    yyn = 59;
                    continue;

                case 13:
                    yyst[yysp] = 13;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (next()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 41:
                    switch (yytok) {
                        case LITERAL:
                            yyn = 9;
                            continue;
                        case LPAREN:
                            yyn = 10;
                            continue;
                        case ID:
                            yyn = 19;
                            continue;
                    }
                    yyn = 59;
                    continue;

                case 14:
                    yyst[yysp] = 14;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (next()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 42:
                    switch (yytok) {
                        case LITERAL:
                            yyn = 9;
                            continue;
                        case LPAREN:
                            yyn = 10;
                            continue;
                        case ID:
                            yyn = 19;
                            continue;
                    }
                    yyn = 59;
                    continue;

                case 15:
                    yyst[yysp] = 15;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (next()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 43:
                    switch (yytok) {
                        case LITERAL:
                            yyn = 9;
                            continue;
                        case LPAREN:
                            yyn = 10;
                            continue;
                        case ID:
                            yyn = 19;
                            continue;
                    }
                    yyn = 59;
                    continue;

                case 16:
                    yyst[yysp] = 16;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (next()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 44:
                    switch (yytok) {
                        case LITERAL:
                            yyn = 9;
                            continue;
                        case LPAREN:
                            yyn = 10;
                            continue;
                        case ID:
                            yyn = 19;
                            continue;
                    }
                    yyn = 59;
                    continue;

                case 17:
                    yyst[yysp] = 17;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (next()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 45:
                    switch (yytok) {
                        case LITERAL:
                            yyn = 9;
                            continue;
                        case LPAREN:
                            yyn = 10;
                            continue;
                        case ID:
                            yyn = 19;
                            continue;
                    }
                    yyn = 59;
                    continue;

                case 18:
                    yyst[yysp] = 18;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 46:
                    switch (yytok) {
                        case ADD:
                            yyn = 12;
                            continue;
                        case SUB:
                            yyn = 13;
                            continue;
                        case RPAREN:
                            yyn = 27;
                            continue;
                    }
                    yyn = 59;
                    continue;

                case 19:
                    yyst[yysp] = 19;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (next()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 47:
                    switch (yytok) {
                        case LITERAL:
                        case LPAREN:
                        case ID:
                        case error:
                        case EQUAL:
                            yyn = 59;
                            continue;
                    }
                    yyn = yyr15();
                    continue;

                case 20:
                    yyst[yysp] = 20;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 48:
                    switch (yytok) {
                        case ENDINPUT:
                        case SEMI:
                            yyn = yyr1();
                            continue;
                    }
                    yyn = 59;
                    continue;

                case 21:
                    yyst[yysp] = 21;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 49:
                    yyn = yys21();
                    continue;

                case 22:
                    yyst[yysp] = 22;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 50:
                    yyn = yys22();
                    continue;

                case 23:
                    yyst[yysp] = 23;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 51:
                    yyn = yys23();
                    continue;

                case 24:
                    yyst[yysp] = 24;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 52:
                    yyn = yys24();
                    continue;

                case 25:
                    yyst[yysp] = 25;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 53:
                    yyn = yys25();
                    continue;

                case 26:
                    yyst[yysp] = 26;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 54:
                    switch (yytok) {
                        case ADD:
                            yyn = 12;
                            continue;
                        case SUB:
                            yyn = 13;
                            continue;
                        case ENDINPUT:
                        case SEMI:
                            yyn = yyr5();
                            continue;
                    }
                    yyn = 59;
                    continue;

                case 27:
                    yyst[yysp] = 27;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (next()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 55:
                    switch (yytok) {
                        case LITERAL:
                        case LPAREN:
                        case ID:
                        case error:
                        case EQUAL:
                            yyn = 59;
                            continue;
                    }
                    yyn = yyr14();
                    continue;

                case 56:
                    return true;
                case 57:
                    yyerror("stack overflow");
                case 58:
                    return false;
                case 59:
                    yyerror("syntax error");
                    return false;
            }
        }
    }

    protected void yyexpand() {
        int[] newyyst = new int[2*yyst.length];
        Object[] newyysv = new Object[2*yyst.length];
        for (int i=0; i<yyst.length; i++) {
            newyyst[i] = yyst[i];
            newyysv[i] = yysv[i];
        }
        yyst = newyyst;
        yysv = newyysv;
    }

    private int yys5() {
        switch (yytok) {
            case LPAREN:
            case error:
            case LITERAL:
            case ID:
            case EQUAL:
                return 59;
            case EXP:
                return 14;
        }
        return yyr9();
    }

    private int yys7() {
        switch (yytok) {
            case DIV:
                return 15;
            case MUL:
                return 16;
            case ENDINPUT:
            case SUB:
            case SEMI:
            case RPAREN:
            case ADD:
                return yyr6();
        }
        return 59;
    }

    private int yys8() {
        switch (yytok) {
            case RPAREN:
            case LPAREN:
            case error:
            case ID:
            case LITERAL:
                return 59;
            case EQUAL:
                return 17;
        }
        return yyr15();
    }

    private int yys21() {
        switch (yytok) {
            case DIV:
                return 15;
            case MUL:
                return 16;
            case ENDINPUT:
            case SUB:
            case SEMI:
            case RPAREN:
            case ADD:
                return yyr7();
        }
        return 59;
    }

    private int yys22() {
        switch (yytok) {
            case DIV:
                return 15;
            case MUL:
                return 16;
            case ENDINPUT:
            case SUB:
            case SEMI:
            case RPAREN:
            case ADD:
                return yyr8();
        }
        return 59;
    }

    private int yys23() {
        switch (yytok) {
            case LPAREN:
            case error:
            case LITERAL:
            case ID:
            case EQUAL:
                return 59;
            case EXP:
                return 14;
        }
        return yyr13();
    }

    private int yys24() {
        switch (yytok) {
            case LPAREN:
            case error:
            case LITERAL:
            case ID:
            case EQUAL:
                return 59;
            case EXP:
                return 14;
        }
        return yyr11();
    }

    private int yys25() {
        switch (yytok) {
            case LPAREN:
            case error:
            case LITERAL:
            case ID:
            case EQUAL:
                return 59;
            case EXP:
                return 14;
        }
        return yyr10();
    }

    private int yyr1() { // calc : calc SEMI statement
        {
                                    ((VarCalcParseTree.ParseNode)yysv[yysp-1]).print("");
                                    System.out.println(((VarCalcParseTree.ParseNode)yysv[yysp-1]).evaluate());
                               }
        yysv[yysp-=3] = yyrv;
        return 1;
    }

    private int yyr2() { // calc : statement
        {
                                    ((VarCalcParseTree.ParseNode)yysv[yysp-1]).print("");
                                    System.out.println(((VarCalcParseTree.ParseNode)yysv[yysp-1]).evaluate());
                                }
        yysv[yysp-=1] = yyrv;
        return 1;
    }

    private int yyr5() { // assign : ID EQUAL expr
        { yyrv = pt.new AssignNode(pt.new VariableNode(yysv[yysp-3].toString()), yysv[yysp-1]); }
        yysv[yysp-=3] = yyrv;
        return 2;
    }

    private int yyr14() { // exp : LPAREN expr RPAREN
        { yyrv = yysv[yysp-2]; }
        yysv[yysp-=3] = yyrv;
        return 3;
    }

    private int yyr15() { // exp : ID
        { yyrv = pt.new VariableNode(yysv[yysp-1].toString()); }
        yysv[yysp-=1] = yyrv;
        return 3;
    }

    private int yyr16() { // exp : LITERAL
        { yyrv = pt.new LiteralNode(yysv[yysp-1]); }
        yysv[yysp-=1] = yyrv;
        return 3;
    }

    private int yyr6() { // expr : term
        yysp -= 1;
        return yypexpr();
    }

    private int yyr7() { // expr : expr ADD term
        { yyrv = pt.new BinOpNode(yysv[yysp-3], "+", yysv[yysp-1]); }
        yysv[yysp-=3] = yyrv;
        return yypexpr();
    }

    private int yyr8() { // expr : expr SUB term
        { yyrv = pt.new BinOpNode(yysv[yysp-3], "-", yysv[yysp-1]); }
        yysv[yysp-=3] = yyrv;
        return yypexpr();
    }

    private int yypexpr() {
        switch (yyst[yysp-1]) {
            case 17: return 26;
            case 10: return 18;
            default: return 4;
        }
    }

    private int yyr12() { // factor : exp
        yysp -= 1;
        return yypfactor();
    }

    private int yyr13() { // factor : factor EXP factor
        { yyrv = pt.new BinOpNode(yysv[yysp-3], "**", yysv[yysp-1]); }
        yysv[yysp-=3] = yyrv;
        return yypfactor();
    }

    private int yypfactor() {
        switch (yyst[yysp-1]) {
            case 16: return 25;
            case 15: return 24;
            case 14: return 23;
            default: return 5;
        }
    }

    private int yyr3() { // statement : assign
        yysp -= 1;
        return yypstatement();
    }

    private int yyr4() { // statement : expr
        yysp -= 1;
        return yypstatement();
    }

    private int yypstatement() {
        switch (yyst[yysp-1]) {
            case 0: return 6;
            default: return 20;
        }
    }

    private int yyr9() { // term : factor
        yysp -= 1;
        return yypterm();
    }

    private int yyr10() { // term : term MUL factor
        { yyrv = pt.new BinOpNode(yysv[yysp-3], "*", yysv[yysp-1]); }
        yysv[yysp-=3] = yyrv;
        return yypterm();
    }

    private int yyr11() { // term : term DIV factor
        { yyrv = pt.new BinOpNode(yysv[yysp-3], "/", yysv[yysp-1]); }
        yysv[yysp-=3] = yyrv;
        return yypterm();
    }

    private int yypterm() {
        switch (yyst[yysp-1]) {
            case 13: return 22;
            case 12: return 21;
            default: return 7;
        }
    }

    protected String[] yyerrmsgs = {
    };

    private VarCalcLexer lexer;
    private SymbolTable sym;
    private VarCalcParseTree pt;
    
    public VarCalc()
    {
        lexer = new VarCalcLexer(System.in);
        sym = new SymbolTable();
        pt = new VarCalcParseTree();
    }


    public int next() {
        lexer.next();

        return lexer.getToken();
    }

    
    public void yyerror(String msg) {
           lexer.printError("ERROR: " + msg);
    }


    public static void main(String [] args) {
        VarCalc parser = new VarCalc();
        parser.next();
        parser.parse();
    }

}
