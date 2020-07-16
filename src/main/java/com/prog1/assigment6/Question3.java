
package com.prog1.assigment6;

//Think of a way for swapping two variables with no extra space (i.e without the using of a temp as an intermediate value for swapping).
//Provide your pseudocode or flowchart only (No program required)
public class Question3 {
  public static void main(String[] args) {
    int x = 2, y = 3;
    Variables newVariables = swap(x, y);
    System.out.println("After swaping:" + " x = " + newVariables.getVariable1() + ", y = " + newVariables.getVariable2());
  }
  
  static Variables swap(int firstVariable, int secondVariable) {
    if (firstVariable != secondVariable) {
      firstVariable = firstVariable + secondVariable;
      secondVariable = firstVariable - secondVariable;
      firstVariable = firstVariable - secondVariable;
    }
    return new Variables(firstVariable, secondVariable);
  }
  
  public static class Variables {
    private int variable1;
    private int variable2;
    
    public Variables(int variable1, int variable2) {
      this.variable1 = variable1;
      this.variable2 = variable2;
    }
    
    public int getVariable1() {
      return variable1;
    }
    
    public void setVariable1(int variable1) {
      this.variable1 = variable1;
    }
    
    public int getVariable2() {
      return variable2;
    }
    
    public void setVariable2(int variable2) {
      this.variable2 = variable2;
    }
    
  }
}
