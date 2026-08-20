class Solution {
    public boolean mergeTriplets(int[][] triplets, int[] target) {
        int n = triplets.length;
        int[] result = new int[3];
        for(int i=0;i<n;i++){
            if (triplets[i][0] > target[0] ||
                triplets[i][1] > target[1] ||
                triplets[i][2] > target[2]) {
                continue;
            }
            for(int j=0;j<3;j++){
                result[j] =Math.max(triplets[i][j],result[j]);
            }            
        }

        return result[0]==target[0]&&result[1]==target[1]&&result[2]==target[2];
        
    }
}
