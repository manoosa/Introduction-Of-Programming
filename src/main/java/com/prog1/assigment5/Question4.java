package com.prog1.assigment5;

import java.util.Scanner;

public class Question4 {
  public static void main(String args[]) {
    double secondRoot = 0, firstRoot = 0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a :");
    double a = sc.nextDouble();
    
    System.out.println("Enter b :");
    double b = sc.nextDouble();
    
    System.out.println("Enter c :");
    double c = sc.nextDouble();
    
    double value = b * b - (4 * a * c);
    
    if (value > 0) {
      double sqrt = Math.sqrt(value);
      firstRoot = (-b + sqrt) / (2 * a);
      secondRoot = (-b - sqrt) / (2 * a);
    }
    
    System.out.println("The first root is :" + firstRoot);
    System.out.println("The second root is:" + secondRoot);
  }
}
