package com.pluralsight.calengine;

/**
  *Added to github 8/7/17 by Mbrown
  */
public interface MathProcessing {
  //add a constant
  //add a space
  String SEPARATOR = " ";
  String getKeyword(); //add
  String getSymbol(); //+
  double doCalculation(double leftVal, double rightVal);
  
  
}
