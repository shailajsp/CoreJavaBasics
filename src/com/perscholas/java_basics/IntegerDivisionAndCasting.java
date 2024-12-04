package com.perscholas.java_basics;

public class IntegerDivisionAndCasting {
    public static void main(String[] args) {
        // Declare and initialize two integer variables
        int x = 7;
        int y = 6;
         int q = y / x;
          System.out.println("The result of y / x with integer division is: " + q);
                double qDouble = (double) y / x;
                System.out.println("The result of y / x after casting y to double is: " + qDouble);
    }
}