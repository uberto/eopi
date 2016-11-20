package com.gamasoft.eopi.cap15_BST;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by uberto on 20/11/16.
 */

//15.3
public class FindGreatestElementsTest {

    @Test
    public void findOne() throws Exception {
        Assert.assertEquals(Arrays.asList(8), FindGreatestElements.find(Samples.smallBST, 1));

    }


    @Test
    public void findTwo() throws Exception {
        Assert.assertEquals(Arrays.asList(9, 5), FindGreatestElements.find(Samples.tinyBST, 2));

    }



    @Test
    public void findFour() throws Exception {
        Assert.assertEquals(Arrays.asList(58, 50, 45, 30), FindGreatestElements.find(Samples.mediumBST, 4));

    }
}
