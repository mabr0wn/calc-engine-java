package com.pluralsight.calengine;

/**
  *Added to github on 08/7/17 by MBROWN
  */
public class DynamicHelper {
  private MathProcessing[] handlers;
  
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
   //we want to take the current handler we are looping through and call it getKeyword method
   //runs the keyword(add) in this statement matches the keyword that handler is currently handling.
   if (keyword.equalsIgnoreCase(handler.getKeyword())) {
     //if it is matches the keyword we will take the local variable and assign it to theHandler
    theHandler = handler;
    //then we will break out of the loop
    break;
    //when we break out of this for statement we now have a handler that can handle that particular keyword
   }
 }
 //convert a string into a double
 //taking parts[1] would be the first number in the string 1.0
 double leftVal = Double.parseDouble(parts[1]);
 //parts[2] would be the 2nd number in the string 2.0
 double rightVal = Double.parseDouble(parts[2]);
 
 //the results will be calculate leftVal and rightVal base on that keyword  that the handler is processing
 //add, subtract, multiply, division
 double result = theHanlder.doCalculation(leftVal, rightVal);
 
 //use the string builder to output how we want the print out to look like.
 StringBuilder sb = new StringBuilder(20);
 //append inserts at the end of the line of code.
 sb.append(leftVal);
 sb.append(' ');
 sb.append(theHandler.getSymbol);
 sb.append(' ');
 sb.append(rightVal);
 sb.append(" = ");
 sb.append(result);
 
 return sb.toString();
 
}  
