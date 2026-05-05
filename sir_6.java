// This program shows basic Java concepts like variables, operators, if-else, loop, and array

public class sir_6 {
    public static void main(String[] args) {

        // ---- Data Types ----
        int a = 10;   // integer value
        double b = 5.5; // decimal value

        // ---- Operators ----
        double sum = a + b; // addition
        System.out.println("Sum = " + sum);

        // ---- Control Statement (if-else) ----
        if (a > b) {
            System.out.println("a is greater than b");
        } else {
            System.out.println("b is greater than a");
        }

        // ---- Loop ----
        System.out.println("Loop Example:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Number: " + i);
        }

        // ---- Array ----
        int arr[] = {1, 2, 3, 4, 5};
        System.out.println("Array elements:");
        for (int i : arr) {
            System.out.println(i);
        }
    }
}