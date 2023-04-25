package org.example.operations;

import lombok.Data;

@Data
public class MultiplyOperation implements IOperation{


    private double value;
    public MultiplyOperation (double value){
        this.value = value;
    }

    @Override
    public double calculate(double leftValue) {
        return leftValue * value;
    }

    public double getValue(){
        return this.value;
    }
}
