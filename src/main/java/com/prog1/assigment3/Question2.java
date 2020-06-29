package com.prog1.assigment3;

public class Question2 {
  public static void main(String[] args) {
    House house1 = new House("House One", 1, 3, "23 nowhere street, Anywhere");
    House house2 = new House("House Two", 0, 5, "23 El makan Street, Somehere");
    Student student1 = new Student("Omar", 143434, "MAN", house1);
    Student student2 = new Student("Sarah", 12345, "WOMAN", house2);
    
    System.out.println(house1.toString());
    System.out.println(student1.toString());
    System.out.println(student2.getStudentAdd());
    System.out.println(student2.getHouseInfo());
    System.out.println(House.getTotalHouses());
    
    final int result = house1.compareTo(house2);
    
    if (result == 1) {
      System.out.println("House 1 has more men/women ratio than House 2");
    } else if (result == 0) {
      System.out.println("House 1 has the same men/women ratio as House 2");
    } else {
      System.out.println("House 1 has less men/women ratio than House 2");
    }
    
    house2.setName("New House two");
    System.out.println(student2.getHouseInfo());
  }
}
