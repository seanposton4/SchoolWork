// Output created by jacc on Fri Oct 09 21:37:44 CDT 2020


class Looplang implements LooplangTokens {
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
                case 48:
                    switch (yytok) {
                        case ARRAY:
                            yyn = 10;
                            continue;
                        case ID:
                            yyn = 11;
                            continue;
                        case IN:
                            yyn = 12;
                            continue;
                        case OUT:
                            yyn = 13;
                            continue;
                        case WHILE:
                            yyn = 14;
                            continue;
                    }
                    yyn = 99;
                    continue;

                case 1:
                    yyst[yysp] = 1;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 49:
                    switch (yytok) {
                        case ENDINPUT:
                            yyn = 96;
                            continue;
                    }
                    yyn = 99;
                    continue;

                case 2:
                    yyst[yysp] = 2;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 50:
                    yyn = yys2();
                    continue;

                case 3:
                    yyst[yysp] = 3;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 51:
                    yyn = yys3();
                    continue;

                case 4:
                    yyst[yysp] = 4;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 52:
                    yyn = yys4();
                    continue;

                case 5:
                    yyst[yysp] = 5;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 53:
                    yyn = yys5();
                    continue;

                case 6:
                    yyst[yysp] = 6;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 54:
                    switch (yytok) {
                        case ASSIGN:
                            yyn = 15;
                            continue;
                    }
                    yyn = 99;
                    continue;

                case 7:
                    yyst[yysp] = 7;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 55:
                    yyn = yys7();
                    continue;

                case 8:
                    yyst[yysp] = 8;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 56:
                    yyn = yys8();
                    continue;

                case 9:
                    yyst[yysp] = 9;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 57:
                    yyn = yys9();
                    continue;

