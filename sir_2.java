// Multiplication Table: Use a for loop to print the multiplication table of a number provided by the user (up to 10).

import java.util.Scanner;

public class sir_2{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Enter You Number");
        int a = scn.nextInt();

        int i,mul;
        for(i=1; i<=10; i++){
            mul = a*i;
            System.out.printf("%d x %d = %d\n",a,i,mul);
        }
    }
}