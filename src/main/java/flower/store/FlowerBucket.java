package flower.store;
import java.util.ArrayList;
import java.util.List;

public class FlowerBucket {
    private List<FlowerPack> flowerPacks;

    public void add(FlowerPack flowerPack) {
        if(flowerPacks == null) {
            flowerPacks = new ArrayList<>();
        }
        flowerPacks.add(flowerPack);
    }

    public double getPrice() {
        double price = 0;

        for (FlowerPack flowerPack : flowerPacks) {
            price += flowerPack.getPrice();
        }
        return price;
    }
}
