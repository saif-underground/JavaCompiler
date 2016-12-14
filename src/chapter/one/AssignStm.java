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
public class AssignStm extends Stm{
    public String id;
    public Exp exp;
    
    public AssignStm(String id, Exp exp){
        this.id = id;
        this.exp = exp;
    }//end of constructor

    @Override
    public int getPrintStmMaxArgs() {
        return exp.getPrintStmMaxArgs();
    }

    @Override
    public Table interprete(Table t) {
        return new Table(id, exp.interPrete(t).i, t);
    }
}//end of class
