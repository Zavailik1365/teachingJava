package com.odins;

import com.odins.threads.ImplementsRuneble;

public class DemoImplementsRuneble {

    public static void main(String arg[]) {

        Thread threadArray[] = new Thread[10];
        boolean jodFinished[] = {false, false, false, false, false,
                false, false, false, false, false};

        for (int i = 0; i < 10; i++) {
            ImplementsRuneble runeble = new ImplementsRuneble("Поток номер: " + i);
            threadArray[i] = new Thread(runeble);
            threadArray[i].run();
        }

        while (true) {
            for (int i = 0; i < 10; i++){
                if (threadArray[i].isAlive()) {
                    break;
                }  else {
                    jodFinished[i] = true;
                }
            }
            if (jodFinished.equals(false)) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException exc) {
                    System.out.println("Выполнение потока переваною");}
            } else {
                break;}
        }
    }
}
