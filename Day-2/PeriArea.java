import java.util.*;
public class PeriArea {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Perimeter of the rectangle is:"+(2*(a+b)));
        System.out.println("Area of the rectangle:"+(a*b));
        sc.close();
    }
}
