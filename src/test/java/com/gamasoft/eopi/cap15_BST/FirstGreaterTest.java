package com.gamasoft.eopi.cap15_BST;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by uberto on 19/11/16.
 */

// 15.2

public class FirstGreaterTest {


    @Test
    public void findInSmallBST() throws Exception {

       Assert.assertEquals(9, FirstGreater.find(Samples.tinyBST, 6));

    }

    @Test
    public void findInMediumBST() throws Exception {

        Assert.assertEquals(15, FirstGreater.find(Samples.mediumBST, 10));
        Assert.assertEquals(5, FirstGreater.find(Samples.mediumBST, 3));
        Assert.assertEquals(10, FirstGreater.find(Samples.mediumBST, 9));
        Assert.assertEquals(30, FirstGreater.find(Samples.mediumBST, 21));
        Assert.assertEquals(58, FirstGreater.find(Samples.mediumBST, 51));
        Assert.assertEquals(45, FirstGreater.find(Samples.mediumBST, 31));

    }

}
