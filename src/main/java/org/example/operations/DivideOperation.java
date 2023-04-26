package org.example.operations;

import lombok.Data;
import org.example.exceptions.FactoryException;

@Data
public class DivideOperation implements IOperation{

    private double value;

    public DivideOperation (double value){
        this.value = value;
    }

    @Override
    public double calculate(double leftValue) {
        if(value == 0){
            throw new FactoryException("You can't divide by 0");
        }
        return leftValue / value;
    }

    @Override
    public double getValue() {
        return this.value;
    }
}
