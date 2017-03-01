package com.samrayleung.www.chapter2;

import java.util.Random;

/**
 * @author samray<samrayleung@gmail.com>
 *         Create on 2/28/17
 */
public class SortCompare {
    public static double time(String alg,Double[] a){
        Stopwatch timer=new Stopwatch();
        if(alg.equals("Insertion")){
            new Insertion().sort(a);
        }else if(alg.equals("Selection")){
            new Selection().sort(a);
        }else if(alg.equals("Shell")){
            new Shell().sort(a);
        }else if(alg.equals("Merge")){
            new Merge().sort(a);
        }else if(alg.equals("Quick")){

        }else if(alg.equals("Heap")){

        }else if(alg.equals("MergeImp")){
            new MergeImproved().sort(a);
        }
        return timer.elapsedTime();
    }
    public static double timeRandomInput(String alg,int length,int times){
        double total=0.0;
        Double[] a=new Double[length];
        for(int t=0;t<times;t++){
            for(int i=0;i<length;i++){
                a[i]= new Random().nextDouble();
            }total+=time(alg,a);
        }
        return total;
    }

    public static void main(String[] args) {
//        String alg1=args[0];
//        String alg2=args[1];
//        int length=Integer.parseInt(args[2]);
//        int times=Integer.parseInt(args[3]);
        String alg1="Merge";
        String alg2="MergeImp";
        int length=10000;
        int times=1000;
        double t1=timeRandomInput(alg1,length,times);
        double t2=timeRandomInput(alg2,length,times);
        System.out.printf("the length of Random Number is:%d;repeat %d times\n",length,times);
        System.out.printf("Algorithms1 is:%s;Algorithms2 is:%s\n",alg1,alg2);
        System.out.printf("%s costs time: %.4f seconds\n%s costs time: %.4f seconds\n",alg1,t1,alg2,t2);
        System.out.printf("%.3f times faster than %s\n",t2/t1,alg2);
    }
}
