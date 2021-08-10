class Solution {
    public int numIdenticalPairs(int[] nums) {
    
        //Improved solution using Hash table
            //Time complexity: O(n)
            //Space complexity: O(n)
        
        int num = 0;
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>(); //number to its frequency
        
        for(int i = 0;i<nums.length;i++){
            
            if(map.containsKey(nums[i])){
                //If a value is already present in 'map', then we need to increase its frequency by 1. 
                    //Therefore, we'll have k more possible combinations with the new value considered
                               //We have the number '2' with frequency 2. We have only one combination (i,j)
                               //If we find another number '2', then we'll increase its frequency to 3. 
                                    //We'll also increase the number of combinations (i,j) considering the new value.
                

                int k = map.get(nums[i]);
                map.remove(nums[i]);
                map.put(nums[i],k+1);
                
                //With the "new value" considered, we'll have k (prior frequency) more possible combinations
                num += k;
            }
            
            else
                map.put(nums[i],1);
                
        }
        
        return num;
    }
    
        //Brute force approach:
             //Time complexity: O(n^2)
             //Space complexity: O(1)
        /*
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
    
    */
}
