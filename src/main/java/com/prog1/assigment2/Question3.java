package com.prog1.assigment2;

import java.util.Scanner;

public class Question3 {
  
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter first number: "); // m=20
    final int m = scanner.nextInt();
    System.out.print("Enter second number: "); // m=10
    final int n = scanner.nextInt();
    final PythagoreanTriple result = getPythagoreanValues(m, n);
    
    if (result != null) {
      System.out.printf("a = %d b = %d c = %d", result.getSideA(), result.getSideB(), result.getSideC());
    } else {
      System.out.printf("invalid as m is less than n");
    }
  }
  
  private static PythagoreanTriple getPythagoreanValues(final int m, final int n) {
    if (m >= n) {
      int a = (int) Math.pow(m, 2);
      int b = 2 * m * n;
      double p = Math.pow(a, 2) + Math.pow(b, 2);
      int c = (int) Math.sqrt(p);
      return new PythagoreanTriple(a, b, c);
    }
    
    return null;
  }
  
  public static class PythagoreanTriple {
    private int sideA;
    private int sideB;
    private int sideC;
    
    public PythagoreanTriple(int sideA, int sideB, int sideC) {
      super();
      this.sideA = sideA;
      this.sideB = sideB;
      this.sideC = sideC;
    }
    
    public int getSideA() {
      return sideA;
    }
    
    public int getSideB() {
      return sideB;
    }
    
    public int getSideC() {
      return sideC;
    }
  }
}
