package org.example;

public class MultiThreading {
    public static void main(String[] args) throws InterruptedException{
        System.out.println("Current thread: " + Thread.currentThread().getName());

        MyThread myThread = new MyThread("MyThread", new int[] {1,2,3,4});
        MyThread threadTwo = new MyThread("Second Thread", new int[] {5,6,7,8});

        myThread.start(); //new thread
        threadTwo.start(); //new thread

        //Thread of main method
        int[] myArray= {9,10,11,12};
        for (int i : myArray) {
            System.out.println("Thread name: " + Thread.currentThread().getName()+ " , Value: " + i);
            Thread.sleep(3000);
        }

        // Thread from Runnable
        Runnable runnableThread = new RunnableThread(new int[] {20,21,22,23});
        Thread thread = new Thread(runnableThread,"runnable thread");
        thread.start();
    }
}