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
public class EseqExp extends Exp{
    public Stm stm;
    public Exp exp;
    
    public EseqExp(Stm stm, Exp exp) {
        this.stm = stm;
        this.exp = exp;
    }//end of constructor    

    @Override
    public int getPrintStmMaxArgs() {
        return Integer.max(stm.getPrintStmMaxArgs(), exp.getPrintStmMaxArgs());
    }//end of method

    @Override
    public IntAndTable interPrete(Table table) {
        return exp.interPrete(stm.interprete(table));
    }
}//end of class
