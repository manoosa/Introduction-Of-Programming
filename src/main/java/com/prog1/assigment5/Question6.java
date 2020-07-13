package com.prog1.assigment5;

import java.util.Scanner;

public class Question6 {
  public static void main(String[] args) {
    final Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter first number :");
    final String word = scanner.next();
    final int length = word.length();
    
    for (int i = length - 1; i >= 0; i--) {
      System.out.print(word.charAt(i));
    }
    
    System.out.println("");
  }
}
