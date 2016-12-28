package com.gamasoft.eopi.cap7_Strings;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by uberto on 28/12/16.
 */
//7.5
public class PalindromicTest {

    @Test
    public void shortPalin(){
        Assert.assertTrue(Palindromic.is("aa"));
        Assert.assertTrue(Palindromic.is("aaa"));
        Assert.assertTrue(Palindromic.is("aaaa"));
        Assert.assertTrue(Palindromic.is("aaaaa"));
        Assert.assertTrue(Palindromic.is("aba"));
        Assert.assertTrue(Palindromic.is("abba"));
        Assert.assertTrue(Palindromic.is("a b, a"));
        Assert.assertTrue(Palindromic.is("a b;b, a"));
        Assert.assertTrue(Palindromic.is(" c$$b_  c!"));
        Assert.assertFalse(Palindromic.is("ab"));
        Assert.assertFalse(Palindromic.is("abb"));
        Assert.assertFalse(Palindromic.is(" c$$bz_  c!"));
        Assert.assertFalse(Palindromic.is("aaabaa"));
    }

    @Test
    public void longPalin(){
        Assert.assertTrue(Palindromic.is("a b>>c$d%%e}}f g | #hijk++l m!n=op%^%$#qrs^tuv!!wx<>:yzzyxw  ..  vutsrq_(ponm)lkjih *gfe=dcba  "));
        Assert.assertFalse(Palindromic.is("a b>>c$d%%e}}f g | #hijk++l m!n=op%^%$#qrs^tuv!!wx<>:yzyzxw  ..  vutsrq_(ponm)lkjih *gfe=dcba  "));
    }

}
