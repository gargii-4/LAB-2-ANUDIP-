import java.util.*;

class Calculator {
    public int add(int a, int b) {        // add 2 int
        return a + b;
    }

    public int add(int a, int b, int c) {   // add 3 int
        return a + b + c;
    }

    public double add(double a, double b) {    // add 2 doubles
        return a + b;
    }
}

public class CalculatorProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();

        System.out.print("Enter first integer: ");     // add 2 int
        int int1 = sc.nextInt();
        System.out.print("Enter second integer: ");
        int int2 = sc.nextInt();
        int sumTwoInts = calc.add(int1, int2);
        System.out.println("Sum of two integers: " + sumTwoInts);

        System.out.print("Enter third integer: ");    // add 3 int
        int int3 = sc.nextInt();
        int sumThreeInts = calc.add(int1, int2, int3);
        System.out.println("Sum of three integers: " + sumThreeInts);

        System.out.print("Enter first double: ");      // add 2 doubles
        double double1 = sc.nextDouble();
        System.out.print("Enter second double: ");
        double double2 = sc.nextDouble();
        double sumTwoDoubles = calc.add(double1, double2);
        System.out.println("Sum of two doubles: " + sumTwoDoubles);

        sc.close();
    }
}
