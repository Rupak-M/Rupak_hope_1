abstract class Salary{
    abstract void salary();
    void display(){
        System.out.println("Salary is provided!!");
    }
}
class FullTime extends Salary{
    void salary(){
        System.out.println("Full time Employee:20000");
    }
}
class PartTime extends Salary{
    void salary(){
        System.out.println("Part time Employee:8000");
    }
}
public class EmployeeExample {
    public static void main(String[] args) {
        Salary ft=new FullTime();
        Salary pt=new PartTime();
        ft.salary();
        ft.display();
        pt.salary();
        pt.display();

    }
}
