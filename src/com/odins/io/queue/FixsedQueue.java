package com.odins.io.queue;

import com.odins.io.queue.base.Queue;
import com.odins.io.queue.base.QueueElement;

public class FixsedQueue extends Queue implements Queue.IQueue {

    public FixsedQueue(int size){
        super(size);
    }

    public boolean putNext(QueueElement value) {

        if (this.queueCalls.length <= this.putloc) {
            System.out.println("Очередь переполнена.");
            return false;
        }

        this.queueCalls[this.putloc] = value;
        this.putloc++;

        return true;
    }

}
