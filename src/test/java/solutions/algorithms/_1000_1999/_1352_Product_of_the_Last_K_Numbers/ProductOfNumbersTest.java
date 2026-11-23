package solutions.algorithms._1000_1999._1352_Product_of_the_Last_K_Numbers;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class ProductOfNumbersTest {

    @Test
    void test1() {
        ProductOfNumbers productOfNumbers = new ProductOfNumbers();
        productOfNumbers.add(3);        // [3]
        productOfNumbers.add(0);        // [3,0]
        productOfNumbers.add(2);        // [3,0,2]
        productOfNumbers.add(5);        // [3,0,2,5]
        productOfNumbers.add(4);        // [3,0,2,5,4]
        int a1 = productOfNumbers.getProduct(2);// return 20
        int a2 = productOfNumbers.getProduct(3); // return 40
        int a3 = productOfNumbers.getProduct(4); // return 0
        productOfNumbers.add(8);        // [3,0,2,5,4,8]
        int a4 = productOfNumbers.getProduct(2); // return 32

        Assertions.assertThat(a1).isEqualTo(20);
        Assertions.assertThat(a2).isEqualTo(40);
        Assertions.assertThat(a3).isEqualTo(0);
        Assertions.assertThat(a4).isEqualTo(32);
    }

    @Test
    void test2() {
        ProductOfNumbers productOfNumbers = new ProductOfNumbers();
        productOfNumbers.add(3);        // [3]
        productOfNumbers.add(0);        // [3,0]
        productOfNumbers.add(0);        // [3,0,0]
        productOfNumbers.add(8);        // [3,0,0,8]
        productOfNumbers.add(3);        // [3,0,0,8,3]
        int a1 = productOfNumbers.getProduct(1);// return 3
        productOfNumbers.add(7);        // [3,0,0,8,3,7]
        int a2 = productOfNumbers.getProduct(5); // return 0.
        productOfNumbers.add(3);        // [3,0,0,8,3,7,3]

        Assertions.assertThat(a1).isEqualTo(3);
        Assertions.assertThat(a2).isEqualTo(0);
    }
}