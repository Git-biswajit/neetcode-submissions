class Solution {
    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int count=0;
        int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1}};
        boolean[][] visited = new boolean[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]=='1' && !visited[i][j]){
                    count++;
                    bfs(grid,visited, i,j,dirs);
                }
            }
        }
        return count;        
    }
    public void bfs(char[][] grid,boolean[][] visited,int r,int c,int[][] dirs){
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{r,c});
        visited[r][c]= true;
        int n = grid.length;
        int m = grid[0].length;
        while(!q.isEmpty()){
            int[] temp = q.poll();
            int i = temp[0];
            int j = temp[1];
            for(int[] dir: dirs){
                int nr = i + dir[0];
                int nc = j + dir[1];
                if(nr>=0 && nc>=0 && nr<n && nc<m && grid[nr][nc]=='1' && !visited[nr][nc]){
                    visited[nr][nc]= true;
                    q.add(new int[]{nr,nc});
                }
            }                                                      
        }
    }
}
