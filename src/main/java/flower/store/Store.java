package flower.store;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<FlowerBucket> flowerBuckets;

    public List<FlowerBucket> search(FlowerBucket request) {
        List<FlowerBucket> matchingBuckets = new ArrayList<FlowerBucket>();
        
        for (FlowerBucket flowerBucket : flowerBuckets) {
            if (flowerBucket.matches(request)) {
                matchingBuckets.add(flowerBucket);
            }
        }

        return matchingBuckets;
    }
}
