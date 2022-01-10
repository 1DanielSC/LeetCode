class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> finalList = new ArrayList<List<Integer>>();
        List<Integer> list = new ArrayList<Integer>();
        
        solve(finalList,list,n,k,1);
        
        return finalList;
        
    }
    public void solve(List<List<Integer>> finalList, List<Integer> list, int n, int k, int start){
        //Check if it's a final solution
        if(k == 0){
            finalList.add(new ArrayList(list));
            return;
        }
        
        
        //Test each possible number not considering the previous numbers used (usage of "start")
        for(int i = start; i <= n; i++){
            
            //Avoid repeated and already used numbers by passing i+1 as an argument to "start" parameter
             list.add(i);
             solve(finalList,list,n,k-1,i+1);
             list.remove(list.size() - 1);
            
            
        }
        
        return;
    }
}
