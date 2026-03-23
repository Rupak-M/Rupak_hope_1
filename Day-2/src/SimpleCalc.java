import java.util.Scanner;
public class SimpleCalc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number 1:");
        int a=sc.nextInt();
        System.out.println("Enter the number 2:");
        int b=sc.nextInt();
        char a1=sc.next().charAt(0);
        while(true)
        {
            switch (a1)
            {
                case '+':
                    System.out.println(a + b);
                    break;
                case '-':
                    System.out.println(a - b);
                    break;
                case '*':
                    System.out.println(a * b);
                    break;
                case '/':
                    System.out.println(a / b);
                    break;
                case '%':
                    System.out.println(a % b);
                    break;
                case 'a':
                    return;
                default:
                    System.out.println("invalid input");
            }
        }
    }
}
