package com.odins;

import com.odins.threads.ExtendsThreads;

public class DemoExtendsThreads {

    public static void main(String arg[]) {

        ExtendsThreads threadArray[] = new ExtendsThreads[10];
        boolean jobFinished[] = {false, false, false, false, false,
                false, false, false, false, false};
        boolean jobsFinished;

        for (int i = 0; i < 10; i++) {
            threadArray[i] = new ExtendsThreads("Поток номер: " + i);
            threadArray[i].run();
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
