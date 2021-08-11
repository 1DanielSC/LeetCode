class Solution {
  
    //Time complexity: O(n)
    //Space complexity: O(1)
    
    public String defangIPaddr(String address) {
        String temp = "";
        for(int i = 0; i < address.length();i++){
            if(address.charAt(i) == '.')
                temp = temp + "[.]";
            else
                temp = temp + address.charAt(i);
        }
        
        return temp;
    }
}
