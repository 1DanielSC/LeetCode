
class Solution {
  //Solution based on DFS traversal
      //Time complexity: O(n)
      //Space Complexity: O(n)
  
  
    public int maxDepth(Node root) {
        if(root == null)
            return 0;

        int max = DFS(root,1);
        
        return max;
    }
    
    public int DFS(Node root, int currentDepth){
        if(root == null || root.children.isEmpty())
            return currentDepth;
        
        int maxDepth = 0;
        currentDepth++;
        
        //Since there aren't cycles in a tree, it isn't necessary to use a boolen visited[] array
        //The result of this solution is the same of BFS, since there aren't edges connecting nodes of the same level
        for(int i = 0; i < root.children.size();i++){
            
            int n = DFS(root.children.get(i), currentDepth);
            
            maxDepth = Math.max(maxDepth,n);
            
        }
        
        return maxDepth;
    }
}
