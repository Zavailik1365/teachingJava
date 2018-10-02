package com.odins.io.queue.base;

public class Queue {

    protected QueueElement queueCalls[];
    protected int putloc = 0;
    protected int getloc = 0;

    public Queue(int size) {
        queueCalls = new QueueElement[size];
    }

    public boolean getNext() {

        if (this.queueCalls.length <= this.getloc) {
            System.out.println("Индекс находится за границами массива.");
            return false;
        }

        if (this.putloc == this.getloc && this.putloc != 0) {
            System.out.println("Обход очереди завершен.");
            return false;
        }

        this.queueCalls[this.getloc].showValue();
        this.getloc++;

        return true;
    }

   public interface IQueue{
       boolean putNext(QueueElement value);
   }

}
