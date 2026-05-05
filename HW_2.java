// Write a program in java to enter 10 of your friends name(one word) in string and arrange them lexicographically..strings are immutable
import java.util.*;
public class HW_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String [] friends = new String[10];
        int i;
        for(i=0; i<10; i++){
            System.out.print("Enter"+(i+1)+"Frinds Name :");
            friends [i] = sc.nextLine();
        }


        System.out.println("============== Friends List ================");
        for (i = 0; i < 10; i++) {
            if(friends [i].compareTo(friends[i+1])<0){
                System.out.println("Your"+(i+1)+"Frinds Name :" +friends[i]);
            }
        }
    }
    
}
