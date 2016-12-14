package chapter.one;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sid
 */
public class NumExp extends Exp{
    public int num;

    /**
     * constructor for the class
     * @param num is the number that this expression holds
     */
    public NumExp(int num) {
        this.num = num;
    }
    
    @Override
    public int getPrintStmMaxArgs() {
        return 0;
    }

    @Override
    public IntAndTable interPrete(Table table) {
        return new IntAndTable(num, table);
    }
    
}//end of class
