# Triangle Type Classifier
## Program Description

This Java program determines whether three input integers can form a triangle and classifies the type of triangle they would form. The program demonstrates conditional logic, geometric principles, and type classification in Java.

## Class Structure
The program consists of a single class:
```
Triangle.java
└── main() method
```

## Features
- Validates if three numbers can form a triangle
- Identifies multiple triangle types:
  - Equilateral triangle
  - Isosceles triangle
  - Right-angle triangle
  - Common triangle
- Provides clear output messages

## Input Requirements
The program requires three integer inputs:
- Three numbers representing the lengths of triangle sides
- Each number should be entered on a separate line
- No specific order required (program handles all arrangements)

## How to Run
1. Compile the program:
```bash
javac Triangle.java
```

2. Run the program:
```bash
java Triangle
```

## Output Messages
The program will output one of these messages:
1. "The numbers: X, Y and Z represent an equilateral triangle"
2. "The numbers: X, Y and Z represent an isosceles triangle"
3. "The numbers: X, Y and Z represent a right-angle triangle"
4. "The numbers: X, Y and Z represent a common triangle"
5. "The numbers: X, Y and Z cannot represent a triangle"

## Classification Logic
1. Triangle Validation:
   - Uses triangle inequality theorem
   - Checks if sum of any two sides > third side
   
2. Type Classification (in order):
   - Equilateral: all sides equal
   - Right-angle: uses Pythagorean theorem
   - Isosceles: exactly two sides equal
   - Common: all other valid triangles

## Technical Requirements
- Java Development Kit (JDK)
- Command-line interface or IDE
- Scanner class (java.util.Scanner)

## Limitations
- Assumes valid integer inputs
- No input validation implemented
- Single-use program (needs to be rerun for multiple triangles)
- Integer-only side lengths

## Implementation Notes
- Uses Scanner class for input handling
- Closes Scanner properly to prevent resource leaks
- Implements mathematical checks for triangle properties
- Priority order for triangle type classification
- All calculations performed using integer arithmetic
