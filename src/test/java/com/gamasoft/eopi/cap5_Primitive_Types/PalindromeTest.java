package com.gamasoft.eopi.cap5_Primitive_Types;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by uberto on 21/12/16.
 */
//5.8  5.9
public class PalindromeTest {

    @Test
    public void palindrome() throws Exception {

        Assert.assertTrue(Palindrome.check(123454321));
        Assert.assertTrue(Palindrome.check(64822846));
        Assert.assertTrue(Palindrome.check(1));
        Assert.assertTrue(Palindrome.check(44));
        Assert.assertTrue(Palindrome.check(444));
        Assert.assertTrue(Palindrome.check(4444));
        Assert.assertFalse(Palindrome.check(123454322));
        Assert.assertFalse(Palindrome.check(1234543211));

    }


    @Test
    public void reverse() throws Exception {

        Assert.assertEquals(54321, Palindrome.reverse(12345));
        Assert.assertEquals(0, Palindrome.reverse(0));
        Assert.assertEquals(9, Palindrome.reverse(9));
        Assert.assertEquals(6457469, Palindrome.reverse(9647546));

    }
}
