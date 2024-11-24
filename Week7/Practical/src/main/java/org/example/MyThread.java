package org.example;

public class MyThread extends Thread{
    private int[] array;

    public MyThread(String name, int[] array) {
        super(name);
        this.array = array;
    }

    @Override
    public void run() {
        for (int i : array) {
            System.out.println("Thread name: " + Thread.currentThread().getName() + " , value: " + i);
        }
    }
}
