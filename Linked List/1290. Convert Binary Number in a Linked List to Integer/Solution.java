class Solution {
    //Time Complexity: O(n)
    //Space Complexity: O(1)
  
    //Solution using bitwise operators
    public int getDecimalValue(ListNode head) {
        int k = 0;
        
        while(head != null){
            if(head.val == 1){
                k <<= 1; //Left-shift
                k |= 1; //Set right-most bit to one (least significant bit)
            }
            else
                k <<= 1;    
            
            head = head.next;
        }
        
        return k;
        
    }
}
