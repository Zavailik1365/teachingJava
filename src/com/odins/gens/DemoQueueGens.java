package com.odins.gens;

import com.odins.gens.queue.QueueFull;
import com.odins.gens.queue.exception.*;

public class DemoQueueGens {
    
    public static void main(String arg[]){
    
        Integer integerArray[] = new Integer[10];
        QueueFull<Integer> queueInteger = new QueueFull(integerArray);
        for (int i = 0; i < 11; i++){
            try {
                queueInteger.put(i);
            } catch (QueueFullException exc) {
                System.out.println(exc);
            }
        }
        
        while (true) {
            try{
                queueInteger.get();
            } catch (QueueEmptyException exc) {
                System.out.println(exc);
            } catch (QueueIsEnd exc) {
                System.out.println(exc);
                break;
            }
        }
    
    
        Double doubleArray[] = new Double[10];
        QueueFull<Double> queueDouble = new QueueFull(doubleArray);
        for (double i = 0; i < 11; i++){
            try {
                queueDouble.put(i);
            } catch (QueueFullException exc) {
                System.out.println(exc);
            }
        }
    
        while (true) {
            try{
                queueDouble.get();
            } catch (QueueEmptyException exc) {
                System.out.println(exc);
            } catch (QueueIsEnd exc) {
                System.out.println(exc);
                break;
            }
        }
    }
}
