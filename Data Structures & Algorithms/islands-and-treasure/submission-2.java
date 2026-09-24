class Solution {
    public void islandsAndTreasure(int[][] grid) {
        int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1}};
        int n = grid.length;
        int m = grid[0].length;
        Queue<int[]> queue = new LinkedList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==0){
                queue.offer(new int[]{i,j});
                }
            }
        }
        while(!queue.isEmpty()){
            int[] temp = queue.poll();
            int r = temp[0];
            int c = temp[1];
            for(int[] dir: dirs){
                int nr = r + dir[0];
                int nc = c + dir[1];
                if(nr<0 || nc<0 || nr>=n || nc>=m || grid[nr][nc]==-1){
                    continue;
                }
                if(grid[nr][nc]==2147483647){
                   grid[nr][nc] = grid[r][c]+1;
                   queue.offer(new int[]{nr,nc});
                }
                

            }

        }


        
    }
}
