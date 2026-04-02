
public class Wrapper {
    public static void main(String[] args) {
        int a=10;
        System.out.println("Value of a: "+a);
        Integer objA=10;
        System.out.println("Value of objA: "+objA);
        System.out.println(a==objA);
        System.out.println(objA.hashCode());
        Character c='a';
        System.out.println(c);
        System.out.println(c.hashCode());
    }
}
