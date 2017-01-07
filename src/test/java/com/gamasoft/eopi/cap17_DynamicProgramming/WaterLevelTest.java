package com.gamasoft.eopi.cap17_DynamicProgramming;

import junit.framework.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Created by uberto on 07/01/17.
 */
public class WaterLevelTest {

    @Test
    public void zeroWater() throws Exception {

        List<Integer> m = Arrays.asList(1, 2, 1);

        Assert.assertEquals(0, WaterLevel.calculate(m));

    }

    @Test
    public void tinyLake() throws Exception {

        List<Integer> m = Arrays.asList(1,0,1);

        Assert.assertEquals(1, WaterLevel.calculate(m));

    }

    @Test
    public void tinyHighLake() throws Exception {

        List<Integer> m = Arrays.asList(2,1,2);

        Assert.assertEquals(1, WaterLevel.calculate(m));

    }


    @Test
    public void deepLake() throws Exception {

        List<Integer> m = Arrays.asList(10,0,10);

        Assert.assertEquals(10, WaterLevel.calculate(m));

    }

    @Test
    public void shallowLake() throws Exception {

        List<Integer> m = Arrays.asList(2,1,1,1,2);

        Assert.assertEquals(3, WaterLevel.calculate(m));

    }

    @Test
    public void smallLake() throws Exception {

        List<Integer> m = Arrays.asList(3, 2, 1, 3);

        Assert.assertEquals(3, WaterLevel.calculate(m));

    }

    /*

         #
         #....#
      #..#....#
     ##..#.#.###.#
    ###############   tot 15

     */

    @Test
    public void threeLakes() throws Exception {

        List<Integer> m = Arrays.asList(1,2,3,1,1,5,1,2,1,2,4,2,1,2,1);

        Assert.assertEquals(15, WaterLevel.calculate(m));

    }

}
