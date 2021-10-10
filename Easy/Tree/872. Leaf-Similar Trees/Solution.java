class Solution {
  
    //Time complexity: O(n)
    //Space complexity: O(n)
          //2n <= 4*n
    
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        if(root1 == null && root2 == null || root1 == null || root2 == null)
            return false;
        
        ArrayList<Integer> list1 = new ArrayList<Integer> ();
        ArrayList<Integer> list2 = new ArrayList<Integer> ();
        
        getLeaves(root1,list1);
        getLeaves(root2,list2);
        
        if(list1.size() != list2.size())
            return false;
        
        for(int i = 0; i < list1.size();i++){
            if(list1.get(i) != list2.get(i))
                return false;
        }
        
        
        return true;
        
    }
    
    public void getLeaves(TreeNode root, ArrayList<Integer> list){
        if(root == null)
            return;
        getLeaves(root.left,list);
        if(root.left == null && root.right == null)
            list.add(root.val);
        getLeaves(root.right,list);

    }
}
