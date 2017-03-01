package com.samrayleung.www.chapter1;

import java.util.Iterator;

/**
 * @author samray<samrayleung@gmail.com>
 *         Create on 2/23/17
 */
public class Stack<Item> implements Iterable<Item>{
    private Node first;
    private int number;
    private class Node{
        Item item;
        Node next;
    }
    public boolean isEmpty(){
        return first==null;/*or number=0*/
    }
    public int size(){
        return number;
    }
    public void push(Item item){
        Node oldFirst=first;
        first=new Node();
        first.next=oldFirst;
        first.item=item;
        number++;
    }
    public Item pop(){
        Item item=first.item;
        first=first.next;
        number--;
        return item;
    }
    @Override
    public Iterator<Item> iterator() {
        return null;
    }
}
