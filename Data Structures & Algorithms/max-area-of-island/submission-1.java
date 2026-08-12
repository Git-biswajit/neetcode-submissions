class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int maxArea =0;
        int n = grid.length;
        int m = grid[0].length;
        boolean[][] visited = new boolean[n][m];
        int[][] dirs = {{0,1},{0,-1},{1,0},{-1,0}};
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1 && !visited[i][j]){
                    int area = bfs(grid,i,j,visited,dirs);
                    maxArea = Math.max(maxArea,area);
                }
            }
        }
        return maxArea;        
    }
    public int bfs(int[][] grid, int r,int c,boolean[][] visited,int[][] dirs){
        Queue<int[]> q = new LinkedList<>();
        int area=0;
        q.add(new int[]{r,c});
        visited[r][c]=true;              
        while(!q.isEmpty()){
            int[] temp = q.poll();
            int row = temp[0];
            int col = temp[1];
            area++;  
            for(int[] dir: dirs){
                int nr = row + dir[0];
                int nc = col + dir[1];
                if(nr>=0 && nc>=0 && nr<grid.length && nc<grid[0].length && grid[nr][nc]== 1 && !visited[nr][nc]){
                  visited[nr][nc] = true;
                  q.add(new int[]{nr,nc});

                }
            }
        }
        return area;
    }
}
