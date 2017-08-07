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
   
  //split the statement up using the string split method
  //use the constant that was defined on our MathProcessing called Separator
  //that constant is a space anytime it see a space it will split the code.
  String[] parts = statement.split(MathProcessing.SEPARATOR);
  String keyword = parts[0];//first line in the String array statements which will be add
  
  MathProcessing theHandler = null;
 
  //next add a for loop will go through the handlers
  for (MathProcessing handler : handlers) {
   //we want to take the current handler we are looping through and call it getKeyword
  }
}  
