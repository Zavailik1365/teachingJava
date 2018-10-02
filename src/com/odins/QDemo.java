package com.odins;

import com.odins.io.queue.DynQueue;
import com.odins.io.queue.FixsedQueue;
import com.odins.io.queue.CircularQueue;
import com.odins.io.queue.base.QueueElement;


public class QDemo {

    public static void main(String args[]) {

        System.out.println("Фиксированная очередь");

        FixsedQueue queueFixed = new FixsedQueue(29);

        for (int i = 0; i < 10; i++) {
            QueueElement element = new QueueElement();
            element.setQueueElement(i);
            queueFixed.putNext(element);
        }

        for (int i = 60; i < 70; i++) {
            QueueElement element = new QueueElement();
            element.setQueueElement((char) i);
            queueFixed.putNext(element);
        }

        for (double i = 60; i < 70; i++) {
            QueueElement element = new QueueElement();
            element.setQueueElement(i);
            queueFixed.putNext(element);
        }

        while (true){
            if (! queueFixed.getNext()) {
                break;
            }
        }

        System.out.println("Динамическое выделение памяти под очередь");

        DynQueue queueDyn = new DynQueue(29);

        for (int i = 0; i < 40; i++) {
            QueueElement element = new QueueElement();
            element.setQueueElement(i);
            queueDyn.putNext(element);
        }

        while (true){
            if (! queueDyn.getNext()) {
                break;
            }
        }

        System.out.println("Круговое выделение памяти");

        CircularQueue queueCir = new CircularQueue(29);

        for (int i = 0; i < 40; i++) {
            QueueElement element = new QueueElement();
            element.setQueueElement(i);
            queueCir.putNext(element);
        }

        queueCir.getNextEndQueue();
        while (true){
            if (! queueCir.getNext()) {
                break;
            }
        }

    }
}
