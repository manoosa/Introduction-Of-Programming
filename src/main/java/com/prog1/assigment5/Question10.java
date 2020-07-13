package com.prog1.assigment5;

import java.util.Scanner;

public class Question10 {
  public static void main(String args[]) {
    final Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter scentence :");
    String str = scanner.nextLine();
    
    System.out.println("Please enter word :");
    String word = scanner.nextLine();
    
    final String[] words = str.split(" ");
    int count = 0;
    
    for (String eachWord : words) {
      if (eachWord.equals(word)) {
        count++;
      }
    }
    
    System.out.println("The word occurs " + count + " times.");
  }
}
