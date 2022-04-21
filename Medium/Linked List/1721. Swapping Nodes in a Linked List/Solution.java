class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        if(head == null)
            return null;
        
        int length = getLength(head);
        ListNode first = head;
        ListNode last = head;
        
        for(int i = 0; i < k-1; i++){
            first = first.next;
        }
        
        for(int i = 0; i < length-k; i++){
            last = last.next;
        }
        
        int temp = first.val;
        first.val = last.val;
        last.val = temp;
        
        return head;
    }
    
    public int getLength(ListNode head){
        int length = 0;
        ListNode temp = head;
        while(temp != null){
            length++;
            temp = temp.next;
        }
        return length;
    }
}
