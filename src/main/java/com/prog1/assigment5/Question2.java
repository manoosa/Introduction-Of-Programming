package com.prog1.assigment5;

import java.util.Scanner;

public class Question2 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter number :");
    int number = scanner.nextInt();
    int factorial = 1;
    
    if (number != 0) {
      for (int i = number; i > 1; i--) {
        factorial *= i;
      }
      
      System.out.println("The factorial of " + number + " is :" + factorial);
    } else {
      System.out.println("The number : " + number + " is invalid");
    }
  }
}
