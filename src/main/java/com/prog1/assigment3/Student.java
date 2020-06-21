package com.prog1.assigment3;

public class Student {
  
  private String name;
  private int id;
  private String gender;
  private House house;
  
  public Student(String name, int id, String gender, House house) {
    super();
    this.name = name;
    this.id = id;
    this.gender = gender;
    this.house = house;
    
    if (gender == "Man") {
      house.addMan();
    } else {
      house.addWoman();
    }
  }
  
  public Student() {
    super();
  }
  
  public String getName() {
    return name;
  }
  
  public int getId() {
    return id;
  }
  
  public String getGender() {
    return gender;
  }
  
  public House getHouse() {
    return house;
  }
  
  public String getStudentAdd() {
    return house.getAddress();
  }
  
  public void setName(String name) {
    this.name = name;
  }
  
  public void setId(int id) {
    this.id = id;
  }
  
  public void setGender(String gender) {
    this.gender = gender;
  }
  
  public void setHouse(House house) {
    this.house = house;
  }
  
  public void setStudentAdd(String address) {
    this.house.setAddress(address);
  }
  
  public String toString() {
    return "Name :" + name + "\n" + "Id :" + id + "\n" + "Gender :" + gender + "\n" + "House :" + house;
  }
  
  String getHouseInfo() {
    return house.toString();
  }
}
