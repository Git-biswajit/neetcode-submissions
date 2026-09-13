class Solution {
    int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1}};
    public void solve(char[][] board) {
        int n = board.length;
        int m = board[0].length;
        for(int r=0;r<n;r++){
            dfs(board,r,0);
        }
        for(int r=0;r<n;r++){
            dfs(board,r,m-1);
        }
        for(int c=0;c<m;c++){
            dfs(board,0,c);
        }
        for(int c=0;c<m;c++){
            dfs(board,n-1,c);
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(board[i][j]=='O'){
                  board[i][j]='X';  
                }
                else if(board[i][j]=='T'){
                    board[i][j]='O';
                }
            }
        }
        
    }
    public void dfs(char[][] board,int r, int c){
    if(board[r][c] != 'O'){
        return;
    }
          board[r][c]= 'T';  
        
        for(int[] dir:dirs){
            int nr = r + dir[0];
            int nc = c + dir[1];
            if(nr<0 || nr>=board.length || nc<0 || nc>=board[0].length || board[nr][nc]!='O'){
                continue;
            }
            dfs(board,nr,nc);
        }

    }
}
