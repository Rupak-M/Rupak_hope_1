class Blueprint{
    int bed,rest,hall,kit,din,play;
    void bedroom(int a){
        bed=a;
    }
    void restroom(int a){
        rest=a;
    }
    void hallroom(int a){
        hall=a;
    }
    Blueprint(int n){
        play=1;din=1;kit=1;
        if(n==1){
            bedroom(1);
            restroom(1);
            hallroom(1);
        }
        if(n==2){
            bedroom(2);
            restroom(2);
            hallroom(1);
        }
        if(n==3){
            bedroom(4);
            restroom(4);
            hallroom(2);
        }        
    }
    void display(){
        System.out.println("bed rooms: "+bed);
        if(rest==1){
            System.out.println("rest rooms: "+rest+" public");
        }
        else{
            System.out.println("rest rooms: "+rest+" attached");
        }
        if(hall==1){
            System.out.println("common hall: "+hall);
        }
        else{
            System.out.println("hall: "+hall+" each and every 2 bed room has a hall");
        }
        System.out.println("commmon kitchen    : "+kit);
        System.out.println("common dinning hall: "+din);
        System.out.println("public play ground : "+play);

    }
}

public class Apart {
    public static void main(String[] args) {
        Blueprint b1=new Blueprint(1);
        Blueprint b2=new Blueprint(2);
        Blueprint b3=new Blueprint(3);
        System.out.println("--1st Apartment--");
        b1.display();
        System.out.println("--2nd Apartment--");
        b2.display();
        System.out.println("--3rd Apartment--");
        b3.display();       
    }
}