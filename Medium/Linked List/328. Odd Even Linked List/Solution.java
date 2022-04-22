class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null || head.next.next == null)
            return head;

        ListNode prev, temp, end, op;
        
        temp = head;
        int length = 1;
        while(temp.next != null){
            temp = temp.next;
            length++;
        }
        
        end = temp;
        temp = head;
        prev = null;
        
        int counter = 1;
        
        while(temp != null && counter <= length){
            
            if(counter % 2 == 0){
                op = temp;
                temp = temp.next; //next node (odd)
                
                end.next = op; //put the even node at the end
                end = end.next; //update end pointer to point to the end of list
                
                prev.next = op.next; //move "previous" pointer
                end.next = null; //end of list
                    //Here's why we had to use "op" pointer. We would mass with the references
              //We couldn't update temp.next or op.next to null because we'd lose the reference to the next node (odd)

                
            }else{
                prev = temp;
                temp = temp.next;
            }

            counter++;
        }
        
        return head;
    }
}
