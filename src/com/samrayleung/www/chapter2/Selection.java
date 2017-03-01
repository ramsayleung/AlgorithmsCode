package com.samrayleung.www.chapter2;

/**
 * @author samray<samrayleung@gmail.com>
 *         Create on 2/28/17
 */
public class Selection extends Example {
    public  void sort(Comparable[] a){
        int length=a.length;
        for (int i = 0; i < a.length; i++) {
            int min=i;
           for(int j=i+1;j<length;j++) {
               if(less(a[j],a[i])){
                   min=j;
               }
           }
           exch(a,i,min);
        }
    }
}
