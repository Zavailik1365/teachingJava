package com.odins.gens.queue.exception;

public class QueueEmptyException extends Exception {

    public String toString() {
        return  "Очередь пустая.";
    }
}
