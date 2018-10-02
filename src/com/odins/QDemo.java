package com.odins;

import com.odins.io.queue.DynQueue;
import com.odins.io.queue.FixsedQueue;
import com.odins.io.queue.CircularQueue;
import com.odins.io.queue.base.QueueElement;
import com.odins.io.queue.exception.QueueEmptyException;
import com.odins.io.queue.exception.QueueFullException;


public class QDemo {

    public static void main(String args[]) {

        System.out.println("Фиксированная очередь");

        FixsedQueue queueFixed = new FixsedQueue(29);

        try {
            while (true){
                if (! queueFixed.getNext()) {
                    break;
                }
            }
        } catch (QueueFullException | QueueEmptyException exc) {
            System.out.println(exc);
        }

        try {
            for (int i = 0; i < 10; i++) {
                QueueElement element = new QueueElement();
                element.setQueueElement(i);
                queueFixed.putNext(element);
            }
        } catch (QueueFullException exc) {
            System.out.println(exc);
        }

        try {
            for (int i = 60; i < 70; i++) {
                QueueElement element = new QueueElement();
                element.setQueueElement((char) i);
                queueFixed.putNext(element);
            }
        } catch (QueueFullException exc) {
            System.out.println(exc);
        }

        try {
            for (double i = 60; i < 70; i++) {
                QueueElement element = new QueueElement();
                element.setQueueElement(i);
                queueFixed.putNext(element);
            }
        } catch (QueueFullException exc) {
            System.out.println(exc);
        }

        try {
            while (true){
                if (! queueFixed.getNext()) {
                    break;
                }
            }
        } catch (QueueFullException | QueueEmptyException exc) {
            System.out.println(exc);
        }

        System.out.println("Динамическое выделение памяти под очередь");

        DynQueue queueDyn = new DynQueue(29);

        for (int i = 0; i < 40; i++) {
            QueueElement element = new QueueElement();
            element.setQueueElement(i);
            queueDyn.putNext(element);
        }

        try {
            while (true){
                if (! queueDyn.getNext()) {
                    break;
                }
            }
        } catch (QueueFullException | QueueEmptyException exc) {
            System.out.println(exc);
        }

        System.out.println("Круговое выделение памяти");

        CircularQueue queueCir = new CircularQueue(29);

        for (int i = 0; i < 40; i++) {
            QueueElement element = new QueueElement();
            element.setQueueElement(i);
            queueCir.putNext(element);
        }

        try {
            queueCir.getNextEndQueue();
            while (true){
                if (! queueCir.getNext()) {
                    break;
                }
            }
        } catch (QueueFullException | QueueEmptyException exc) {
            System.out.println(exc);
        }
    }
}
