package com.samrayleung.www.chapter2;

/**
 * @author samray<samrayleung@gmail.com>
 *         Create on 2/28/17
 */
public class Insertion extends Example{
    @Override
    public void sort(Comparable[] a) {
//        将 a[] 按升序排列
        int length=a.length;
        for (int i = 0; i < a.length; i++) {
//            将a[i]  插入到 a[i-1],a[i-2],a[i-3]...之中
            for (int j=i;j>0&&less(a[j],a[j-1]);j--){
                exch(a,j,j-1);
            }
        }
    }
    public static void sort(Comparable[] a,int low,int high){
        for(int i=low;i<high;i++){
            for(int j=i;j>0&&less(a[j],a[j-1]);j--){
                exch(a,j,j-1);
            }
        }
    }
}
