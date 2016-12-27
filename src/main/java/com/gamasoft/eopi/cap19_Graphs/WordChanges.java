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

            for(GraphNode ln: nodes.values())
                if (singleCharDiff(ln.key, w)) {
               //     System.out.println("dist 1 -->" + ln.key + " " + w);
                    n.addLink(ln);
                }

        }

        return nodes;
    }

    public static boolean singleCharDiff(String w1, String w2) {
        int d = 0;

        if (w1.length() == w2.length()) {
            for (int i = 0; i < w1.length(); i++) {
                if (w1.charAt(i) != w2.charAt(i)) {
                    d++;
                    if (d > 1)
                        return false;
                }
            }
            return d == 1;
        } else {
            String ls = w1.length() > w2.length() ? w1 : w2;
            String ss = w1.length() > w2.length() ? w2 : w1;
            if (ls.length() == ss.length() + 1) {
                int off = 0;
                for (int i = 0; i < ss.length(); i++) {

                    char sc = ss.charAt(i);
                    if (sc != ls.charAt(i + off)) {
                        if (off == 0 && sc == ls.charAt(i + 1))
                            off = 1;
                        else
                            return false;
                    }
                }
                return true;
            } else
                return false;
        }
    }
}
