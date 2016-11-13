package com.gamasoft.eopi.cap6_Arrays;

import junit.framework.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by uberto on 04/11/16.
 */
public class DutchFlagTest {

    //6.1
    @Test
    public void dutchFlag() throws Exception {

        Integer[] array1 = {1, 3, 2, 5, 3};
        DutchFlag.sort(array1, 2);
        Assert.assertEquals("[1, 2, 3, 5, 3]", Arrays.asList(array1).toString());

        Integer[] array2 = {5, 1, 4, 2, 3};
        DutchFlag.sort(array2, 4);
        Assert.assertEquals("[1, 2, 3, 4, 5]", Arrays.asList(array2).toString());

        Integer[] array3 = {6, 1, 5, 5, 6, 1};
        DutchFlag.sort(array3, 3);
        Assert.assertEquals("[1, 1, 5, 5, 6, 6]", Arrays.asList(array3).toString());

    }
}