package org.example.exceptions;

public class CalculatorServiceException extends RuntimeException{

    public CalculatorServiceException (String message){
        super(message);
    }
}
