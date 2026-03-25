class crOverloading{
    crOverloading(){
        System.out.println("Default Constructor");
    }
    crOverloading(int i){
        System.out.println("Parameterised Constructor and Constructor Overloading,"+i);
    }
    crOverloading(String i){
        System.out.println(i);
    }
}
public class CrOverLoading {
    public static void main(String[] args) {
        System.out.println("Constructor OverLoading Examples");
        crOverloading cr1=new crOverloading(5);
        crOverloading cr2=new crOverloading("Hope Batch 1");

    }    
}

