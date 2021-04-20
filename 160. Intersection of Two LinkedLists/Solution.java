/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    
    
    public static int getSize(ListNode node){
        if(node == null) return 0;
        int size = 0;
        while(node != null){
            size++;
            node=node.next;
        }
        return size;
    }
    
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null) return null;
        
        ListNode one = headA;
        ListNode two = headB;
        
        int size1 = getSize(one);
        int size2 = getSize(two);
        
        if(size1 >= size2){
            for(int i = 0; i < size1 - size2; i++){
                one = one.next;
            }

        }else{
            for(int i = 0; i < size2 - size1; i++){
                two = two.next;
            }
        }
        
        ListNode temp = null;
        
        while(one != null && two != null){
            if(one.equals(two)) {
                if(temp == null){
                    temp = one;
                }
            }
            
            else temp = null;
            
            one = one.next;
            two = two.next;
        }
        return temp;
        
    }
}
