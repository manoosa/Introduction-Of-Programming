package com.prog1.assigment7;

//Write a Java program that given a two-dimensional array, reorders the rows such that the
//row with the highest row sum is the first row.

public class Question4 {
  public static void main(String[] args) {
    final int[][] array = new int[][] { new int[] { 1, 2, 5, -9 }, new int[] { 2, 0 }, new int[] { 2, 2, 3 } };
    final int[] rowSum = new int[array.length];
    
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[i].length; j++) {
        rowSum[i] += array[i][j];
      }
    }
    
    for (int j = rowSum.length; j > 0; j--) {
      boolean isSwap = false;
      
      for (int i = 1; i < j; i++) {
        if (rowSum[i - 1] < rowSum[i]) {
          int temp = rowSum[i - 1];
          rowSum[i - 1] = rowSum[i];
          rowSum[i] = temp;
          final int[] tempArray = array[i - 1];
          array[i - 1] = array[i];
          array[i] = tempArray;
          isSwap = true;
        }
      }
      
      if (!isSwap) {
        break;
      }
    }
    
    System.out.println("Sorted array: ");
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[i].length; j++) {
        System.out.print(array[i][j] + " ");
      }
      System.out.println();
    }
  }
}
