package com.prog1.assigment5;

import java.util.Scanner;

public class Question3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter number :");
    int number = scanner.nextInt();
    String binaryNo = "";
    
    while (number > 0) {
      binaryNo = number % 2 + "" + binaryNo;
      number = number / 2;
    }
    
    System.out.println("Binary number:" + binaryNo);
  }
  
  // I can also create an array and add the binary number
  // I can you library Integer.toBinaryString
}
