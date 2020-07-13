package com.prog1.assigment5;

import java.util.Scanner;

public class Question1 {
  public static void main(String[] args) {
    final Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter first number :");
    int first = scanner.nextInt();
    System.out.println("Please enter second number :");
    int second = scanner.nextInt();
    System.out.println("Please enter third number :");
    int third = scanner.nextInt();
    
    int smallest = smallest(first, second, third);
    System.out.println("smallest of three numbers is :" + smallest);
    
    int largest = largest(first, second, third);
    System.out.println("largest of three numbers is :" + largest);
    
  }
  
  private static int smallest(int first, int second, int third) {
    int min = first;
    
    if (second < min) {
      min = second;
    }
    
    if (third < min) {
      min = third;
    }
    
    return min;
  }
  
  private static int largest(int first, int second, int third) {
    int max = first;
    
    if (second > max) {
      max = second;
    }
    
    if (third > max) {
      max = third;
    }
    
    return max;
  }
  
  // I can also use Math.min((1,2),3)
}
