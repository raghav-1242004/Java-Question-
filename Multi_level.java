// class Animal {
//     void eat(){
//         System.out.println("Eating .....");
//     }
// }

// class Dog extends Animal{
//     void bark(){
//         System.out.println("Barking...");
//     }
// }

// class cat extends Dog(){

// }
//     void Miaow(){
//         System.out.println("Miaow ...");
//     }


// public class Multil_level {
//     public static void main(String args[]){
//         cat a = new cat();
//         a.Miaow();
//         b.bark();
//         a.eat();


//     }
    
// }
class Animal {
    void eat() {
        System.out.println("Eating .....");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Barking...");
    }
}

class Cat extends Dog {   // Multi-level inheritance
    void miaow() {
        System.out.println("Miaow ...");
    }
}

public class Multi_level {
    public static void main(String args[]) {
        Cat a = new Cat();

        a.miaow();  // from Cat
        a.bark();   // from Dog
        a.eat();    // from Animal
    }
}