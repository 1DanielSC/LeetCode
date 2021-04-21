class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> mapping = new HashMap<Integer,Integer>(); //number to index
	        
		int[] a = new int[2];
	
		for(int i = 0; i < nums.length;i++) {

			int num = nums[i];
			if(mapping.containsKey(target - nums[i])) {
				a[0] = mapping.remove(target - nums[i]);
				a[1] = i;
				return a;
			}else {
				mapping.put(nums[i],i);
			}
		}
		
	
		return a;
        
    }
    
}
