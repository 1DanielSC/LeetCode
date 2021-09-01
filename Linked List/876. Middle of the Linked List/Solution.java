class Solution {
    public ListNode middleNode(ListNode head) {
        if(head == null)
            return null;
        
        ListNode temp = head;
        int number = 0;
        
        while(temp != null){
            number++;
            temp = temp.next;
        }
        
        temp = head;
        
        if(number % 2 != 0)
           number = number/2;
        else
            number = (number+1)/2;
        
        
        while(temp != null && number != 0){
            number--;
            temp = temp.next;
        }
        
        return temp;
        
    }
}
