class Solution {
  //Time Complexity: O(n)
  //Space Complexity: O(n)
    public int[] runningSum(int[] nums) {
        int[] sum = new int[nums.length];
        int totalSum = 0;
        
      //run through nums's array elements, get the value stored of each element and increase totalSum value.
      //sum[i] will be equal to the totalSum until num[i]
        for(int i = 0; i < nums.length; i++){
            totalSum += nums[i];
            sum[i] = totalSum;
        }
        
        
        return sum;
    }
}
