package com.odins;

import com.odins.threads.ExtendsThreads;

public class DemoExtendsThreads {

    public static void main(String arg[]) {

        ExtendsThreads threadArray[] = new ExtendsThreads[10];

        for (int i = 0; i < 10; i++) {
            threadArray[i] = new ExtendsThreads("Поток номер: " + i);
            threadArray[i].start();
        }

        for (int i = 0; i < 10; i++) {
            try {
                threadArray[i].join();
            } catch (InterruptedException exc) {
                System.out.println("Прерываение основного потока.");
            }
        }
    }
}
