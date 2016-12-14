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
public class OpExp extends Exp{
    public Exp left, right;
    public int oper;
    final public static int Plus=1,Minus=2,Times=3,Div=4;

    public OpExp(Exp left, int oper, Exp right) {
        this.left = left;
        this.right = right;
        this.oper = oper;
    }//end of constructor   

    @Override
    public int getPrintStmMaxArgs() {
        return Integer.max(left.getPrintStmMaxArgs(), right.getPrintStmMaxArgs());
    }//end of method

    @Override
    public IntAndTable interPrete(Table table) {
        IntAndTable leftExpResult = left.interPrete(table);
        IntAndTable rightExpResult = right.interPrete(leftExpResult.t);
        int valLeft = leftExpResult.i;
        int valRight = rightExpResult.i;
        int result = 0;
        switch(oper){
            case Plus:
                result = valLeft + valRight;
                break;
            case Minus:
                result = valLeft - valRight;
                break;
            case Times:
                result = valLeft * valRight;
                break;
            case Div:
                result = valLeft / valRight;
                break;
        }
        return new IntAndTable(result, rightExpResult.t);
    }
}//end of class
