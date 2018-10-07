package com.odins;

import com.odins.threads.ImplementsRuneble;

public class DemoImplementsRuneble {

    public static void main(String arg[]) {

        Thread threadArray[] = new Thread[10];
        boolean jobsFinished;
        boolean jobFinished[] = {false, false, false, false, false,
                false, false, false, false, false};

        for (int i = 0; i < 10; i++) {
            ImplementsRuneble runeble = new ImplementsRuneble("Поток номер: " + i);
            threadArray[i] = new Thread(runeble);
            threadArray[i].start();
        }

        while (true) {

            jobsFinished = true;

            for (int i = 0; i < 10; i++){
                if (threadArray[i].isAlive()) {
                    break;
                }  else {
                    jobFinished[i] = true;
                }
            }
            for (int i = 0; i < 10; i++){
                if (!jobFinished[i]) {
                    jobsFinished = false;
                }
            }

            if (!jobsFinished) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException exc) {
                    System.out.println("Выполнение потока переваною");}
            } else {
                break;
            }
        }
    }
}
