/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter.one;

/**
 * the name is misleading. this class represents an element in the table. the
 * table elements contain variable, value pairs.
 *
 * @author sid
 */
class Table {

    String id;
    int value;
    Table tail;

    Table(String i, int v, Table t) {
        id = i;
        value = v;
        tail = t;
    }
    
    /**
     * returns the value of the identifier from the table
     * @param id to look at
     * @return value of the id
     */
    int lookup(String id){
        Table head = this;
        while(head != null){
            if(head.id.equals(id)){
                return head.value;
            }
            head = head.tail;
        }
        return Integer.MIN_VALUE;
    }
}

