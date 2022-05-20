package com.exampletwo;


import java.util.Scanner;

public class AverageMethod {
    static int arg1 = 1;
    static int arg2 = 2;
    static int arg3 = 3; 
    static double answer = average(arg1, arg2, arg3);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int arg1 = Integer.valueOf(scanner.nextLine());

        System.out.println("Enter the second number: ");
        int arg2 = Integer.valueOf(scanner.nextLine());

        System.out.println("Enter the third number: ");
        int arg3 = Integer.valueOf(scanner.nextLine());

        double answer = average(arg1, arg2, arg3);

        System.out.println("The average is: " + answer);

        scanner.close();

    }

    public static double average(int num1, int num2, int num3) {
        return (num1 + num2 + num3) / 3.0;
    }
}