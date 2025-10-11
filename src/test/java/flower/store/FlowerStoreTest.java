package flower.store;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Assertions;

public class FlowerStoreTest {

    @Test
    public void testStore() {
        FlowerBucket flowerBucket1 = new FlowerBucket();
        FlowerBucket flowerBucket2 = new FlowerBucket();
        Flower flower1 = new Rose();
        Flower flower2 = new Chamomile();
        flower1.setPrice(1);
        FlowerPack flowerPack1 = new FlowerPack(flower1, 2);
        flowerBucket1.add(flowerPack1);
        FlowerPack flowerPack2 = new FlowerPack(flower2, 10);
        flowerBucket2.add(flowerPack2);

        Store store = new Store(Arrays.asList(flowerBucket1, flowerBucket2, flowerBucket1));
        Assertions.assertEquals(store.search(flowerBucket1), Arrays.asList(flowerBucket1, flowerBucket1));
    }
}
