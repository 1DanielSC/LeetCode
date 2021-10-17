class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] answer = new int[2];
        answer[0] = binarySearchFirst(nums,target);
        answer[1] = binarySearchLast(nums,target);
        return answer;
        
    }
    
    public int binarySearchFirst(int[] nums, int target){
        
        int low = 0, high = nums.length - 1;
        int mid;
        
        while(low <= high){
            
            mid = (low + high)/2;
            
            if(target < nums[mid])
                high = mid - 1;
            else if(target > nums[mid])
                low = mid + 1;
            else if(low != mid)
                high = mid;
            else 
                return mid;
        }
        
        return -1;
        
    }
    public int binarySearchLast(int[] nums, int target){
        int low = 0, high = nums.length - 1;
        int result = -1;
        int mid;
        
        while(low <= high){
            
            mid = (low + high)/2;
            
            if(target < nums[mid])
                high = mid - 1;
            else if(target > nums[mid])
                low = mid + 1;
            else{
                result = mid;
                low = mid + 1;
            }
        }
        
        return result;
    }
}
