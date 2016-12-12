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
public class PairExpList extends ExpList{
    public Exp head;
    public ExpList tail;

    public PairExpList(Exp exp, ExpList expList) {
        this.head = exp;
        this.tail = expList;
    }//end of constructor

    @Override
    public int countNumberOfArgs() {
        return 1 + tail.countNumberOfArgs();
    }//end of method
    
}//end of class
