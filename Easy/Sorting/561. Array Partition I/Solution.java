class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int ans = 0;
        
        //Since the array nums[] is sorted, we only need to get the first element of every 2 subsequent elements.
            //The question wants the minimum between nums[i] and nums[i+1].
            //As the array is already sorted, it is assured that nums[i] is less or equal than nums[i+1]
        for(int i = 0; i < nums.length ; i = i+2)
            ans += nums[i];
        
        
        return ans;
    }
}
