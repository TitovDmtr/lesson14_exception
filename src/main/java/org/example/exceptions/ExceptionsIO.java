package org.example.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionsIO {
//    public static void main(String args[]) throws FileNotFoundException {
//        File f = new File("D://java/file.txt");
//        FileReader fr = new FileReader(f);
//    }

//    public static void main(String args[]) {
//        File f = new File("D://java/file.txt");
//        try {
//            FileReader fr = new FileReader(f);
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        }
//    }

    public static void main(String args[]) {
        int array[] = {1, 2, 3};
        System.out.println(array[4]);
    }


}