package com.gamasoft.eopi;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by uberto on 30/10/16.
 */
public class SquareRootTest {


    @Test
    public void squareRoot() throws Exception {

        assertEquals(10, SquareRoot.squareRoot(100, 0.1), 0.1);


        assertEquals(1000, SquareRoot.squareRoot(1000000, 1), 1);


        assertEquals(0.5, SquareRoot.squareRoot(0.25, 0.01), 0.01);

    }
}