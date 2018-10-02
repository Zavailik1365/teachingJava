package com.odins;

public class StackObject {

    private int queueElementInt;
    private char queueElementChar;
    private double queueElementDouble;
    private boolean queueElementBoolean;
    private String typeElement;

    StackObject(){

    }

    StackObject(StackObject object){

        this.queueElementInt = object.queueElementInt;
        this.queueElementChar = object.queueElementChar;
        this.queueElementDouble = object.queueElementDouble;
        this.queueElementBoolean = object.queueElementBoolean;
        this.typeElement = object.typeElement;

    }

    public void setQueueElement (int element) {
        this.queueElementInt = element;
        this.typeElement = "int";
    }

    public void setQueueElement (char element) {
        this.queueElementChar = element;
        this.typeElement = "char";
    }

    public void setQueueElement (double element) {
        this.queueElementDouble = element;
        this.typeElement = "double";
    }

    public void setQueueElement (boolean element) {
        this.queueElementBoolean = element;
        this.typeElement = "boolean";
    }

    public void showValue () {
        switch (this.typeElement) {
            case "int":
                System.out.println("Элемент очереди: " + queueElementInt);
                break;
            case "double":
                System.out.println("Элемент очереди: " + queueElementDouble);
                break;
            case "char":
                System.out.println("Элемент очереди: " + queueElementChar);
                break;
            case "boolean":
                System.out.println("Элемент очереди: " + queueElementBoolean);
                break;
            default:
                System.out.println("Неверные параметры");
        }

    }
}
