package com.gamasoft.eopi;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by uberto on 30/10/16.
 */
public class SquareRootTest {


    @Test
    public void squareRoot() throws Exception {

        double r = SquareRoot.squareRoot(100, 0.1);

        assertEquals(10, r, 0.1);
    }
}