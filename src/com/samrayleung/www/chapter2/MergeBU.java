package com.samrayleung.www.chapter2;

/**
 * @author samray<samrayleung@gmail.com>
 *         Create on 3/1/17
 */
public class MergeBU extends Example{
    private static Comparable[] aux;

    @Override
    public void sort(Comparable[] a) {
        int length=a.length;
        aux=new Comparable[a.length];
        for(int sz=1;sz<length;sz=sz+sz){
            for(int lo=0;lo<length-sz;lo+=sz+sz){
                Merge.merge(a,aux,lo,lo+sz-1,Math.min(lo+sz+sz-1,length-1));
            }
        }
    }
}
