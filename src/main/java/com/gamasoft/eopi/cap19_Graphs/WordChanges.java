package com.gamasoft.eopi.cap19_Graphs;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by uberto on 16/12/16.
 */
public class WordChanges {
    public static int findChanges(String from, String to, List<String> dict) {
        if (from.equals(to))
            return 0;

        Map<String, GraphNode> nodes = createNodes(dict);

        GraphNode nfrom = nodes.get(from);
        if (nfrom == null)
            throw new RuntimeException("not present in dict " + from);

        return GraphNode.navigateNodesTo(nfrom, to);
    }


    private static Map<String, GraphNode> createNodes(List<String> dict) {
        Map<String, GraphNode> nodes = new HashMap<>();
        for(String w: dict)
            nodes.put(w, new GraphNode(w));

        for(GraphNode n: nodes.values()){
            String w = n.key;

        }

        return nodes;
    }

}
