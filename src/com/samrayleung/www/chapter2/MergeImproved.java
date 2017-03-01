package com.samrayleung.www.chapter2;

/**
 * @author samray<samrayleung@gmail.com>
 *         Create on 3/1/17
 */
public class MergeImproved extends Example{
    private static Comparable[] aux;
    @Override
    public void sort(Comparable[] a) {
        Comparable[] aux=a.clone();
        sort(a,aux,0,a.length-1);
    }
    public static void sort(Comparable[] a,Comparable[] aux,int lo,int hi){
        if(hi<=lo){
            return;
        }else if(hi-lo<15){
         insertionSort(a,lo,hi);
            return;
        }
        else {
            int mid = lo + (hi - lo) / 2;
            sort(a,aux, lo, mid);
            sort(a,aux, mid + 1, hi);
//            merge(a,aux, lo, mid, hi);
        if(less(a[mid+1],a[mid])){
            merge(a,aux,lo,mid, hi);
        }
        }
    }
    // sort from a[lo] to a[hi] using insertion sort
    private static void insertionSort(Comparable[] a, int lo, int hi) {
        for (int i = lo; i <= hi; i++)
            for (int j = i; j > lo && less(a[j], a[j-1]); j--)
                exch(a, j, j-1);
    }
    private static void merge(Comparable[] a, Comparable[] aux, int lo, int mid, int hi) {
        int i = lo, j = mid+1;
        for (int k = lo; k <= hi; k++) {
            if      (i > mid)                          a[k] = aux[j++];
            else if (j > hi)                           a[k] = aux[i++];
            else if (less(aux[j], aux[i])) a[k] = aux[j++];
            else                                       a[k] = aux[i++];
        }
    }

}
