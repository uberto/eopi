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

    @Test
    public void performance() throws Exception {

        String main = "abcdefghilmabcdefghilmabcdefghilmabcdefghilmwwabcdefghilmabcdefghilmabcdefghilmabcdefghilmabcdefghilmwwwabcdefghilm";
        String substring = "ghilmwwwabcd";

        for (int i = 0; i < 10000; i++) {
            SubString.find(main, substring);
        }


        long st = System.nanoTime();
        int index = SubString.find(main, substring);
        long elap = System.nanoTime() - st;

        System.out.println("RabinKarp " + index + " nanosec " + elap);


        long st2 = System.nanoTime();
        int index2 = main.indexOf(substring);
        long elap2 = System.nanoTime() - st2;

        System.out.println("IndexOf " + index2 + " nanosec " + elap2);
    }

    @Test
    public void performanceSimil() throws Exception {

        String main = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabaaaaaaaaaa";
        String substring = "aaaaaaaaaaba";

        for (int i = 0; i < 10000; i++) {
            SubString.find(main, substring);
        }

        long st = System.nanoTime();
        int index = SubString.find(main, substring);
        long elap = System.nanoTime() - st;

        System.out.println("Simil RabinKarp " + index + " nanosec " + elap);


        long st2 = System.nanoTime();
        int index2 = main.indexOf(substring);
        long elap2 = System.nanoTime() - st2;

        System.out.println("Simil IndexOf " + index2 + " nanosec " + elap2);
    }
}
