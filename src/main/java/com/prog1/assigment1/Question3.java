package com.prog1.assigment1;

public class Question3 {
  
  public static void main(String[] args) {
    final int m = 20;
    final int n = 10;
    getPythagoreanValues(m, n);
  }
  
  private static void getPythagoreanValues(final int m, final int n) {
    int a = (int) Math.pow(m, 2);
    int b = 2 * m * n;
    double p = Math.pow(a, 2) + Math.pow(b, 2);
    int c = (int) Math.sqrt(p);
    System.out.print("a = " + a + " b = " + b + " c = " + c);
  }
}
