class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        
        if(lists.length == 0)
            return null;
        
        
        ListNode temp = new ListNode();
        
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        
        for(int i = 0; i < lists.length; i++){
            temp = lists[i];
            
            while(temp != null){
                
                pq.add(temp.val);
                temp = temp.next;
            }
        }
        
        if(pq.isEmpty())
            return null;
        
        ListNode head = new ListNode(pq.remove());
        temp = head;
        
        while(!pq.isEmpty()){
            temp.next = new ListNode(pq.remove());
            temp = temp.next;
        }
        
        
        return head;
    }
}
