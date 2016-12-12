package com.gamasoft.eopi.cap18_Greedy;

import junit.framework.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Created by uberto on 12/12/16.
 */

//18.6
public class GasupTest {

    @Test
    public void miniCircle() throws Exception {

        List<Double> gas =       Arrays.asList(15.0, 5.0,  5.0);
        List<Double> distances = Arrays.asList(10.0, 5.0, 10.0);

        Assert.assertEquals(0, Gasup.findStart(distances, gas));

    }


    @Test
    public void trickyCircle() throws Exception {

        List<Double> gas =       Arrays.asList(13.0,  4.0, 9.0, 7.0, 6.0, 16.0);
        List<Double> distances = Arrays.asList( 8.0, 10.0, 8.0, 9.0, 5.0, 15.0);

        Assert.assertEquals(4, Gasup.findStart(distances, gas));

    }

    @Test
    public void bigCircle() throws Exception {

        List<Double> gas =       Arrays.asList(50.0, 20.0,  5.0, 30.0, 25.0, 10.0, 10.0);
        List<Double> distances = Arrays.asList(45.0, 30.0, 10.0, 20.0, 30.0, 10.0, 5.0);

        Assert.assertEquals(3, Gasup.findStart(distances, gas));

    }

}
