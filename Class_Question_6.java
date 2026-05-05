import java.util.*;
public class Class_Question_6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your String");
        String name = sc.nextLine();
        
        System.out.println("Entery youn DOB");
        String dob = sc.nextLine();
        int len1 = name.length();
        int len2 = dob.length();

        if(len1<4 && len2 < 4){
            System.out.print("Enter minimum 4 length of Name and Date of Birth");
        }
        else{
            String start = name.substring(0,4).toUpperCase();   
            
            String date = dob.substring(0,4);
            System.out.println(start.concat(date));

        }
        


    
    }
    
}
