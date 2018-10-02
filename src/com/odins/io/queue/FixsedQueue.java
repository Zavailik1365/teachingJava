package com.odins.io.queue;

import com.odins.io.queue.base.Queue;
import com.odins.io.queue.base.QueueElement;
import com.odins.io.queue.exception.QueueFullException;

public class FixsedQueue extends Queue implements Queue.IQueue {

    public FixsedQueue(int size){
        super(size);
    }

    public boolean putNext(QueueElement value) throws QueueFullException {

        if (this.queueCalls.length <= this.putloc) {
           throw new QueueFullException(this.queueCalls.length );
        }

        this.queueCalls[this.putloc] = value;
        this.putloc++;

        return true;
    }

}
