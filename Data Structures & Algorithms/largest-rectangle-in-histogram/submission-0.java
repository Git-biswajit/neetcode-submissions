class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int len =0;
        int height =0;
        int max = 0;
        int area =0;

        for(int i=0;i<=heights.length;i++){
            int num = (i==heights.length)?0:heights[i];
            while(!stack.isEmpty() && num<heights[stack.peek()]){
                int temp = stack.pop();
                len = stack.isEmpty()?i:i-stack.peek()-1;
                height = heights[temp];
                area = len*height;
                max = Math.max(area,max);
            }
            stack.push(i);
        }
        return max;
                     
    }
}
