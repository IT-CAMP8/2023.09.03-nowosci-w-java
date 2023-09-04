package pl.camp.it.java9;

import java.util.List;

public class StremWhile {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5,6,7,8,2,3,4,5,6);
        System.out.println(list);

        System.out.println("take");
        list.stream().takeWhile(x -> x < 4).forEach(System.out::println);
        System.out.println("drop");
        list.stream().dropWhile(x -> x < 4).forEach(System.out::println);
    }
}
