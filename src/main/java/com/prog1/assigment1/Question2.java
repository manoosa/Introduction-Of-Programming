package com.prog1.assigment1;

public class Question2 {
  
  public static void main(String[] args) {
    final int totalApples = 10;
    getNumberOfApples(totalApples);
  }
  
  private static void getNumberOfApples(final int totalApples) {
    final int apples = totalApples % 12;
    final int dozen = (totalApples - apples) / 12;
    System.out.print(dozen + " dozens and " + apples + " apples");
  }
}
