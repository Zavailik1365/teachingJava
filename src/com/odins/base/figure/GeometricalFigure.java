package com.odins.base.figure;

abstract public class GeometricalFigure {

    private int width;
    private int height ;
    private String name;
    private double area;
    private final String variantCalc;

    GeometricalFigure(){
        this.height  = 0;
        this.width = 0;
        this.name = "No name";
        this.variantCalc = "Standart";
    }

    protected GeometricalFigure(int width, int height, String name){
        this.height  = height;
        this.width = width;
        this.name = name;
        this.variantCalc = "Parameters";
    }

    protected void showAreaFigure() {
        System.out.println("Площадь фигуры:" + this.name + " равна: " + this.area +  " ("+ this.variantCalc + ")");
    }

    protected int getHeiqhts(){
        return this.height;
    }

    protected int getWeidth(){
        return this.width;
    }

    protected void setArea(double area){
        this.area = area;
    }

    abstract void area();

}

