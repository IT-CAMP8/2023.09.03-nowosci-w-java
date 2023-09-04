package pl.camp.it.java10;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class KopiowanieKolekcji {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5,6);
        System.out.println(list);

        List<Integer> copyList = List.copyOf(list);
        //copyList.add(10);

        Set<Integer> set = Set.of(1,2,3,4,5);
        Set<Integer> copySet = Set.copyOf(set);
    }
}
