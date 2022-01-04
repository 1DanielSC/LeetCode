class Solution {
  
  
  
    public boolean exist(char[][] board, String word) {
        return start(board, word);
    }
    
    
    
    public boolean start(char[][] board, String word){
        
      //Since we cannot repeat the same letter cell, we'll use a boolean 2D-array to avoid using the same letter cell more than once.
          //if visited == true, then we've already visited the letter cell. Otherwise, it is available for use.
        boolean[][] visited = new boolean[board.length][board[0].length];
        
      //Find the first letter of "word" in the board
        for(int i = 0; i < board.length;i++){
            for(int j = 0; j < board[0].length;j++){  
                if(board[i][j] == word.charAt(0) && find(board,visited,word,i,j,0))
                        return true; 
            }
        }
        
        return false;
    }

    public boolean find(char[][] board, boolean[][] visited, String word, int x, int y, int stringIndex){
        if(stringIndex == word.length())
            return true;
        
        if(x < 0 || y < 0 || x >= board.length || y >= board[0].length)
            return false;
        if(visited[x][y] || board[x][y] != word.charAt(stringIndex))
            return false;
        
        visited[x][y] = true;
        
        //As we are allowed to visit only horizontaly and vertically adjacent cells, we have only 4 possible, or less, lettler cells
            //Up, down, left and right to the current cell.
        if( fun(board,visited,word, x, y-1, stringIndex+1) ||
             fun(board,visited,word, x, y+1, stringIndex+1) ||
             fun(board,visited,word, x-1, y, stringIndex+1) ||
             fun(board,visited,word, x+1, y, stringIndex+1))
            return true;

        //We couldn't find the rest of "word" in the adjacent cells
          
        visited[x][y] = false;
        return false;
    }
    
    
}
