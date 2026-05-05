// Question:-8

//exception class
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class sir_5 {

    // Method using 'throws'
    static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            // use'throw'
            throw new InvalidAgeException("Age must be 18 or above!");
        } else {
            System.out.println("You are eligible to vote.");
        }
    }

    public static void main(String[] args) {

        try {
            // Built-in Exception
            int a = 10;
            int b = 0;

            int result = a / b;  // it is invalid

            System.out.println("Result: " + result);

            checkAge(15);   // Call method throw exption

        } 
        // Catch Method use
        catch (ArithmeticException e) {
            System.out.println("Built-in Exception Caught: " + e);
        } 
        catch (InvalidAgeException e) {
            System.out.println("User-defined Exception Caught: " + e.getMessage());
        } 
        finally {
            System.out.println("Finally block always executes.");
        }
    }
}