                case 10:
                    yyst[yysp] = 10;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (yynext()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 58:
                    switch (yytok) {
                        case LBRACKET:
                            yyn = 17;
                            continue;
                    }
                    yyn = 99;
                    continue;

                case 11:
                    yyst[yysp] = 11;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (yynext()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 59:
                    switch (yytok) {
                        case LBRACKET:
                            yyn = 18;
                            continue;
                    }
                    yyn = 99;
                    continue;

                case 12:
                    yyst[yysp] = 12;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (yynext()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 60:
                    switch (yytok) {
                        case ID:
                            yyn = 11;
                            continue;
                    }
                    yyn = 99;
                    continue;

                case 13:
                    yyst[yysp] = 13;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (yynext()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 61:
                    switch (yytok) {
                        case ID:
                            yyn = 11;
                            continue;
                    }
                    yyn = 99;
                    continue;

                case 14:
                    yyst[yysp] = 14;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (yynext()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 62:
                    switch (yytok) {
                        case ID:
                            yyn = 11;
                            continue;
                    }
                    yyn = 99;
                    continue;

                case 15:
                    yyst[yysp] = 15;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (yynext()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 63:
                    switch (yytok) {
                        case ID:
                            yyn = 26;
                            continue;
                        case LITERAL:
                            yyn = 27;
                            continue;
                        case LPAREN:
                            yyn = 28;
                            continue;
                    }
                    yyn = 99;
                    continue;

                case 16:
                    yyst[yysp] = 16;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 64:
                    yyn = yys16();
                    continue;

                case 17:
                    yyst[yysp] = 17;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (yynext()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 65:
                    switch (yytok) {
                        case LITERAL:
                            yyn = 29;
                            continue;
                    }
                    yyn = 99;
                    continue;

                case 18:
                    yyst[yysp] = 18;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (yynext()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 66:
                    switch (yytok) {
                        case ID:
                            yyn = 26;
                            continue;
                        case LITERAL:
                            yyn = 27;
                            continue;
                        case LPAREN:
                            yyn = 28;
                            continue;
                    }
                    yyn = 99;
                    continue;

                case 19:
                    yyst[yysp] = 19;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 67:
                    yyn = yys19();
                    continue;

                case 20:
                    yyst[yysp] = 20;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 68:
                    yyn = yys20();
                    continue;

                case 21:
                    yyst[yysp] = 21;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 69:
                    switch (yytok) {
                        case ARRAY:
                            yyn = 10;
                            continue;
                        case ID:
                            yyn = 11;
                            continue;
                        case IN:
                            yyn = 12;
                            continue;
                        case OUT:
                            yyn = 13;
                            continue;
                        case WHILE:
                            yyn = 14;
                            continue;
                    }
                    yyn = 99;
                    continue;

                case 22:
                    yyst[yysp] = 22;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 70:
                    yyn = yys22();
                    continue;

                case 23:
                    yyst[yysp] = 23;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 71:
                    yyn = yys23();
                    continue;

                case 24:
                    yyst[yysp] = 24;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 72:
                    yyn = yys24();
                    continue;

                case 25:
                    yyst[yysp] = 25;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 73:
                    yyn = yys25();
                    continue;

                case 26:
                    yyst[yysp] = 26;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (yynext()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 74:
                    yyn = yys26();
                    continue;

                case 27:
                    yyst[yysp] = 27;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (yynext()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 75:
                    yyn = yys27();
                    continue;

                case 28:
                    yyst[yysp] = 28;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (yynext()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 76:
                    switch (yytok) {
                        case ID:
                            yyn = 26;
                            continue;
                        case LITERAL:
                            yyn = 27;
                            continue;
                        case LPAREN:
                            yyn = 28;
                            continue;
                    }
                    yyn = 99;
                    continue;

                case 29:
                    yyst[yysp] = 29;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (yynext()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 77:
                    switch (yytok) {
                        case RBRACKET:
                            yyn = 38;
                            continue;
                    }
                    yyn = 99;
                    continue;

                case 30:
                    yyst[yysp] = 30;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 78:
                    switch (yytok) {
                        case MINUS:
                            yyn = 32;
                            continue;
                        case PLUS:
                            yyn = 33;
                            continue;
                        case RBRACKET:
                            yyn = 39;
                            continue;
                    }
                    yyn = 99;
                    continue;

                case 31:
                    yyst[yysp] = 31;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 79:
                    yyn = yys31();
                    continue;

                case 32:
                    yyst[yysp] = 32;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (yynext()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 80:
                    switch (yytok) {
                        case ID:
                            yyn = 26;
                            continue;
                        case LITERAL:
                            yyn = 27;
                            continue;
                        case LPAREN:
                            yyn = 28;
                            continue;
                    }
                    yyn = 99;
                    continue;

                case 33:
                    yyst[yysp] = 33;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (yynext()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 81:
                    switch (yytok) {
                        case ID:
                            yyn = 26;
                            continue;
                        case LITERAL:
                            yyn = 27;
                            continue;
                        case LPAREN:
                            yyn = 28;
                            continue;
                    }
                    yyn = 99;
                    continue;

                case 34:
                    yyst[yysp] = 34;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (yynext()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 82:
                    switch (yytok) {
                        case ID:
                            yyn = 26;
                            continue;
                        case LITERAL:
                            yyn = 27;
                            continue;
                        case LPAREN:
                            yyn = 28;
                            continue;
                    }
                    yyn = 99;
                    continue;

                case 35:
                    yyst[yysp] = 35;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (yynext()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 83:
                    switch (yytok) {
                        case ID:
                            yyn = 26;
                            continue;
                        case LITERAL:
                            yyn = 27;
                            continue;
                        case LPAREN:
                            yyn = 28;
                            continue;
                    }
                    yyn = 99;
                    continue;

                case 36:
                    yyst[yysp] = 36;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (yynext()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 84:
                    switch (yytok) {
                        case ID:
                            yyn = 26;
                            continue;
                        case LITERAL:
                            yyn = 27;
                            continue;
                        case LPAREN:
                            yyn = 28;
                            continue;
                    }
                    yyn = 99;
                    continue;

                case 37:
                    yyst[yysp] = 37;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 85:
                    switch (yytok) {
                        case MINUS:
                            yyn = 32;
                            continue;
                        case PLUS:
                            yyn = 33;
                            continue;
                        case RPAREN:
                            yyn = 46;
                            continue;
                    }
                    yyn = 99;
                    continue;

                case 38:
                    yyst[yysp] = 38;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (yynext()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 86:
                    switch (yytok) {
                        case ID:
                            yyn = 47;
                            continue;
                    }
                    yyn = 99;
                    continue;

                case 39:
                    yyst[yysp] = 39;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (yynext()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 87:
                    yyn = yys39();
                    continue;

                case 40:
                    yyst[yysp] = 40;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (yynext()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 88:
                    yyn = yys40();
                    continue;

                case 41:
                    yyst[yysp] = 41;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 89:
                    yyn = yys41();
                    continue;

                case 42:
                    yyst[yysp] = 42;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 90:
                    yyn = yys42();
                    continue;

                case 43:
                    yyst[yysp] = 43;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 91:
                    yyn = yys43();
                    continue;

                case 44:
                    yyst[yysp] = 44;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 92:
                    yyn = yys44();
                    continue;

                case 45:
                    yyst[yysp] = 45;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 93:
                    yyn = yys45();
                    continue;

                case 46:
                    yyst[yysp] = 46;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (yynext()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 94:
                    yyn = yys46();
                    continue;

                case 47:
                    yyst[yysp] = 47;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (yynext()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 95:
                    yyn = yys47();
                    continue;

                case 96:
                    return true;
                case 97:
                    yyerror("stack overflow");
                case 98:
                    return false;
                case 99:
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

    private int yys2() {
        switch (yytok) {
            case ENDINPUT:
            case WHILE:
            case IN:
            case OUT:
            case ID:
            case END:
            case ARRAY:
                return yyr5();
        }
        return 99;
    }

    private int yys3() {
        switch (yytok) {
            case ENDINPUT:
            case WHILE:
            case IN:
            case OUT:
            case ID:
            case END:
            case ARRAY:
                return yyr7();
        }
        return 99;
    }

    private int yys4() {
        switch (yytok) {
            case ENDINPUT:
            case WHILE:
            case IN:
            case OUT:
            case ID:
            case END:
            case ARRAY:
                return yyr8();
        }
        return 99;
    }

    private int yys5() {
        switch (yytok) {
            case ENDINPUT:
            case WHILE:
            case IN:
            case OUT:
            case ID:
            case END:
            case ARRAY:
                return yyr4();
        }
        return 99;
    }

    private int yys7() {
        switch (yytok) {
            case ENDINPUT:
            case WHILE:
            case IN:
            case OUT:
            case ID:
            case END:
            case ARRAY:
                return yyr2();
        }
        return 99;
    }

    private int yys8() {
        switch (yytok) {
            case ARRAY:
                return 10;
            case ID:
                return 11;
            case IN:
                return 12;
            case OUT:
                return 13;
            case WHILE:
                return 14;
            case ENDINPUT:
                return yyr1();
        }
        return 99;
    }

    private int yys9() {
        switch (yytok) {
            case ENDINPUT:
            case WHILE:
            case IN:
            case OUT:
            case ID:
            case END:
            case ARRAY:
                return yyr6();
        }
        return 99;
    }

    private int yys16() {
        switch (yytok) {
            case ENDINPUT:
            case WHILE:
            case IN:
            case OUT:
            case ID:
            case END:
            case ARRAY:
                return yyr3();
        }
        return 99;
    }

    private int yys19() {
        switch (yytok) {
            case ENDINPUT:
            case WHILE:
            case IN:
            case OUT:
            case ID:
            case END:
            case ARRAY:
                return yyr28();
        }
        return 99;
    }

    private int yys20() {
        switch (yytok) {
            case ENDINPUT:
            case WHILE:
            case IN:
            case OUT:
            case ID:
            case END:
            case ARRAY:
                return yyr29();
        }
        return 99;
    }

    private int yys22() {
        switch (yytok) {
            case LT:
            case LPAREN:
            case LBRACKET:
            case GT:
            case LITERAL:
            case GE:
            case LE:
            case EQ:
            case error:
            case ASSIGN:
                return 99;
        }
        return yyr17();
    }

    private int yys23() {
        switch (yytok) {
            case MINUS:
                return 32;
            case PLUS:
                return 33;
            case ENDINPUT:
            case WHILE:
            case IN:
            case OUT:
            case ID:
            case END:
            case ARRAY:
                return yyr10();
        }
        return 99;
    }

    private int yys24() {
        switch (yytok) {
            case LT:
            case LPAREN:
            case LBRACKET:
            case GT:
            case LITERAL:
            case GE:
            case LE:
            case EQ:
            case error:
            case ASSIGN:
                return 99;
            case EXP:
                return 34;
        }
        return yyr14();
    }

    private int yys25() {
        switch (yytok) {
            case DIVIDE:
                return 35;
            case MULTIPLY:
                return 36;
            case ENDINPUT:
            case WHILE:
            case RBRACKET:
            case IN:
            case PLUS:
            case OUT:
            case RPAREN:
            case ID:
            case MINUS:
            case END:
            case ARRAY:
                return yyr11();
        }
        return 99;
    }

    private int yys26() {
        switch (yytok) {
            case LT:
            case LPAREN:
            case LBRACKET:
            case GT:
            case LITERAL:
            case GE:
            case LE:
            case EQ:
            case error:
            case ASSIGN:
                return 99;
        }
        return yyr20();
    }

    private int yys27() {
        switch (yytok) {
            case LT:
            case LPAREN:
            case LBRACKET:
            case GT:
            case LITERAL:
            case GE:
            case LE:
            case EQ:
            case error:
            case ASSIGN:
                return 99;
        }
        return yyr21();
    }

    private int yys31() {
        switch (yytok) {
            case ARRAY:
                return 10;
            case ID:
                return 11;
            case IN:
                return 12;
            case OUT:
                return 13;
            case WHILE:
                return 14;
            case END:
                return 40;
        }
        return 99;
    }

    private int yys39() {
        switch (yytok) {
            case ENDINPUT:
            case WHILE:
            case IN:
            case OUT:
            case ID:
            case END:
            case ASSIGN:
            case ARRAY:
                return yyr30();
        }
        return 99;
    }

    private int yys40() {
        switch (yytok) {
            case ENDINPUT:
            case WHILE:
            case IN:
            case OUT:
            case ID:
            case END:
            case ARRAY:
                return yyr27();
        }
        return 99;
    }

    private int yys41() {
        switch (yytok) {
            case DIVIDE:
                return 35;
            case MULTIPLY:
                return 36;
            case ENDINPUT:
            case WHILE:
            case RBRACKET:
            case IN:
            case PLUS:
            case OUT:
            case RPAREN:
            case ID:
            case MINUS:
            case END:
            case ARRAY:
                return yyr13();
        }
        return 99;
    }

    private int yys42() {
        switch (yytok) {
            case DIVIDE:
                return 35;
            case MULTIPLY:
                return 36;
            case ENDINPUT:
            case WHILE:
            case RBRACKET:
            case IN:
            case PLUS:
            case OUT:
            case RPAREN:
            case ID:
            case MINUS:
            case END:
            case ARRAY:
                return yyr12();
        }
        return 99;
    }

    private int yys43() {
        switch (yytok) {
            case LT:
            case LPAREN:
            case LBRACKET:
            case GT:
            case LITERAL:
            case GE:
            case LE:
            case EQ:
            case error:
            case ASSIGN:
                return 99;
            case EXP:
                return 34;
        }
        return yyr18();
    }

    private int yys44() {
        switch (yytok) {
            case LT:
            case LPAREN:
            case LBRACKET:
            case GT:
            case LITERAL:
            case GE:
            case LE:
            case EQ:
            case error:
            case ASSIGN:
                return 99;
            case EXP:
                return 34;
        }
        return yyr16();
    }

    private int yys45() {
        switch (yytok) {
            case LT:
            case LPAREN:
            case LBRACKET:
            case GT:
            case LITERAL:
            case GE:
            case LE:
            case EQ:
            case error:
            case ASSIGN:
                return 99;
            case EXP:
                return 34;
        }
        return yyr15();
    }

    private int yys46() {
        switch (yytok) {
            case LT:
            case LPAREN:
            case LBRACKET:
            case GT:
            case LITERAL:
            case GE:
            case LE:
            case EQ:
            case error:
            case ASSIGN:
                return 99;
        }
        return yyr19();
    }

    private int yys47() {
        switch (yytok) {
            case ENDINPUT:
            case WHILE:
            case IN:
            case OUT:
            case ID:
            case END:
            case ARRAY:
                return yyr9();
        }
        return 99;
    }

    private int yyr1() { // program : stmnt_list
         
             program = tree.new 
              ProgramNode((LooplangParseTree.StatementListNode)yysv[yysp-1]); 
          
        yysv[yysp-=1] = yyrv;
        return 1;
    }

    private int yyr10() { // assignment : ref ASSIGN expr
        {
              yyrv = tree.new AssignNode((LooplangParseTree.RefNode)yysv[yysp-3], 
                                       (LooplangParseTree.ParseNode)yysv[yysp-1]);
            }
        yysv[yysp-=3] = yyrv;
        return 2;
    }

    private int yyr19() { // exp : LPAREN expr RPAREN
        { yyrv = yysv[yysp-2]; }
        yysv[yysp-=3] = yyrv;
        return 22;
    }

    private int yyr20() { // exp : ID
        { yyrv = tree.new RefNode(yysv[yysp-1].toString(),  (LooplangParseTree.ParseNode)yysv[yysp-1]); }
        yysv[yysp-=1] = yyrv;
        return 22;
    }

    private int yyr21() { // exp : LITERAL
        { yyrv = tree.new LiteralNode((Integer)yysv[yysp-1]); }
        yysv[yysp-=1] = yyrv;
        return 22;
    }

    private int yyr11() { // expr : term
        yysp -= 1;
        return yypexpr();
    }

    private int yyr12() { // expr : expr PLUS term
        { yyrv = tree.new BinOpNode((LooplangParseTree.ParseNode)yysv[yysp-3], "+", (LooplangParseTree.ParseNode)yysv[yysp-1]); }
        yysv[yysp-=3] = yyrv;
        return yypexpr();
    }

    private int yyr13() { // expr : expr MINUS term
        { yyrv = tree.new BinOpNode((LooplangParseTree.ParseNode)yysv[yysp-3], "-", (LooplangParseTree.ParseNode)yysv[yysp-1]); }
        yysv[yysp-=3] = yyrv;
        return yypexpr();
    }

    private int yypexpr() {
        switch (yyst[yysp-1]) {
            case 18: return 30;
            case 15: return 23;
            default: return 37;
        }
    }

    private int yyr17() { // factor : exp
        yysp -= 1;
        return yypfactor();
    }

    private int yyr18() { // factor : factor EXP factor
        { yyrv = tree.new BinOpNode((LooplangParseTree.ParseNode)yysv[yysp-3], "^", (LooplangParseTree.ParseNode)yysv[yysp-1]); }
        yysv[yysp-=3] = yyrv;
        return yypfactor();
    }

    private int yypfactor() {
        switch (yyst[yysp-1]) {
            case 36: return 45;
            case 35: return 44;
            case 34: return 43;
            default: return 24;
        }
    }

    private int yyr28() { // input : IN ref
        { 
         yyrv = tree.new InputNode((LooplangParseTree.RefNode) yysv[yysp-1]); 
       }
        yysv[yysp-=2] = yyrv;
        return 3;
    }

    private int yyr29() { // output : OUT ref
        { 
          yyrv = tree.new OutputNode((LooplangParseTree.RefNode) yysv[yysp-1]); 
        }
        yysv[yysp-=2] = yyrv;
        return 4;
    }

    private int yyr9() { // array_decl : ARRAY LBRACKET LITERAL RBRACKET ID
        {
              yyrv = tree.new ArrayDeclNode(yysv[yysp-1].toString(), (Integer) yysv[yysp-3]);
            }
        yysv[yysp-=5] = yyrv;
        return 5;
    }

    private int yyr30() { // ref : ID LBRACKET expr RBRACKET
        { 
       yyrv = tree.new RefNode(yysv[yysp-4].toString(), (LooplangParseTree.ParseNode) yysv[yysp-2]); 
     }
        yysv[yysp-=4] = yyrv;
        switch (yyst[yysp-1]) {
            case 14: return 21;
            case 13: return 20;
            case 12: return 19;
            default: return 6;
        }
    }

    private int yyr4() { // statement : array_decl
        yysp -= 1;
        return yypstatement();
    }

    private int yyr5() { // statement : assignment
        yysp -= 1;
        return yypstatement();
    }

    private int yyr6() { // statement : while
        yysp -= 1;
        return yypstatement();
    }

    private int yyr7() { // statement : input
        yysp -= 1;
        return yypstatement();
    }

    private int yyr8() { // statement : output
        yysp -= 1;
        return yypstatement();
    }

    private int yypstatement() {
        switch (yyst[yysp-1]) {
            case 21: return 7;
            case 0: return 7;
            default: return 16;
        }
    }

    private int yyr2() { // stmnt_list : statement
        { 
               yyrv = tree.new StatementListNode(
                  (LooplangParseTree.StatementNode) yysv[yysp-1]
               ); 
             }
        yysv[yysp-=1] = yyrv;
        return yypstmnt_list();
    }

    private int yyr3() { // stmnt_list : stmnt_list statement
        { 
                ((LooplangParseTree.StatementListNode)yysv[yysp-2]).add(
                     (LooplangParseTree.StatementNode) yysv[yysp-1]
                );
                yyrv=yysv[yysp-2];
              }
        yysv[yysp-=2] = yyrv;
        return yypstmnt_list();
    }

    private int yypstmnt_list() {
        switch (yyst[yysp-1]) {
            case 0: return 8;
            default: return 31;
        }
    }

    private int yyr14() { // term : factor
        yysp -= 1;
        return yypterm();
    }

    private int yyr15() { // term : term MULTIPLY factor
        { yyrv = tree.new BinOpNode((LooplangParseTree.ParseNode)yysv[yysp-3], "*", (LooplangParseTree.ParseNode)yysv[yysp-1]); }
        yysv[yysp-=3] = yyrv;
        return yypterm();
    }

    private int yyr16() { // term : term DIVIDE factor
        { yyrv = tree.new BinOpNode((LooplangParseTree.ParseNode)yysv[yysp-3], "/", (LooplangParseTree.ParseNode)yysv[yysp-1]); }
        yysv[yysp-=3] = yyrv;
        return yypterm();
    }

    private int yypterm() {
        switch (yyst[yysp-1]) {
            case 33: return 42;
            case 32: return 41;
            default: return 25;
        }
    }

    private int yyr27() { // while : WHILE ref stmnt_list END
        {
         yyrv = tree.new WhileNode((LooplangParseTree.RefNode) yysv[yysp-3], 
                                 (LooplangParseTree.StatementListNode)yysv[yysp-2]);
       }
        yysv[yysp-=4] = yyrv;
        return 9;
    }

    protected String[] yyerrmsgs = {
    };


//////////////////////////////////////////
// Extra Code
//////////////////////////////////////////

    private LooplangLexer lexer;
    private int token;
    private Object yylvalue;
    private LooplangParseTree tree;
    private LooplangParseTree.ProgramNode program;

    public int yynext() {
        lexer.next();
        token = lexer.getToken();
        yylvalue = lexer.getValue();

        return token;
    }

    public void yyerror(String msg) {
        lexer.printError("ERROR: " + msg);
    }

    public Looplang(java.io.InputStream in) {
        lexer = new LooplangLexer(in); 
        tree = new LooplangParseTree(this);
    }


    public LooplangParseTree.ProgramNode getProgram() {
        return program;
    }


    public static void main(String [] args) {
        boolean interpret = true;
        boolean printTree = false;
        boolean compile = false;
        String filename="";

        //process command line
        for(int i=0; i<args.length; i++) {
            if(args[i].equals("-c")) {
                interpret = false;
                compile = true;
            } else if(args[i].equals("-t")) {
                printTree = true;
            } else {
                filename = args[i];
            }
        }

        try {
            Looplang parser = new Looplang(new java.io.FileInputStream(filename));
            parser.yynext();
            parser.parse();
 
            //print the tree
            if(printTree) {
                parser.getProgram().print("");
            }

            //interpret the code
            if(interpret) {
                parser.getProgram().evaluate();
            }

            //compile the code to c
            if(compile) {
                java.io.FileOutputStream file = new java.io.FileOutputStream(filename.split("\\.")[0] + ".c");
                file.write(parser.getProgram().generate().getBytes());
                file.close();
            }

        } catch(java.io.FileNotFoundException e) {
            System.err.println("Could not open file.");
        } catch(java.io.IOException e) {
            System.err.println("File Write Error");
        }
    }
        
        
        
        

}
