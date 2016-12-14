/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter.one;

/**
 * return type of expression interpreter. an expression might update a table 
 * and return a value.
 * @author sid
 */
public class IntAndTable {
    int i;
    Table t;

    /**
     * 
     * @param ii value that the expression evaluates to
     * @param tt updated table because of the expression evaluation
     */
    IntAndTable(int ii, Table tt) {
        i = ii;
        t = tt;
    }
}

