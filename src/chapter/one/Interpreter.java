/**
 * interprets a statement and expression. an interpreation on an statement 
 * changes table elements that contain variable, value pairs. because of a 
 * statement or an expression, variables might hold new values.
 * @author sid
 */
package chapter.one;

public class Interpreter {
    /**
     * @param s is the statement to be interpreted
     */
    public void interprete(Stm s){
    
    }
    
    /** 
     * @param s statment to be evaluated
     * @param t current table
     * @return updated table 
     */
    private Table interpStm(Stm s, Table t){
        return null;
    }
    
    /**
     * @param t current (variable,value) pair
     * @param key the variable to be looked out
     * @return the value of the variable
     */
    private int lookup(Table t, String key){
        return 0;
    }
    
    /**
     * @param e current expression to be evaluated
     * @param t current (variable, value) pair
     * @return object containing value of the expression and updated table
     */
    private IntAndTable interpExp(Exp e, Table t){
        return null;
    }
}

/**
 * return type of expression interpreter. an expression might update a table 
 * and return a value.
 * @author sid
 */
class IntAndTable {
    int i;
    Table t;

    /**
     * 
     * @param ii value that the expression evaluates to
     * @param tt updated table because of the expression evaluation
     */
    IntAndTable(int ii, Table tt) {
        i = ii;
        t = tt;
    }
}
