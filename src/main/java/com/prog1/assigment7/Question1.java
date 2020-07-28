package com.prog1.assigment7;

//Write a Java method with the following signature that copies an array of datatype int and
//returns a reference to the copy.

public class Question1 {
  public static void main(String[] args) {
    final int[] data = { 47, 24, 1, 3, 141, 32 };
    final int[] copy = array_copy(data);
    
    if (copy == null) {
      System.out.println("Array is Null or Empty");
      return;
    }
    
    // System.out.println(Arrays.toString(copy));
    
    System.out.println("Copied array: ");
    
    for (int i = 0; i < copy.length; i++) {
      System.out.print(copy[i] + " ");
    }
  }
  
  public static int[] array_copy(final int[] intArray) {
    if (intArray == null || intArray.length == 0) {
      return null;
    }
    
    final int[] copyArray = new int[intArray.length];
    
    for (int i = 0; i < intArray.length; i++) {
      copyArray[i] = intArray[i];
    }
    
    return copyArray;
  }
}
