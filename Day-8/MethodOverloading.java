class Addition{
    int add(int a, int b){
        return a+b;
    }
    int add(int a, int b, int c){
        return a+b+c;
    }
    int add(int a, int b, int c, int d){
        return a+b+c+d;
    }
    double add(double a, double b){
        return a+b;
    }

}
public class MethodOverloading {    
    public static void main(String[] args) {
        Addition addition = new Addition();
        System.out.println("Addition of 2 numbers: " + addition.add(5, 10));
        System.out.println("Addition of 3 numbers: " + addition.add(5, 10, 15));
        System.out.println("Addition of 4 numbers: " + addition.add(5, 10, 15, 20));
        System.out.println("Addition of 2 double numbers: " + addition.add(5.5, 10.5));
    }
}

