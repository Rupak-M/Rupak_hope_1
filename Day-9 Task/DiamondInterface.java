
interface Person {
    void role();
}

interface Doctor extends Person{
    void  treat();
}

interface Patient extends Person{
    void ill();
}

class Hospital implements Doctor,Patient{

    public void role() {
        System.out.println("Person can be both Doctor and Patient in the Hospital");
    }
    public void treat()
    {
        System.out.println("Doctor treats and cure the illness of the Patient");
    }
    public void ill(){
        System.out.println("Patient consults Doctor to cure illness");
    }
}
public class DiamondInterface {
    public static void main(String[] args) {
        Hospital c = new Hospital();
        c.role();
        c.treat();
        c.ill();

    }
}

