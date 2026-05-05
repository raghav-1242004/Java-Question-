// This program demonstrates string creation, comparison, immutability, and methods

public class sir_8 {
    public static void main(String[] args) {

        // ---- Creation ----
        String s1 = "Hello";
        String s2 = "Hello";

        // ---- Comparison ----
        if (s1.equals(s2)) {
            System.out.println("Strings are equal");
        }

        // ---- Immutability ----
        String s3 = s1.concat(" World"); // new string created
        System.out.println("Original: " + s1);
        System.out.println("New: " + s3);

        // ---- String Methods ----
        System.out.println("Length: " + s1.length());
        System.out.println("Uppercase: " + s1.toUpperCase());
    }
}