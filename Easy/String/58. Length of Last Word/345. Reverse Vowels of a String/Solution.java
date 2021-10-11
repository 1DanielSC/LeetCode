class Solution {
  //Two pointer approach. One going from left to right and the other from right to left
    public String reverseVowels(String s) {
        
        char[] answer = new char[s.length()];
        
        int i = 0, j = s.length() - 1;
        
        while(i <= j){
           
            //One operation at a time  
          
            if(!isVowel(s.charAt(i))){
                answer[i] = s.charAt(i);
                i++;
            }
          
            else if(!isVowel(s.charAt(j))){
                answer[j] = s.charAt(j);
                j--;
            }
          
            //Both s.charAt(i) and s.charAt(j) are vowels then.
            else{
                answer[i] = s.charAt(j);
                answer[j] = s.charAt(i);
                i++;
                j--;
            }
        }
        
        return new String(answer);
    }
    
    public static boolean isVowel(char c){
        
        return (c == 'a') || (c == 'e') || (c == 'i') || (c == 'o') || (c == 'u') || 
        		(c == 'A') || (c == 'E') || (c == 'I') || (c == 'O') || (c == 'U');
    }
}
