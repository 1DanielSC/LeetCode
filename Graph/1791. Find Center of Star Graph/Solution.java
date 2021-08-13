class Solution {
  //Time Complexity: O(1)
  //Space Complexity: O(1)
  
  /*
  A star graph is a graph where there is one center node and **exactly n - 1 edges** that **connect the center node with every other node**.
        
        Since edges.length == n - 1, then the center node is present in every edge (u,v)
        Hence, we only need to check two edges from edges array because the center node will be present in it.
  */
    public int findCenter(int[][] edges) {
       if(edges[0][0] == edges[1][0] || edges[0][0] == edges[1][1])
           return edges[0][0];
        else
            return edges[0][1];
    }
}
