package com.odins.gens.queue.exception;

public class QueueFullException extends Exception {

    private int size;

    public QueueFullException(int size) {
        this.size = size;
    }

    public String toString() {
        return  "Очередь переполнена. Размер очереди: " + size;
    }
}
