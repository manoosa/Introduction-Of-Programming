package com.prog1.assigment5;

import java.util.Scanner;

public class Question9 {
  public static void main(String args[]) {
    int integerValue;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter a number :");
    integerValue = scanner.nextInt();
    
    while (integerValue != -1) {
      int value = integerValue;
      int count = 0;
      
      while (value != 0) {
        value /= 10;
        ++count;
      }
      
      System.out.println("Number of digits in:" + integerValue + " is: " + count);
      System.out.println("Please enter a number :");
      integerValue = scanner.nextInt();
    }
    
    System.out.println("Thank you!");
  }
}
