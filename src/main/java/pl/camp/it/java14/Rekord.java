package pl.camp.it.java14;

public record Rekord(String brand, String model, int price) {
    public void cos() {
        System.out.println(this.price);
        System.out.println(this.model);
    }
}
