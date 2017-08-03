package com.pluralsight.calengine;

/**
 *Added to github 8/3
 */
public class InvlaidStatementException(String reason, String statement) {
  super(reason + ": " + statement);
  
  
}

public class InvalidStatementException(String reason, String statement, Throwable cause) {
  super(reason + ": " + statemnt, cause);
 }
)
