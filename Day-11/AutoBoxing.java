
public class AutoBoxing {
    public static void main(String[] args) {
        int a=10;
        Integer obj=a;
        System.out.println(obj);
        System.out.println(a==obj);
        int b=-128;
        Integer obj1=b;
        System.out.println(obj1);
        System.out.println(b==obj1);
        Integer c=-128;
        Integer d=-128;
        System.out.println(c+" "+d);
        System.out.println(c==d);
        Character e='a';
        Character f='a';
        System.out.println(e==f);
        Float g=127.5f;
        Float h=127.5f;
        System.out.println(g==h);

        




    }
}
