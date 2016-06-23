package com.company;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        int[] array = {1, 2, 3, 4, 5, 2, 1, 1};

        Array leftSum = new Array(array, 0, array.length/2);
        Array rightSum = new Array(array, array.length/2, array.length);

        Thread leftThread = new Thread(leftSum);
        Thread rightThread = new Thread(rightSum);

        leftThread.start();
        rightThread.start();

        try{
            leftThread.join();
            rightThread.join();
        }catch (InterruptedException e){
        }

        int left = leftSum.getSum();
        int right = rightSum.getSum();
        System.out.println(left + right);

    }
}
