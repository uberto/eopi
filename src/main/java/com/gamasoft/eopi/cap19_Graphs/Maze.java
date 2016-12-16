package com.gamasoft.eopi.cap19_Graphs;

import com.sun.jmx.remote.internal.ArrayQueue;

import java.util.*;

/**
 * Created by uberto on 14/12/16.
 */
public class Maze {
    public static int findShortestExit(char[][] maze) {
        //For a (n,m) maze: start is at 0,0, finish at n,m

        GraphNode start = createMazeGraph(maze);

        return GraphNode.navigateNodesTo(start, xyKey(maze[0].length - 1, maze.length - 1));

    }



    private static GraphNode createMazeGraph(char[][] maze) {
        Map<String, GraphNode> nodes = new HashMap<>();
        for (int x = 0; x < maze[0].length; x++) {
            for (int y = 0; y < maze.length; y++) {
                if (maze[y][x] == '_'){
                    GraphNode n = new GraphNode(xyKey(x, y));
                    nodes.put(n.key, n);
                }
            }
        }

        for(String c: nodes.keySet()){
            String[] xy = c.split(",");
            int x = Integer.valueOf(xy[0]);
            int y = Integer.valueOf(xy[1]);

            GraphNode n = nodes.get(c);

            GraphNode left = nodes.get(xyKey(x-1, y));
            if (left != null)
                n.addLink(left);
            GraphNode right = nodes.get(xyKey(x+1, y));
            if (right != null)
                n.addLink(right);
            GraphNode down = nodes.get(xyKey(x, y-1));
            if (down != null)
                n.addLink(down);
            GraphNode up = nodes.get(xyKey(x, y+1));
            if (up != null)
                n.addLink(up);

        }

        return nodes.get("0,0");
    }

    private static String xyKey(int x, int y) {
        return String.valueOf(x)+','+String.valueOf(y);
    }

}
