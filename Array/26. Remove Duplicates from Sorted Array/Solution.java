class Solution {
    //Time Complexity: O(n)
    //Space Complexity: O(1) --> We are not allocating extra memory to solve this problem, i.e., we are using the existing array to solve it.
  
    //Two pointers approach
  
    //The fast pointer will be responsible for identifying repetitive ordered numbers in the existing array.
        //If this pointer identifies a repetitive number, it will go for the next one. Otherwise, it will get nums[fast] and insert it at nums[++slow].
    
    //The slow pointer will point to the last element that is not duplicate.
  
  
    public int removeDuplicates(int[] nums){
        if(nums.length <= 1)
            return nums.length;
        
        int slow = 0, fast = 1;

        while(fast < nums.length){
            if(nums[slow] == nums[fast])
                fast++;
            else
                nums[++slow] = nums[fast++];
        }
        
        return slow+1; //Slow started the counting at 0
    }
}  
