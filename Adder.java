package com.pluralsight.calengine;

/**
  * Added to gituhub on 07/26/17
  */
//will use this class to set the Add operations.
// 1.0 + 2.0 = 3.0
public class Adder extends CalculateBase {
    
   public Adder() { }
  
   public Adder(double leftVal, double rightVal) { super(leftVal, rightVal); }
  
   @Override
   public void calculate() {
      double value = getLeftVal() + getRightVal();
      setResult(value);
   
   }

}
