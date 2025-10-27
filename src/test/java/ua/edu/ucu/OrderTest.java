package ua.edu.ucu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import ua.edu.ucu.delivery.PostStrategy;
import ua.edu.ucu.flower.Flower;
import ua.edu.ucu.flower.FlowerBucket;
import ua.edu.ucu.flower.FlowerColor;
import ua.edu.ucu.flower.FlowerType;
import ua.edu.ucu.flower.Order;
import ua.edu.ucu.payment.PayPalStrategy;
import org.junit.jupiter.api.Test;

public class OrderTest {
    @Test
    public void test() {
        Order order = new Order(new PostStrategy());
        order.setPayment(new PayPalStrategy());

        Flower flower1 = new Flower();
        flower1.setPrice(50);
        flower1.setColor(FlowerColor.RED);
        flower1.setType(FlowerType.TULIP);
        
        FlowerBucket flowerPack1 = new FlowerBucket();
        FlowerBucket flowerBucket1 = new FlowerBucket();
        flowerBucket1.setItem(flower1);
        
        order.addItem(flowerPack1);
        order.addItem(flowerBucket1);
        order.addItem(item1);
        
        assertEquals(order.getTotalPrice(), 155);
    }
}
