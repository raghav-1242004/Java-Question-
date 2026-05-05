import java.util.Scanner;
public class Class_Question_5 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your First Number:-");
        int a = sc.nextInt();
        char ch = sc.next().charAt(0);
        // System.out.print("Enter Your Second Number");
        int b = sc.nextInt();
        int c =0;

        switch(ch){
            case '+': c = a+b; break;
            case '-': c = a-b; break;
            case '*': c = a*b; break;
            case '/':
                if(b!=0){
                    c =(a/b);
                }
                else{
                    System.out.print("Your Denominator if In valid");
                }
            default: System.out.print("Enter correct Symbol");
        }
        System.out.printf("%d %c %d = %d",a,ch,b,c);

    }  
}
