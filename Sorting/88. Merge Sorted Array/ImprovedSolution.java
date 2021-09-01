class ImprovedSolution {
  
    //Time complexity: O(m+n)
    //Space complexity: O(m+n)
  
    //In a nutshell, all we need to do is create a ney array with length m+n and merge the two given arrays (nums1 and nums2)
  
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int[] temp = new int[m+n];
        
        int i = 0, j = 0,k=0;
        while(i < m && j < n){
            
            if(nums1[i] < nums2[j])
                temp[k++] = nums1[i++];  
            else
                temp[k++] = nums2[j++];

        }
        
        while(i < m)
            temp[k++] = nums1[i++];
        

        while(j < n)
            temp[k++] = nums2[j++];

        
        i=0;
        while(i<m+n)
            nums1[i] = temp[i++];
     
    }
    
}
