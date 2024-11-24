package org.example;

public class RunnableThread implements Runnable{
    private int[] array;

    public RunnableThread(int[] array) {
        this.array = array;
    }

    @Override
    public void run() {
        for (int i : array) {
            System.out.println("Thread name: " + Thread.currentThread().getName()+ " , Value: " + i);
        }
    }
}
