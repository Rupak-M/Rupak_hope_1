class Name{
    private String name;
     void setName(String name){
        this.name = name;
    }
     String getName(){
        return this.name;
    }
}
public class GetterSetter {
    public static void main(String[] args) {
        Name name = new Name();
        name.setName("Sam");
        System.out.println(name.getName());
    }
}
