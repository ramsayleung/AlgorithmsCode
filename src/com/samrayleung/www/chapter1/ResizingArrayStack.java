package com.samrayleung.www.chapter1;

import java.util.Iterator;

/**
 * @author samray<samrayleung@gmail.com>
 *         Create on 2/23/17
 */
public class ResizingArrayStack<Item> implements Iterable<Item> {
    private Item[] a = (Item[]) new Object[1];
    private int number = 0;

    private boolean isEmpty() {
        return number == 0;
    }

    private int size() {
        return number;
    }

    private void resize(int max) {
        Item[] newStack = (Item[]) new Object[max];
        for (int i = 0; i < a.length; i++) {
            newStack[i] = a[i];
        }
        a = newStack;
    }

    private void push(Item item) {
        if (a.length == number) {
            resize(a.length * 2);
        }
        a[number++] = item;
    }

    private Item pop() {
        Item item = a[--number];
        a[number] = null;
        if (number>0&&number == a.length / 4) {
            resize(a.length / 2);
        }
        return item;
    }
    public Iterator<Item> iterator(){
        return new  ReverseArrayIterator();
    }
    public class ReverseArrayIterator implements Iterator<Item>{
        private int i=number;
        @Override
        public boolean hasNext() {
            return i>0;
        }

        @Override
        public Item next() {
            return a[--i];
        }

        @Override
        public void remove() {

        }
    }
}
