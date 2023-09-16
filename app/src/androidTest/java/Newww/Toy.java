package Newww;

public class Toy {
    String name;
    String color;
    double price;
    Quality quality;

    public Toy(String name, String color, double price, Quality quality) {
        this.name = name;
        this.color = color;
        this.price = price;
        this.quality = quality;
    }

    @Override
    public String toString() {
        return "Toy{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", quality=" + quality +
                '}';
    }


    public double discount(double discountRate) {
        return price * (1 - discountRate);
    }
}
