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
public class CompoundStm extends Stm{
    Stm stm1, stm2;
    public CompoundStm(Stm stm1, Stm stm2){
        this.stm1 = stm1;
        this.stm2 = stm2;
    }//end of constructor

    @Override
    public int getPrintStmMaxArgs() {
        return Integer.max(stm1.getPrintStmMaxArgs(), stm2.getPrintStmMaxArgs());
    }//end of method

    @Override
    public Table interprete(Table t) {
        return stm2.interprete(stm1.interprete(t));
    }
}//end of class
