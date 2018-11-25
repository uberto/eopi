package com.gamasoft.eopi.cap17_DynamicProgramming;

import com.gamasoft.eopi.cap17_DynamicProgramming.Knapsack.Watch;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by uberto on 27/11/16.
 */
//17.6
public class KnapsackTest {

    @Test
    public void smallShop() throws Exception {

        Set<Watch> shop = Knapsack.shop(newWatch(1,1), newWatch(3,2), newWatch(1,3));

        Assert.assertEquals(3, Knapsack.select(shop, 1));
        Assert.assertEquals(4, Knapsack.select(shop, 2));
        Assert.assertEquals(4, Knapsack.select(shop, 3));
        Assert.assertEquals(5, Knapsack.select(shop, 4));
        Assert.assertEquals(6, Knapsack.select(shop, 5));

    }


    @Test
    public void bigShop() throws Exception {

        Set<Watch> shop = Knapsack.shop(
                newWatch(20, 65),
                newWatch(8, 35),
                newWatch(60, 245),
                newWatch(55, 195),
                newWatch(40, 65),
                newWatch(70, 150),
                newWatch(85, 275),
                newWatch(25, 155),
                newWatch(30, 120),
                newWatch(65, 320),
                newWatch(75, 75),
                newWatch(10, 40),
                newWatch(95, 200),
                newWatch(50, 100),
                newWatch(40, 220),
                newWatch(20, 99),
                newWatch(62, 247),
                newWatch(57, 197),
                newWatch(42, 67),
                newWatch(77, 152),
                newWatch(87, 277),
                newWatch(27, 157),
                newWatch(32, 122),
                newWatch(67, 322),
                newWatch(77, 77),
                newWatch(12, 42),
                newWatch(97, 202),
                newWatch(52, 102),
                newWatch(42, 222));

        Assert.assertEquals(0, Knapsack.select(shop, 5));
        Assert.assertEquals(40, Knapsack.select(shop, 10));

        Assert.assertEquals(706, Knapsack.select(shop, 130));

        Assert.assertEquals(1438, Knapsack.select(shop, 279));

        long start = System.currentTimeMillis();
        Assert.assertEquals(1699, Knapsack.select(shop, 342));

        System.out.println("klapsack " + (System.currentTimeMillis() - start)); //67725

    }

    private Watch newWatch(int weight, int price) {
        return new Watch(weight, price);
    }
}
