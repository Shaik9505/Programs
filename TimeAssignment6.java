package com.practiseprograms;

import java.util.Date;

public class TimeAssignment6 extends Thread {
private String threadName;
    
TimeAssignment6(String name) {
        threadName = name;
        System.out.println("Creating "+threadName);
    }

    static void printDateTime() {
        Date date = new Date();
        String str = String.format("Current Date/Time : %tc", date );
        System.out.println(str);
    }
    
    public void run() {
        System.out.println("Running "+threadName);
        try {
            for(int i=0; i<2; i++) {
                printDateTime();
                Thread.sleep(5000);
            }
        }

            catch(InterruptedException e) {
                System.out.println("Thread " +  threadName + " interrupted.");
            }
        }
    }

