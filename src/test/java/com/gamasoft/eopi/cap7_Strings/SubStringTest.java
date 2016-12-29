package com.gamasoft.eopi.cap7_Strings;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by uberto on 29/12/16.
 */
//7.13
public class SubStringTest {

    @Test
    public void verySimple() throws Exception {

        Assert.assertEquals(1, SubString.find("abc", "b"));
        Assert.assertEquals(-1, SubString.find("abc", "d"));
        Assert.assertEquals(0, SubString.find("abc", "a"));
        Assert.assertEquals(1, SubString.find("abc", "bc"));
        Assert.assertEquals(-1, SubString.find("abc", "bcd"));
        Assert.assertEquals(0, SubString.find("abc", "abc"));

    }


    @Test
    public void medium() throws Exception {

        Assert.assertEquals(2, SubString.find("abcde", "c"));
        Assert.assertEquals(2, SubString.find("abcde", "cd"));
        Assert.assertEquals(1, SubString.find("abcde", "bcd"));
        Assert.assertEquals(1, SubString.find("abcde", "bcde"));
        Assert.assertEquals(0, SubString.find("abcde", "abcde"));
        Assert.assertEquals(-1, SubString.find("abcde", "dc"));

    }

    @Test
    public void longString() throws Exception {

        Assert.assertEquals(10, SubString.find("abcdefghilmabcdefghilm", "mabcdefghil"));
        Assert.assertEquals(4, SubString.find("aaaaaaaaaaaaaabaaaaaaaa", "aaaaaaaaaaba"));
        Assert.assertEquals(-1, SubString.find("ndhfkjsc ksnkshkfewwk emkwjheiuejnkwenwuiwjd", "zzz"));
        Assert.assertEquals(43, SubString.find("abcdefghilmabcdefghilmabcdefghilmabcdefghilmwwabcdefghilm", "mwwa"));

    }
}
