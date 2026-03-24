
public class Square 
{
    public void square(int n)
    {
        System.out.print(n*n);
    }
    public static void main(String[] args) 
    {
        int n=345;
        Square s=new Square();
        s.square(n);
    }    
}
