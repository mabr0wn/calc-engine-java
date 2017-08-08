package com.pluralsight.calengine;

/**
  *added to github on 07/26/2017
  */
public class Multiplier extends CalculateBase implements MathProcessing{
  
  public Multiplier() { }
  
  public Multiplier(double leftVal, double rightVal) { super(leftVal, rightVal); }
  
  @Override
  public void calculate() {
      double value = getLeftVal() * getRightVal();
      setResult(value);
  }
 
  @Override
  //the keyword is Multiply
  public String getKeyword() { return "multiply"; }
 
  @Override
  //the Symbol is *
  public char getSymbol() { return '*'; }
 
  @Override
  //the doCalculation will mulitply the appropiate values together and get the result.
  public double doCalculation(double leftVal, double rightVal) {
   setLeftVal(leftVal);
   setRightVal(rightVal);
   calculate();
   
   return getResult();
  }
}
