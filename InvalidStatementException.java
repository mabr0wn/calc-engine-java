package com.pluralsight.calengine;

/**
 *Added to github 8/3
 */
//Constructor for reason statement is invalid
//This constructor accepts the information we need.
//Run this constructor to for first
public class InvlaidStatementException(String reason, String statement) {
  super(reason + ": " + statement);
  
  
}
//this constructor allows us to associate another exception with it.(Throwable)
public class InvalidStatementException(String reason, String statement, Throwable cause) {
  super(reason + ": " + statemnt, cause);
 }
)
