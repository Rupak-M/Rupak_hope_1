import java.util.*;
public class LinkedHashMapImp {
    public static void main(String[] args) {
        Map<String,Integer> map=new LinkedHashMap<>();
        map.put("One",1);
        map.put("Two",2);
        map.put("Three",3);
        System.out.println(map);
        System.out.println(map.get("Hello"));
        System.out.println(map.getOrDefault("KSP", 0));
    }
}
