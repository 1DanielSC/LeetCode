
//First solution:
class Solution {
    public boolean isValidBST(TreeNode root) {
        
        return check(root,null,null);
    }
    
    public boolean check(TreeNode root, TreeNode low, TreeNode max){
        if(root == null)
            return true;
        
        if(low != null && root.val <= low.val)
            return false;
        
        if(max != null && root.val >= max.val)
            return false;
            
        return check(root.left,low,root) && check(root.right,root,max);
    }

}


//Second and less efficient solution:
  //InOrder traversal gives us a list with all tree elements sorted
    //We'll need to use an array to store the elements. Hence, the space complexity will be O(n), whereas the space complexity of the first solution is O(1)
class Solution2 {
    public boolean isValidBST(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        isSorted(root,list);
        
        for(int i = 0; i < list.size() - 1; i++){
            if(list.get(i) >= list.get(i+1))
                return false;
        }
        
        return true;
    }
    
    public void isSorted(TreeNode root, ArrayList<Integer> list){
        if(root == null)
            return;
        isSorted(root.left,list);
        list.add(root.val);
        isSorted(root.right,list);
    }   
}
