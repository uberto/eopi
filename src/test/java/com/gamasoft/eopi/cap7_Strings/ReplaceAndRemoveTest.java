package com.gamasoft.eopi.cap7_Strings;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by uberto on 06/11/16.
 */
public class ReplaceAndRemoveTest {

    //a -> dd
    //b -> _

//7.4
    @Test
    public void replaceAndRemove1() throws Exception {

        char[] array = "abcd".toCharArray();

        ReplaceAndRemove.transform(array, 4);

        Assert.assertEquals("ddcd", new String(array));

    }



    @Test
    public void replaceAndRemove2() throws Exception {

        char[] array = "aaabcd".toCharArray();

        ReplaceAndRemove.transform(array, 4);

        Assert.assertEquals("dddddd", new String(array));

    }


    @Test
    public void replaceAndRemove3() throws Exception {

        char[] array = "bbbbcdefgh".toCharArray();

        ReplaceAndRemove.transform(array, 4);

        Assert.assertEquals("bbbbcdefgh", new String(array));

    }


    @Test
    public void replaceAndRemove4() throws Exception {

        char[] array = "aacaefg".toCharArray();

        ReplaceAndRemove.transform(array, 4);

        Assert.assertEquals("ddddcdd", new String(array));

    }

    @Test
    public void replaceAndRemove5() throws Exception {

        char[] array = "cdef".toCharArray();

        ReplaceAndRemove.transform(array, 4);

        Assert.assertEquals("cdef", new String(array));

    }


    @Test
    public void replaceAndRemove6() throws Exception {

        char[] array = "abbacc".toCharArray();

        ReplaceAndRemove.transform(array, 4);

        Assert.assertEquals("ddddcc", new String(array));

    }


}
