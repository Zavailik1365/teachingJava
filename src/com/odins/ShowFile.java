package com.odins;

import java.io.FileInputStream;

public class ShowFile {

    private String fileName;

    public ShowFile(String fileName) {
        this.fileName = fileName;
    }

    public void showFileInConsole()
            throws Exception {
        FileInputStream fileInput = new FileInputStream(this.fileName);
        while (true) {
            int symbol = fileInput.read();
            if (symbol == -1) {
                break;}
            System.out.print((char) symbol);
        }
        fileInput.close();
    }
}
