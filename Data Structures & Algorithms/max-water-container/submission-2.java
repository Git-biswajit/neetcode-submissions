class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length;
        int right = n-1;
        int left = 0;
        int maxArea = Integer.MIN_VALUE;
        while(left<right){
            int height = Math.min(heights[left],heights[right]);
            int weidth = right - left;
            int area = height * weidth;
            maxArea = Math.max(area,maxArea);
            if(heights[left]>heights[right]){
                right--;
            }
            else{
                left++;
            }
        }
        return maxArea;        
    }
}
