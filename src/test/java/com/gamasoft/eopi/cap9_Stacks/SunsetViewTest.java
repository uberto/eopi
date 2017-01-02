package com.gamasoft.eopi.cap9_Stacks;

import junit.framework.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by uberto on 02/01/17.
 */
//9.6
public class SunsetViewTest {

    @Test
    public void oneBuilding() throws Exception {

        List<Integer> views = SunsetView.addBuildings(5);

        Assert.assertEquals(1, views.size());
        Assert.assertEquals(5, views.get(0).intValue());

    }


    @Test
    public void threeBuildings() throws Exception {

        List<Integer> views = SunsetView.addBuildings(5, 3, 4);

        Assert.assertEquals(2, views.size());
        Assert.assertEquals(5, views.get(0).intValue());
        Assert.assertEquals(4, views.get(1).intValue());

    }


    @Test
    public void fiveBuildings() throws Exception {

        List<Integer> views = SunsetView.addBuildings(5, 3, 4, 1, 2);

        Assert.assertEquals(3, views.size());
        Assert.assertEquals(5, views.get(0).intValue());
        Assert.assertEquals(4, views.get(1).intValue());
        Assert.assertEquals(2, views.get(2).intValue());

    }


    @Test
    public void sixBuildings() throws Exception {

        List<Integer> views = SunsetView.addBuildings(5, 3, 4, 1, 2, 10);

        Assert.assertEquals(1, views.size());
        Assert.assertEquals(10, views.get(0).intValue());

    }
}
