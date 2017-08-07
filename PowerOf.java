package com.pluralsight.calengine;

/**
  *added to github on 8/7/17 by MBROWN
  */
//we now have a class called power that will conform to our MathPRocessing interface
public class PowerOf implements MathProcessing {
  @Override
  public String getKeyword() {
    return "power";
  }
  
  @Override
  public char getSymbol() {
    return '^';
  }
  
  //Math.pow does the square of a number 5 ^ 2 = 25
  @Override
  public double doCalculation(double leftVal, double rightVal) {
    return Math.pow(leftVal, rightVal)
  }
}
