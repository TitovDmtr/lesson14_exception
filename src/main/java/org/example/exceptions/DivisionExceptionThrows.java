package org.example.exceptions;

import java.io.IOException;
import java.util.Scanner;

public class DivisionExceptionThrows {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i =0;
        while (i < 5) {
            i++;
            System.out.print("Type 1st number: ");
            int a = in.nextInt();
            System.out.print("Type 2nd number: ");
            int b = in.nextInt();
            try {
                int div = divide(a, b);
                System.out.println("a / b = " + div);
                int mult = a * b;
                System.out.println("a * b = " + mult);

            } catch (ArithmeticException ex) {
                System.out.println("Exception: Division by 0 is forbidden");
            } catch (IOException ex1) {
                System.out.println("IOException: a == 1");
            }
        }

    }

    private static int divide(int a, int b) throws ArithmeticException, IOException {
        if (a == 1) {
            throw new IOException();
        }
        return a / b;
    }
}
