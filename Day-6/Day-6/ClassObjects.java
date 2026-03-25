
public class ClassObjects {
    public static void main(String[] args) {
        System.out.println("I am inside Class Objects");
        Apartment apt=new Apartment();
        apt.display();
    }
}
 class Apartment{
    public void display(){
        System.out.println("I am inside Apartment class");
    }
}

