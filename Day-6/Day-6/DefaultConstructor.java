
public class DefaultConstructor {

      public DefaultConstructor() {
        System.out.println("I am inside default constructor");
    }
    
    public static void main(String[] args) {
        dConstruct dc=new dConstruct(10);
        System.out.println(dc);
        System.out.println("See your default constructor");
    }
}
class dConstruct{
    public dConstruct(int x) {

        System.out.println("I am inside Parameterised constructor and the value is "+ x);
    }
   
    
}