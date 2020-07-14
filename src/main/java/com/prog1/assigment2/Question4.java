package com.prog1.assigment2;

public class Question4 {
  public static void main(String[] args) {
    final int r1 = 116, r2 = 116, r3 = 5;
    final int seriousConnection = seriousConnection(r1, r2, r3);
    final double parralelConnection = parralelConnection(r1, r2, r3);
    System.out.printf("resistance outputs= " + seriousConnection + " in serious and " + parralelConnection + " in parralel");
  }
  
  public static double parralelConnection(final int r1, final int r2, final int r3) {
    double output = 0;
    
    if (r1 != 0 && r2 != 0 && r3 != 0) {
      final double result = (1 / (double) r1) + (1 / (double) r2) + (1 / (double) r3);
      output = 1 / result;
    }
    
    return output;
  }
  
  public static int seriousConnection(final int r1, final int r2, final int r3) {
    return r1 + r2 + r3;
  }
}
