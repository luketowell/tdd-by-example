package guru.springframework;

import guru.springframework.models.Dollar;
import guru.springframework.models.Franc;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class MoneyTest {
    @Test
    void testMultiplication() {
        Dollar five = new Dollar(5);
        Dollar product = five.times(2);
        assertEquals(10, (int)product.getAmount());
        product = five.times(3);
        assertEquals(15, (int)product.getAmount());
    }

    @Test
    void equalityTest() {
        assertEquals(new Dollar(5), new Dollar(5));
        assertNotEquals(new Dollar(5), new Dollar(8));
        assertNotEquals(new Dollar(5), new Franc(5));
    }

    @Test
    void francMultiplication() {
        Franc five = new Franc(5);
        Franc product = five.times(2);
        assertEquals(10, (int)product.getAmount());
        product = five.times(3);
        assertEquals(15, (int)product.getAmount());
    }

    @Test
    void francequalityTest() {
        assertEquals(new Franc(5), new Franc(5));
        assertNotEquals(new Franc(5), new Franc(8));
    }


}
