package com.company;

/**
 * Created by Женя on 23.06.2016.
 */
public class Array extends Thread{
    private int sum = 0;
    private int startBarrier;
    private int endBarrier;
    private int[] array;

    public Array(int[] array, int startBarrier, int endBarrier){
        this.array = array;
        this.startBarrier = startBarrier;
        this.endBarrier = endBarrier;
    }

    public void run(){
        for (int i = startBarrier; i < endBarrier; i++){
            sum += array[i];
        }
    }

    public int getSum() {
        return sum;
    }
}
