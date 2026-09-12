class Solution {
    public void islandsAndTreasure(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[][] dir = {{0,1},{0,-1},{1,0},{-1,0}};
        Queue<int[]> q = new LinkedList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==0){
                    q.offer(new int[]{i,j});
                }
            }
        } 
        while(!q.isEmpty()){
            int[] curr = q.poll();
            int r = curr[0];
            int c = curr[1];
            int count =0;
            for(int[] d:dir){
                int nr = r + d[0];
                int nc = c + d[1];
                if(nr<0 || nr>=n || nc<0 || nc>=m){
                    continue;
                }
                if(grid[nr][nc]==2147483647){
                    grid[nr][nc] = grid[r][c] +1;
                    q.offer(new int[]{nr,nc});
                }             
            }
        }       
    }
}
