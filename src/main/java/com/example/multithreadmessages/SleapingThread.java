package com.example.multithreadmessages;

import java.text.SimpleDateFormat;
import java.util.Date;
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
            sleepTime = random.nextInt(100, 500);
            try{
                sleep(sleepTime);
                }catch(InterruptedException e){
                System.out.println("interrupted");
            }
            SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
            Date date = new Date();
            String currentTime = formatter.format(date);
            System.out.println("Time " + currentTime + "; Thread " + number + "; Message " + i);
        }
    }
}
