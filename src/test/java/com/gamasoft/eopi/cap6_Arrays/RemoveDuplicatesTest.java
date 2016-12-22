package com.gamasoft.eopi.cap6_Arrays;

import junit.framework.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by uberto on 22/12/16.
 */
public class RemoveDuplicatesTest {
    @Test
    public void noDuplicates() throws Exception {

        int[] a = {1, 2, 3, 4, 5};

        RemoveDuplicates.remove(a);

        Assert.assertEquals(5, a.length);
    }

    @Test
    public void same() throws Exception {

        int[] a = {1, 1, 1};

        Assert.assertEquals("[1]", Arrays.toString(RemoveDuplicates.remove(a)));

    }

    @Test
    public void lotsOfDuplicates() throws Exception {

        int[] a = {1, 1, 2, 2, 2, 3, 3, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5};

         Assert.assertEquals("[1, 2, 3, 4, 5]", Arrays.toString(RemoveDuplicates.remove(a)));

    }
}
