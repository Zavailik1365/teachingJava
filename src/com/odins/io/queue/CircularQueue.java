package com.odins.io.queue;

import com.odins.io.queue.base.Queue;
import com.odins.io.queue.base.QueueElement;

public class CircularQueue extends Queue implements Queue.IQueue {

    private boolean endQueue;

    public CircularQueue(int size) {
        super(size);
        this.endQueue = false;
    }

    public boolean putNext(QueueElement value) {

        if (this.queueCalls.length <= this.putloc) {
            this.putloc = 0;
        }

        this.queueCalls[this.putloc] = value;
        this.putloc++;

        return true;
    }

    public boolean getNext() {

        if (this.queueCalls.length <= this.getloc) {
            System.out.println("Индекс находится за границами массива.");
            return false;
        }

        if (this.endQueue && this.putloc == this.getloc && this.putloc != 0) {
            System.out.println("Обход очереди завершен.");
            return false;
        }

        this.queueCalls[this.getloc].showValue();
        this.getloc++;

        return true;
    }

    public void getNextEndQueue() {

        if (this.endQueue) {
            return;
        }

        for (int i = this.putloc; i < this.queueCalls.length; i++) {
            this.queueCalls[i].showValue();
        }
    }
}
