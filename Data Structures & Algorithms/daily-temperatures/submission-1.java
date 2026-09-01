class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<temperatures.length;i++){
            int num = temperatures[i];
            while(!stack.isEmpty() && num>temperatures[stack.peek()]){
                int temp = stack.pop();
                result[temp] = i-temp;
            }
            stack.push(i);
        }  
        return result;        
    }
}
