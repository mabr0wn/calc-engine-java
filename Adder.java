package com.pluralsight.calengine;

/**
  * Added to gituhub on 07/26/17
  */
//will use this class to set the Add operations.
// 1.0 + 2.0 = 3.0
public class Adder extends CalculateBase implements MathProcessing {
    
   public Adder() { }
  
   public Adder(double leftVal, double rightVal) { super(leftVal, rightVal); }
   
   //will add left and rightVal together
   @Override
   public void calculate() {
      double value = getLeftVal() + getRightVal();
      setResult(value);
   
   }
 
   @Override
   //the keyword is add
   public String getKeyword() {
   return "add";
   }
   @Override
   //the symbol is +
   public char getSymbol() {
      return '+';
   }
   @Override
   //the doCalculation will add the appropiate values together and get the result using the calculate()
   public double doCalculation(double leftVal, double rightVal) {
      setLeftVal(leftVal);
      setRightVal(rightVal);
      calculate();
    
      return getResult();
   }
  
}
