// Natural Sum: Write a while loop to calculate the sum of the first $n$ natural numbers.

import java.util.Scanner;

public class sir_3{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter your Number:-");
        int n = scn.nextInt();

        int i=0,sum =0;
        while(i<=n){
            sum = sum+i;
            i++;
        }
        System.out.print("Your sum of N Number:- "+sum);
        
    }
}