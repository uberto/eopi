package com.gamasoft.eopi.cap19_Graphs;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by uberto on 14/12/16.
 */
//19.1
public class MazeTest {

    @Test
    public void tinyMaze() throws Exception {

        char[][] maze = new char[][]{{'_','_'}};

        Assert.assertEquals(2, Maze.findShortestExit(maze));

    }

    @Test
    public void smallMaze() throws Exception {

        char[][] maze = new char[][]{{'_','_','X'},
                {'X','_','X'},
                {'X','_','_'}};

        Assert.assertEquals(5, Maze.findShortestExit(maze));

    }

    @Test
    public void closedMaze() throws Exception {

        char[][] maze = new char[][]{{'_','_','X'},
                                     {'X','X','X'},
                                     {'X','_','_'}};

        Assert.assertEquals(-1, Maze.findShortestExit(maze));

    }

    @Test
    public void openMaze() throws Exception {

        char[][] maze = new char[][]{{'_','_','_','_'}, 
                                     {'X','_','X','_'},
                                     {'_','_','_','_'},
                                     {'X','_','X','X'},
                                     {'_','_','_','_'}};

        Assert.assertEquals(8, Maze.findShortestExit(maze));

    }

    @Test
    public void bigMaze() throws Exception {

        char[][] maze = new char[][]
                {{'_','_','_','_','_','_','_'},
                 {'X','X','X','_','X','X','_'},
                 {'_','_','_','_','X','_','_'},
                 {'X','_','X','_','_','_','X'},
                 {'_','_','_','X','X','X','_'}, 
                 {'_','X','X','_','_','_','_'},
                 {'_','_','_','_','X','X','_'}};

        Assert.assertEquals(21, Maze.findShortestExit(maze));

    }


}
