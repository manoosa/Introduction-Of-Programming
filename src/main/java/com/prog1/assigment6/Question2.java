package com.prog1.assigment6;

import java.util.Scanner;

//Perrin series are similar to the Fibonacci series but with the following rule:
//P(n) = P(n-2) + P(n-3); P(0) = 3, P(1) = 0, P(2) =2 
//They have a property (not fully proven) is that if P(n) is divisible by n the n is prime (special cases exist)

public class Question2 {
  public static void main(String[] args) {
    final Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter an input :");
    int number = scanner.nextInt();
    int perrinNumber = getPerrinNumber(number);
    
    if (perrinNumber % number == 0) {
      System.out.println(number + " is prime");
    } else {
      System.out.println(number + " is not prime");
    }
    
  }
  
  static int getPerrinNumber(int number) {
    if (number == 0)
      return 3;
    
    if (number == 1)
      return 0;
    
    if (number == 2)
      return 2;
    
    return getPerrinNumber(number - 2) + getPerrinNumber(number - 3);
  }
}
