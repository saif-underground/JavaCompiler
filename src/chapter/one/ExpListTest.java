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
public class ExpListTest {

    public static void main(String args[]) {
        ExpList exp = new LastExpList(new NumExp(3));
        //System.out.println(exp.countNumberOfArgs());
        exp = new PairExpList(new NumExp(0),
                new PairExpList(new NumExp(1), new LastExpList(new NumExp(2)))
        );
        //System.out.println(exp.countNumberOfArgs());

        Stm stm = new PrintStm(new LastExpList(new NumExp(0)));
        System.out.println(stm.getPrintStmMaxArgs());

        stm = new PrintStm(new PairExpList(new NumExp(0),
                new PairExpList(new NumExp(0), new LastExpList(new NumExp(0)))));
        System.out.println(stm.getPrintStmMaxArgs());

        Stm prog
                = new CompoundStm(new AssignStm("a",
                        new OpExp(new NumExp(5),
                                OpExp.Plus, new NumExp(3))),
                        new CompoundStm(new AssignStm("b",
                                new EseqExp(new PrintStm(new PairExpList(new IdExp("a"),
                                        new LastExpList(new OpExp(new IdExp("a"),
                                                OpExp.Minus, new NumExp(1))))),
                                        new OpExp(new NumExp(10), OpExp.Times,
                                                new IdExp("a")))),
                                new PrintStm(new LastExpList(new IdExp("b")))));
        System.out.println(prog.getPrintStmMaxArgs());
        
        prog = new CompoundStm(new AssignStm("a", new NumExp(0)), 
                new PrintStm(new LastExpList(new IdExp("a"))));
        System.out.println(prog.getPrintStmMaxArgs());
        
        prog = new CompoundStm(new AssignStm("a", new NumExp(0)), 
                new PrintStm(new PairExpList(new NumExp(0), new LastExpList(new NumExp(0)))));
        System.out.println(prog.getPrintStmMaxArgs());
        
        stm = new PrintStm(new PairExpList(new NumExp(0), new LastExpList(
                new NumExp(0)
        )));
        
    }//end of main
}//end of method
