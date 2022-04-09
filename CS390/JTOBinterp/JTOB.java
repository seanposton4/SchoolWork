// Output created by jacc on Mon Nov 23 00:29:07 CST 2020


class JTOB implements JTOBTokens {
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
                case 76:
                    yyn = yys0();
                    continue;

                case 1:
                    yyst[yysp] = 1;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 77:
                    switch (yytok) {
                        case ENDINPUT:
                            yyn = 152;
                            continue;
                    }
                    yyn = 155;
                    continue;

                case 2:
                    yyst[yysp] = 2;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 78:
                    yyn = yys2();
                    continue;

                case 3:
                    yyst[yysp] = 3;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 79:
                    yyn = yys3();
                    continue;

                case 4:
                    yyst[yysp] = 4;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 80:
                    yyn = yys4();
                    continue;

                case 5:
                    yyst[yysp] = 5;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 81:
                    yyn = yys5();
                    continue;

                case 6:
                    yyst[yysp] = 6;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 82:
                    yyn = yys6();
                    continue;

                case 7:
                    yyst[yysp] = 7;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 83:
                    yyn = yys7();
                    continue;

                case 8:
                    yyst[yysp] = 8;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 84:
                    yyn = yys8();
                    continue;

                case 9:
                    yyst[yysp] = 9;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 85:
                    yyn = yys9();
                    continue;

                case 10:
                    yyst[yysp] = 10;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 86:
                    yyn = yys10();
                    continue;

                case 11:
                    yyst[yysp] = 11;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 87:
                    yyn = yys11();
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
                case 88:
                    switch (yytok) {
                        case ID:
                            yyn = 23;
                            continue;
                    }
                    yyn = 155;
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
                case 89:
                    switch (yytok) {
                        case LBRACKET:
                            yyn = 24;
                            continue;
                    }
                    yyn = 155;
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
                case 90:
                    yyn = yys14();
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
                case 91:
                    switch (yytok) {
                        case LITERAL:
                            yyn = 26;
                            continue;
                    }
                    yyn = 155;
                    continue;

