abstract class Animal{
    abstract void sound();
    void eat(){
        System.out.println("eating");
    }
}
class Dog extends Animal{
    void sound(){
        System.out.println("Barks");
    }
}
class Cat extends Animal{
    void sound(){
        System.out.println("Meows");
    }
}
public class Abstraction{
    public static void main(String[] args) {
        Animal c=new Cat();
        Animal d=new Dog();
        d.eat();
        d.sound();
        c.eat();
        c.sound();

        
    }
}