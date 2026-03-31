

class Encapsulation {
    int a;

    public Encapsulation() {
        a=10;
    }
    void display(){
        System.out.println("Implementation of Encapsulation: "+a);
    }
}
public class EncapsulationImp {
    public static void main(String[] args) {
        Encapsulation obj = new Encapsulation();
        obj.display();
    }
}
