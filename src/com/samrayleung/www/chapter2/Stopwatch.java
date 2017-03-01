package com.samrayleung.www.chapter2;

/**
 * @author samray<samrayleung@gmail.com>
 *         Create on 2/28/17
 */
public class Stopwatch {
    private final long start;
    public Stopwatch(){
        start=System.currentTimeMillis();
    }
    public double elapsedTime(){
        long now=System.currentTimeMillis();
        return (now-start)/1000.0;
    }
}
