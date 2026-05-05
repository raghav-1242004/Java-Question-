// First interface
interface A {
    void show();
}

// Second interface
interface B {
    void display();
}

// Class implementing both interfaces
class Demo implements A, B {

    public void show() {
        System.out.println("Interface A method");
    }

    public void display() {
        System.out.println("Interface B method");
    }
}

public class sir_12 {
    public static void main(String[] args) {

        Demo d = new Demo();
        d.show();
        d.display();
    }
}