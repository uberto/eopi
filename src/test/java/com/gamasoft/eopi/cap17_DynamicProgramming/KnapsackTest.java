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

        Set<Watch> shop = Knapsack.shop(new Watch(1,1), new Watch(3,2), new Watch(1,3));

        Assert.assertEquals(3, Knapsack.select(shop, 1));
        Assert.assertEquals(4, Knapsack.select(shop, 2));
        Assert.assertEquals(4, Knapsack.select(shop, 3));
        Assert.assertEquals(5, Knapsack.select(shop, 4));
        Assert.assertEquals(6, Knapsack.select(shop, 5));

    }


    @Test
    public void bigShop() throws Exception {

        Set<Watch> shop = Knapsack.shop(
                new Watch(20, 65),
                new Watch(8, 35),
                new Watch(60, 245),
                new Watch(55, 195),
                new Watch(40, 65),
                new Watch(70, 150),
                new Watch(85, 275),
                new Watch(25, 155),
                new Watch(30, 120),
                new Watch(65, 320),
                new Watch(75, 75),
                new Watch(10, 40),
                new Watch(95, 200),
                new Watch(50, 100),
                new Watch(40, 220),
                new Watch(20, 99));

        Assert.assertEquals(0, Knapsack.select(shop, 5));
        Assert.assertEquals(40, Knapsack.select(shop, 10));

        long start = System.currentTimeMillis();
        Assert.assertEquals(695, Knapsack.select(shop, 130));

        System.out.println("klapsack " + (System.currentTimeMillis() - start));
    }
}
