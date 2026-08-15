class Solution {
    int count;
    public int maxAreaOfIsland(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int maxArea = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    count=0;
                    dfs(grid,i,j);
                    maxArea = Math.max(maxArea,count);
                }
            }
        }
        return maxArea;        
    }
    public void dfs(int[][] grid, int row,int col){
        if(row<0 || col<0 || row>=grid.length || col>=grid[0].length || grid[row][col]==0){
            return;
        }
        grid[row][col]=0;
        count++;
        dfs(grid,row+1,col);
        dfs(grid,row-1,col);
        dfs(grid,row,col+1);
        dfs(grid,row,col-1);
    }
}
