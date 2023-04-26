package org.example.operations;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.exceptions.FactoryException;
import org.example.exceptions.OperationsReaderException;
@NoArgsConstructor
@AllArgsConstructor
public class OperationFactory {

    public static IOperation buildOperation (String line){

        String[] parts = line.split(" ");
        if (parts [0].isEmpty() || parts[1].isEmpty()){
            throw new FactoryException("Empty line in file");
        }
        String operation = parts[0];
        double number = Double.parseDouble(parts[1]);


        switch (operation) {
            case "add" -> {
                return new AddOperation(number);
            }
            case "subtract" -> {
                return new SubtractOperation(number);
            }
            case "apply" -> {
                return new ApplyOperation(number);
            }
            case "multiply" -> {
                return new MultiplyOperation(number);
            }
            case "divide" -> {
                return new DivideOperation(number);
            }
            default -> throw new FactoryException("Operation dose not exist");
        }

    }
}
