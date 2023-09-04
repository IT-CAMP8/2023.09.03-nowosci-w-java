package pl.camp.it.java14;

public class ImmutableClass {
    private final String brand;
    private final String model;
    private final int price;

    public ImmutableClass(String brand, String model, int price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getPrice() {
        return price;
    }
}
