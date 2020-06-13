package com.prog1.assigment1;

public class Question2 {
  
  public static void main(String[] args) {
    final int totalApples = 10;
    final Apples2Dozen result = getNumberOfApples(totalApples);
    System.out.printf("%d dozens and %d apples", result.getDozen(), result.getApples());
  }
  
  private static Apples2Dozen getNumberOfApples(final int totalApples) {
    final int apples = totalApples % 12;
    final int dozen = (totalApples - apples) / 12;
    return new Apples2Dozen(dozen, apples);
  }
  
  public static class Apples2Dozen {
    private int dozen;
    private int apples;
    
    public Apples2Dozen(int dozen2, int apples2) {
      super();
      this.dozen = dozen2;
      this.apples = apples2;
    }
    
    public int getDozen() {
      return dozen;
    }
    
    public int getApples() {
      return apples;
    }
    
  }
}
