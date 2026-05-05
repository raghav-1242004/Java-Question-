// Vowel or Consonant: Use a switch statement to check if a character input is a vowel (a, e, i, o, u) or a consonant
import java.util.Scanner;
public class sir_4{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter your number:- ");
        char n = scn.next().charAt(0);
        
        switch(n){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
            System.out.print("Vowel");
            break;

            default :
            System.out.print("Consonant");
            break;
        

        }
        }
        
        





    
}