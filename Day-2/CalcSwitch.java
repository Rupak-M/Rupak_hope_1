import java.util.Scanner;

public class CalcSwitch {
     public static void main(String[] args) {
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of a:");
        a=sc.nextInt();
        System.out.print("Enter the value of b:");
        b=sc.nextInt();
        System.out.print("Enter the Operator:");
        String op=sc.next();
        switch(op){
            case "+":
                System.out.println("Sum of a+b="+(a+b));
                break;
            case "-":
                System.out.println("Subtraction of a-b="+(a-b));
                break;
            case "*":
                System.out.println("Multiplication of a*b="+(a*b));
                break;
            case "/":
                System.out.println("Division of a/b="+(a/b));
                break;
            case "%":
                System.out.println("Modulus of a%b="+(a%b));
                break;
            default:
                System.out.println("Invalid Operator!!");
}sc.close();
}
}