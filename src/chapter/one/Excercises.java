/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter.one;

/**
 *
 * @author sid
 */
public class Excercises {
    /*
    Write a Java function int maxargs(Stm s) that tells the maximum number of arguments of any 
    print statement within any subexpression of a given statement. For example, maxargs(prog) is 2
    */
    //exercise 1
    public int maxargs(Stm stm){
        return stm.getPrintStmMaxArgs();
    }//end of method
    
    void interp(Stm s){
    
    }//end of method
}//end of method
