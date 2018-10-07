package com.odins.threads;

public class ExtendsThreads extends Thread{

    public ExtendsThreads(String nameThreads) {
        super(nameThreads);
    }

    @Override
    public void run() {

        try {
            for (int i = 0; i < 10; i++){
                System.out.println("Выполнение потока: " + this.getName() + " итерация: " + i);
                Thread.sleep(400);
            }
        } catch (InterruptedException exc){
            System.out.println("Прерывание потока");
        }
    }
}
