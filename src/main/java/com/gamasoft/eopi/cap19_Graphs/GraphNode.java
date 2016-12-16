package com.gamasoft.eopi.cap19_Graphs;

import java.util.*;

/**
 * Created by uberto on 16/12/16.
 */
public class GraphNode {
    public final Set<GraphNode> links = new HashSet<>();
    public final String key;

    public GraphNode(String key) {
        this.key = key;
    }

    public void addLink(GraphNode node) {
        links.add(node);
    }


    public static int navigateNodesTo(GraphNode start, String finalKey) {
        if (start == null)
            return -1;

        Set<String> visited = new HashSet<>();
        Deque<GraphNode> toVisit = new ArrayDeque<>();
        Deque<GraphNode> nextToVisit = new ArrayDeque<>();

        toVisit.addAll(start.links);
        visited.add(start.key);

        int level = 2; //if we find right away is still 2 steps
        while (!toVisit.isEmpty()){
            GraphNode n = toVisit.pop();
            if (!visited.contains(n.key)) {
                if (n.key.equals(finalKey))
                    return level;
                nextToVisit.addAll(n.links);
                visited.add(n.key);
            }

            if (toVisit.isEmpty()){
                level++;
                toVisit.addAll(nextToVisit);
                nextToVisit.clear();
            }
        }

        return -1;
    }
}
