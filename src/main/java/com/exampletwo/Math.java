package com.exampletwo;

public class Math {
    
    public static void main(String[] args) {
        System.out.println(remainder(6, 5));
    }       

    public static int sum(int num1, int num2) {
        return num1 + num2;
    }

    public static int product(int num1, int num2) {
        return num1 * num2;
    }
    
    public static double remainder(int num1, int num2) {
        return num1 % num2;
    }

    public static boolean num1Bigger(int num1, int num2) {
        if (num1 > num2) {
            return true;
        } else { 
            return false;
        }
    }

    public static int notEquals(int int1) {
        return int1;
    }
}
