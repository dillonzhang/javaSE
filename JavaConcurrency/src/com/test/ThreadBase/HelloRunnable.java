package com.test.ThreadBase;

public class HelloRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println(" hello this is a thread!");
    }

    public static void main(String[] args) {
        new Thread(new HelloRunnable()).start();
    }
}
