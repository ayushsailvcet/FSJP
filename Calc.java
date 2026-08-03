/* 
EXP - 2
Write a Java program to create a class called Calculator that demonstrates:
1. Constructor Overloading — define two constructors:
	○ One default constructor that prints a welcome message.
	○ One parameterized constructor that takes two numbers and displays their sum.

2. Method Overloading — create a method add() with:
	○ No parameters (adds two default numbers 5 and 10).
	○ Two integer parameters (adds two integers passed to it).
	○ Three float parameters (adds three floats passed to it).
*/

class Calculator {
    int a, b;

    // Default constructor
    Calculator() {
        a = 0;
        b = 0;
    }

    // Constructor with one parameter
    Calculator(int x) {
        a = x;
        b = 0;
    }

    // Constructor with two parameters
    Calculator(int x, int y) {
        a = x;
        b = y;
    }

    void displaySum() {
        System.out.println("Sum = " + (a + b));
    }
}

public class Calc {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        Calculator c2 = new Calculator(10);
        Calculator c3 = new Calculator(10, 20);

        System.out.print("Calculator 1: ");
        c1.displaySum();

        System.out.print("Calculator 2: ");
        c2.displaySum();

        System.out.print("Calculator 3: ");
        c3.displaySum();
    }
}
