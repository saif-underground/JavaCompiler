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
public class LastExpList extends ExpList{
    public Exp head;

    public LastExpList(Exp exp) {
        this.head = exp;
    }//end of constructor

    @Override
    public int countNumberOfArgs() {
       return 1; 
    }//end of method
    
}//end of class
