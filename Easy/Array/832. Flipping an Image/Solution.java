class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        
        solve(image);
        
        return image;
    }
  
    //Dica: Se o problema consiste em trocar os valores de posição e alterá-los, então é possível fazer isso ao mesmo tempo. 
          //Não será necessário ter dois loops n^2 para resolvê-lo.
  
    public static void solve(int[][] image){
        int init, last, temp;
       
        for(int row = 0; row < image.length; row++){
            init = 0;
            last = image.length - 1;

            while(init <= last){
                temp = 1-image[row][init];
                image[row][init] = 1-image[row][last];
                image[row][last] = temp;
                
                init++;
                last--;
            }

        }
    }
    
}
