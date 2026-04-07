import java.util.*;
public class SetImp {
    public static void main(String[] args) {
        Set<Integer> set=new HashSet<>();
        Integer a=1;
        set.add(a);
        System.out.println(set);
        set.add(2);
        System.out.println(set);
        System.out.println(a.hashCode());
        System.out.println(set.contains(1));
        set.toArray();
        set.size();
        
        Set<String> set1=new HashSet<>();
        set1.add("KSP");
        set1.add("RAMPEX");
        System.out.println(set1);
        set1.add("Sam");
        set1.add("Anu");
        set1.add("Maxhee");
        System.out.println(set1);
        System.out.println(set1.contains("KSP"));
        for(String s:set1){
            System.out.println(s);
        }
        

        
    }
}
