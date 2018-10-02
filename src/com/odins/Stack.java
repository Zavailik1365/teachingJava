package com.odins;

public class Stack {

    private StackObject stackCalls[];
    private int currentPush;

    Stack(int size) {
        this.stackCalls = new StackObject[size];
        this.currentPush = 0;
    }

    public boolean push(int... values) {

        if (isEndStack())
            return false;

        for (int i : values) {
            StackObject stackObject = new StackObject();
            stackObject.setQueueElement(i);
            this.stackCalls[this.currentPush] = stackObject;
            this.currentPush++;
        }
        return true;
    }

    public boolean push(double... values) {

        if (isEndStack())
            return false;

        for (double i : values) {
            StackObject stackObject = new StackObject();
            stackObject.setQueueElement(i);
            this.stackCalls[this.currentPush] = stackObject;
            this.currentPush++;
        }
        return true;
    }

    public boolean push(char... values) {

        if (isEndStack())
            return false;

        for (char i : values) {
            StackObject stackObject = new StackObject();
            stackObject.setQueueElement(i);
            this.stackCalls[this.currentPush] = stackObject;
            this.currentPush++;
        }
        return true;
    }

    public boolean push(boolean... values) {

        if (isEndStack())
            return false;

        for (boolean i : values) {
            StackObject stackObject = new StackObject();
            stackObject.setQueueElement(i);
            this.stackCalls[this.currentPush] = stackObject;
            this.currentPush++;
        }
        return true;
    }

    private boolean isEndStack() {
        return this.currentPush == this.stackCalls.length;
    }

    public boolean pop() {

        if (this.currentPush == 0)
            return false;

        this.stackCalls[this.currentPush - 1].showValue();
        this.currentPush--;

        return true;

    }

}

