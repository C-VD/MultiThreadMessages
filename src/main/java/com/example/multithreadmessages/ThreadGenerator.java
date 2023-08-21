package com.example.multithreadmessages;

public class ThreadGenerator {
    public static void startThread(int number,int nMessages){
        SleapingThread st = new SleapingThread(nMessages, number);
        st.start();
    }
}
