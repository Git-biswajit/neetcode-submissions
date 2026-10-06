class Solution {
    int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1}};
    public int numIslands(char[][] grid) {
    int n = grid.length;
    int m = grid[0].length;
    boolean[][] visited = new boolean[n][m];
    int count =0;
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            if(!visited[i][j] && grid[i][j]=='1'){
                dfs(grid,visited,i,j);
                count++;
            }
        }
    }  
    return count;      
}
public void dfs(char[][] grid,boolean[][] visited, int r, int c){
    if(r<0 || r>=grid.length || c<0 || c>=grid[0].length || visited[r][c] || grid[r][c]=='0'){
        return;
    }
    visited[r][c] = true;
    for(int[] dir:dirs){
        int nr = r + dir[0];
        int nc = c + dir[1];
        dfs(grid,visited,nr,nc);
    }
}
}
