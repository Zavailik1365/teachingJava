package com.odins;

import com.odins.base.figure.Circale;
import com.odins.base.figure.Tringal;

public class DemoGeometricalFigure {

    public void calculateArea(){

        Tringal tringal1 = new Tringal(4, 4, 2, "Триугольник 1");
        tringal1.area();

        Tringal tringal2 = new Tringal(5, 5, 5, "Триугольник 2");
        tringal2.area();

        Tringal tringal3 = new Tringal(2, 2, 2, "Триугольник 3");
        tringal3.area();

        Circale Circale1 = new Circale(10, "Circale 1");
        Circale1.area();

        Circale Circale2 = new Circale(100, "Circale 2");
        Circale2.area();

        Circale Circale3 = new Circale(11, "Circale 3");
        Circale3.area();
    }
}
