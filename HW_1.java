// Write a program in java in which all the predefined functions must be in user defined functions with same features
import java.util.*;
public class HW_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name:");
        String name = sc.next();
        // length()
        int a = name.length();
        System.out.println("Langth = "+a);
        // charAt(index)
        System.out.println("CharAt = "+name.charAt(2));
        //substring(start, end)
        System.out.println("substrin = "+name.substring(2, 4));
        // toUpperCase()
        System.out.println("toUpperCase = "+name.toUpperCase());
        // toLowerCase()
        System.out.println("toLowerCase = "+name.toLowerCase());
        // equals()
        System.out.println("Enter Second String");
        String b = sc.next();
        System.out.println("equals = "+b.equals(name));
        // equalsignoreCase()
        System.out.println("equals case igonre = "+b.equalsIgnoreCase(name));
        // compareTo()
        System.out.println("CompareTo = " +b.compareTo(name));
        // indexOf(char)
        System.out.println("indexOf = "+name.indexOf('a'));
        // replace(old,go new)
        System.out.println("Replace = "+name.replace('r','a'));
        // trim()
        System.out.println("trim() = "+name.trim());
        // contains(CharSequences)
        System.out.println("Contains = "+name.contains("ra"));
        // startsWith(String prefix)
        System.out.println("startsWith = "+name.startsWith("a"));
        // endsWith(String suffix)
        System.out.println("endsWith = "+name.endsWith("av"));
        // isEmpty()
        System.out.println("isEmpty = "+name.isEmpty());
        // isBlank()(java 11+)
        System.out.println("isBlank"+name.isBlank());
        // split(String regex)
        System.out.println("split = "+name.split(","));
        // concat()
        System.out.println("concat = "+name.concat(b));
        // toCharArray()
        // string arr;
        char arr[] = name.toCharArray();
        System.out.println("toCharArray = "+arr); 

    }
}
