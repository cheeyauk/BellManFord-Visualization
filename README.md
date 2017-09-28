# BellManFord 

This is a Masters assignment turned application ! In short, it is an interactive application designed on Java with simple two functional features: 

1. Design a structural directed graph
2. Solve shortest distance between points of interest using Bellman Ford algorithm

The application is built using third party library, specifically jgraph for directed graph visualization and swing for UI component design. 

__Introduction__

Introduced by mathematicians Richard Bellman and Lester Ford, Bellman-Ford is an algorithm that solves the shortest path problem from a single source to all other vertices in a weighted directed graph. As opposed to dijkstra algorithm, the algorithm can solve problem with negative weights, although it is slightly more expensive. Bellman-Ford operates based on relaxation process where for each of the node in a digraph, all neighbour are investigated for shortest path by comparing distance through parent s to existing shortest path. More details on the algorithm are available below: 

https://brilliant.org/wiki/bellman-ford-algorithm/

__Application Overview__

The figure below shows a intuitive visualization on how the application works.

<img src="/App_Overview.png?" width="500"/>

The application contains three main modules : 

1. __BellmanMethod module__ - Module to perform Bellman Ford calculation.
2. __GraphFactory module__ A jgraph based factory which is designed for purpose of drawing weighted digraphs (e.g. add edge, add vertex
) and provided specific representations that is required for shortest distance calculation.
3. __Main UI__ which host user data and display results to users. The other two modules are used to support this module and are independent of each other.

A simple flow diagram here visualizes the interaction between different modules:
<img src="/App_Usage.png?" width="600"/>

As illustrated in from the main UI, the user is able to select from a few provided predrawn graphs. That would not solve the defintion for a flexible application. Well, don't worry! 
A cool feature was provided to draw your own nodes and vertices, illustrated below. Granted, the UI to do so isn't the most intuitive (note the "strict" format required in the text box), but this is an interface I have been able to come up with in a short amount of time.

<img src="/Use_Case1.png?" width="500"/>

Lastly, the application supports creation of bi-directed graph, though the arrows might overlap on the UI. The 9 vertices example is based on the following graph, just so if you need to understand in more detail: 

<img src="/9_Vertice_Example.png?" width="400"/>

Do get the source code and play around with it!
