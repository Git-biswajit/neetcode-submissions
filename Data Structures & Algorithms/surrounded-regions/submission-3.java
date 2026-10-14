class Solution {
    int[][] dirs = {{0,1},{0,-1},{1,0},{-1,0}};
    public void solve(char[][] board) {
        int n = board.length;
        int m = board[0].length;
        for(int i=0; i<m;i++){
            dfs(board,0,i);
        }
        for(int i=0; i<n;i++){
            dfs(board,i,m-1);
        }
        for(int i=0; i<m;i++){
            dfs(board,n-1,i);
        }
        for(int i=0; i<n;i++){
            dfs(board,i,0);
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(board[i][j]=='O'){
                    board[i][j] = 'X';
                }
                else if(board[i][j]=='T'){
                   board[i][j] = 'O'; 
                }
            }
        }
        
                
    }
    public void dfs(char[][] board,int r, int c){
        if(r<0 || r>=board.length || c<0 || c>=board[0].length){
            return;
        }
        if(board[r][c]!='O'){
            return;
        }
        board[r][c] = 'T';
        for(int[] dir : dirs){
            int nr = r + dir[0];
            int nc = c + dir[1];
            dfs(board,nr,nc);
        }

    }
}
