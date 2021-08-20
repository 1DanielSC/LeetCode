class Solution {
    //Time Complexity: O(n)
    //Space Complexity: O(n)
  
    //All we need is to traverse the tree and append each node's val to our list
      
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        if(root == null)
            return list;
        
        inOrder(root, list);
        return list;
    }
    
    public void inOrder(TreeNode root, List<Integer> list){
        if(root == null)
            return;
        
        inOrder(root.left,list);
        list.add(root.val);
        inOrder(root.right,list);
    }
}
