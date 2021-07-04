class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null && l2 == null)
            return null;
        if(l1 == null)
            return l2;
        if(l2 == null)
            return l1;
        
        ListNode temp = new ListNode();
        
        if(l1.val <= l2.val){
            temp.val = l1.val;
            temp.next = mergeTwoLists(l1.next,l2);
        }
        else{  
            temp.val = l2.val;
            temp.next = mergeTwoLists(l1,l2.next);
        }
        
        
       return temp;
    }
    
}
