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
public class PrintStm extends Stm{
    public ExpList exps;
    public PrintStm(ExpList exps){
        this.exps = exps;
    }//end of constructor

    @Override
    public int getPrintStmMaxArgs() {
        return exps.countNumberOfArgs();
    }//end of method
}//end of class
