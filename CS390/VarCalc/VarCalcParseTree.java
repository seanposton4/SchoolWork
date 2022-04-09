public class VarCalcParseTree
{
    private SymbolTable sym;            //symbol table for the parse tree

    //Construct a parse tree 
    public VarCalcParseTree()
    {
        sym = new SymbolTable();
    }


    //////////////////////////////////////////
    // Parse Tree Inner Classes
    //////////////////////////////////////////

    //Interface of Parse nodes
    public interface ParseNode 
    {
        public void print(String prefix);
        public Object evaluate();
    }


    //Binary Operator Node
    public class BinOpNode implements ParseNode
    {
        protected ParseNode left;
        protected String op;
        protected ParseNode right;

        //construct the binary operator node
        public BinOpNode(Object left, String op, Object right) {
            this.left = (ParseNode) left;
            this.op = op;
            this.right = (ParseNode) right;
        }

        public void print(String prefix) {
            right.print("  "+prefix);
            System.out.println(prefix + op);
            left.print("  " + prefix);
        }

        public Object evaluate() {
            Double lval;
            Double rval;

            //evaluate the operands
            lval = (Double) left.evaluate();
            rval = (Double) right.evaluate();

            //perform the operation
            switch(op) 
            {
                case "+":
                    return lval+rval;
                case "-":
                    return lval-rval;
                case "*":
                    return lval*rval;
                case "/":
                    return lval/rval;
                case "**":
                    return Double.valueOf(Math.pow(lval, rval));
            }

            //undefined, just return 0
            return Double.valueOf(0.0);
        }
    }


   //represents a variable on the parse tree
   public class VariableNode implements ParseNode
   {
        String name;

        //create the variable
        public VariableNode(String name) {
            this.name = name;
        }

        //set the variable's value
        public void set(Object value) {
            sym.assignValue(name, value);
        }

        //evaluate the varaible
        public Object evaluate() {
            if(sym.hasName(name)) {
                return sym.getValue(name);
            } else {
                System.err.println("ERROR: Undefined Reference " + name);
                return null;
            }
        }


        //print the variable
        public void print(String prefix) {
            System.out.println(prefix + name);
        }
    }


    //assignment operation
    public class AssignNode implements ParseNode 
    {
        VariableNode v;  //the variable
        ParseNode expr;  //the expression

        //create an assignment node
        public AssignNode(Object v, Object expr) {
            this.v = (VariableNode) v;
            this.expr = (ParseNode) expr;
        }


        //evaluate the assignment node
        public Object evaluate() {
            //get the rhs
            Object rhs = expr.evaluate();

            //assign the value
            v.set(rhs);

            //the result
            return rhs;
        }


        //print out the assignment
        public void print(String prefix) {
            expr.print(prefix+"  ");
            System.out.println(prefix+"=");
            v.print(prefix+"  ");
        }
    }


    //literal ndoe
    public class LiteralNode implements ParseNode
    {
        Object val;

        //create the literal
        public LiteralNode(Object val) {
            this.val = val;
        }


        //evaluate the literal
        public Object evaluate()
        {
            return val;
        }


        //print the literal
        public void print(String prefix) {
            System.out.println(prefix + val.toString());
        }
    }


    

}