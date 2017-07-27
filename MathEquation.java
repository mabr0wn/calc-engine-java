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
  //we do not need to use a set Result, will use execute() method instead. 
  
  //Constructors
  public MathEquation() { }
  
  public MathEquation(char opCode) { this.opCode = opCode; }
  
  public MathEquation(char opCode, double leftVal, double rightVal) {
    //since we called it above we can call this();
    this(opCode);
    this.leftVal = leftVal;
    this.rightVal = rightVal;
  }
  //Method for execute our double variables on main class.
  public void execute(double leftVal, double rightVal) {
    this.leftVal = leftVal;
    this.rightVal = rightVal;
    
    execute();
    
    
  }
  //method execute to call our int variables on Main.java
  public void execute(int leftVal, int rightVal) {
    this.leftVal = leftVal;
    this.rightVal = rigthVal;
    
    execute();
    
    result = (int)result
  }//Switch statement  
  public void execute() {
      switch(opCode) {
        case 'a':
            result = leftVal + rightVal;
            break;
       case 's':
            result = leftVal - rightVal;
            break;
       case 'd':
            result = rightVal != 0.0d ? leftVal / rightVal : 0.0d;
            //another way to write switch method.
            /*if(rightVal != 0.0d);
                 result leftVal / rightVal
              else
                 result = 0.0d; */ 
            break;
       case 'm' :
            result = leftVal * rightVal;
            break;
       default:
            System.out.println("Error - Invalid opCode");
            result = 0.0d;
            break;
      } 
   }
}
