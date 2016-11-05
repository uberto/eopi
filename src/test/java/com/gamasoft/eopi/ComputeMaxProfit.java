package com.gamasoft.eopi;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by uberto on 05/11/16.
 */
public class ComputeMaxProfit {

    @Test
    public void maxProfit() throws Exception {

        Integer[] ticks = new Integer[]{2,7,4,1,5,3,6,0 };

        Assert.assertEquals(5, MaxProfit.compute(ticks));

    }
}
