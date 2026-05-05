class Animal{
    String name;

    public void eat(){
        System.out.println(name + "is eating.");
    }
}
class Dog extends Animal{
    public void bark(){
        System.out.println(name+"eats dog Food.");
    }
}

public class sing_level{
    public static void main(String arg[]){
        Dog myDog = new Dog();
        myDog.name = "Buddy";

        myDog.eat();

        myDog.bark();

    }
}