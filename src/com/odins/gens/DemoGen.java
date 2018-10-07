package com.odins.gens;

public class DemoGen{

   public static void main(String arg[]){

       Gen obj1 = new Gen<String, Integer>("Test", 99);
       obj1.printValues();

       Gen obj2 = new Gen<Double, Integer>(99.0, 99);
       obj2.printValues();
   }
}
