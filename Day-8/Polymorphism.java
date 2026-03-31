class Animal {
    void sound() {
        System.out.println("All animals have different sound");
    }
}
class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}
class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Animal animal;
        animal = new Dog();
        animal.sound();
        animal = new Cat();
        animal.sound();


    }
}
