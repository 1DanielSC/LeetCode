class Solution {
    public ListNode mergeNodes(ListNode head) {
        if(head == null)
            return head;
        
        ListNode temp = head.next;
        ListNode headList, newList = new ListNode(0);
        headList = newList;
        
        int sum = 0;
        
        while(temp != null){
            
            if(temp.val != 0)
                sum += temp.val;
            
            else{
                newList.next = new ListNode(sum);
                newList = newList.next;
                
                sum = 0;
            }
            
            temp = temp.next;
        }
        
        return headList.next;
    }
}
