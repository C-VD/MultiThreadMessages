package com.example.multithreadmessages;

import java.util.Random;

public class SleapingThread extends Thread{
    private final int nMessages;
    private final int number;
    public SleapingThread(int nMessages, int number) {
        super();
        this.nMessages = nMessages;
        this.number = number;
    }


    public void run(){
        Random random = new Random();
        int sleepTime;
        for (int i = 0; i < nMessages; i++) {
            random.nextInt(100, 500);
            sleep(sleepTime);
            System.out.println("Thread " + number + "; Message " + i);
        }
    }
}
