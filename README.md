# Calculator_Task


## Table of contents
* [General info](#general-info)
* [How it work](#how-it-work)
* [How to run the aplication](#how-to-run-the-aplication)



## General info

Calculator implemented according to instructions.

## How it work
The calculator performs mathematical operations: addition, subtraction, multiplication and division. 
Operations are given in a text file as follows, 
first give the name of the operation and the number for the operation separated by a space, e.g. add 1. 
The number from which the process will start should be added at the end of the file with the prefix apply, e.g. apply 20. 
There is no limit for number of operation in text file, but there can be only one apply. This is how a sample file should look like.
add 10
multiply 15
subtract 5
apply 20
The calculator ignores mathematical rules about the order in which the operations are performed, they will be carried out from top to bottom.
For the program to work the operations in the file must be given according to the example, 
so there can be no empty lines, the space between the operation name and the number should not be more than one space. 

## How to run the aplication
Code can be pulled from the repository, then Jar should be created, class Main should be selected to run in Jar. Then application can be run from console.
In the console, we need to go to the Jar file folder and run it adding as a parameter an absolute path to the file where operations are stored
For example java -jar Jar_File_Name.jar C:\MyName\Desktop\CalculatorTask\Calculator_Task_File.txt
We should see the result of all operations in the console or error if there was something not according to instructions
