// Parent class
class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}

// Child class
class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows");
    }
}

public class sir_11{
    public static void main(String[] args) {

        // Reference type = parent, object type = child
        Animal obj = new Cat();

        obj.sound(); // runtime decides method
    }
}