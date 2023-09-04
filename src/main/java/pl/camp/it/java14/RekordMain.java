package pl.camp.it.java14;

public class RekordMain {
    public static void main(String[] args) {
        Rekord rekord = new Rekord("BMW", "3", 500);
        System.out.println(rekord.brand());
        System.out.println(rekord.model());
        System.out.println(rekord.price());

        rekord.cos();
    }
}
