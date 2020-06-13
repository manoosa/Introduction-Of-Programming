package com.novomind.base64;

public class Main2 {
  
  public static void main(String[] args) {
    int totalApples = 10;
    getNumberOfApples(totalApples);
  }
  
  private static void getNumberOfApples(int totalApples) {
    int apples = totalApples % 12;
    int dozen = (totalApples - apples) / 12;
    System.out.print(dozen + " dozens and " + apples + " apples");
  }
}
