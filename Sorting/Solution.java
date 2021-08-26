class Solution {
  
    //Time Complexity: O(n)
    //Space Complexity: O(n)
  
      //This solution below can still be improved: 
          //space complexity can be reduced to (1)
  
    public int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];
        
        int k=result.length-1,i=0,j=result.length-1;
        
        while(i <= j){
            if((nums[i]*nums[i]) > (nums[j]*nums[j])){
                result[k] = nums[i]*nums[i];
                i++;
            }
            else{
                result[k] = nums[j]*nums[j];
                j--;
            }
            
            k--;
        }
    
        
        return result;
    }
    
    public void swap(int[] nums, int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
