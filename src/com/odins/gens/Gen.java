package com.odins.gens;

public class Gen<T, V> {

    private T obj1;
    private V obj2;

    public Gen(T obj1, V obj2){
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    public void printValues() {
        System.out.println(this.obj1.getClass().getName());
        System.out.println(this.obj2.getClass().getName());
        System.out.println(this.obj1);
        System.out.println(this.obj2);
    }
}
