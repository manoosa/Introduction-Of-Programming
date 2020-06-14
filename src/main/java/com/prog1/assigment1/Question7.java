package com.prog1.assigment1;

import java.util.Scanner;

public class Question7 {
  
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter quarters: ");
    final int quarters = scanner.nextInt();
    System.out.print("Enter dimes: ");
    final int dimes = scanner.nextInt();
    System.out.print("Enter nickle: ");
    final int nickle = scanner.nextInt();
    System.out.print("Enter pennies: ");
    final int pennies = scanner.nextInt();
    final double dollars = CountChange(quarters, dimes, nickle, pennies);
    System.out.printf("Total = " + dollars + " dollars");
  }
  
  private static double CountChange(int quarters, int dimes, int nickle, int pennies) {
    double dollars = 0;
    double totalPennies = 0;
    
    if (quarters != 0) {
      totalPennies = quarters * 25;
    }
    
    if (dimes != 0) {
      totalPennies += dimes * 10;
    }
    
    if (nickle != 0) {
      totalPennies += nickle * 5;
    }
    
    if (pennies != 0) {
      totalPennies += pennies;
    }
    
    if (totalPennies != 0) {
      dollars = totalPennies / 100;
    }
    
    return dollars;
  }
}
