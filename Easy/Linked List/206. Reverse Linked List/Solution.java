class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null)
            return null;
        return solve(null,head);
    }
    
    public ListNode solve(ListNode prev, ListNode temp){
        if(temp == null)
            return prev;
        
        ListNode next = temp.next;
        temp.next = prev;
        return solve(temp,next);
    }
}
