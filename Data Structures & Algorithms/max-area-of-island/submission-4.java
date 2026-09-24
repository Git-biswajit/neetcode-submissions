class Solution {
    int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1}};
    public int maxAreaOfIsland(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int maxArea = Integer.MIN_VALUE;
        boolean[][] visited = new boolean[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                   if (!visited[i][j] && grid[i][j] == 1) {
                    int area = dfs(grid,visited,i,j);
                    maxArea = Math.max(maxArea,area);                    
                }
            }
        }
        return maxArea==Integer.MIN_VALUE?0:maxArea;        
    }
    public int dfs(int[][] grid,boolean[][] visited,int r,int c){
        if(r<0 || c<0 || r>=grid.length || c>=grid[0].length || visited[r][c] || grid[r][c]==0){
            return 0;
        }
        int count =1;
        visited[r][c]= true;
        for(int[] dir: dirs){
            int nr = r +dir[0];
            int nc = c +dir[1];
            count = count + dfs(grid,visited,nr,nc);
        }
        return count;
    }
}
