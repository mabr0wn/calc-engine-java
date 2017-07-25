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
    setCommandFromString(commandString);
   //Switch statement will take care of calling adder, subtracter, multiplier, or divider depending on what command was typed.
   //we look at that command and create the appropriate calculateBase derived class
   
   CalculateBase calulator = null;
   switch (command) {
    case Add:
        calculator = new Adder(leftValue, rightValue);
        break;
    case Subtract:
        calculator = new Subtracter(leftValue, rightValue);
        break;
    case Multiply:
        calculator = new Multiplier(leftValue, rightValue);
        break;
    case Divide:
        calculator = new Divider(leftValue, rightValue);
        break;
   }
   //now use our calculator to do the actual work. this will do the actual operations
   calculator.calculate();
   //get the result from the calculator and store into result field.
   result = calculator.getResult();
  }
 
 private void setCommandStringFromString(String commandString) {
     //take that string command(add) --> convert into MathCommand.Add
  
  /*saying here if true commmandString(add) is equal to MathCommand.Add
    ignore the case sensitive of Add in MathCommand, convert to a String
    Set the command to be equal to MathCommand.Add*/
  if(commandString.equalsIgnoreCase(MathCommand.Add.toString()))
      command = MathCommand.Add;
  else if(commandString.equalsIgnoreCase(MathCommand.Subtract.toString()))
      command = MathCommand.Subtract;
  else if(commandString.equalsIgnoreCase(MathCommand.Mulitply.toString()))
      command = MathCommand.Mulitply;
  else if(commandString.equalsIgnoreCase(MathCommand.Divide.toString()))
      command = MathCommand.Divide;
  }
 
 //Convert objects into a string
 @Override
 public String toString() {
      //1.0 + 2.0 = 3.0
      char symbol = ' ';
      switch(command) {
       case Add:
           symbol = ADD_SYMBOL;
           break;
       case Subtract:
           symbol = SUBTRACT_SYMBOL;
           break;
       case Mulitply:
           symbol = MULTIPLY_SYMBOL;
           break;
       case Divide:
           symbol = DIVIDE_SYMBOL;
           break;
      }
      //we need to build that output string using stringBuilder class
      //left value + space + symbol + right value + equals + results
      StringBuilder sb = new StringBuilder(20);
      sb.append(leftValue);
      sb.append(' ');
      sb.append(symbol);
      sb.append(' ');
      sb.append(rightValue);
      sb.append(" = ");
      sb.append(result);
  
      return sb.toString();
 
   }
}
