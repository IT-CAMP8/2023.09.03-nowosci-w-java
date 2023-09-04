package pl.camp.it.java9;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MetodyFabrykujaceDoKolekcji {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5,6,7);
        System.out.println(list);
        List<Integer> list2 = new ArrayList<>(list);
        list2.add(10);
        System.out.println(list2);

        Set<String> set = Set.of("a","b","c","d");
        System.out.println(set);

        Map<Integer, String> map = Map.of(1, "v1", 2, "v2");
        System.out.println(map);

        Map<Integer, String> map2 = Map.ofEntries(
                Map.entry(1,"a"),
                Map.entry(2,"b"),
                Map.entry(3,"c"),
                Map.entry(4,"d"),
                Map.entry(5,"e")
                );

        metoda(1,5,2,3,4,5);
    }

    public static void metoda(int... inty) {
        System.out.println(inty[0]);
    }

    /*public static void metoda2(int... inty, String... stringi) {

    }*/
}
