/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shortestpathapp;

/**
 *
 * @author cheeyauk
 * Bellman Method is a class to initialize and calculate Bellman Ford algorithm. This is the key part of the framework to determine the shortest path of a given transportation network.
 */
public class BellmanMethod {

    // Singleton variables used by current and parent class
    private static int distances[];
    private static int parents[];
    private static int numberOfVertices;
    public static int MAX_VALUE = 9999;
    public static int[][] adjacencyMatrix;
    public static boolean isNegativeCycle = false;

    // Main initialisation. Called from parent
    public BellmanMethod(int numberofvertices, int distancesIn[], int parentsIn[]) {
        this.numberOfVertices = numberofvertices;
        distances = distancesIn;
        parents = parentsIn;
    }
    
    // The main Bellman Loop. Calculation will perform BellmanCalculateDistance followed by BellmanCheckNegativeCycle 
    public void BellmanFordLoop(int source, int adjacencyMatrix[][]) {

        distances[source] = 0;
        BellmanCalculateDistance(adjacencyMatrix);
        BellmanCheckNegativeCycle(adjacencyMatrix);

    }

    // Bellman relaxation cycles
    // Each node is relaxed for n times.
    private void BellmanCalculateDistance(int adjacencyMatrix[][]) {
        // repeat for number of nodes
        for (int repeat = 1; repeat <= numberOfVertices - 1; repeat++) {
            for (int startNode = 1; startNode <= numberOfVertices; startNode++) {
                for (int endNode = 1; endNode <= numberOfVertices; endNode++) {
                    if (adjacencyMatrix[startNode][endNode] != MAX_VALUE) {
                        if (distances[endNode] > distances[startNode] + adjacencyMatrix[startNode][endNode]) {
                            distances[endNode] = distances[startNode] + adjacencyMatrix[startNode][endNode];
                            parents[endNode] = startNode;
                        }
                    }
                }
            }
        }
    }

    // Check for negative matrix using additional relaxation and detection
    private void BellmanCheckNegativeCycle(int adjacencyMatrix[][]) {
        for (int startNode = 1; startNode <= numberOfVertices; startNode++) {
            for (int endNode = 1; endNode <= numberOfVertices; endNode++) {
                if (adjacencyMatrix[startNode][endNode] != MAX_VALUE) {
                    if (distances[endNode] > distances[startNode]
                            + adjacencyMatrix[startNode][endNode]) {
                        isNegativeCycle = true;
                    }
                }
            }
        }

    }

}
