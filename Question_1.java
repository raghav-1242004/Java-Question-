// Even or Odd: Write a program that takes an integer input and uses an if-else statement to determine if it is even or odd.
import java.util.Scanner;

public class Question_1{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter your number");
        int a = scn.nextInt();

        if(a%2==0){
            System.out.println("Your Number is Even");
        }
        else{
            System.out.println("Your Number is Odd");
        }
        
    }
}