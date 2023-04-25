package org.example.operations;

import lombok.Data;

@Data
public class ApplyOperation implements  IOperation{

    private double value;
    public ApplyOperation (double value){
        this.value = value;
    }

    @Override
    public double calculate(double leftValue) {
        return value;
    }

    public double getValue(){
        return this.value;
    }

}
