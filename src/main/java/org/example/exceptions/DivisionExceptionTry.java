package org.example.exceptions;

import java.util.Scanner;

public class DivisionExceptionTry {
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
                int div = a / b;
                System.out.println("a / b = " + div);
            } catch (ArithmeticException ex) {
                System.out.println("Exception: Division by 0 is forbidden");
            }
        }
    }
}

//Throwable: - Error: - OutOfMemoryError
//                    - LinkageError
//                    - StackOverflowError
//
//           - Exception: - RuntimeException: - IllegalArgumentException (NumberFormatException)
//                                            - IndexOutOfBoundException (ArrayIndexOutOfBoundsException)
//                                            - ArithmeticException
//
//                        + IOException: + FileNotFoundException
//                                       + SocketException

// Error - критична помилка під час виконання програми, повʼязана з роботою JVM.
// Exceptions - виняткова, незапланована ситуація, що сталася під час роботи програми.
//
// Два види ексепшенів: - Checked
//                      - Unchecked

// try{} catch{};
// try{} catch{} finally{};
// try{} finally{};
