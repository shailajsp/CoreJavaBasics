package com.perscholas.java_basics;

public class DivideAndCast {
    public static void main(String[] args) {

        double num1 = 18.5;
        double num2 = 3.5;
         double result = num1 / num2;
          System.out.println("The result of " + num1 + " divided by " + num2 + " is: " + result);
            int castedResult = (int) result;
           System.out.println("After casting to integer, the result is: " + castedResult);
    }
}