package Graphs;

public class AdjacencyMatrix {
    // Adjacency Matrix = A 2D array to store 1s and 0s to represent edges of a graph

    // Matrix list of a graph
    // Time complexity: O(1)
    // Space complexity: O(V^2) V = vertices of the graph

    // Graphs.Node is a point on the graph and an edge is a line connecting a node.
    public static void main(String[] args) {
        Graph graph = new Graph(5);

        graph.addNode(new Node('A'));
        graph.addNode(new Node('B'));
        graph.addNode(new Node('C'));
        graph.addNode(new Node('D'));
        graph.addNode(new Node('E'));

        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(2, 4);
        graph.addEdge(4, 0);
        graph.addEdge(4, 2);

        graph.print();


        // Depth FS = Traverse a graph branch by branch
        // Uses a stack
        // Better if destination is on average far from start
        // Children are visited before siblings
        // More popular for games/puzzles
        graph.depthFirstSearch(4);

        // Breath FS = Traverse a graph level by level
        // Uses a queue
        // Better if destination is on average close to start
        // Siblings are visited before children
        graph.breathFirstSearch(0);

        System.out.println(graph.checkEdge(4, 3));

    }


}
