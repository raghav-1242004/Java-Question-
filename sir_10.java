// Parent class
class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

// Child class
class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks"); // overriding method
    }
}

public class sir_10 {
    public static void main(String[] args) {

        Dog d = new Dog();
        d.sound(); // child method will run
    }
}