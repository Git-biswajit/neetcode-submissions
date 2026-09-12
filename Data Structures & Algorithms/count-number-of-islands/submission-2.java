class Solution {
    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int count=0;
        Queue<int[]> q = new LinkedList<>();
        int[][] dir = {{1,0},{-1,0},{0,1},{0,-1}};
        boolean[][] visited = new boolean[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(!visited[i][j] && grid[i][j]=='1'){
                   count++;
                   visited[i][j] = true;
                   q.offer(new int[]{i,j});
                   while(!q.isEmpty()){
                    int[] cur = q.poll();
                    int r = cur[0];
                    int c = cur[1];
                    for(int[] d:dir){
                        int nr = r + d[0];
                        int nc = c + d[1];
                    if(nr>=0 && nr<n && nc>=0 && nc<m && !visited[nr][nc] && grid[nr][nc]=='1'){
                        visited[nr][nc]=true;
                        q.offer(new int[]{nr,nc});
                    }
                    }
                   }
                }
            }

        }
        return count;

        }        
    }

