package flower.store;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Random;

import org.junit.jupiter.api.Assertions;

public class FlowerStoreTest {
    private static final Random RANDOM_GENERATOR = new Random();
    private static final int MAX_QUANTITY = 1000;

    @Test
    public void testStore() {
        FlowerBucket firstFlowerBucket = new FlowerBucket();
        FlowerBucket secondFlowerBucket = new FlowerBucket();
        Flower firstFlower = new Rose();
        Flower secondFlower = new Chamomile();
        FlowerPack firstFlowerPack = new FlowerPack(
            firstFlower, RANDOM_GENERATOR.nextInt(MAX_QUANTITY));
        firstFlowerBucket.add(firstFlowerPack);
        FlowerPack secondFlowerPack = new FlowerPack(
            secondFlower, RANDOM_GENERATOR.nextInt(MAX_QUANTITY));
        secondFlowerBucket.add(secondFlowerPack);

        Store store = new Store(Arrays.asList(
            firstFlowerBucket, secondFlowerBucket, firstFlowerBucket));
        Assertions.assertEquals(store.search(firstFlowerBucket), 
        Arrays.asList(firstFlowerBucket, firstFlowerBucket));
    }
}
