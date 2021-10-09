//2 solutions for this problem:

//First solution

class Solution {
  
    //Time Complexity: O(n log n)
    //Space Complexity: O(n)
  
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans = new int[nums.length];
        
        int[] copy = new int[nums.length];

        for(int i = 0; i < copy.length;i++)
            copy[i] = nums[i];
        
        Arrays.sort(copy);
      
        //O(n log n)
            //We are performing the binary search n times
        for(int i = 0; i < nums.length; i++) 
            binarySearch(copy, nums[i], ans, i); 
        
        return ans;
    }
    
    
    public void binarySearch(int[] nums, int num, int[] ans, int index){
        int low = 0, mid = 0, high = nums.length - 1;
        
        while(low <= high){
            mid = (low + high)/2;
            
            if(num > nums[mid])
                low = mid + 1;
            
            else if(num < nums[mid])
                high = mid - 1;
            
            else if(low != mid) //We want to get the first occurance of the number "num" in the sorted array which is "copy"
                high = mid;
            
            else{ //Every element before the first occurance is less than "num"
                    //Then, "index" is the number of elements less than num
                ans[index] = low;
                return;
            }
        }
            
    }
}


//Second Solution

class Solution2 {
    //This solution is a Brute Force algorithm, 
     //We are going to compare each element of nums[] with all the others, except the case i = j
  
    //Time Complexity: O(n^2)
    //Space Complexity: O(1)
  
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans = new int[nums.length];
        int k = 0, num = 0;
        
        for(int i = 0 ; i < nums.length; i++){
            
            num = nums[i];
            
            for(int j = 0 ; j < nums.length; j++){
                if(num > nums[j] && i !=j)
                    k++;
            }
            
            ans[i] = k;
            k = 0;
        }
        
        return ans;
    }
}







