import java.util.Scanner;
public class Class_Question_2{
    public static void main(String[] args){

        Scanner scn = new Scanner (System.in);
        int a = scn.nextInt();

        int [] array = new int[a];
        int sum = 0;

        for(int i=0; i<a;i++){
            System.out.print("Enter your element:-");
            array[i] = scn.nextInt();
            sum +=array[i];
        }

        System.out.print("Your sum:"+sum);
    }
}