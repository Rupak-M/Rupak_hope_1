public class Hello
{
    public static void main(String[] args)
    {
        byte a=-128,b=127;
        System.out.println("the range of byte is from "+a+" to "+b);
        short s1=-32768;
        short s2=32767;
        System.out.println("the range of short is from "+s1+" to "+s2);
        int i1=-2147483648,i2=2147483647;
        System.out.println("the range of int is from "+i1+" to "+i2);
        boolean b1=true,b2=false;
        System.out.println("the value of boolean is either "+b1+" or "+b2);
        long l1=250L;
        System.out.println("long : ;"+l1);
        float f1=3.14f;
        System.out.println("float : "+f1);
        double d1=56466.83645629;
        System.out.println("double : "+d1);
        Character c1='a';
        System.out.println("char : "+c1);
    }
}
/* figure the range of short and int
short= -32,768 to 32,767
int = -2,147,483,648 to 2,147,483,647
task 2 what is the purpose of comma(,) in print statement: it is used in the printf statement
System.out.printf("%,d%n", 1234567); // Output: 1,234,567


 */