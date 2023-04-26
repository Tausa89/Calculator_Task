package org.example;

import org.example.exceptions.OperationsReaderException;
import org.example.operations.IOperation;
import org.example.operations.OperationFactory;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OperationsReader {
    static List<IOperation> getOperationsFromFile(File fileName)  {
        List<IOperation> operations = new ArrayList<>();

        try {
            Scanner scanner = new Scanner(fileName);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                operations.add(OperationFactory.buildOperation(line));
            }
            scanner.close();

        } catch (
                FileNotFoundException e) {
            throw new OperationsReaderException("File not found");
        }
        return operations;
    }
}
