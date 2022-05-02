/*
Determine if a 9 x 9 Sudoku board is valid. Only the filled cells need to be validated according to the following rules:

Each row must contain the digits 1-9 without repetition.
Each column must contain the digits 1-9 without repetition.
Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition.
Note:

A Sudoku board (partially filled) could be valid but is not necessarily solvable.
Only the filled cells need to be validated according to the mentioned rules.
*/

class Solution {
    public boolean isValidSudoku(char[][] board) {
     
        for(int i=0;i<board.length;i++){
            ArrayList<Character> lis=new ArrayList<>();
            for(int j=0;j<board[0].length;j++){
                if(board[i][j] != '.' && lis.contains(board[i][j])){
                    return false;
                }else if(board[i][j] != '.'){
                    lis.add(board[i][j]);
                }
                
            }
        }
        
        for(int i=0;i<board[0].length;i++){
            ArrayList<Character> lis=new ArrayList<>();
            for(int j=0;j<board.length;j++){
                if(board[j][i] != '.' && lis.contains(board[j][i])){
                    return false;
                }else if(board[j][i] != '.'){
                    lis.add(board[j][i]);
                }
                
            }
        }
        
        int c=0;
        int l=0;
        int r=2;
        int t=0;
        int d=2;
        int count=0;
        
        while(count<9){
            ArrayList<Character> lis=new ArrayList<>();
            for(int i=l;i<=r;i++){
                for(int j=t;j<=d;j++){
                 if(board[i][j] != '.' && lis.contains(board[i][j])){
                    return false;
                }else if(board[i][j] != '.'){
                    lis.add(board[i][j]);
                }   
                }
            }
            
            if(c<=2){
                l+=3;
                r+=3;
                c++;
            }
            
            if(c==3){
                l=0;
                r=2;
                t+=3;
                d+=3;
                c=0;
            }
            count++;
        }
        
        return true;
    }
}
