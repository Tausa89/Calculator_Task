package org.example.service;

import org.example.exceptions.CalculatorServiceException;
import org.example.operations.ApplyOperation;
import org.example.operations.IOperation;

import java.util.List;

public class CalculatorService {

    public static double calculate (List<IOperation> operations){
        validateOperations(operations);
        double result = getInitialValue(operations);
        for (IOperation op : operations) {
            if(!op.getClass().equals(ApplyOperation.class)){
                result = op.calculate(result);
            }
        }
        return result;
    }
    private static void validateOperations(List<IOperation> operations) {
        var applyOperations = operations.stream().filter(x -> x.getClass().equals(ApplyOperation.class)).toList();
        if ((long) applyOperations.size() != 1){
            throw new CalculatorServiceException("Wrong number of operations - must be 1");}
    }
    private static double getInitialValue(List<IOperation> operations) {

        return operations.stream().filter(i -> i.getClass().equals(ApplyOperation.class)).findFirst().get().getValue();
    }


}
