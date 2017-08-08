package com.pluralsight.calengine;

/**
  *added to github on 07/26/17
  *Updated 8/8/17
  */
public class Divider extends CalculateBase implements MathProcessing {
  
  public Divider() { }
   
  public Dividier(double leftVal, double rightVal) { 
    super(leftVal, rightVal); 
    }
    
  @Override
  public void calculate() {
      double value = getLeftVal() / getRightVal();
      setResult(value);
    }
 
  @Override
  public String getKeyword() { return "divide"; }
 
  @Override
  public char getSymbol() { return '/'; }
 
  @Override
  public double doCalculation(double leftVal, double rightVal) {
   setLeftVal(leftVal);
   setRightVal(rightVal);
   calculate();
   
   return getResult();
   
  }
}
