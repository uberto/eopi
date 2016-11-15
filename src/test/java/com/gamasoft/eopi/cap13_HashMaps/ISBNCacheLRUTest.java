package com.gamasoft.eopi.cap13_HashMaps;

import junit.framework.Assert;
import org.junit.Test;
import sun.misc.LRUCache;

/**
 * Created by uberto on 15/11/16.
 */

// 13.3
public class ISBNCacheLRUTest {

    @Test
    public void checkIfPresent() throws Exception {

        ISBNCacheLRU cache = new ISBNCacheLRU(3);

        cache.insert("1234", 12.34);
        cache.insert("1235", 12.35);
        cache.insert("1236", 12.36);

        Assert.assertEquals(12.34, cache.lookUp("1234"));
        Assert.assertEquals(12.35, cache.lookUp("1235"));
        Assert.assertEquals(12.36, cache.lookUp("1236"));
    }

    @Test
    public void removeLRU() throws Exception {

        ISBNCacheLRU cache = new ISBNCacheLRU(3);

        cache.insert("1234", 12.34);
        cache.insert("1235", 12.35);
        cache.insert("1236", 12.36);
        cache.insert("1237", 12.37);

        Assert.assertEquals(12.35, cache.lookUp("1235"));
        Assert.assertEquals(12.36, cache.lookUp("1236"));
        Assert.assertEquals(12.37, cache.lookUp("1237"));
        try{
            cache.lookUp("1234");
            Assert.fail("No exception");
        } catch (NullPointerException e){

        }

    }

    @Test
    public void removeLRULookup() throws Exception {

        ISBNCacheLRU cache = new ISBNCacheLRU(3);

        cache.insert("1234", 12.34);
        cache.insert("1235", 12.35);
        cache.insert("1236", 12.36);
        Assert.assertEquals(12.34, cache.lookUp("1234"));
        Assert.assertEquals(12.35, cache.lookUp("1235"));
        cache.insert("1237", 12.37);

        Assert.assertEquals(12.35, cache.lookUp("1235"));
        Assert.assertEquals(12.34, cache.lookUp("1234"));
        Assert.assertEquals(12.37, cache.lookUp("1237"));
        try{
            cache.lookUp("1236");
            Assert.fail("No exception");
        } catch (NullPointerException e){

        }

    }
}
