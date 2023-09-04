package pl.camp.it.java9;

public interface MetodyPrywatneWInterfejsie {

    void add(int a, int b);

    default void diff(int a, int b) {
        obliczenia(a);
        obliczenia(b);
    }

    private void obliczenia(int a) {
        //jakies oblicznia -  50 linijek
        System.out.println(a);
    }
}
