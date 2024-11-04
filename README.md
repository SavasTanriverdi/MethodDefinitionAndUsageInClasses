MethodDefinitionAndUsageInClasses

This project is a simple Java example demonstrating method definition and usage in classes. It includes a Calculator class that defines methods for basic arithmetic operations: addition, subtraction, multiplication, and division. The project illustrates how to define and call methods within a class.
Project Structure

    MethodDefinitionAndUsageInClasses.java: Contains the Calculator class with methods for arithmetic operations, and the main method that demonstrates how to create an object of Calculator and use its methods.

Code Overview
Key Methods

    add(int a, int b)
        Description: Adds two integers and returns the result.
        Parameters:
            int a - the first integer.
            int b - the second integer.
        Returns: int - the sum of a and b.

    subtract(int a, int b)
        Description: Subtracts b from a and returns the result.
        Parameters:
            int a - the first integer.
            int b - the second integer.
        Returns: int - the difference between a and b.

    multiply(int a, int b)
        Description: Multiplies two integers and returns the result.
        Parameters:
            int a - the first integer.
            int b - the second integer.
        Returns: int - the product of a and b.

    divide(double a, double b)
        Description: Divides a by b and returns the result.
        Parameters:
            double a - the numerator.
            double b - the denominator.
        Returns: double - the quotient of a divided by b.
        Error Handling: If b is zero, an error message is printed, and the method returns 0 to prevent division by zero.

Usage

    javac Main.java
    java Calculator.java

Example output:

    Addition of 10 and 5: 15
    Subtraction of 10 and 5: 5
    Multiplication of 10 and 5: 50
    Division of 10 by 5: 2.0

Key Concepts

    Method Definition: Each arithmetic operation is defined as a separate method within the Calculator class.
    Encapsulation: The Calculator class encapsulates related methods, making the code more organized and modular.
    Error Handling: The divide method includes a check for division by zero, demonstrating a simple form of error handling in methods.

Author

This project is a beginner-friendly example for defining and using methods within a class in Java, aimed at illustrating core concepts of methods in OOP.

