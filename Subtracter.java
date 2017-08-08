package com.pluralsight.calengine;

/**
  *added to github on 07/26/17
  */
public class Subtracter extends CalculateBase implements MathProcessing {
    
    public Subtracter() { }
  
    public Subtracter(double leftVal, double rightVal) { super(leftVal, rightVal); }
  
    @Override
    public void calculate() {
      double value = getLeftVal() - getRightVal();
      setResults(value);
    }
 
    @Override
    public String getKeyword() { return "subtract"; }
 
    @Override
    public char getSymbol() { return '-'; }
 
    @Override
    public double doCalculation(double leftVal, double rightVal) {
     setLeftVal(leftVal);
     setRightVal(rightVal);
     calculate();
     
     return getResult();
    }

}
