package com.odins.base.figure;

public class Tringal extends GeometricalFigure {

    private int side;

    public Tringal(int width, int height, int side, String name){

        super(width, height, name);

        if (((width + height) < side) || ((width + side) < height) || ((side + height) < width)) {
            System.out.println("Не верные параметры. Сумма двух сторон триугольника ментше" +
                    "третьей строкы");
            return;
        }
       this.side = side;
    }

    public void area(){
        int pir;
        double area;
        pir = (super.getHeiqhts() + super.getWeidth() + this.side) / 2;
        area = Math.sqrt(pir*(pir - super.getHeiqhts())*(pir - super.getWeidth())*(pir - this.side));
        super.setArea(area);
        super.showAreaFigure();
    }

}
