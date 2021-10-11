class Solution {
  
    //Time complexity: O(n)
    //Space complexity: O(1)
  
    public int lengthOfLastWord(String s) {
        int ans = 0;

	        
	    for(int i = s.length()-1; i > -1; i--) {
	    	if(s.charAt(i) != ' ')
	    		ans++;

	    	if(s.charAt(i) == ' ' && ans != 0)
	    		break;
	    }

        return ans;
    }
}
