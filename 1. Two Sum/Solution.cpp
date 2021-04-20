class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {

        int sum = 0;
        vector<int> vec(2);
      for(int i = 0; i < nums.size(); i++)  
        for(int j = 0; j < nums.size(); j++){
            sum = nums.at(i) + nums.at(j);
            if(sum == target && i != j){
                vec.at(0) = i;
                vec.at(1) = j;
                return vec;
            }
           
        } 
        
        return vec;
    }
};
