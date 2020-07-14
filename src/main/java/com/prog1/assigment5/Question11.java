package com.prog1.assigment5;

import java.util.Scanner;

public class Question11 {
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter the first string :");
    String firstString = scanner.nextLine();
    
    System.out.println("Please enter the second string :");
    String secondString = scanner.nextLine();
    
    System.out.println("Please enter the character you wish to remove :");
    char characterToRemove = scanner.nextLine().charAt(0);
    
    StringBuilder output = new StringBuilder();
    // output.append(firstString.replace(character, ""));
    // output.append(secondString.replace(character, ""));
    
    for (int i = 0; i < firstString.length(); i++) {
      char value = firstString.charAt(i);
      
      if (characterToRemove != value) {
        output.append(value);
      }
    }
    
    for (int i = 0; i < secondString.length(); i++) {
      char value = secondString.charAt(i);
      
      if (characterToRemove != value) {
        output.append(value);
      }
    }
    
    System.out.println("The output is: " + output.toString());
  }
}
