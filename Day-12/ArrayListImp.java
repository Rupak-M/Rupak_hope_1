import java.util.*;
public class ArrayListImp {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(20);
        list.add(10);
        list.add(null);
        System.out.println("ArrayList: "+list);
        System.out.println("Size: "+list.size());
        System.out.println("Element at index 1: "+list.get(1));
        list.set(0,100);
        System.out.println("Updated ArrayList: "+list);
        list.remove(0);
        System.out.println("After removing index 0: "+list);
        System.out.println(list.contains(20));
        System.out.println("Index of 100: "+list.indexOf(100)); 
        System.out.println("Index of 100: "+list.lastIndexOf(10));
        list.clear(); 
        System.out.println("After clearing: "+list);
        System.out.println("Is empty: "+list.isEmpty());

    }
}
