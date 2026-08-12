class Solution {
    public int islandPerimeter(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        boolean[][] visited = new boolean[n][m];
        Queue<int[]> q = new LinkedList<>();
        outer:
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    q.offer(new int[]{i, j});
                    visited[i][j] = true;
                    break outer;               
                }
            }
        }
        int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1}};
        int perimiter = 0;
        while(!q.isEmpty()){
            int[] temp = q.poll();
            int r = temp[0];
            int c = temp[1];
            for(int i=0;i<4;i++){
                int nr = r + dirs[i][0];
                int nc = c + dirs[i][1];
                if(nr<0||nc<0||nr>=n||nc>=m){
                    perimiter++;
                }
                else if(grid[nr][nc]==0){
                    perimiter++;
                }
                else if(!visited[nr][nc]){
                   visited[nr][nc] = true;
                   q.add(new int[]{nr,nc});

                }
            }
        }
        return perimiter;
        
    }
}