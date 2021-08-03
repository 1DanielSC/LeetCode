class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int num = 0;
      
        //The Integer value won't be used.
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        
        //We'll add every character of jewels string in the hashmap that hasn't been inserted yet
        for(int i = 0;i<jewels.length();i++){
            if(!map.containsKey(jewels.charAt(i)))
                map.put(jewels.charAt(i),1);
        }
        
        //For every character in stones string, we'll check if it is present in the hashmap
        for(int i = 0; i < stones.length();i++){
            if(map.containsKey(stones.charAt(i)))
                num++;
        }
        
        return num;
        
    }
  
    //Time complexity: O(n)
    //Space complexity: O(n)
}
