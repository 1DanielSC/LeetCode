
class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> finalList = new ArrayList<List<Integer>>();
        List<Integer> list = new ArrayList<Integer>();
        
        
        solve(finalList, list, nums);
        
        return finalList;
    }
    
    
    
    public static void solve(List<List<Integer>> finalList, List<Integer> list, int[] nums){
        
        if(list.size() == nums.length){
            finalList.add(new ArrayList(list)); //new list to not have problems with reference.
            return;
        }
            
        //Test each element from nums array --> nums[i]
        for(int i = 0; i < nums.length ; i++){
            
            //Verify if element is already present is the partial list (we don't want to have duplicated elements)
            if(!list.contains(nums[i])){
                
                list.add(nums[i]);
                solve(finalList, list, nums);
                list.remove(list.size()-1);
            }
        }
        
    }
    
    
    /*
    public static boolean solve(List<List<Integer>> finalList, List<Integer> list, int[] nums){
        
        if(list.size() == nums.length){
            finalList.add(list);
            return true;
        }
            
        //Test each element from nums array
        for(int i = 0; i < nums.length ; i++){
            
          //Verify if element is already present is the partial list (we don't want to have duplicated elements)
            if(!list.contains(nums[i])){
                
                List<Integer> list2 = new ArrayList<Integer>();
                list2.addAll(list);
                list2.add(nums[i]);
                
                solve(finalList, list2, nums);
                    
            }
        }
        
        return false;
    }
    */
}
