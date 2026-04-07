import java.util.*;
public class LinkedHashSetImp {
    public static void main(String[] args) {
        Set<Integer> set=new LinkedHashSet<>();
        Integer a=1;
        set.add(a);
        System.out.println(set);
        set.add(2);
        System.out.println(set);
        System.out.println(a.hashCode());
        System.out.println(set.contains(1));
        System.out.println(set.size());
        
        Set<String> set1=new LinkedHashSet<>();
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
