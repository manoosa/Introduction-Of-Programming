package com.prog1.assigment1;

public class Question3 {
  
  public static void main(String[] args) {
    final int m = 0, n = 10;
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
