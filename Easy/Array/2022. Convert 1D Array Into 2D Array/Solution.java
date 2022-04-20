class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        
        if(original.length != n*m)
            return new int[0][0];
        
        
        int[][] list = new int[m][n];
  
        int col = 0;
        int row = 0;
        
        for(int i = 0; i < original.length; i++){
            list[row][col] = original[i];
            col++;
            if(col == n){
               col = 0;
               row++;
           }
        }
        
       
        return list;
    }
}
