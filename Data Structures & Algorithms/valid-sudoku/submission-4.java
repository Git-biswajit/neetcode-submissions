class Solution {
    public boolean isValidSudoku(char[][] board) {
        int n = board.length;
        int m = board[0].length;
        Set<String> set = new HashSet<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                char ch = board[i][j];
                if(ch=='.'){
                    continue;
                }
                String row = "row"+ch+i;
                String col = "col"+ch+j;
                String box = "box" + ch + ((i / 3) * 3 + (j / 3));
                if(set.contains(row)||set.contains(col)|| set.contains(box)){
                    return false;
                }
                set.add(row);
                set.add(col);
                set.add(box);
            }
        }
        return true;
    }
}
