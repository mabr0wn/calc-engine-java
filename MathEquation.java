package com.puralsight.calengine;

/**
  *added to github 7/26/17
  */
//DataTypes and Variables
public class MathEquation {
  private double leftVal; //these are all memebers variables
  private double rightVal;
  private char opCode;
  private double result;
  //Accessors(getters) && Mutators(setters)
  public double getLeftVal() { return leftVal; }
  
  public void setLeftVal(double leftVal) { this.leftVal = leftVal; }
  
  public double getRightVal() { return rightVal; }
  
  public void setRightVal(double rightVal) { this.rightVal = rightVal; }
  
  public char getOpCode() {
    return opCode;
  }
  public void setOpCode(char opCode) {
    this.opCode = opCode;
  }
  
  public double getResult() { return result; }
   //we do not need to use a set Result, will sue execute() method instead. 
  
  //Constructors
  public MathEquation() { }
  
  public MathEquation(char opCode) { this.opCode = opCode; }
  
  public MathEquation(char opCode, double leftVal, double rightVal) {
    //since we called it above we can call this();
    this(opCode);
    this.leftVal = leftVal;
    this.rightVal = rightVal;
  }
  //Methods
  public void execute(double leftVal, double rightVal) {
    this.leftVal = leftVal;
    this.rightVal = rightVal;
    
    execute();
    
    
  }
  
  public void execute(int leftVal, int rightVal) {
    this.leftVal = leftVal;
    this.rightVal = rigthVal;
    
    execute();
    
    result = (int)result
  } 
  public void execute() {
      switch(opCode) {
        case 'a':
            result = leftVal + rightVal
      
      } 
        
  
  
  }
  
}
