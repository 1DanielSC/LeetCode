class Solution {
  
    //Time Complexity: O(n logn)
    //Space Complexity: O(n)
  
    //Solution based on priority queue - min-heap
  
    public int[] sortArray(int[] nums) {
        PriorityQueue <Integer> pq = new  PriorityQueue <Integer>();
        int[] sorted = new int[nums.length];
        
        for(int i = 0; i < nums.length;i++){
            pq.add(nums[i]);
        }
        
        for(int i = 0; i < nums.length;i++){
            sorted[i] = pq.remove();
        }
        
        return sorted;
        
    }
}
