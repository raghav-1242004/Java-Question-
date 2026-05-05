// This program shows wrapper classes and autoboxing/unboxing

public class sir_9{
    public static void main(String[] args) {

        // ---- Autoboxing ----
        int a = 10;
        Integer obj = a; // primitive to object

        // ---- Unboxing ----
        int b = obj; // object to primitive

        System.out.println("Object value: " + obj);
        System.out.println("Primitive value: " + b);
    }
}