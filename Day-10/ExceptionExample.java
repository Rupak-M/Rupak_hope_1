import java.io.FileNotFoundException;
import java.io.FileReader;;
public class ExceptionExample {
    public ExceptionExample(){
    
    }
    public static void main(String[] args) {
        //Checked Exception
        try {
            FileReader f= new FileReader("abc.txt");
            System.out.print(f);
        } catch (FileNotFoundException e) {
            System.out.println("Exception: "+e.getMessage());
        }
        //Unchecked Exception
        try {
            int a=10/0;
            System.out.println(a);
        }catch(ArithmeticException e){
            System.out.println("Arithmetic Exception: "+e.getMessage());
        }
    }
}
