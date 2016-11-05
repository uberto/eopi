package com.gamasoft.eopi.cap6_Arrays;

import junit.framework.Assert;
import org.junit.Test;

import java.util.List;

/**
 * Created by uberto on 05/11/16.
 */
public class SpiralOrderingTest {


    //6.17
    @Test
    public void squareSpiralOrdering() throws Exception {

        Integer[][] m = new Integer[][]{{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
        };

        List<Integer> l = SpiralOrdering.order(m);

        Assert.assertEquals("[1, 2, 3, 6, 9, 8, 7, 4, 5]", l.toString());

    }


    @Test
    public void rectSpiralOrdering() throws Exception {

        Integer[][] m = new Integer[][]{
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
        };

        List<Integer> l = SpiralOrdering.order(m);

        Assert.assertEquals("[1, 2, 3, 4, 5, 10, 15, 14, 13, 12, 11, 6, 7, 8, 9]", l.toString());

    }



    @Test
    public void vertRectSpiralOrdering() throws Exception {

        Integer[][] m = new Integer[][]{
                {1, 2, 3},
                {5, 6, 7},
                {8, 9, 10},
                {11, 12, 13},
        };

        List<Integer> l = SpiralOrdering.order(m);

        Assert.assertEquals("[1, 2, 3, 7, 10, 13, 12, 11, 8, 5, 6, 9]", l.toString());

    }


    @Test
    public void evenSquareSpiralOrdering() throws Exception {

        Integer[][] m = new Integer[][]{
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16},
        };

        List<Integer> l = SpiralOrdering.order(m);

        Assert.assertEquals("[1, 2, 3, 4, 8, 12, 16, 15, 14, 13, 9, 5, 6, 7, 11, 10]", l.toString());

    }
}
