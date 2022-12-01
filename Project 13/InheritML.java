// Write a Program in Java to Show Multilevel Inheritance.

class Animal {
    void eat() {
        System.out.println("Eating...");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Barking...");
    }
}

class BabyDog extends Dog {
    void weep() {
        System.out.println("Weeping...");
    }
}


public class InheritML {
    public static void main(String[] args){

        BabyDog d = new BabyDog();
        d.weep();
        d.bark();
        d.eat();
    }
}
