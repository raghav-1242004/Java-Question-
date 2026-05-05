import java.util.*;
class Student{
    String name;
    int age;
    void display(){
        System.out.println(name+ " " +age);
    }
}
public class Question_3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Student s1 = new Student();
        System.out.println("Enter your Name:-");
        s1.name = sc.next();
        System.out.println("Enter your age:-");
        s1.age = sc.nextInt();

        s1.display();

        

    }
    
}
