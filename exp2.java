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

public class exp2 {
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
