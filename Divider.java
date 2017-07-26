package com.pluralsight.calengine;

/**
  *added to github on 07/26/17
  */
public class Divider extends CalculateBase {
  
  public Divider() { }
   
  public Dividier(double leftVal, double rightVal) { 
    super(leftVal, rightVal); 
    }
    
  @Override
  public void calculate() {
      double value = getLeftVal() / getRightVal();
      setResult(value);
    }
}
