package com.samrayleung.www.chapter2;

/**
 * @author samray<samrayleung@gmail.com>
 *         Create on 3/1/17
 */
public class Shell extends Example{
    @Override
    public void sort(Comparable[] a) {
        int length=a.length;
        int h=1;
        while (h<length/3){
            h=3*h+1;
        }
        while (h>=1){
            for(int i=h;i<length;i++){
                for(int j=i;j>=h&&less(a[j],a[j-h]);j-=h){
                    exch(a,j,j-h);
                }
            }
            h=h/3;
        }
    }
}
