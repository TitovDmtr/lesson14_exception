package org.example.exceptions;

public class ExceptionFinally {
    public static void main(String[] args) {
        int[] array = {10, 20};

        try {
            System.out.println("array[0] = " + array[0]);
            //System.exit(0);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.err.println("Exception about index: " + ex);
        } finally {
            array[0] = 6;
            System.out.println("Block finally");
        }
    }
}

// Блок finally не виконається, коли ми в блок try додамо System.exit(0);