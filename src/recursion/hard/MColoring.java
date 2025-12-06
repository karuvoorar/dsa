package recursion.hard;

import java.util.ArrayList;
import java.util.List;

public class MColoring {

    public static void main(String[] args) {
        int[][] edges = {
                { 0, 1 }, { 0, 2 }, { 1, 2 }, { 1, 3 }
        };
        int colors = 3; // Number of colors
        int nodes = 4; // Number of nodes

        System.out.println(graphColoring(edges, colors, nodes));
    }

    static boolean graphColoring(int[][] edges, int colors, int nodes) {
        List<List<Integer>> adjList = new ArrayList<>();

        // Add list for edges to add their connecting nodes
        for (int i = 0; i < nodes; i++) {
            adjList.add(new ArrayList<>());
        }

        // Create a graph for the edge
        for (int[] edge : edges) {
            adjList.get(edge[0]).add(edge[1]);
            adjList.get(edge[1]).add(edge[0]);
        }

        int[] colorsArr = new int[nodes];

        return graphColoring(0, nodes, colors, colorsArr, adjList);
    }

    private static boolean graphColoring(int node, int nodes, int colors, int[] colorsArr, List<List<Integer>> adj) {

        // base condition
        // we have reached end of the node
        if (node == nodes)
            return true;

        for (int color = 1; color <= colors; color++) {
            if (isSafe(color, node, colorsArr, adj)) {

                colorsArr[node] = color; // add color to the node

                // explore the other nodes
                if (graphColoring(node + 1, nodes, colors, colorsArr, adj))
                    return true;

                colorsArr[node] = 0; // backtrack
            }
        }

        return false;
    }

    private static boolean isSafe(int color, int node, int[] colors, List<List<Integer>> adj) {

        // Pick the node's adjacent neighbors
        for (int neighbor : adj.get(node)) {

            // check if the adjacent neighbor has the same color
            if (color == colors[neighbor])
                return false;
        }

        return true;
    }
}
