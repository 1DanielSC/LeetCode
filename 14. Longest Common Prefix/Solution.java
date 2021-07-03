class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        int size = strs[0].length();
        //The longest prefix we can get it's the smallest string
        for(int i = 0; i < strs.length;i++){
            if(strs[i].length() < size)
                size = strs[i].length();
        }
        
        boolean flag = true; 
        String a = "";
        for(int i = 0; i < size;i++){
            char c = strs[0].charAt(i);
            
            for(int j = 1; j < strs.length;j++){
                if(strs[j].charAt(i) != c)
                    flag = false;
            }
            if(flag)
                a += strs[0].charAt(i);
            else 
                break;
            
        }
        
        return a;
    }
}
