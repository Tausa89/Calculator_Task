package org.example.operations;

import lombok.Data;
@Data
public class SubtractOperation implements IOperation {

    private double value;
    public SubtractOperation (double value){
        this.value = value;
    }
    @Override
    public double calculate(double leftValue) {
        return leftValue - value;
    }

    @Override
    public double getValue() {
        return this.value;
    }


}
