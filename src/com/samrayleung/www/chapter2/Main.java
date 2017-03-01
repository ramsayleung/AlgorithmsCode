package com.samrayleung.www.chapter2;


public class Main {

    public static void main(String[] args) {
        System.out.println();
    }
    public static  int rank(int key,int[] a){
        int lo=0;
        int hi=a.length-1;
        while (lo<hi){
            int mid=lo+(lo+hi)/2;
            if(key<a[mid]){
                hi=mid-1;
            }else if (key>a[mid]){
                lo=mid+1;
            }else {
                return mid;
            }
        }
        return  -1;
    }
}
