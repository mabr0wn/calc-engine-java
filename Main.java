package com.pluralsight.calengine;

import sun.nio.cs.ext.MacThai;

public class Main {
  
  public static void main(String[] args) {
    //UseMathEquation();
    //UseCalculatorBase();
    
    String[] statements = {
            "add 1.0",
            "add xx 25.0",
            "addX 0.0 0.0",
            "divide 100.0 50.0", //100.0 / 50.0 = 2.0
            "add 25.0 92.0", //25.0 + 92.0 = 117.0
            "substract 225.0 17.0" //225.0 - 17.0 = 208.0
            "multiply 11.0 3.0" //11.0 * 3.0 = 33.0   
    };
    
    CalculateHelper helper = new CalculateHelper();
    //for string statment loop through statements[array] in our Main class
    //tell helper to process them running the process method in CalculateHelp
    //ask the helper to write it out.
    for (String statement:statements) {
      try {
         helper.process(statement);
         System.out.println(helper);
      } catch(InvalidStatementException e) {
          System.out.println("Original exception: " + e.cause().getMessage());
      }
    }
    /*MathEquation testEquation = new MathEquation();
    testEquation.execute();
    System.out.println("test=");
    System.out.println(testEquation.getResult());*/
    
    //will add for indexes starting with 0
    MathEquation[] equations = new MathEquation[4];
    equations[0] = new MathEquation('d', 100.0d, 50.0d);
    equations[1] = new MathEquation('a', 25.0d, 92.0d);
    equations[2] = new MathEquation('s', 225.0d, 17.0d);
    equations[3] = new MathEquation('m', 11.0d, 3.0d);
    
    
         //Call the array MathEquation call the varibale equation, and through the equations
    for(MathEquation equation : equations) {
        //it will call the execute method and run the switch statement in Class MathEquation
        equation.execute();
        System.out.print("Result = ");
        System.out.println(equation.getResult());//returns result
    }
    
    System.out.println();
    System.out.println("Using Overloads");
    System.println();
    
    double leftDouble = 9.0d;
    double rightDouble = 4.0d;
    
    int leftInt = 9;
    int rightInt = 4;
    
    MathEquation equationOverload = new MathEquation('d');
    
    equationOverload.execute(leftDouble, rightDouble);
    System.out.print("Result=");
    System.out.println(equationOverload.getResult());
    
    //will result in a whole number
    equationOverload.execute(leftInt, rightInt);
    System.out.print("Result=");
    System.out.println(equationOverload.getResult());
    
    //if we want to print int as a double we need to convert to double
    //we will not be able to run int because its a narrowing conversion not legal.
    //so instead it will run both ints as a double casting (double)
    equationOverload.execute((double)leftInt, rightInt);
    System.out.print("Result=");
    System.out.println(equationOverload.getResult());
    
    //We will now use inheritance from Divider, Adder, Subtracter, and Multiplier class.
    System.out.println();
    System.out.print("Using Inheritance");
    System.out.println();
    
    //CalculateBase extends to 4 operator classes.
    //Create an array of CalculateBase called calculators
    CalculateBase[] calculators = {
             new Dividier(100.0d, 50.0d);
             new Adder(25.0d, 92.0d);
             new Subtracter(225.0d, 17.0d);
             new Mulitplier(11.0d, 3.0d)
    };
    //Declaring variable called calculator that is going to loop through our calculators.
    //then inside each calculator calls calculate method
    for(CalculateBase calculator:calculators) {
        calculator.calculate();
        System.out.print("Result=");
        System.out.println(calculator.getResult());
    }
    
    
  }
}
