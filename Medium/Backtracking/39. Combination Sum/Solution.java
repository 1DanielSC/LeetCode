class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> finalList = new ArrayList<List<Integer>>();
        List<Integer> list = new ArrayList<Integer>();
        
        
        solve(finalList, list, candidates, target, 0);
        
        return finalList;
    }
    
 //The parameter "start" is used to avoid using the same numbers. As a result, we'll be avoiding the same combinations.
  
 //Besides that, we'll decrement "target" so as to not go over all the "list" array to check whether its summation gives the proper result or not.
  
    public static void solve(List<List<Integer>> finalList, List<Integer> list, int[] candidates, int target, int start){
        
        if(target == 0){
            finalList.add(new ArrayList(list));
            return;
        }
        
        for(int i = start; i < candidates.length; i++){
            
            if(target - candidates[i] >= 0){
                list.add(candidates[i]);
                solve(finalList, list, candidates, target - candidates[i], i);
                list.remove(list.size() - 1);
            }
            
            
        }
        
    }
}
