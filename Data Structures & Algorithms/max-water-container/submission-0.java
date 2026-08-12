class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length;
        int l=0;
        int r=n-1;
        int maxm =0;
        while(l<r){
            int h = Math.min(heights[l],heights[r]);
            int w = r-l;
            int area = h*w;
            maxm = Math.max(maxm,area);
            if(heights[l]<heights[r]){
                l++;
            }
            else{
                r--;
            }
            
        }
        return maxm;
        
    }
}
