package com.odins.base.figure;

public class Circale extends GeometricalFigure {

    public Circale(int radius, String name){
        super(radius, 0, name);
    }

    public void area(){
        super.setArea(Math.PI * (super.getWeidth()^2));
        super.showAreaFigure();
    }

}

