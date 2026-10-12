class Solution {
    int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1}};
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int n = heights.length;
        int m = heights[0].length;
        List<List<Integer>> result = new ArrayList<>();

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                boolean[][] visitedP = new boolean[n][m];
                boolean[][] visitedA = new boolean[n][m];
                if(isPacific(heights,i,j,visitedP) && isAtlantic(heights,i,j,visitedA)){
                  result.add(Arrays.asList(i, j));
                }
            }
        }
        return result;                
    }
    public boolean isPacific(int[][] heights,int r,int c,boolean[][] visited){
        if(r==0 || c==0){
            return true;
        }
        visited[r][c] = true;
        for(int[] dir:dirs){
            int nr = r + dir[0];
            int nc = c + dir[1];
            if(nr<0 || nr>=heights.length || nc<0 || nc>=heights[0].length || heights[nr][nc]>heights[r][c] || visited[nr][nc]){
               continue;
            }
            if(isPacific(heights,nr,nc,visited)){
                return true;
            }
          
        }
          return false;
    }
    public boolean isAtlantic(int[][] heights,int r,int c,boolean[][] visited){
         if(r==heights.length-1 || c==heights[0].length-1){
            return true;
        }
        visited[r][c] = true;
        for(int[] dir:dirs){
            int nr = r + dir[0];
            int nc = c + dir[1];
            if(nr<0 || nr>=heights.length || nc<0 || nc>=heights[0].length || heights[nr][nc]>heights[r][c] || visited[nr][nc]){
               continue;
            }
            if(isAtlantic(heights,nr,nc,visited)){
                return true;
            }
          
        }
          return false;
        
    }
}
