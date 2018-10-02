package com.odins;

public class InvertNameEmployer {

    public static void invert(String nameEmployer){

        if (nameEmployer.length() == 0)
            return;

        System.out.println(nameEmployer.charAt(nameEmployer.length() - 1));

        invert(nameEmployer.substring(0, nameEmployer.length() - 1));

    }
}
