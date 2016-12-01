package com.gamasoft.eopi.cap18_Greedy;

import junit.framework.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Created by uberto on 01/12/16.
 */

//18.1

public class TasksAndWorkersTest {
    @Test
    public void oneWorker() throws Exception {

        List<Integer> tasks = Arrays.asList(4, 4);

        Assert.assertEquals(8, TasksAndWorkers.durationInPair(tasks));
    }

    @Test
    public void twoWorkers() throws Exception {

        List<Integer> tasks = Arrays.asList(7,1,3,5);

        Assert.assertEquals(8, TasksAndWorkers.durationInPair(tasks));
    }

    @Test
    public void threeWorkers() throws Exception {

        List<Integer> tasks = Arrays.asList(2,5,1,6,4,4);

        Assert.assertEquals(8, TasksAndWorkers.durationInPair(tasks));

    }

    @Test
    public void twoWorkersRandom() throws Exception {

        List<Integer> tasks = Arrays.asList(1,5,7,9);

        Assert.assertEquals(12, TasksAndWorkers.durationInPair(tasks));
    }

    @Test
    public void theeWorkersRandom() throws Exception {

        List<Integer> tasks = Arrays.asList(1,4,4,4,7,9);

        Assert.assertEquals(11, TasksAndWorkers.durationInPair(tasks));
    }
}
