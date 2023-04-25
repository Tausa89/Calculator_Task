package org.example;

import org.example.operations.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceTest {



    @Test
    void returnCorrectValueFromApplyOperation() {
        List<IOperation> operations = List.of(new ApplyOperation(5));
        var result = CalculatorService.calculate(operations);
        assertEquals(5,result);

    }
    @Test
    void returnCorrectValueFromAddOperation(){
        List<IOperation> operations = List.of(new AddOperation(5),new ApplyOperation(5));
        var result = CalculatorService.calculate(operations);
        assertEquals(10,result);
    }
    @Test
    void returnCorrectValueFromDivideOperation(){
        List<IOperation> operations = List.of(new DivideOperation(10),new ApplyOperation(50));
        var result = CalculatorService.calculate(operations);
        assertEquals(5,result);
    }
    @Test
    void returnCorrectValueFromSubtractOperation(){
        List<IOperation> operations = List.of(new SubtractOperation(10),new ApplyOperation(20));
        var result = CalculatorService.calculate(operations);
        assertEquals(10,result);
    }

    @Test
    void returnCorrectValueWithAllOperations(){
        List<IOperation> operations = List.of(new ApplyOperation(100), new DivideOperation(10),
                new AddOperation(2), new MultiplyOperation(5), new SubtractOperation(20));
        var result = CalculatorService.calculate(operations);
        assertEquals(40,result);
    }

}