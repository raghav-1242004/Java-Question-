// This program shows 1D and 2D arrays using enhanced for loop

public class sir_7 {
    public static void main(String[] args) {

        // ---- 1D Array ----
        int arr[] = {10, 20, 30, 40};

        System.out.println("1D Array:");
        for (int x : arr) {
            System.out.println(x); // printing each element
        }

        // ---- 2D Array ----
        int matrix[][] = {
            {1, 2},
            {3, 4}
        };

        System.out.println("2D Array:");
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}