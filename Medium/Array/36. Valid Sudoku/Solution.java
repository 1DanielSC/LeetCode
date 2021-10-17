class Solution {
  //For each valid cell, we'll call the three following functions: checkRow(), checkColumn() and checkSquare().
  //If one of them returns false, then the Sudoku is not valid.
  
    public boolean isValidSudoku(char[][] board) {
        
        for(int i = 0; i < board.length;i++){
            for(int j = 0; j < board[i].length;j++){
                if(board[i][j] != '.' && (!checkRow(board,i,j) || !checkColumn(board,i,j) || !checkSquare(board,i,j)))
                    return false;
            }
        }
        
        return true;
    }
                  
    public boolean checkRow(char[][] board, int row, int col){
        char temp = board[row][col];
        for(int i = 0; i < board[row].length;i++){
            if(i != col && board[row][i] == temp)
                return false;
        }
        return true;
    }
                   
    public boolean checkColumn(char[][] board, int row, int col){
        char temp = board[row][col];
        for(int i = 0; i < board.length;i++){
            if(i != row && board[i][col] == temp)
                return false;
        }
        return true;
    }
                   
                   
    public boolean checkSquare(char[][] board, int row, int col){
        int x, y;
        
        
        if(row >= 0 && row <= 2)
            x = 0;
        else if(row >= 3 && row <= 5)
            x = 3;
        else
            x = 6;
        
        if(col >= 0 && col <= 2)
            y = 0;
        else if(col >= 3 && col <= 5)
            y = 3;
        else
            y = 6;

      
        char temp = board[row][col];
        
        for(int i = x; i < x + 3; i++){
            for(int j = y; j < y + 3; j++){
                if(i != row && j != col && board[i][j] == temp)
                    return false;
            }
        }
        
        return true;
    }
}
