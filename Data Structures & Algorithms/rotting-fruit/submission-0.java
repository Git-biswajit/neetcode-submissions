class Solution {
    int[][] dir = {{1,0},{-1,0},{0,1},{0,-1}};
    public int orangesRotting(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int fresh =0;
        int minute =0;
        Queue<int[]> queue = new LinkedList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==2){
                    queue.offer(new int[]{i,j});
                }
                else if (grid[i][j] == 1) {
                    fresh++;
                }

            }        
        }
        if(fresh==0){
            return 0;
        }
        while(!queue.isEmpty() && fresh>0){
            int sz = queue.size();
            for(int i=0;i<sz;i++){
                int[] temp = queue.poll();
                for(int j =0;j<4;j++){
                    int newr = temp[0] + dir[j][0];
                    int newc = temp[1] + dir[j][1];
                    if(newc>=0 && newc<m && newr>=0 && newr<n && grid[newr][newc]==1){
                        grid[newr][newc]=2;
                        fresh--;
                        queue.offer(new int[]{newr, newc});
                    }
                }
               
            }
             minute++;
        }
        return fresh==0?minute:-1;
        
    }
}
