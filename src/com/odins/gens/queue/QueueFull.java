package com.odins.gens.queue;

import com.odins.gens.queue.common.QueueAPI;
import com.odins.gens.queue.exception.*;

public class QueueFull<T> implements QueueAPI<T> {
    
    private T objects[];
    private int getloc;
    private int putloc;
    
    public QueueFull(T objects[]){
        this.objects = objects;
        this.getloc = 0;
        this.putloc = 0;
        
    }
    public void put(T object)throws QueueFullException {
       
        if (this.objects.length == this.putloc) {
            throw new QueueFullException(this.objects.length);
        }
    
        this.objects[this.putloc] = object;
        this.putloc++;
    }
    
    public void get()throws QueueEmptyException, QueueIsEnd {
        
        if (this.objects.length == 0) {
            throw new QueueEmptyException();
        }
        if (this.objects.length == this.getloc) {
            throw new QueueIsEnd();
        }
    
        System.out.println(this.objects[this.getloc]);
        this.getloc++;
    }
}
