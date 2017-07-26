package com.pluralsight.calengine;

/**
  *added to github on 07/26/2017
  */
public class Multiplier extends CalculateBase {
  
  public Multiplier() { }
  
  public Multiplier(double leftVal, double rightVal) { super(leftVal, rightVal); }
  
  @Override
  public void calculate() {
      double value = getLeftVal() * getRightVal();
      setResult(value);
  }
}
