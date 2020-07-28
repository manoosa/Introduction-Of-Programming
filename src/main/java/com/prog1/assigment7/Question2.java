package com.prog1.assigment7;

//Write a Java method that given an array of positive integers and a key will return true if and
//only if the key occurs in the array otherwise it will return false. 
public class Question2 {
  public static void main(String[] args) {
    final int[] data = { 47, 24, 1, 3, 141, 32 };
    final int key = 0;
    
    if (data == null || data.length == 0) {
      System.out.println("Array is Null or Empty");
      return;
    }
    
    if (checkKeyExist(data, key)) {
      System.out.println("key exist");
    } else {
      System.out.println("key does not  exist");
    }
  }
  
  private static boolean checkKeyExist(final int[] data, final int key) {
    for (int i = 0; i < data.length; i++) {
      if (key == data[i]) {
        return true;
      }
    }
    return false;
  }
}
