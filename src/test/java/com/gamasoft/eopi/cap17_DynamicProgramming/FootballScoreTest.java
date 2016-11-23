package com.gamasoft.eopi.cap17_DynamicProgramming;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by uberto on 22/11/16.
 */
//17.1
public class FootballScoreTest {

//score can be 2, 3 or 7
    @Test
    public void zeroScore() throws Exception {

        Assert.assertEquals(0, FootballScore.scoreCombinations(1));

    }
    @Test
    public void oneScore() throws Exception {

        Assert.assertEquals(1, FootballScore.scoreCombinations(2));
        Assert.assertEquals(1, FootballScore.scoreCombinations(3));
        Assert.assertEquals(1, FootballScore.scoreCombinations(4));
        Assert.assertEquals(1, FootballScore.scoreCombinations(5));

    }
    @Test
    public void twoOrThreeScore() throws Exception {
        Assert.assertEquals(2, FootballScore.scoreCombinations(6));
        Assert.assertEquals(2, FootballScore.scoreCombinations(7));
        Assert.assertEquals(2, FootballScore.scoreCombinations(8));
        Assert.assertEquals(3, FootballScore.scoreCombinations(9));
        Assert.assertEquals(3, FootballScore.scoreCombinations(10));
    }

    @Test
    public void biggerScore() throws Exception {


        Assert.assertEquals(129, FootballScore.scoreCombinations(98));
        Assert.assertEquals(131, FootballScore.scoreCombinations(99));
        Assert.assertEquals(134, FootballScore.scoreCombinations(100));
        Assert.assertEquals(136, FootballScore.scoreCombinations(101));

    }
}
