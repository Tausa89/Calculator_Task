package org.example;

import java.awt.*;
import java.io.File;

public class Main {
    public static void main(String[] args) {


        File file = new File("Task.txt");
        var operations = OperationsReader.getOperationsFromFile(file);
        var result = CalculatorService.calculate(operations);
        System.out.printf("Result = %s".formatted(result));

    }


}






