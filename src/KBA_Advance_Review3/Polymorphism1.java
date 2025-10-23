package KBA_Advance_Review3;



class Animal {
    public void makeSound() { // (1) base class method
        System.out.println("Some animal sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() { // (2) overriding method
        System.out.println("Woof!");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() { // (3) overriding method
        System.out.println("Meow!");
    }
}

public class Polymorphism1 {
    public static void main(String[] args) {
        Animal a1 = new Dog(); // (4) base class reference
        Animal a2 = new Cat(); // (5) base class reference

        a1.makeSound(); // (6) calls Dog's makeSound()
        a2.makeSound(); // (7) calls Cat's makeSound()
    }
}



