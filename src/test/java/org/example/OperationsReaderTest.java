package org.example;

import org.example.exceptions.FactoryException;
import org.example.exceptions.OperationsReaderException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

class OperationsReaderTest {

    @Test
    @DisplayName("when wrong file name or not exist")
    void testOne() {
        File file = new File("WrongTestFileOne.txt");


        assertThrows(OperationsReaderException.class, () ->{
            OperationsReader.getOperationsFromFile(file);
        },"File not found");
    }


    @Test
    @DisplayName("when wrong operation name in file")
    void testTwo(){
        File file = new File("FileWithWrongOperation.txt");
        assertThrows(FactoryException.class, () ->{
            OperationsReader.getOperationsFromFile(file);
        });

    }

    @Test
    @DisplayName("when there is empty line in File")
    void testThree(){
        File file = new File("FileWithEmptyLine.txt");
        assertThrows(FactoryException.class, () ->{
            OperationsReader.getOperationsFromFile(file);
        },"Empty line in file");

    }


}