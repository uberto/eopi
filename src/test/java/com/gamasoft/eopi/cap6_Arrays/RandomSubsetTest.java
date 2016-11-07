package com.gamasoft.eopi.cap6_Arrays;

import junit.framework.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by uberto on 05/11/16.
 */
public class RandomSubsetTest {

    //6.11
    @Test
    public void randomSubset() throws Exception {

        String[] ss1 = new String[]{"a","b","c","d","e","f","g","h"};
        String[] ss2 = new String[]{"a","b","c","d","e","f","g","h"};
        String[] ss3 = new String[]{"a","b","c","d","e","f","g","h"};
        String[] ss4 = new String[]{"a","b","c","d","e","f","g","h"};

        RandomSubset.extract(ss1, 3);
        RandomSubset.extract(ss2, 3);
        RandomSubset.extract(ss3, 3);
        RandomSubset.extract(ss4, 3);

        Assert.assertFalse(Arrays.equals(ss1, ss2));
        Assert.assertFalse(Arrays.equals(ss1, ss3));
        Assert.assertFalse(Arrays.equals(ss1, ss4));
        Assert.assertFalse(Arrays.equals(ss2, ss3));
        Assert.assertFalse(Arrays.equals(ss2, ss4));
        Assert.assertFalse(Arrays.equals(ss3, ss4));

    }


}
