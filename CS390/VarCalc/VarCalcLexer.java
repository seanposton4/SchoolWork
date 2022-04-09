import java.io.InputStream;
import java.util.Scanner;

public class VarCalcLexer implements VarCalcTokens 
{
    //constructor
    public VarCalcLexer(final InputStream in) {
        line = "";
        lineNo = 0;
        colNo = 0;
        currentChar = ' ';
        scan = new Scanner(in);
    }

    // input status
    private String line;
    private int lineNo;
    private int colNo;
    private char currentChar;
    private final Scanner scan;

    // get the next character
    private void nextChar() {
        colNo++;
        while (colNo > line.length()) {
            if (!scan.hasNext()) {
                colNo--;
                currentChar = (char) 0;
                return;
            }

            line = scan.nextLine() + "\n";
            colNo = 1;
            lineNo++;
        }

        currentChar = line.charAt(colNo - 1);
    }

    // report current line number
    public int getLineNumber() {
        return lineNo;
    }

    // report current column number
    public int getColumnNumber() {
        return colNo;
    }

    // return the current line
    public String getLine() {
        return line;
    }

    // print an error message
    public void printError(final String msg) {
        final String lineMsg = "Line " + getLineNumber() + " Column " + getColumnNumber();
        System.err.println(msg);
        System.out.printf("%s: %s", lineMsg, getLine());
        System.out.printf(" %" + lineMsg.length() + "s %" + getColumnNumber() + "s\n", "", "^");
        System.out.println();
    }

    // Lexer Status
    int token;
    Object value;

    public int getToken() {
        return token;
    }

    public Object getValue() {
        return value;
    }


    // matches a single character token
    // Returns true on match
    private boolean singleMatch(final char[] c, final int[] token) {
        for (int i = 0; i < c.length; i++) {
            if (c[i] == currentChar) {
                this.token = token[i];
                this.value = null;
                return true;
            }
        }

        return false;
    }


    //matches an id
    private void id() 
    {
        StringBuilder sb = new StringBuilder();

        while(Character.isLetter(currentChar)) {
            sb.append(currentChar);
            nextChar();
        }

        token = ID;
        value = sb.toString();
    }


    //matches literals 
    private void literal()
    {
        StringBuilder sb = new StringBuilder();

        //grab the whole number part
        while(Character.isDigit(currentChar)){
            sb.append(currentChar);
            nextChar();
        }

        //grab the fractional part (if there is one)
        if(currentChar == '.') {
            sb.append('.');
            nextChar();
            while(Character.isDigit(currentChar)) {
                sb.append(currentChar);
                nextChar();
            }
        }

        token = LITERAL;
        value = Double.valueOf(sb.toString());
    }


    // load the next token
    public void next() {
        // the keyword tokens
        final char[] c = { '+', '-', '/', '=', ';', '(', ')' };
        final int[] ct = { ADD, SUB, DIV, EQUAL, SEMI, LPAREN, RPAREN };

        // skip whitespace
        while (Character.isWhitespace(currentChar)) {
            nextChar();
        }

        // detect end of the file
        if (currentChar == 0) {
            token = ENDINPUT;
            return;
        }

        // assume there is an error
        token = error;
        value = String.valueOf(currentChar);

        // match strings
        if(Character.isLetter(currentChar)) {
            id();
        } else if(Character.isDigit(currentChar)) {
            literal();
        } else if(singleMatch(c, ct)) {
            nextChar();
        } else if(currentChar == '*') {
            nextChar();
            if(currentChar == '*') {
                token = EXP;
                value = null;
                nextChar();
            } else {
                token = MUL;
                value = null;
            }
        } else {
            currentChar = ' ';
        }
}

    // convert the current token to a string
    public String toString() {
        final String[] label = { "ENDINPUT", "ADD", "DIV", "EQUAL", "EXP", "ID", "LITERAL", "LPAREN", "MUL", "RPAREN", "SEMI", "SUB", "error"};

        return label[token] + ": " + value;
    }

    // test the lexer
    public static void main(final String[] args) {
        final VarCalcLexer lexer = new VarCalcLexer(System.in);

        do {
            lexer.next();
            if(lexer.getToken() == VarCalcLexer.error) {
                lexer.printError("Invalid Token");
            } else {
                System.out.println(lexer);
            }
        } while(lexer.getToken() != VarCalcLexer.ENDINPUT);
    }
}
