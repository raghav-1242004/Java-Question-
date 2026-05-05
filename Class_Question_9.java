import java.util.*;
class A{
    int add(int a, int b){
        return a+b;
    }

}
interface I1{
    int sum(int a, int b);
}
interface I2{
    int mul(int a, int b);

}

class B extends A implements I1, I2{
     public int sum(int a, int b){
        return a+b;
    }
    public int mul(int a, int b){
        return a*b;
    }
}
public class Class_Question_9 extends B{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Number :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        Class_Question_9 c = new Class_Question_9();
        System.out.println("ADD :"+c.add(a,b));
        System.out.println("SUM :" +c.sum(a,b));
        System.out.println("MUL :" +c.mul(a,b));
      
        
    }
    
}
