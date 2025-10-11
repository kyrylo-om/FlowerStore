package flower.store;

import lombok.Getter;
import lombok.Setter;



@Setter
public class Flower {
    @Getter
    private double sepalLength;
    private FlowerColor color;
    @Getter
    private double price;
    @Getter
    private FlowerType flowerType;

    public String getColor() {
        return color.toString();
    }

    public Flower(Flower flower) {
        sepalLength = flower.sepalLength;
        color = flower.color;
        price = flower.price;
        flowerType = flower.flowerType;
    }

    public Flower() {

    }

    public boolean matches(Flower other) {
        if(color == other.color && flowerType == other.flowerType && sepalLength == other.sepalLength) {
            return true;
        }
        return false;
    }
}
