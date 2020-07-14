package com.prog1.assigment5;

import java.util.Scanner;

public class Question3 {
  private static final String EMPTY_STRING = "";
  
  public static void main(String[] args) {
    final Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter number :");
    int number = scanner.nextInt();
    String binaryNo = EMPTY_STRING;
    
    while (number > 0) {
      binaryNo = number % 2 + "" + binaryNo;
      number = number / 2;
    }
    
    if (binaryNo.equals(EMPTY_STRING)) {
      System.out.println("Invalid number: " + number);
    } else {
      System.out.println("Binary number:" + binaryNo);
    }
  }
  
  // I can also create an array and add the binary number
  // I can you library Integer.toBinaryString
}
