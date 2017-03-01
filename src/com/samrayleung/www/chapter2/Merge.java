package com.samrayleung.www.chapter2;

/**
 * @author samray<samrayleung@gmail.com>
 *         Create on 3/1/17
 */
public class Merge extends Example{
    private static Comparable[] aux;
    @Override
    public void sort(Comparable[] a) {
        Comparable[] aux=a.clone();
        sort(a,aux,0,a.length-1);
    }
    public static  void sort(Comparable[] a,Comparable[] aux,int lo,int hi){
       if(hi<=lo){
            return;
        }
        int mid=lo+(hi-lo)/2;
        sort(a,aux,lo,mid);/*将左半边排序*/
        sort(a,aux,mid+1,hi);/*将右半边排序*/
       merge(a,aux,lo,mid,hi);
    }

    public static void merge(Comparable[] a, Comparable[] aux, int lo, int mid, int hi) {


        int i = lo, j = mid+1;
        for (int k = lo; k <= hi; k++) {
            if      (i > mid)                          a[k] = aux[j++];
            else if (j > hi)                           a[k] = aux[i++];
            else if (less(aux[j], aux[i])) a[k] = aux[j++];
            else                                       a[k] = aux[i++];
        }
    }
}
