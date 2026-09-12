class Solution {
    public int orangesRotting(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int count =0;
        int fresh =0;
        Queue<int[]> queue = new LinkedList<>();
        int[][] dir ={{1,0},{-1,0},{0,1},{0,-1}};
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==2){
                queue.offer(new int[]{i,j});
                }
                if(grid[i][j]==1){
                    fresh++;
                }
            }
        }
        int minute = 0;
        while(!queue.isEmpty() && fresh>0){
            int sz = queue.size();

            for(int i=0;i<sz;i++){

            int[] temp = queue.poll();
            int r = temp[0];
            int c = temp[1];

            for(int[] d:dir){
                int nr = r + d[0];
                int nc = c + d[1];
                if(nr<0 || nr>=n || nc<0 || nc>=m || grid[nr][nc]!=1){
                    continue;
                }
                grid[nr][nc]=2;
                fresh--;
                queue.offer(new int[]{nr,nc});
            }

            }
            minute++;
        }
        return fresh==0?minute:-1;
    }
}
