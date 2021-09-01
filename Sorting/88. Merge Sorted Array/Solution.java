class Solution {
  
    //WORST SOLUTION in terms of time complexity
    //I'll upload a more efficient solution as soon as possible
    
  
    //Time complexity: O(n^3)
    //Space complexity: O(1)
  
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        for(int i = 0; i < n;i++){ //for each element in nums2
            
            for(int j = 0; j < m + n; j++){ //we will find its proper position in nums1
                
                if(nums1[j] > nums2[i]){ //we will insert nums2[i] at position i and the number nums[j] will get shifted to the right
                    insert(nums1,nums2[i],m,j);
                    m++;
                    break;
                    
                }else if(nums1[j] == 0 && j >= m){
                    nums1[j] = nums2[i];
                    m++;
                    break;
                }
            }
            
        }
    }
    
    public void insert(int[] nums1, int number, int m, int position){
        
        int temp;
        
        for(int i = m; i > position;i--) //shifting all nums2 elements to the left from the position m-1 down to 'position'
            nums1[i] = nums1[i-1];
        
        nums1[position] = number; //inserting nums2 number in the proper position
    }
}
