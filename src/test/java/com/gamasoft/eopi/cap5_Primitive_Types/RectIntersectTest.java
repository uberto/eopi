package com.gamasoft.eopi.cap5_Primitive_Types;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by uberto on 22/12/16.
 */
//5.11
public class RectIntersectTest {

    @Test
    public void zeroIntersect() throws Exception {

        RectIntersect.Rect r1 = new RectIntersect.Rect(0,0,1,1);
        RectIntersect.Rect r2 = new RectIntersect.Rect(2,2,3,3);

        Assert.assertNull(RectIntersect.findIntersect(r1, r2));

    }



    @Test
    public void oneCornerIntersect() throws Exception {

        RectIntersect.Rect r1 = new RectIntersect.Rect(0,0,2,2);
        RectIntersect.Rect r2 = new RectIntersect.Rect(1,1,3,3);

        Assert.assertEquals("1,1,2,2", RectIntersect.findIntersect(r1, r2).toString());

    }


    @Test
    public void twoCornersIntersect() throws Exception {

        RectIntersect.Rect r1 = new RectIntersect.Rect(0,0,2,2);
        RectIntersect.Rect r2 = new RectIntersect.Rect(1,0,3,2);

        Assert.assertEquals("1,0,2,2", RectIntersect.findIntersect(r1, r2).toString());

    }


    @Test
    public void insideIntersect() throws Exception {

        RectIntersect.Rect r1 = new RectIntersect.Rect(0,0,3,3);
        RectIntersect.Rect r2 = new RectIntersect.Rect(1,1,2,2);

        Assert.assertEquals("1,1,2,2", RectIntersect.findIntersect(r1, r2).toString());

    }

    @Test
    public void crossIntersect() throws Exception {

        RectIntersect.Rect r1 = new RectIntersect.Rect(0,1,3,2);
        RectIntersect.Rect r2 = new RectIntersect.Rect(1,0,2,3);

        Assert.assertEquals("1,1,2,2", RectIntersect.findIntersect(r1, r2).toString());

    }

}
