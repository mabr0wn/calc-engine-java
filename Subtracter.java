package com.pluralsight.calengine;

/**
  *added to github on 07/26/17
  */
public class Subtracter extends CalculateBase {
    
    public Subtracter() { }
  
    public Subtracter(double leftVal, double rightVal) { super(leftVal, rightVal); }
  
    @Override
    public void calculate() {
      double value = getLeftVal() - getRightVal();
      setResults(value);
    }

}
