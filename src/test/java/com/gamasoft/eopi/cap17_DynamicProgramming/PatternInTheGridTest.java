package com.gamasoft.eopi.cap17_DynamicProgramming;

import junit.framework.Assert;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by uberto on 26/11/16.
 */

//17.5
public class PatternInTheGridTest {

    @Test
    public void miniGrid() throws Exception {

        Integer[][] grid = new Integer[][]{{1,2},{3,4}};


        Assert.assertTrue(PatternInTheGrid.exists(grid, Arrays.asList(2,4,3)));
        Assert.assertFalse(PatternInTheGrid.exists(grid, Arrays.asList(1,4,3)));
        Assert.assertTrue(PatternInTheGrid.exists(grid, Arrays.asList(1,2,4,3)));
        Assert.assertTrue(PatternInTheGrid.exists(grid, Arrays.asList(4,2,4)));

    }


    @Test
    public void mediumGrid() throws Exception {

        Integer[][] grid = new Integer[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};


        Assert.assertTrue(PatternInTheGrid.exists(grid, Arrays.asList(10,6,7,3)));
        Assert.assertTrue(PatternInTheGrid.exists(grid, Arrays.asList(15,11,10,6,5,9)));
        Assert.assertTrue(PatternInTheGrid.exists(grid, Arrays.asList(11,7,11)));
        Assert.assertFalse(PatternInTheGrid.exists(grid, Arrays.asList(12,11,1)));

    }

    @Test
    public void repeatedGrid() throws Exception {

        Integer[][] grid = new Integer[][]{{11,12,13,14},{5,6,7,8},{9,10,11,12},{13,14,15,16}};


        Assert.assertTrue(PatternInTheGrid.exists(grid, Arrays.asList(14,8)));
        Assert.assertTrue(PatternInTheGrid.exists(grid, Arrays.asList(12,16,15,14,10,6,12,13)));
        Assert.assertTrue(PatternInTheGrid.exists(grid, Arrays.asList(14,13,14)));
        Assert.assertFalse(PatternInTheGrid.exists(grid, Arrays.asList(12,5)));

    }
}
