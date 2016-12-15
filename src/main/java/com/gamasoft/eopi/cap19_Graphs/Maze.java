package com.gamasoft.eopi.cap19_Graphs;

import com.sun.jmx.remote.internal.ArrayQueue;

import java.util.*;

/**
 * Created by uberto on 14/12/16.
 */
public class Maze {
    public static int findShortestExit(char[][] maze) {
        //For a (n,m) maze: start is at 0,0, finish at n,m

        MazeNode start = createMazeGraph(maze);

        return findExit(start, xyKey(maze[0].length - 1, maze.length - 1));

    }

    private static int findExit(MazeNode start, String exit) {
        if (start == null)
            return -1;

        Set<String> visited = new HashSet<>();
        Deque<MazeNode> toVisit = new ArrayDeque<>();
        Deque<MazeNode> nextToVisit = new ArrayDeque<>();

        toVisit.addAll(start.children);
        visited.add(start.name);

        int level = 2; //if we find right away is still 2 steps
        while (!toVisit.isEmpty()){
            MazeNode n = toVisit.pop();
            if (!visited.contains(n.name)) {
                if (n.name.equals(exit))
                    return level;
                nextToVisit.addAll(n.children);
                visited.add(n.name);
            }

            if (toVisit.isEmpty()){
                level++;
                toVisit.addAll(nextToVisit);
                nextToVisit.clear();
            }
        }

        return -1;
    }

    private static MazeNode createMazeGraph(char[][] maze) {
        Map<String, MazeNode> nodes = new HashMap<>();
        for (int x = 0; x < maze[0].length; x++) {
            for (int y = 0; y < maze.length; y++) {
                if (maze[y][x] == '_'){
                    MazeNode n = new MazeNode(xyKey(x, y));
                    nodes.put(n.name, n);
                }
            }
        }

        for(String c: nodes.keySet()){
            String[] xy = c.split(",");
            int x = Integer.valueOf(xy[0]);
            int y = Integer.valueOf(xy[1]);

            MazeNode n = nodes.get(c);

            MazeNode left = nodes.get(xyKey(x-1, y));
            if (left != null)
                n.addChild(left);
            MazeNode right = nodes.get(xyKey(x+1, y));
            if (right != null)
                n.addChild(right);
            MazeNode down = nodes.get(xyKey(x, y-1));
            if (down != null)
                n.addChild(down);
            MazeNode up = nodes.get(xyKey(x, y+1));
            if (up != null)
                n.addChild(up);

        }

        return nodes.get("0,0");
    }

    private static String xyKey(int x, int y) {
        return String.valueOf(x)+','+String.valueOf(y);
    }

    private static class MazeNode {
        private List<MazeNode> children = new ArrayList<>();
        private String name;

        public MazeNode(String name) {

            this.name = name;
        }

        public void addChild(MazeNode mazeNode) {
            children.add(mazeNode);
        }
    }
}
