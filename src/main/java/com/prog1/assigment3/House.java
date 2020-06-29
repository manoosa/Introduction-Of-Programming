package com.prog1.assigment3;

public class House implements Comparable<House> {
  private String name;
  private int menNo;
  private int womenNo;
  private String address;
  public static int houses;
  
  public House() {
    houses += 1;
  }
  
  public House(String name, int menNo, int womenNo, String address) {
    this.name = name;
    this.menNo = menNo;
    this.womenNo = womenNo;
    this.address = address;
    houses += 1;
  }
  
  public String getName() {
    return name;
  }
  
  public void setName(String name) {
    this.name = name;
  }
  
  public int getMenNo() {
    return menNo;
  }
  
  public void setMenNo(int menNo) {
    this.menNo = menNo;
  }
  
  public int getWomenNo() {
    return womenNo;
  }
  
  public void setWomenNo(int womenNo) {
    this.womenNo = womenNo;
  }
  
  public String getAddress() {
    return address;
  }
  
  public void setAddress(String address) {
    this.address = address;
  }
  
  public void addMan() {
    this.menNo += 1;
  }
  
  public void addWoman() {
    this.womenNo += 1;
  }
  
  public float MFRatio() {
    return (float) this.menNo / this.womenNo;
  }
  
  // public int compare(House a) {
  // final float ratio = (float) this.MFRatio();
  // final float otherRatio = (float) a.MFRatio();
  
  // 5-9/9-5(absolute)
  // if (ratio > otherRatio) {
  // return 1;
  // } else if (ratio == otherRatio) {
  // return 0;
  // } else {
  // return -1;
  // }
  // }
  
  public static int compare(House a, House b) {
    return a.compareTo(b);
  }
  
  @Override
  public String toString() {
    return "Name: " + name + "\n" + "Number of Men :" + menNo + "\n" + "Number of Women :" + womenNo + "\n" + "Address :" + address;
  }
  
  public static int getTotalHouses() {
    return houses;
  }
  
  @Override
  public int compareTo(House o) {
    final Float ratio = (Float) this.MFRatio();
    final Float otherRatio = (Float) o.MFRatio();
    return ratio.compareTo(otherRatio);
  }
  
}
