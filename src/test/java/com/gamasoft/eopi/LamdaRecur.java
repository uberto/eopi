package com.gamasoft.eopi;

import junit.framework.Assert;
import org.junit.Test;

import java.util.function.BiFunction;

/**
 * Created by uberto on 04/11/16.
 */
public class LamdaRecur {

    @Test
    public void fibonacci() throws Exception {

        Assert.assertEquals(1, fibonacci(1));
        Assert.assertEquals(2, fibonacci(2));
        Assert.assertEquals(3, fibonacci(3));
        Assert.assertEquals(5, fibonacci(4));
        Assert.assertEquals(8, fibonacci(5));
        Assert.assertEquals(13, fibonacci(6));
        Assert.assertEquals(21, fibonacci(7));
        Assert.assertEquals(34, fibonacci(8));

    }

    private int fibonacci(int number) {
        BiFunction<BiFunction<BiFunction,Integer,Integer>, Integer, Integer> helper = (f, x) -> x > 1 ? f.apply(f, x - 1) + f.apply(f, x - 2) : 1;

        return helper.apply((BiFunction) helper, number);
    }
}
