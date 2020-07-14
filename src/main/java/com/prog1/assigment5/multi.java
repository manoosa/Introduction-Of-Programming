package com.prog1.assigment5;

//Write an algorithm that will print the multiplication table for the numbers from 1 to n.
public class multi {
  public static void main(String[] args) {
    int n = 5;
    int i = 1;
    while (i <= n) {
      int j = 1;
      while (j <= n) {
        System.out.print(i * j + " ");
        j++;
      }
      System.out.println("");
      i = i + 1;
    }
  }
}

// Don't do this.
//
// when you know the start and end of the loop and condition is obvious, it is better to use for loop more than two
// while loops.
//
// This will be helpful for readability
