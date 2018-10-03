package com.odins;

import com.odins.files.compare.Compare;
import com.odins.files.compare.exception.ArgumetsError;

public class DemoCompare {

    public static void main(String arg []) {

        try {
            Compare compare = new Compare(arg);
            compare.showResult();
        } catch (ArgumetsError exc) {
            System.out.println(exc.toString());
        }


    }
}
