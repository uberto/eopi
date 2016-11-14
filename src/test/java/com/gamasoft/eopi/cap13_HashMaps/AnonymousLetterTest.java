package com.gamasoft.eopi.cap13_HashMaps;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by uberto on 14/11/16.
 */
public class AnonymousLetterTest {

    @Test
    public void smallLetter() throws Exception {

        String magazine = "abcd";

        Assert.assertTrue(AnonymousLetter.canWrite(magazine, "abc"));
        Assert.assertFalse(AnonymousLetter.canWrite(magazine, "abbc"));
        Assert.assertFalse(AnonymousLetter.canWrite(magazine, "abce"));
        Assert.assertTrue(AnonymousLetter.canWrite(magazine, "dcba"));

    }

    @Test
    public void longLetter() throws Exception {

        String magazine = "Hash table based implementation of the Map interface. This implementation provides all of the optional map operations, and permits null values and the null key. (The HashMap class is roughly equivalent to Hashtable, except that it is unsynchronized and permits nulls.) This class makes no guarantees as to the order of the map; in particular, it does not guarantee that the order will remain constant over time.\n" +
                "This implementation provides constant-time performance for the basic operations (get and put), assuming the hash function disperses the elements properly among the buckets. Iteration over collection views requires time proportional to the 'capacity' of the HashMap instance (the number of buckets) plus its size (the number of key-value mappings). Thus, it's very important not to set the initial capacity too high (or the load factor too low) if iteration performance is important.";

        Assert.assertTrue(AnonymousLetter.canWrite(magazine, "Shall I compare thee to a summer's day Thou art more lovely and more temperateRough winds do shake the darling buds of May, And summer's lease hath all too short a date"));
    }
}
