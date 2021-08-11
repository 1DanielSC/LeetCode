class Solution {
  
    //Solution that modifies array in-place, i.e., without using extra memory
    //Time Complexity: O(n)
    //Space Complexity: O(1)
  
    public void reverseString(char[] s) {
        char temp;
        for(int i = 0,j=s.length - 1; i < (s.length)/2;i++,j--){
            temp = s[i];
            s[i] = s[j];
            s[j] = temp;
        }
            
    }
}
