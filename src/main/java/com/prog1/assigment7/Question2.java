package com.prog1.assigment7;

public class Question2 {
  public static void main(String[] args) {
    int[] data = { 47, 24, 1, 3, 141, 32 };
    int key = 0;
    
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
