package com.odins.gens.queue.common;

import com.odins.gens.queue.exception.*;

public interface QueueAPI<T> {
    
    void put(T object) throws QueueFullException;
    void get() throws QueueEmptyException, QueueIsEnd;
    
}
