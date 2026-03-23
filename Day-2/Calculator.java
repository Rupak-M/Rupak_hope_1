import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of a:");
        a=sc.nextInt();
        System.out.print("Enter the value of b:");
        b=sc.nextInt();
        System.out.println("Sum of a+b="+(a+b));
        System.out.println("Subtraction of a-b="+(a-b));
        System.out.println("Multiplication of a*b="+(a*b));
        System.out.println("Division of a/b="+(a/b));
        System.out.println("Modulus of a%b="+(a%b));
        sc.close();
    }
}
