package pl.camp.it.java11;

public class MetodyKlasyString {
    public static void main(String[] args) {
        String s = " ";

        System.out.println(s.isBlank());

        String multilineText = "Linia 1\nLinia 2\nLinia 3\nLinia 4";
        System.out.println(multilineText);

        multilineText.lines().map(str -> "Linijka: " + str).forEach(System.out::println);

        String string = "cos";
        String repeat = string.repeat(10);
        System.out.println(repeat);

        String string2 = "   ABC   ";
        System.out.println(string2.stripLeading());
        System.out.println(string2.stripTrailing());
        System.out.println(string2.strip());
    }
}
