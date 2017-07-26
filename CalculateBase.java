package com.pluralsight.calengine;
/**
  *Added to Github 7/26/17
  */
//we need to declare as abstract since method calculate is going to be intiated in other subclasses.
//abstract method calculate() will not work without calling the entire class abstract
//will extend this class to Adder, Subtracter, Multiplier, and Divider class.
public abstract class CalculateBase {
    private double leftVal;
    private double rightVal;
    private double result;
  
    public double getLeftVal() { return leftVal; }
  
    // saying set method leftval to data type variable leftVal
    public void setLeftVal(double leftVal) { this.leftVal = leftVal; }
  
    public double getRightVal() { return rightVal; }
  
    public void setRightVal(double rightVal) { this.rightVal = rightVal; }
  
    public double getResult() { return results; }
  
    public void setResults(double results) { this.result = results; }
  
    public CalculateBase() { }
    
    public CalculateBase(double leftVal, double rightVal) {
        this.leftVal = leftVal;
        this.rightVal = rightVal;
      
    }
    
    //will use in our CalculateHelper();
    public abstract void calculate();

}
