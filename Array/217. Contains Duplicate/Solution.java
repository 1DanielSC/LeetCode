//Two solutions:


class Solution1 {
  
    //Time Complexity: O(n)
    //Space Complexity: O(n)
  
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i]))
                return true;
            else
                map.put(nums[i],i);
        }
        
        return false;
    }
}

class Solution2 {
  
    //Time Complexity: O(n log n)
    //Space Complexity: O(Space used by sorting algorithm)

    public boolean containsDuplicate(int[] nums) {
        
        Arrays.sort(nums);
        
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] == nums[i+ 1])
                return true;
        }
        
        return false;
    }
}
}
