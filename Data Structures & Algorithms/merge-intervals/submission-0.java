class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        List<int[]> list = new ArrayList<>();
        int[] erval = intervals[0];
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]<=erval[1]){
                erval[1] = Math.max(erval[1],intervals[i][1]);
            }
            else{
               list.add(erval);
               erval = intervals[i];
            }         
        }
        list.add(erval);
        return list.toArray(new int[list.size()][]);
        
    }
}
