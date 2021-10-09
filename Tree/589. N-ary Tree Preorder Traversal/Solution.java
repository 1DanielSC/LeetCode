class Solution {
    //Time Complexity: O(n)
    //Space Complexity: O(n) -> We are creating a list to hold all the elements of the N-ary tree
  
    public List<Integer> preorder(Node root) {

        ArrayList<Integer> list = new ArrayList<Integer>();
        
        preOrder(root,list);
        return list;
    }
    
    public void preOrder(Node node, List<Integer> list){
        if(node == null)
            return;
        //PreOrder -> Firstly, we process the data and then traverse the tree
        list.add(node.val);
        
      //The traversing starts at the first child. (i = 0)
        for(int i = 0; i < node.children.size();i++){
            preOrder(node.children.get(i),list);
        }
    }
}
