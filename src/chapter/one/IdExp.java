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
public class IdExp extends Exp{
    public String id;
    public IdExp(String id) {
        this.id = id;
    }//end of constructor 
    
    @Override
    public int getPrintStmMaxArgs() {
        return 0;
    }

    @Override
    public IntAndTable interPrete(Table table) {
        return new IntAndTable(table.lookup(id), table);
    }
}//end of class
