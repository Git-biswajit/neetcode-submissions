class Solution {
    public void solve(char[][] board) {
        int n = board.length;
        int m = board[0].length;
        for(int r=0;r<n;r++){
            dfs(board,r,0);
            dfs(board,r,m-1);
        }
        for(int c=0;c<m;c++){
            dfs(board,0,c);
            dfs(board,n-1,c);
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(board[i][j]=='O'){
                    board[i][j]='X';
                }
                else if(board[i][j]=='T'){
                    board[i][j] = 'O';
                }
            }
        }
                
    }
    public void dfs(char[][] board, int r , int c){
        int n = board.length;
        int m = board[0].length;
        if(r<0 || c<0 || r>=n || c>=m){
            return;
        }
        if(board[r][c]!='O'){
            return;
        }
        board[r][c] = 'T';
        dfs(board,r+1,c);
        dfs(board,r-1,c);
        dfs(board,r,c+1);
        dfs(board,r,c-1);   

    }
}
