package com.odins.threads;

public class ImplementsRuneble implements Runnable{

    private String threadsName;
    public ImplementsRuneble(String threadsName) {
        this.threadsName = threadsName;
    }

    public void run(){

        try {
            for (int i = 0; i < 10; i++){
                System.out.println("Выполнение потока: " + this.threadsName + " итерация: " + i);
                Thread.sleep(400);
            }
        } catch (InterruptedException exc){
            System.out.println("Прерывание потока");
        }

    }
}
