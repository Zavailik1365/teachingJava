package com.odins.files.compare;

import com.odins.files.compare.exception.ArgumetsError;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Compare {

    private String fileNameOne;
    private String fileNameTwo;

    public Compare(String[] args)
        throws ArgumetsError {

        if (args.length != 2) {
            throw new ArgumetsError();
        }
        this.fileNameOne = args[0].replace("-", "");
        this.fileNameTwo = args[1].replace("-", "");
    }

    public void showResult() {

        int symbolOne;
        int symbolTwo;

        try (FileInputStream fileStreamOne = new FileInputStream(this.fileNameOne);
             FileInputStream fileStreamTow = new FileInputStream(this.fileNameTwo)) {

            boolean fileIdentically = true;

            while (fileIdentically ){
                symbolOne = fileStreamOne.read();
                symbolTwo = fileStreamTow.read();

                if (symbolOne != symbolTwo) {
                    System.out.println("Файлы различаются.");
                    fileIdentically = false;
                } else if (symbolOne == -1 | symbolTwo == -1) {
                    break;}
            }

            if (fileIdentically ) {
                System.out.println("Файлы одинаковые");
            }

        } catch (FileNotFoundException exc) {
            System.out.println("Файл не найден: " + exc.toString());
        } catch (Exception exc) {
            System.out.println("Ошибка при чтении файлов: " + exc.toString());
        }

    }

}
