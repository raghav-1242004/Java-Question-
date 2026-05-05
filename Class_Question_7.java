public class Class_Question_7{
    public static void main(String[] args) {
        // 1. Creation and Parsing
        String numericString = "123";
        Integer a = Integer.valueOf(numericString); // Returns Integer object
        int b = Integer.parseInt("456");           // Returns primitive int
        
        System.out.println("--- Parsing & Conversion ---");
        System.out.println("valueOf('123'): " + a);
        System.out.println("parseInt('456'): " + b);

        // 2. Comparison Methods
        Integer x = 100;
        Integer y = 200;
        System.out.println("\n--- Comparison ---");
        System.out.println("compare(100, 200): " + Integer.compare(x, y)); // -1 if x < y
        System.out.println("x.compareTo(y): " + x.compareTo(y));           // Instance version
        System.out.println("max(100, 200): " + Integer.max(x, y));
        System.out.println("min(100, 200): " + Integer.min(x, y));

        // 3. Bitwise & Binary Operations
        int val = 10; 
        System.out.println("\n--- Bitwise & Binary ---");
        System.out.println("Binary String of 10: " + Integer.toBinaryString(val));
        System.out.println("Hex String of 10: " + Integer.toHexString(val));
        System.out.println("Octal String of 10: " + Integer.toOctalString(val));
        System.out.println("Bit Count (1s in binary): " + Integer.bitCount(val));

        // 4. Value Extraction (from Object to Primitive)
        Integer obj = 129;
        System.out.println("\n--- Type Extraction ---");
        System.out.println("byteValue: " + obj.byteValue());   // Casts to byte
        System.out.println("doubleValue: " + obj.doubleValue()); // Casts to double
        System.out.println("longValue: " + obj.longValue());     // Casts to long

        // 5. Constants
        System.out.println("\n--- Integer Constants ---");
        System.out.println("Max Value: " + Integer.MAX_VALUE);
        System.out.println("Min Value: " + Integer.MIN_VALUE);
        System.out.println("Size (in bits): " + Integer.SIZE);
        System.out.println("Bytes: " + Integer.BYTES);
    }
}