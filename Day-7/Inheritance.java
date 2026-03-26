class Animal{
    void display(){
        System.out.println("There are multiple Animals Choose 1 and mention it's sound:");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Dog barks");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Dog sound=new Dog();
        sound.bark();
        System.out.println(sound.hashCode());
    }
}
