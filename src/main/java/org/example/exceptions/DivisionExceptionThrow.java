package org.example.exceptions;

import java.util.Scanner;

public class DivisionExceptionThrow {
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
                int mult = a * b;
                System.out.println("a * b = " + mult);
                if (b == 0) {
                    throw new ArithmeticException(); //Відразу перестрибнемо на "catch" якщо умова виконається
                }
                int div = a / b;
                System.out.println("a / b = " + div);
            } catch (ArithmeticException ex) {
                System.out.println("Exception: Division by 0 is forbidden");
            }
        }

    }
}
