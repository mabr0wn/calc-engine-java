package com.pluralsight.calengine;

import sun.nio.cs.ext.MacThai;

public class Main {
  
  public static void main(String[] args) {
    //UseMathEquation();
    //UseCalculatorBase();
    
    String[] statements = {
            "divide 100.0 50.0", //100.0 / 50.0 = 2.0
            "add 25.0 92.0", //25.0 + 92.0 = 117.0
            "substract 225.0 17.0" //225.0 - 17.0 = 208.0
            "multiply 11.0 3.0" //11.0 * 3.0 = 33.0   
    };
    
    CalculateHelper helper = new CalculateHelper();
    //Loop through all the statements in array calss CalulateHelper
    //tell helper to process them
    //ask the helper to write it out.
  }
}
