package com.odins;

public class StackDemo {

    public static void useStack() {

        Stack stack = new Stack(30);

        stack.push(1,2,3,4);
        stack.push(1.0,21.0,233,4);
        stack.push('A','B','C','D');
        stack.push(true, false);

        while (stack.pop());
    }
}
