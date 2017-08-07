package com.pluralsight.calengine;

/**
  *Added to github on 08/7/17 by MBROWN
  */
public class DynamicHelper {
  private MathProcesing[] handlers;
  
  //pass in that array of all the handlers we want to use.
  //in side the parameters we will pass in MathProcessing array
  public DynanmicHelper(MathProcessing[] handlers) {
    this.handlers = handlers;
  }
  //begin to have a public string called process which will pass in parameters String statement.
  public String process(String statement)
  //what is be process in will be add 1.0 2.0
  //what will be processed out 1.0 + 2.0 = 3.0
}  
