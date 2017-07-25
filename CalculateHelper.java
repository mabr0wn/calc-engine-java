package com.pluralsight.calengine;

/**
  * Added to github on 7/23/17
  */
public class CalculateHelper {
    private static final char ADD_SYMBOL = '+';
    private static final char SUBTRACT_SYMBOL = '-';
    private static final char MULTIPLY_SYMBOL = '*';
    private static final char DIVIDE_SYMBOL = '/';
    MathCommand command;
    double leftValue;
    double rightValue;
    double result;
  
  
  public void process(String statement) {
    //want to receive a string ass 1.0 2.0
    //we recieve the complete string.
    //we then break into individual parts
    String[] parts = statement.split(" "); //this will give you a space
    String commandString = parts[0];//expect to find the value like add
    leftValue = Double.parseDouble(part[1]);//convert string ot a double 1.0 as a double
    rightValue = Double.parseDouble(part[2]);//same as above
    //We then translate the string command into our math command enumeration
  
  }
 
 private void setCommandStringFromString(String commandString) {
     //take that string command(add) --> convert into MathCommand.Add
  
     
 }
}
