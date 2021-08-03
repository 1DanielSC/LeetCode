class Solution {
    public int numIdenticalPairs(int[] nums) {
        int num = 0;
        
        //we'll check every single possible pair (that's why it's a brute force) such that i < j and nums[i] == nums[j]
        for(int i = 0; i < nums.length; i++){
             
          
            //if i >= j, then the following loop won't start as it breaks the condition i < j
            for(int j =  nums.length - 1; j > i; j--){
                if(nums[i] == nums[j])
                    num++;
            } 
            
        }
        
        
        return num;
    }
    //Brute force approach:
        //Time complexity: O(n^2)
        //Space complexity: O(1)
}
