package org.example.exceptions;

public class ExceptionForNull extends Throwable {
    public ExceptionForNull(String loginOrPasswordIsEmpty) {
    }

    public static void main(String[] args) {
        String str = null;
//        str = "abc";
        // 0 case
//        System.out.println(str.length());

        // I case
        try {
            System.out.println(str.length());
        } catch (NullPointerException ex) {
            System.out.println("str is null");
        }

        // II  case
//        if (str != null) {
//            System.out.println(str.length());
//        }
//        System.out.println("After catch");
    }

    //ClassCastException
    //IllegalArgumentException
    //ArrayStoreException
    //NegativeArraySizeException
    //TypeNotPresentException
    //UnsupportedOperationException
    //ClassNotFoundException
    //InstantiationException
}