class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;
        int[][] result = new int[n][2];
        double prevTime = 0.0;
        for(int i=0;i<n;i++){
            result[i][0] = position[i];
            result[i][1] = speed[i]; 
        }
        Arrays.sort(result,(a,b)->a[0]-b[0]);
        Stack<Double> stack = new Stack<>();
        for(int i=n-1;i>=0;i--){
            double time = (double)(target-result[i][0])/result[i][1];
            if(stack.isEmpty() || time > stack.peek()){
                stack.push(time);
            }
        }
        return stack.size();        
    }
}
