package com.odins.io.queue.exception;

public class QueueEmptyException extends Exception {

    public String toString() {
        return  "Очередь пустая.";
    }
}
