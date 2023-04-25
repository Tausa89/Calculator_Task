package org.example;

import org.example.operations.IOperation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OperationsReaderTest {

    @Test()
    @DisplayName("when wrong file name or not exist")
    void getOperationsFromFile() throws FileNotFoundException{
        File file = new File("WrongTestFileOne.txt");
        Exception exception = assertThrows(FileNotFoundException.class, () -> {
            OperationsReader.getOperationsFromFile(file);
        });

        assertEquals("File not found!",exception.getMessage());
    }
}