                case 16:
                    yyst[yysp] = 16;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (yynext()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 92:
                    switch (yytok) {
                        case LPARENTHESIS:
                            yyn = 27;
                            continue;
                    }
                    yyn = 155;
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
                case 93:
                    switch (yytok) {
                        case ID:
                            yyn = 23;
                            continue;
                    }
                    yyn = 155;
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
                case 94:
                    switch (yytok) {
                        case ID:
                            yyn = 23;
                            continue;
                        case LITERAL:
                            yyn = 26;
                            continue;
                    }
                    yyn = 155;
                    continue;

                case 19:
                    yyst[yysp] = 19;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (yynext()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 95:
                    yyn = yys19();
                    continue;

                case 20:
                    yyst[yysp] = 20;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (yynext()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 96:
                    switch (yytok) {
                        case FALSE:
                            yyn = 14;
                            continue;
                        case TRUE:
                            yyn = 19;
                            continue;
                    }
                    yyn = 155;
                    continue;

                case 21:
                    yyst[yysp] = 21;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 97:
                    yyn = yys21();
                    continue;

                case 22:
                    yyst[yysp] = 22;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 98:
                    switch (yytok) {
                        case ASSIGN:
                            yyn = 32;
                            continue;
                    }
                    yyn = 155;
                    continue;

                case 23:
                    yyst[yysp] = 23;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (yynext()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 99:
                    switch (yytok) {
                        case LBRACKET:
                            yyn = 33;
                            continue;
                    }
                    yyn = 155;
                    continue;

                case 24:
                    yyst[yysp] = 24;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (yynext()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 100:
                    switch (yytok) {
                        case LITERAL:
                            yyn = 26;
                            continue;
                    }
                    yyn = 155;
                    continue;

                case 25:
                    yyst[yysp] = 25;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 101:
                    switch (yytok) {
                        case TO:
                            yyn = 35;
                            continue;
                    }
                    yyn = 155;
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
                case 102:
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
                case 103:
                    switch (yytok) {
                        case FALSE:
                            yyn = 14;
                            continue;
                        case TRUE:
                            yyn = 19;
                            continue;
                    }
                    yyn = 155;
                    continue;

                case 28:
                    yyst[yysp] = 28;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 104:
                    yyn = yys28();
                    continue;

                case 29:
                    yyst[yysp] = 29;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 105:
                    yyn = yys29();
                    continue;

                case 30:
                    yyst[yysp] = 30;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 106:
                    yyn = yys30();
                    continue;

                case 31:
                    yyst[yysp] = 31;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 107:
                    switch (yytok) {
                        case COLON:
                            yyn = 37;
                            continue;
                    }
                    yyn = 155;
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
                case 108:
                    yyn = yys32();
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
                case 109:
                    yyn = yys33();
                    continue;

                case 34:
                    yyst[yysp] = 34;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 110:
                    switch (yytok) {
                        case RBRACKET:
                            yyn = 49;
                            continue;
                    }
                    yyn = 155;
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
                case 111:
                    switch (yytok) {
                        case LITERAL:
                            yyn = 26;
                            continue;
                    }
                    yyn = 155;
                    continue;

                case 36:
                    yyst[yysp] = 36;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 112:
                    switch (yytok) {
                        case RPARENTHESIS:
                            yyn = 51;
                            continue;
                    }
                    yyn = 155;
                    continue;

                case 37:
                    yyst[yysp] = 37;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (yynext()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 113:
                    yyn = yys37();
                    continue;

                case 38:
                    yyst[yysp] = 38;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 114:
                    yyn = yys38();
                    continue;

                case 39:
                    yyst[yysp] = 39;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 115:
                    yyn = yys39();
                    continue;

                case 40:
                    yyst[yysp] = 40;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 116:
                    yyn = yys40();
                    continue;

                case 41:
                    yyst[yysp] = 41;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 117:
                    yyn = yys41();
                    continue;

                case 42:
                    yyst[yysp] = 42;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 118:
                    yyn = yys42();
                    continue;

                case 43:
                    yyst[yysp] = 43;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 119:
                    yyn = yys43();
                    continue;

                case 44:
                    yyst[yysp] = 44;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 120:
                    yyn = yys44();
                    continue;

                case 45:
                    yyst[yysp] = 45;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 121:
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
                case 122:
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
                case 123:
                    switch (yytok) {
                        case STRING:
                            yyn = 57;
                            continue;
                    }
                    yyn = 155;
                    continue;

                case 48:
                    yyst[yysp] = 48;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 124:
                    switch (yytok) {
                        case MINUS:
                            yyn = 53;
                            continue;
                        case PLUS:
                            yyn = 54;
                            continue;
                        case RBRACKET:
                            yyn = 58;
                            continue;
                        case MULTIPLY:
                        case DIVIDE:
                            yyn = yyr24();
                            continue;
                    }
                    yyn = 155;
                    continue;

                case 49:
                    yyst[yysp] = 49;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (yynext()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 125:
                    switch (yytok) {
                        case ID:
                            yyn = 59;
                            continue;
                    }
                    yyn = 155;
                    continue;

                case 50:
                    yyst[yysp] = 50;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 126:
                    switch (yytok) {
                        case COLON:
                            yyn = 60;
                            continue;
                    }
                    yyn = 155;
                    continue;

                case 51:
                    yyst[yysp] = 51;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (yynext()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 127:
                    switch (yytok) {
                        case COLON:
                            yyn = 61;
                            continue;
                    }
                    yyn = 155;
                    continue;

                case 52:
                    yyst[yysp] = 52;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 128:
                    yyn = yys52();
                    continue;

                case 53:
                    yyst[yysp] = 53;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (yynext()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 129:
                    yyn = yys53();
                    continue;

                case 54:
                    yyst[yysp] = 54;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (yynext()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 130:
                    yyn = yys54();
                    continue;

                case 55:
                    yyst[yysp] = 55;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (yynext()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 131:
                    yyn = yys55();
                    continue;

                case 56:
                    yyst[yysp] = 56;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (yynext()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 132:
                    yyn = yys56();
                    continue;

                case 57:
                    yyst[yysp] = 57;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (yynext()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 133:
                    switch (yytok) {
                        case DOUBLEQUOTES:
                            yyn = 68;
                            continue;
                    }
                    yyn = 155;
                    continue;

                case 58:
                    yyst[yysp] = 58;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (yynext()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 134:
                    yyn = yys58();
                    continue;

                case 59:
                    yyst[yysp] = 59;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (yynext()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 135:
                    yyn = yys59();
                    continue;

                case 60:
                    yyst[yysp] = 60;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (yynext()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 136:
                    yyn = yys60();
                    continue;

                case 61:
                    yyst[yysp] = 61;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (yynext()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 137:
                    yyn = yys61();
                    continue;

                case 62:
                    yyst[yysp] = 62;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (yynext()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 138:
                    yyn = yys62();
                    continue;

                case 63:
                    yyst[yysp] = 63;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 139:
                    yyn = yys63();
                    continue;

                case 64:
                    yyst[yysp] = 64;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 140:
                    yyn = yys64();
                    continue;

                case 65:
                    yyst[yysp] = 65;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 141:
                    yyn = yys65();
                    continue;

                case 66:
                    yyst[yysp] = 66;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 142:
                    yyn = yys66();
                    continue;

                case 67:
                    yyst[yysp] = 67;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 143:
                    yyn = yys67();
                    continue;

                case 68:
                    yyst[yysp] = 68;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (yynext()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 144:
                    yyn = yys68();
                    continue;

                case 69:
                    yyst[yysp] = 69;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 145:
                    yyn = yys69();
                    continue;

                case 70:
                    yyst[yysp] = 70;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 146:
                    yyn = yys70();
                    continue;

                case 71:
                    yyst[yysp] = 71;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (yynext()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 147:
                    yyn = yys71();
                    continue;

                case 72:
                    yyst[yysp] = 72;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (yynext()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 148:
                    yyn = yys72();
                    continue;

                case 73:
                    yyst[yysp] = 73;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (yynext()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 149:
                    yyn = yys73();
                    continue;

                case 74:
                    yyst[yysp] = 74;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 150:
                    yyn = yys74();
                    continue;

                case 75:
                    yyst[yysp] = 75;
                    yysv[yysp] = (lexer.getValue()
                                 );
                    yytok = (yynext()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 151:
                    yyn = yys75();
                    continue;

                case 152:
                    return true;
                case 153:
                    yyerror("stack overflow");
                case 154:
                    return false;
                case 155:
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

    private int yys0() {
        switch (yytok) {
            case AM:
                return 12;
            case ARRAY:
                return 13;
            case FALSE:
                return 14;
            case FLOOP:
                return 15;
            case IF:
                return 16;
            case INSERT:
                return 17;
            case SAY:
                return 18;
            case TRUE:
                return 19;
            case WHILE:
                return 20;
        }
        return 155;
    }

    private int yys2() {
        switch (yytok) {
            case SAY:
            case FLOOP:
            case FALSE:
            case END:
            case INSERT:
            case ELSE:
            case IF:
            case WHILE:
            case TRUE:
            case ARRAY:
            case ENDINPUT:
            case AM:
                return yyr5();
        }
        return 155;
    }

    private int yys3() {
        switch (yytok) {
            case SAY:
            case FLOOP:
            case FALSE:
            case END:
            case INSERT:
            case ELSE:
            case IF:
            case WHILE:
            case TRUE:
            case ARRAY:
            case ENDINPUT:
            case AM:
                return yyr39();
        }
        return 155;
    }

    private int yys4() {
        switch (yytok) {
            case SAY:
            case FLOOP:
            case FALSE:
            case END:
            case INSERT:
            case ELSE:
            case IF:
            case WHILE:
            case TRUE:
            case ARRAY:
            case ENDINPUT:
            case AM:
                return yyr7();
        }
        return 155;
    }

    private int yys5() {
        switch (yytok) {
            case SAY:
            case FLOOP:
            case FALSE:
            case END:
            case INSERT:
            case ELSE:
            case IF:
            case WHILE:
            case TRUE:
            case ARRAY:
            case ENDINPUT:
            case AM:
                return yyr8();
        }
        return 155;
    }

    private int yys6() {
        switch (yytok) {
            case SAY:
            case FLOOP:
            case FALSE:
            case END:
            case INSERT:
            case ELSE:
            case IF:
            case WHILE:
            case TRUE:
            case ARRAY:
            case ENDINPUT:
            case AM:
                return yyr9();
        }
        return 155;
    }

    private int yys7() {
        switch (yytok) {
            case SAY:
            case FLOOP:
            case FALSE:
            case END:
            case INSERT:
            case ELSE:
            case IF:
            case WHILE:
            case TRUE:
            case ARRAY:
            case ENDINPUT:
            case AM:
                return yyr10();
        }
        return 155;
    }

    private int yys8() {
        switch (yytok) {
            case SAY:
            case FLOOP:
            case FALSE:
            case END:
            case INSERT:
            case ELSE:
            case IF:
            case WHILE:
            case TRUE:
            case ARRAY:
            case ENDINPUT:
            case AM:
                return yyr4();
        }
        return 155;
    }

    private int yys9() {
        switch (yytok) {
            case SAY:
            case FLOOP:
            case FALSE:
            case END:
            case INSERT:
            case ELSE:
            case IF:
            case WHILE:
            case TRUE:
            case ARRAY:
            case ENDINPUT:
            case AM:
                return yyr2();
        }
        return 155;
    }

    private int yys10() {
        switch (yytok) {
            case AM:
                return 12;
            case ARRAY:
                return 13;
            case FALSE:
                return 14;
            case FLOOP:
                return 15;
            case IF:
                return 16;
            case INSERT:
                return 17;
            case SAY:
                return 18;
            case TRUE:
                return 19;
            case WHILE:
                return 20;
            case ENDINPUT:
                return yyr1();
        }
        return 155;
    }

    private int yys11() {
        switch (yytok) {
            case SAY:
            case FLOOP:
            case FALSE:
            case END:
            case INSERT:
            case ELSE:
            case IF:
            case WHILE:
            case TRUE:
            case ARRAY:
            case ENDINPUT:
            case AM:
                return yyr6();
        }
        return 155;
    }

    private int yys14() {
        switch (yytok) {
            case DOUBLEQUOTES:
            case ID:
            case STRING:
            case EQUAL:
            case LPARENTHESIS:
            case LBRACKET:
            case EGTHAN:
            case TO:
            case ELTHAN:
            case NEQUAL:
            case ASSIGN:
            case LTHAN:
            case LITERAL:
            case GTHAN:
            case CHARACTER:
            case error:
                return 155;
        }
        return yyr26();
    }

    private int yys19() {
        switch (yytok) {
            case DOUBLEQUOTES:
            case ID:
            case STRING:
            case EQUAL:
            case LPARENTHESIS:
            case LBRACKET:
            case EGTHAN:
            case TO:
            case ELTHAN:
            case NEQUAL:
            case ASSIGN:
            case LTHAN:
            case LITERAL:
            case GTHAN:
            case CHARACTER:
            case error:
                return 155;
        }
        return yyr25();
    }

    private int yys21() {
        switch (yytok) {
            case SAY:
            case FLOOP:
            case FALSE:
            case END:
            case INSERT:
            case ELSE:
            case IF:
            case WHILE:
            case TRUE:
            case ARRAY:
            case ENDINPUT:
            case AM:
                return yyr3();
        }
        return 155;
    }

    private int yys26() {
        switch (yytok) {
            case EQUAL:
            case ID:
            case STRING:
            case NEQUAL:
            case LTHAN:
            case LBRACKET:
            case EGTHAN:
            case GTHAN:
            case ELTHAN:
            case RPARENTHESIS:
            case ASSIGN:
            case DOUBLEQUOTES:
            case LPARENTHESIS:
            case LITERAL:
            case CHARACTER:
            case error:
                return 155;
        }
        return yyr45();
    }

    private int yys28() {
        switch (yytok) {
            case SAY:
            case FLOOP:
            case FALSE:
            case END:
            case INSERT:
            case ELSE:
            case IF:
            case WHILE:
            case TRUE:
            case ARRAY:
            case ENDINPUT:
            case AM:
                return yyr40();
        }
        return 155;
    }

    private int yys29() {
        switch (yytok) {
            case SAY:
            case FLOOP:
            case FALSE:
            case END:
            case INSERT:
            case ELSE:
            case IF:
            case WHILE:
            case TRUE:
            case ARRAY:
            case ENDINPUT:
            case AM:
                return yyr42();
        }
        return 155;
    }

    private int yys30() {
        switch (yytok) {
            case SAY:
            case FLOOP:
            case FALSE:
            case END:
            case INSERT:
            case ELSE:
            case IF:
            case WHILE:
            case TRUE:
            case ARRAY:
            case ENDINPUT:
            case AM:
                return yyr41();
        }
        return 155;
    }

    private int yys32() {
        switch (yytok) {
            case FALSE:
                return 14;
            case TRUE:
                return 19;
            case ID:
                return 23;
            case LITERAL:
                return 26;
            case CHARACTER:
                return 46;
            case DOUBLEQUOTES:
                return 47;
        }
        return 155;
    }

    private int yys33() {
        switch (yytok) {
            case FALSE:
                return 14;
            case TRUE:
                return 19;
            case ID:
                return 23;
            case LITERAL:
                return 26;
            case CHARACTER:
                return 46;
            case DOUBLEQUOTES:
                return 47;
        }
        return 155;
    }

    private int yys37() {
        switch (yytok) {
            case AM:
                return 12;
            case ARRAY:
                return 13;
            case FALSE:
                return 14;
            case FLOOP:
                return 15;
            case IF:
                return 16;
            case INSERT:
                return 17;
            case SAY:
                return 18;
            case TRUE:
                return 19;
            case WHILE:
                return 20;
        }
        return 155;
    }

    private int yys38() {
        switch (yytok) {
            case SAY:
            case FLOOP:
            case FALSE:
            case MULTIPLY:
            case DIVIDE:
            case MINUS:
            case PLUS:
            case RBRACKET:
            case END:
            case INSERT:
            case ELSE:
            case IF:
            case WHILE:
            case TRUE:
            case ARRAY:
            case ENDINPUT:
            case AM:
                return yyr21();
        }
        return 155;
    }

    private int yys39() {
        switch (yytok) {
            case SAY:
            case FLOOP:
            case FALSE:
            case MULTIPLY:
            case DIVIDE:
            case MINUS:
            case PLUS:
            case RBRACKET:
            case END:
            case INSERT:
            case ELSE:
            case IF:
            case WHILE:
            case TRUE:
            case ARRAY:
            case ENDINPUT:
            case AM:
                return yyr22();
        }
        return 155;
    }

    private int yys40() {
        switch (yytok) {
            case MINUS:
                return 53;
            case PLUS:
                return 54;
            case SAY:
            case FLOOP:
            case FALSE:
            case AM:
            case ENDINPUT:
            case END:
            case INSERT:
            case ELSE:
            case IF:
            case WHILE:
            case TRUE:
            case ARRAY:
                return yyr12();
            case MULTIPLY:
            case DIVIDE:
                return yyr24();
        }
        return 155;
    }

    private int yys41() {
        switch (yytok) {
            case SAY:
            case FLOOP:
            case FALSE:
            case MULTIPLY:
            case DIVIDE:
            case MINUS:
            case PLUS:
            case RBRACKET:
            case END:
            case INSERT:
            case ELSE:
            case IF:
            case WHILE:
            case TRUE:
            case ARRAY:
            case ENDINPUT:
            case AM:
                return yyr18();
        }
        return 155;
    }

    private int yys42() {
        switch (yytok) {
            case SAY:
            case FLOOP:
            case FALSE:
            case MULTIPLY:
            case DIVIDE:
            case MINUS:
            case PLUS:
            case RBRACKET:
            case END:
            case INSERT:
            case ELSE:
            case IF:
            case WHILE:
            case TRUE:
            case ARRAY:
            case ENDINPUT:
            case AM:
                return yyr19();
        }
        return 155;
    }

    private int yys43() {
        switch (yytok) {
            case SAY:
            case FLOOP:
            case FALSE:
            case MULTIPLY:
            case DIVIDE:
            case MINUS:
            case PLUS:
            case RBRACKET:
            case END:
            case INSERT:
            case ELSE:
            case IF:
            case WHILE:
            case TRUE:
            case ARRAY:
            case ENDINPUT:
            case AM:
                return yyr20();
        }
        return 155;
    }

    private int yys44() {
        switch (yytok) {
            case SAY:
            case FLOOP:
            case FALSE:
            case MULTIPLY:
            case DIVIDE:
            case MINUS:
            case PLUS:
            case RBRACKET:
            case END:
            case INSERT:
            case ELSE:
            case IF:
            case WHILE:
            case TRUE:
            case ARRAY:
            case ENDINPUT:
            case AM:
                return yyr23();
        }
        return 155;
    }

    private int yys45() {
        switch (yytok) {
            case DIVIDE:
                return 55;
            case MULTIPLY:
                return 56;
            case SAY:
            case FLOOP:
            case RBRACKET:
            case PLUS:
            case FALSE:
            case MINUS:
            case END:
            case INSERT:
            case ELSE:
            case IF:
            case WHILE:
            case TRUE:
            case ARRAY:
            case ENDINPUT:
            case AM:
                return yyr15();
        }
        return 155;
    }

    private int yys46() {
        switch (yytok) {
            case SAY:
            case FLOOP:
            case FALSE:
            case MULTIPLY:
            case DIVIDE:
            case MINUS:
            case PLUS:
            case RBRACKET:
            case END:
            case INSERT:
            case ELSE:
            case IF:
            case WHILE:
            case TRUE:
            case ARRAY:
            case ENDINPUT:
            case AM:
                return yyr44();
        }
        return 155;
    }

    private int yys52() {
        switch (yytok) {
            case AM:
                return 12;
            case ARRAY:
                return 13;
            case FALSE:
                return 14;
            case FLOOP:
                return 15;
            case IF:
                return 16;
            case INSERT:
                return 17;
            case SAY:
                return 18;
            case TRUE:
                return 19;
            case WHILE:
                return 20;
            case END:
                return 62;
        }
        return 155;
    }

    private int yys53() {
        switch (yytok) {
            case FALSE:
                return 14;
            case TRUE:
                return 19;
            case ID:
                return 23;
            case LITERAL:
                return 26;
            case CHARACTER:
                return 46;
            case DOUBLEQUOTES:
                return 47;
        }
        return 155;
    }

    private int yys54() {
        switch (yytok) {
            case FALSE:
                return 14;
            case TRUE:
                return 19;
            case ID:
                return 23;
            case LITERAL:
                return 26;
            case CHARACTER:
                return 46;
            case DOUBLEQUOTES:
                return 47;
        }
        return 155;
    }

    private int yys55() {
        switch (yytok) {
            case FALSE:
                return 14;
            case TRUE:
                return 19;
            case ID:
                return 23;
            case LITERAL:
                return 26;
            case CHARACTER:
                return 46;
            case DOUBLEQUOTES:
                return 47;
        }
        return 155;
    }

    private int yys56() {
        switch (yytok) {
            case FALSE:
                return 14;
            case TRUE:
                return 19;
            case ID:
                return 23;
            case LITERAL:
                return 26;
            case CHARACTER:
                return 46;
            case DOUBLEQUOTES:
                return 47;
        }
        return 155;
    }

    private int yys58() {
        switch (yytok) {
            case NEQUAL:
            case LBRACKET:
            case STRING:
            case RPARENTHESIS:
            case LTHAN:
            case LITERAL:
            case EGTHAN:
            case TO:
            case ELTHAN:
            case DOUBLEQUOTES:
            case EQUAL:
            case COLON:
            case LPARENTHESIS:
            case GTHAN:
            case CHARACTER:
            case error:
            case ID:
                return 155;
        }
        return yyr43();
    }

    private int yys59() {
        switch (yytok) {
            case SAY:
            case FLOOP:
            case FALSE:
            case END:
            case INSERT:
            case ELSE:
            case IF:
            case WHILE:
            case TRUE:
            case ARRAY:
            case ENDINPUT:
            case AM:
                return yyr11();
        }
        return 155;
    }

    private int yys60() {
        switch (yytok) {
            case AM:
                return 12;
            case ARRAY:
                return 13;
            case FALSE:
                return 14;
            case FLOOP:
                return 15;
            case IF:
                return 16;
            case INSERT:
                return 17;
            case SAY:
                return 18;
            case TRUE:
                return 19;
            case WHILE:
                return 20;
        }
        return 155;
    }

    private int yys61() {
        switch (yytok) {
            case AM:
                return 12;
            case ARRAY:
                return 13;
            case FALSE:
                return 14;
            case FLOOP:
                return 15;
            case IF:
                return 16;
            case INSERT:
                return 17;
            case SAY:
                return 18;
            case TRUE:
                return 19;
            case WHILE:
                return 20;
        }
        return 155;
    }

    private int yys62() {
        switch (yytok) {
            case SAY:
            case FLOOP:
            case FALSE:
            case END:
            case INSERT:
            case ELSE:
            case IF:
            case WHILE:
            case TRUE:
            case ARRAY:
            case ENDINPUT:
            case AM:
                return yyr35();
        }
        return 155;
    }

    private int yys63() {
        switch (yytok) {
            case MINUS:
                return 53;
            case PLUS:
                return 54;
            case SAY:
            case FLOOP:
            case FALSE:
            case MULTIPLY:
            case DIVIDE:
            case RBRACKET:
            case END:
            case INSERT:
            case ELSE:
            case IF:
            case WHILE:
            case TRUE:
            case ARRAY:
            case ENDINPUT:
            case AM:
                return yyr24();
        }
        return 155;
    }

    private int yys64() {
        switch (yytok) {
            case SAY:
            case FLOOP:
            case FALSE:
            case MULTIPLY:
            case DIVIDE:
            case MINUS:
            case PLUS:
            case RBRACKET:
            case END:
            case INSERT:
            case ELSE:
            case IF:
            case WHILE:
            case TRUE:
            case ARRAY:
            case ENDINPUT:
            case AM:
                return yyr14();
        }
        return 155;
    }

    private int yys65() {
        switch (yytok) {
            case SAY:
            case FLOOP:
            case FALSE:
            case MULTIPLY:
            case DIVIDE:
            case MINUS:
            case PLUS:
            case RBRACKET:
            case END:
            case INSERT:
            case ELSE:
            case IF:
            case WHILE:
            case TRUE:
            case ARRAY:
            case ENDINPUT:
            case AM:
                return yyr13();
        }
        return 155;
    }

    private int yys66() {
        switch (yytok) {
            case SAY:
            case FLOOP:
            case FALSE:
            case MULTIPLY:
            case DIVIDE:
            case MINUS:
            case PLUS:
            case RBRACKET:
            case END:
            case INSERT:
            case ELSE:
            case IF:
            case WHILE:
            case TRUE:
            case ARRAY:
            case ENDINPUT:
            case AM:
                return yyr17();
        }
        return 155;
    }

    private int yys67() {
        switch (yytok) {
            case SAY:
            case FLOOP:
            case FALSE:
            case MULTIPLY:
            case DIVIDE:
            case MINUS:
            case PLUS:
            case RBRACKET:
            case END:
            case INSERT:
            case ELSE:
            case IF:
            case WHILE:
            case TRUE:
            case ARRAY:
            case ENDINPUT:
            case AM:
                return yyr16();
        }
        return 155;
    }

    private int yys68() {
        switch (yytok) {
            case SAY:
            case FLOOP:
            case FALSE:
            case MULTIPLY:
            case DIVIDE:
            case MINUS:
            case PLUS:
            case RBRACKET:
            case END:
            case INSERT:
            case ELSE:
            case IF:
            case WHILE:
            case TRUE:
            case ARRAY:
            case ENDINPUT:
            case AM:
                return yyr46();
        }
        return 155;
    }

    private int yys69() {
        switch (yytok) {
            case AM:
                return 12;
            case ARRAY:
                return 13;
            case FALSE:
                return 14;
            case FLOOP:
                return 15;
            case IF:
                return 16;
            case INSERT:
                return 17;
            case SAY:
                return 18;
            case TRUE:
                return 19;
            case WHILE:
                return 20;
            case END:
                return 71;
        }
        return 155;
    }

    private int yys70() {
        switch (yytok) {
            case AM:
                return 12;
            case ARRAY:
                return 13;
            case FALSE:
                return 14;
            case FLOOP:
                return 15;
            case IF:
                return 16;
            case INSERT:
                return 17;
            case SAY:
                return 18;
            case TRUE:
                return 19;
            case WHILE:
                return 20;
            case ELSE:
                return 72;
            case END:
                return 73;
        }
        return 155;
    }

    private int yys71() {
        switch (yytok) {
            case SAY:
            case FLOOP:
            case FALSE:
            case END:
            case INSERT:
            case ELSE:
            case IF:
            case WHILE:
            case TRUE:
            case ARRAY:
            case ENDINPUT:
            case AM:
                return yyr36();
        }
        return 155;
    }

    private int yys72() {
        switch (yytok) {
            case AM:
                return 12;
            case ARRAY:
                return 13;
            case FALSE:
                return 14;
            case FLOOP:
                return 15;
            case IF:
                return 16;
            case INSERT:
                return 17;
            case SAY:
                return 18;
            case TRUE:
                return 19;
            case WHILE:
                return 20;
        }
        return 155;
    }

    private int yys73() {
        switch (yytok) {
            case SAY:
            case FLOOP:
            case FALSE:
            case END:
            case INSERT:
            case ELSE:
            case IF:
            case WHILE:
            case TRUE:
            case ARRAY:
            case ENDINPUT:
            case AM:
                return yyr37();
        }
        return 155;
    }

    private int yys74() {
        switch (yytok) {
            case AM:
                return 12;
            case ARRAY:
                return 13;
            case FALSE:
                return 14;
            case FLOOP:
                return 15;
            case IF:
                return 16;
            case INSERT:
                return 17;
            case SAY:
                return 18;
            case TRUE:
                return 19;
            case WHILE:
                return 20;
            case END:
                return 75;
        }
        return 155;
    }

    private int yys75() {
        switch (yytok) {
            case SAY:
            case FLOOP:
            case FALSE:
            case END:
            case INSERT:
            case ELSE:
            case IF:
            case WHILE:
            case TRUE:
            case ARRAY:
            case ENDINPUT:
            case AM:
                return yyr38();
        }
        return 155;
    }

    private int yyr1() { // program : stmnt_list
        { 
             program = tree.new 
               ProgramNode((JTOBParseTree.StatementListNode)yysv[yysp-1]) ; 
          }
        yysv[yysp-=1] = yyrv;
        return 1;
    }

    private int yyr12() { // assignment : AM ref ASSIGN expr
        {
              yyrv = tree.new AssignNode((JTOBParseTree.RefNode)yysv[yysp-3], 
                                       (JTOBParseTree.ParseNode)yysv[yysp-2]) ;
            }
        yysv[yysp-=4] = yyrv;
        return 2;
    }

    private int yyr25() { // boolean : TRUE
        yysp -= 1;
        return yypboolean();
    }

    private int yyr26() { // boolean : FALSE
        yysp -= 1;
        return yypboolean();
    }

    private int yypboolean() {
        switch (yyst[yysp-1]) {
            case 56: return 38;
            case 55: return 38;
            case 54: return 38;
            case 53: return 38;
            case 33: return 38;
            case 32: return 38;
            case 27: return 36;
            case 20: return 31;
            default: return 3;
        }
    }

    private int yyr44() { // char : CHARACTER
        {
      yyrv = tree.new CharacterNode((Character)yysv[yysp-1]) ;
    }
        yysv[yysp-=1] = yyrv;
        return 39;
    }

    private int yyr13() { // expr : expr PLUS term
        {
        yyrv = tree.new BinOpNode((JTOBParseTree.ParseNode)yysv[yysp-3],  
                                "+", 
                                (JTOBParseTree.ParseNode)yysv[yysp-1]) ;
      }
        yysv[yysp-=3] = yyrv;
        return yypexpr();
    }

    private int yyr14() { // expr : expr MINUS term
        {
        yyrv = tree.new BinOpNode((JTOBParseTree.ParseNode)yysv[yysp-3],  
                                    "-", 
                                    (JTOBParseTree.ParseNode)yysv[yysp-1]) ;
        }
        yysv[yysp-=3] = yyrv;
        return yypexpr();
    }

    private int yyr15() { // expr : term
        yysp -= 1;
        return yypexpr();
    }

    private int yypexpr() {
        switch (yyst[yysp-1]) {
            case 33: return 48;
            case 32: return 40;
            default: return 63;
        }
    }

    private int yyr19() { // factor : literal
        yysp -= 1;
        return yypfactor();
    }

    private int yyr20() { // factor : ref
        yysp -= 1;
        return yypfactor();
    }

    private int yyr21() { // factor : boolean
        yysp -= 1;
        return yypfactor();
    }

    private int yyr22() { // factor : char
        yysp -= 1;
        return yypfactor();
    }

    private int yyr23() { // factor : string
        yysp -= 1;
        return yypfactor();
    }

    private int yyr24() { // factor : expr
        yysp -= 1;
        return yypfactor();
    }

    private int yypfactor() {
        switch (yyst[yysp-1]) {
            case 56: return 67;
            case 55: return 66;
            default: return 41;
        }
    }

    private int yyr36() { // floop : FLOOP literal TO literal COLON stmnt_list END
        {
                yyrv = tree.new FloopNode((JTOBParseTree.RefNode) yysv[yysp-6], (JTOBParseTree.RefNode) yysv[yysp-4], 
                                 (JTOBParseTree.StatementListNode)yysv[yysp-2]) ;
        }
        yysv[yysp-=7] = yyrv;
        return 4;
    }

    private int yyr37() { // if : IF LPARENTHESIS boolean RPARENTHESIS COLON stmnt_list END
        {
                yyrv = tree.new IfNode((JTOBParseTree.RefNode) yysv[yysp-5], 
                                 (JTOBParseTree.StatementListNode)yysv[yysp-2]) ;
        }
        yysv[yysp-=7] = yyrv;
        return 5;
    }

    private int yyr38() { // if : IF LPARENTHESIS boolean RPARENTHESIS COLON stmnt_list ELSE stmnt_list END
        {
                yyrv = tree.new IfNode((JTOBParseTree.RefNode) yysv[yysp-7], 
                                 (JTOBParseTree.StatementListNode)yysv[yysp-4], (JTOBParseTree.StatementListNode)yysv[yysp-2]) ;
        }
        yysv[yysp-=9] = yyrv;
        return 5;
    }

    private int yyr39() { // if : boolean
        yysp -= 1;
        return 5;
    }

    private int yyr40() { // input : INSERT ref
        { 
         yyrv = tree.new InputNode((JTOBParseTree.RefNode) yysv[yysp-1]) ; 
       }
        yysv[yysp-=2] = yyrv;
        return 6;
    }

    private int yyr45() { // literal : LITERAL
        {
        yyrv = tree.new LiteralNode((Integer)yysv[yysp-1]) ;   
        }
        yysv[yysp-=1] = yyrv;
        switch (yyst[yysp-1]) {
            case 35: return 50;
            case 24: return 34;
            case 18: return 29;
            case 15: return 25;
            default: return 42;
        }
    }

    private int yyr41() { // output : SAY ref
        { 
          yyrv = tree.new OutputNode((JTOBParseTree.RefNode) yysv[yysp-1]) ; 
        }
        yysv[yysp-=2] = yyrv;
        return 7;
    }

    private int yyr42() { // output : SAY literal
        { 
          yyrv = tree.new OutputNode((JTOBParseTree.RefNode) yysv[yysp-1]) ; 
        }
        yysv[yysp-=2] = yyrv;
        return 7;
    }

    private int yyr11() { // array_decl : ARRAY LBRACKET literal RBRACKET ID
        {
              yyrv = tree.new ArrayDeclNode(yysv[yysp-1].toString(), (Integer) yysv[yysp-3]) ;
            }
        yysv[yysp-=5] = yyrv;
        return 8;
    }

    private int yyr43() { // ref : ID LBRACKET expr RBRACKET
        { 
      yyrv = tree.new RefNode(yysv[yysp-4].toString(), (JTOBParseTree.ParseNode) yysv[yysp-2]) ; 
    }
        yysv[yysp-=4] = yyrv;
        switch (yyst[yysp-1]) {
            case 18: return 30;
            case 17: return 28;
            case 12: return 22;
            default: return 43;
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

    private int yyr7() { // statement : floop
        yysp -= 1;
        return yypstatement();
    }

    private int yyr8() { // statement : if
        yysp -= 1;
        return yypstatement();
    }

    private int yyr9() { // statement : input
        yysp -= 1;
        return yypstatement();
    }

    private int yyr10() { // statement : output
        yysp -= 1;
        return yypstatement();
    }

    private int yypstatement() {
        switch (yyst[yysp-1]) {
            case 72: return 9;
            case 61: return 9;
            case 60: return 9;
            case 37: return 9;
            case 0: return 9;
            default: return 21;
        }
    }

    private int yyr2() { // stmnt_list : statement
        { 
               yyrv = tree.new StatementListNode(
                  (JTOBParseTree.StatementNode) yysv[yysp-1]
               ) ; 
             }
        yysv[yysp-=1] = yyrv;
        return yypstmnt_list();
    }

    private int yyr3() { // stmnt_list : stmnt_list statement
        { 
                ((JTOBParseTree.StatementListNode)yysv[yysp-2]).add(
                     (JTOBParseTree.StatementNode) yysv[yysp-1]
                ) ;
                yyrv=yysv[yysp-2] ;
              }
        yysv[yysp-=2] = yyrv;
        return yypstmnt_list();
    }

    private int yypstmnt_list() {
        switch (yyst[yysp-1]) {
            case 61: return 70;
            case 60: return 69;
            case 37: return 52;
            case 0: return 10;
            default: return 74;
        }
    }

    private int yyr46() { // string : DOUBLEQUOTES STRING DOUBLEQUOTES
        {
                yyrv = tree.new StringNode((String)yysv[yysp-2]) ; 
        }
        yysv[yysp-=3] = yyrv;
        return 44;
    }

    private int yyr16() { // term : term MULTIPLY factor
        {
    
    yyrv = tree.new BinOpNode((JTOBParseTree.ParseNode)yysv[yysp-3],  
                                "*", 
                                (JTOBParseTree.ParseNode)yysv[yysp-1]) ;
  
  }
        yysv[yysp-=3] = yyrv;
        return yypterm();
    }

    private int yyr17() { // term : term DIVIDE factor
        {
                yyrv = tree.new BinOpNode((JTOBParseTree.ParseNode)yysv[yysp-3],  
                                "/", 
                                (JTOBParseTree.ParseNode)yysv[yysp-1]) ;
        }
        yysv[yysp-=3] = yyrv;
        return yypterm();
    }

    private int yyr18() { // term : factor
        yysp -= 1;
        return yypterm();
    }

    private int yypterm() {
        switch (yyst[yysp-1]) {
            case 54: return 65;
            case 53: return 64;
            default: return 45;
        }
    }

    private int yyr35() { // while : WHILE boolean COLON stmnt_list END
        {
         yyrv = tree.new WhileNode((JTOBParseTree.RefNode) yysv[yysp-4], 
                                 (JTOBParseTree.StatementListNode)yysv[yysp-2]) ;
       }
        yysv[yysp-=5] = yyrv;
        return 11;
    }

    protected String[] yyerrmsgs = {
    };


//////////////////////////////////////////
// Extra Code
//////////////////////////////////////////

    private JTOBLexer lexer ;
    private int token ;
    private Object yylvalue ;
    private JTOBParseTree tree ;
    private JTOBParseTree.ProgramNode program ;

    public int yynext() {
        lexer.next() ;
        token = lexer.getToken() ;
        yylvalue = lexer.getValue() ;

        return token ;
    }

    public void yyerror(String msg) {
        lexer.printError("ERROR: " + msg) ;
    }

    public JTOB(java.io.InputStream in) {
        lexer = new JTOBLexer(in) ; 
        tree = new JTOBParseTree(this) ;
    }


    public JTOBParseTree.ProgramNode getProgram() {
        return program ;
    }


    public static void main(String [] args) {
        boolean interpret = true ;
        boolean printTree = false ;
        boolean compile = false ;
        String filename="" ;

        //process command line
        for(int i=0 ; i<args.length ; i++) {
            if(args[i].equals("-c")) {
                interpret = false ;
                compile = true ;
            } else if(args[i].equals("-t")) {
                printTree = true ;
            } else {
                filename = args[i] ;
            }
        }

        try {
            JTOB parser = new JTOB(new java.io.FileInputStream(filename)) ;
            parser.yynext() ;
            parser.parse() ;
 
            //print the tree
            if(printTree) {
                parser.getProgram().print("") ;
            }

            //interpret the code
            if(interpret) {
                parser.getProgram().evaluate() ;
            }

            //compile the code to c
            if(compile) {
                java.io.FileOutputStream file = new java.io.FileOutputStream(filename.split("\\.")[0] + ".c") ;
                file.write(parser.getProgram().generate().getBytes()) ;
                file.close() ;
            }

        } catch(java.io.FileNotFoundException e) {
            System.err.println("Could not open file.") ;
        } catch(java.io.IOException e) {
            System.err.println("File Write Error") ;
        }
    }

}
