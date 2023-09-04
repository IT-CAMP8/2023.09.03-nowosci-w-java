package pl.camp.it.java10;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class NiemutowalnyCollector {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,43,5);

        List<String> newList = list.stream().map(i -> i+"_STRING")
                .collect(Collectors.toUnmodifiableList());
        System.out.println(newList);
        newList.add("cos");
        System.out.println(newList);
    }
}
