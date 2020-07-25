package com.prog1.assigment7;

import java.util.Arrays;

public class Question1 {
  public static void main(String[] args) {
    int[] data = { 47, 24, 1, 3, 141, 32 };
    int[] copy = array_copy(data);
    
    if (copy == null) {
      System.out.println("Array is Null or Empty");
      return;
    }
    
    System.out.println(Arrays.toString(copy));
  }
  
  public static int[] array_copy(int[] intArray) {
    if (intArray == null || intArray.length == 0) {
      return null;
    }
    
    int[] copyArray = new int[intArray.length];
    
    for (int i = 0; i < intArray.length; i++) {
      copyArray[i] = intArray[i];
    }
    
    return copyArray;
  }
}
