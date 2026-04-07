import java.util.*;
public class LinkedListImp {
    public static void main(String[] args) {
        List<String> race=new LinkedList<>();
        race.add("A");
        race.add("B");
        race.add("C");
        race.addFirst("Start Race");
        System.out.println(race);
        race.remove("B");
        System.out.println("B is Disqualified due to early start");
        System.out.println(race);
        race.addLast("Race Completed");
        System.out.println(race);
        System.out.println("A won the race by defeating C ");
        race.clear();
        System.out.println(race);
        System.out.println(race.isEmpty());




    }
}
