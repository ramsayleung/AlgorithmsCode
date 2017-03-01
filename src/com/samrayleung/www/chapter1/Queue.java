package com.samrayleung.www.chapter1;

import java.util.Iterator;

/**
 * @author samray<samrayleung@gmail.com>
 *         Create on 2/24/17
 */
public class Queue<Item> implements Iterable<Item> {
    private Node first;
    private Node last;
    private int number;

    private class Node {
        Item item;
        Node next;
    }

    public boolean isEmpty() {
        return last == null;
    }

    public int size() {
        return number;
    }

    public void enqueue(Item item) {
        Node oldlast = last;
        last.item = item;
        last.next = null;
        if (isEmpty()) {
            first = last;
        } else {
            oldlast.next = last;
        }
        number++;
    }

    public Item dequeue() {
        Item item = first.item;
        first = first.next;
        if (isEmpty()) {
            last = null;
        }
        number--;
        return item;
    }

    @Override
    public Iterator<Item> iterator() {
        return null;
    }
}
