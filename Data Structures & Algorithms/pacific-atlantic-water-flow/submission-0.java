class Solution {
        int[][] dir = {{1, 0},{-1, 0},{0, 1},{0, -1}};
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int rows = heights.length;
        int cols = heights[0].length;
        boolean[][] atlantic = new boolean[rows][cols];
        boolean[][] pacific = new boolean[rows][cols];
        for(int c=0;c<cols;c++){
            dfs(heights,0,c,pacific);
        }
        for(int r=0;r<rows;r++){
            dfs(heights,r,0,pacific);
        }
        for(int c=0;c<cols;c++){
            dfs(heights,rows-1,c,atlantic);
        }
        for(int r=0;r<rows;r++){
            dfs(heights,r,cols-1,atlantic);
        }
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(atlantic[i][j] && pacific[i][j]){
                    ans.add(Arrays.asList(i, j));
                }
            }
        }
        return ans;

        
    }
    public void dfs(int[][] heights, int row,int col, boolean[][] visited){
        visited[row][col] = true;

        for (int[] d : dir) {

            int newRow = row + d[0];
            int newCol = col + d[1];

            if (newRow >= 0 &&
                newRow < heights.length &&
                newCol >= 0 &&
                newCol < heights[0].length &&
                !visited[newRow][newCol] &&
                heights[newRow][newCol] >= heights[row][col]) {

                dfs(heights, newRow, newCol, visited);
                }
        }
    }
}
