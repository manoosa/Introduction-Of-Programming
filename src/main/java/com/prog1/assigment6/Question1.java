package com.prog1.assigment6;

import java.util.Scanner;

//Write a program that will allow either a real or integer-type number to be //
//raised to an integer-type power (i.e. Evaluate the formula  Y=Xn )

public class Question1 {
  public static void main(String[] args) {
    final Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter Exponent :");
    int exponent = scanner.nextInt();
    
    System.out.println("Please enter Base :");
    final int base = scanner.nextInt();
    
    if (exponent < 0) {
      System.out.println("Invalid Exponent: " + exponent);
    }
    
    final long result = getResult(exponent, base);
    System.out.println("Answer = " + result);
  }
  
  private static long getResult(final int exponent, final int base) {
    long result = 1;
    
    for (int i = exponent; i > 0; i--) {
      result *= base;
    }
    // better for loop if you know start and end
    // while (exponent != 0) {
    // result *= base;
    // --exponent;
    // }
    
    return result;
  }
  
}
