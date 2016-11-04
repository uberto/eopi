package com.gamasoft.eopi;

import junit.framework.Assert;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by uberto on 04/11/16.
 */
public class DutchFlagTest {

    @Test
    public void dutchFlag() throws Exception {

        Assert.assertEquals("[1, 2, 3, 5, 3]", Arrays.asList(DutchFlag.sort(new Integer[]{1,3,2,5,3}, 2)).toString());
        Assert.assertEquals("[1, 2, 3, 4, 5]", Arrays.asList(DutchFlag.sort(new Integer[]{5,1,4,2,3}, 4)).toString());
        Assert.assertEquals("[1, 1, 5, 5, 6, 6]", Arrays.asList(DutchFlag.sort(new Integer[]{6,1,5,5,6,1}, 3)).toString());

    }
}