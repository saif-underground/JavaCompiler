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
//a = 5 + 3; b = (print(a, a - 1), 10 * a); print(b)
public class Main {
    public static void main(String args[]){
        OpExp opExp = new OpExp(new NumExp((3)), OpExp.Plus, new NumExp(5));
        String id1 = "a";
        String id2 = "b";
        AssignStm stm1 = new AssignStm(id1, opExp);
        
        //second stmt
        Exp exp1 = new IdExp(id1);
        Exp exp2 = new OpExp(new IdExp(id1), OpExp.Minus, new NumExp(1));
        ExpList expList= new LastExpList(exp2);
        expList = new PairExpList(exp1, expList);
        Stm tempStm1 = new PrintStm(expList);
        exp1 = new OpExp(new NumExp((10)), OpExp.Times, new IdExp(id1));
        exp1 = new EseqExp(tempStm1, exp1);
        Stm stm2 = new AssignStm(id2, exp1);
        
        
        //3rd stmt
        Stm stm3 = new PrintStm(new LastExpList(new IdExp(id2)));
        
        //program tree
        Stm program = new CompoundStm(stm1, new CompoundStm(stm2, stm3));
    }//end main
    
    /*
    Write a Java function int maxargs(Stm s) that tells the maximum number of arguments of any 
    print statement within any subexpression of a given statement. For example, maxargs(prog) is 2
    */
    public static void maxargs(Stm stm){
    
    }//end of method
}//end of class
