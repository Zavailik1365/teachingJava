package com.odins.io.queue.base;

import com.odins.io.queue.exception.QueueEmptyException;
import com.odins.io.queue.exception.QueueFullException;

public class Queue {

    protected QueueElement queueCalls[];
    protected int putloc = 0;
    protected int getloc = 0;

    public Queue(int size) {
        queueCalls = new QueueElement[size];
    }

    public boolean getNext()
            throws QueueFullException, QueueEmptyException {

        if (this.queueCalls.length <= this.getloc) {
            throw new QueueFullException(this.queueCalls.length);
        }

        if (this.putloc == this.getloc && this.putloc != 0) {
            System.out.println("Обход очереди завершен.");
            return false;
        }

        try {
            this.queueCalls[this.getloc].showValue();
        } catch (NullPointerException exc){
            throw new QueueEmptyException();
        }
        this.getloc++;

        return true;
    }

   public interface IQueue{
       boolean putNext(QueueElement value) throws QueueFullException;
   }

}
