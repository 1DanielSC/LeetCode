class Solution {
    
    public boolean isSameTree(TreeNode p, TreeNode q){
        if(p == null && q == null)
            return true;
        //Check if one of pointers are null (both cannot be null at the same time)
        else if(p == null || q == null)
            return false;
        
        if(p.val != q.val)
            return false;
        
        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }
    
    
}
