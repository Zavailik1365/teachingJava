package com.odins.io.queue;

import com.odins.io.queue.base.Queue;
import com.odins.io.queue.base.QueueElement;

public class DynQueue extends Queue implements Queue.IQueue {

    public DynQueue(int size){
        super(size);
    }

    public boolean putNext(QueueElement value) {

        if (this.queueCalls.length <= this.putloc) {
            QueueElement queueCallsCopy[] = new QueueElement[this.queueCalls.length * 2];
            System.arraycopy(this.queueCalls, 0, queueCallsCopy, 0, this.queueCalls.length);
            this.queueCalls = queueCallsCopy;
            System.out.println("Увеличен размер очереди.");
        }

        this.queueCalls[this.putloc] = value;
        this.putloc++;

        return true;
    }


}
