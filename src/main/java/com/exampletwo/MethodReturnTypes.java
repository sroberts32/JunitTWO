package com.exampletwo;


public class MethodReturnTypes {

    public static void main(String[] args) {

        System.out.println(thisString());
        System.out.println(thisInteger());
        System.out.println(thisBoolean());

    }

    public static String thisString() {
        return ("String of text.");
    }

    public static int thisInteger() {
        return 32;
    }

    public static boolean thisBoolean() {
        return false;
    }
}
