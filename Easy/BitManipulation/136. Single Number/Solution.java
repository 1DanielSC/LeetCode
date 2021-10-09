class Solution {
    //O(n) runtime solution without using extra memory space.
  
    public int singleNumber(int[] nums) {
        
        int num = 0;
        
        for(int i = 0; i < nums.length; i++)
            num ^= nums[i]; //XOR operator. It is not exponentiation (Math.pow(double,double))
        
        return num;
    }
}

/*
  The reason why this works is that the XOR-operation is both associative and commutative
  
  A xor A = 0
  A xor B xor A = (A xor A) xor B = 0 xor B = B

*/
