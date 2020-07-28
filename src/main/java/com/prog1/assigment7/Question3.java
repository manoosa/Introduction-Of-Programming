package com.prog1.assigment7;

import java.util.HashSet;
import java.util.Set;

//Write Java methods Union and Intersection that, given two arrays of integers, prints the
//union and intersection of the two arrays.

public class Question3 {
  public static void main(String[] args) {
    
    final int[] arrayOne = { 2, 24, 22, 3, 14, 32 };
    final int[] arrayTwo = { 20, 21, 3, 1, 6, 22 };
    
    final int[] unionArray = getUnionArray(arrayOne, arrayTwo);
    
    if (unionArray == null || unionArray.length == 0) {
      System.out.println("No union values");
    }
    
    System.out.println("The union of both the arrays are: ");
    
    for (int i = 0; i < unionArray.length; i++) {
      System.out.print(unionArray[i] + " ");
    }
    System.out.println();
    
    final int[] intersectionArray = getIntersectionArray(arrayOne, arrayTwo);
    
    if (intersectionArray == null || intersectionArray.length == 0) {
      System.out.println("No intersection values");
    }
    
    System.out.println("The intersection of both the arrays are: ");
    
    for (int i = 0; i < intersectionArray.length; i++) {
      System.out.print(intersectionArray[i] + " ");
    }
  }
  
  private static int[] getUnionArray(final int[] arrayOne, final int[] arrayTwo) {
    final Set<Integer> unionValues = new HashSet<>();
    
    for (int i = 0; i < arrayOne.length; i++) {
      unionValues.add(arrayOne[i]);
    }
    
    for (int j = 0; j < arrayTwo.length; j++) {
      unionValues.add(arrayTwo[j]);
    }
    
    return createArrayResult(unionValues);
  }
  
  private static int[] getIntersectionArray(final int[] arrayOne, final int[] arrayTwo) {
    final Set<Integer> intersectionValues = new HashSet<>();
    
    for (int i = 0; i < arrayOne.length; i++) {
      for (int j = 0; j < arrayTwo.length; j++) {
        if (arrayOne[i] == (arrayTwo[j])) {
          intersectionValues.add(arrayOne[i]);
        }
      }
    }
    
    return createArrayResult(intersectionValues);
  }
  
  private static int[] createArrayResult(final Set<Integer> setValues) {
    if (setValues.isEmpty()) {
      return null;
    }
    
    final int[] result = new int[setValues.size()];
    int i = 0;
    
    for (Integer value : setValues) {
      result[i] = value;
      i++;
    }
    
    return result;
  }
  
}
