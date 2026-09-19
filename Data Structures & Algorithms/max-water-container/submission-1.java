class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length;
        int left =0;
        int right = n-1;
        int area = 0;
        int maxm = Integer.MIN_VALUE;
        while(left<right){
            int height = Math.min(heights[left],heights[right]);
            int weidth = right-left;
            area = height * weidth;
            maxm = Math.max(maxm,area);
            if(heights[left]>heights[right]){
                right--;
            }
            else{
                left++;
            }
            
        }
        return maxm;
    }
}
