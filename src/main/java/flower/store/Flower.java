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

    public Flower() {
        
    }
    
    public Flower(Flower flower) {
        sepalLength = flower.sepalLength;
        color = flower.color;
        price = flower.price;
        flowerType = flower.flowerType;
    }
    
    public String getColor() {
        return color.toString();
    }

    public boolean matches(Flower other) {
        if (color != other.color) {
            return false;
        }
        if (flowerType != other.flowerType) {
            return false;
        }
        if (sepalLength != other.sepalLength) {
            return false;
        }
        return true;
    }
}
