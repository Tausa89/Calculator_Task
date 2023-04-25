package org.example;

import org.example.exceptions.CalculatorServiceException;
import org.example.operations.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceTest {


    @Test
    @DisplayName("when returned value is correct for Apply Operation")
    void testOne() {
        List<IOperation> operations = List.of(new ApplyOperation(5));
        var result = CalculatorService.calculate(operations);
        assertEquals(5, result);

    }

    @Test
    @DisplayName("when returned value is correct for Add Operation")
    void testTwo() {
        List<IOperation> operations = List.of(new AddOperation(5), new ApplyOperation(5));
        var result = CalculatorService.calculate(operations);
        assertEquals(10, result);
    }

    @Test
    @DisplayName("when returned value is correct for Divide Operation")
    void testThree() {
        List<IOperation> operations = List.of(new DivideOperation(10), new ApplyOperation(50));
        var result = CalculatorService.calculate(operations);
        assertEquals(5, result);
    }

    @Test
    @DisplayName("when returned value is correct for Subtract Operation")
    void testFour() {
        List<IOperation> operations = List.of(new SubtractOperation(10), new ApplyOperation(20));
        var result = CalculatorService.calculate(operations);
        assertEquals(10, result);
    }

    @Test
    @DisplayName("when returned value is correct for All Operation")
    void testFive() {
        List<IOperation> operations = List.of(new ApplyOperation(100), new DivideOperation(10),
                new AddOperation(2), new MultiplyOperation(5), new SubtractOperation(20));
        var result = CalculatorService.calculate(operations);
        assertEquals(40, result);
    }

    @Test
    @DisplayName("when no Apply Operation")
    void testSix() {
        List<IOperation> operations = List.of(new SubtractOperation(10));
        assertThrows(CalculatorServiceException.class, () ->
                {
                    CalculatorService.calculate(operations);
                }
        );
    }

    @Test
    @DisplayName("when more than one Apply Operation")
    void testSeven() {
        List<IOperation> operations = List.of(new SubtractOperation(10));
        assertThrows(CalculatorServiceException.class, () ->
                {
                    CalculatorService.calculate(operations);
                }

        );
    }


}