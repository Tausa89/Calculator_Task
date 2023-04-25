package org.example.operations;

import lombok.Data;

@Data
public class AddOperation implements IOperation {
    private double value;
    public AddOperation (double value){
        this.value = value;
    }
    @Override
    public double calculate(double leftValue) {
        return value + leftValue;
    }

    @Override
    public double getValue() {
        return this.value;
    }
}
