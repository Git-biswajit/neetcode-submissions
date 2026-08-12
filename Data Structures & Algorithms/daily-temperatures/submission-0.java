class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<>();
        int n = temperatures.length;
        int i=0;
        int[] result = new int[n];
        while(i<n){
            while(!stack.isEmpty() && temperatures[i]>temperatures[stack.peek()]){
                int num = stack.pop();
                int prevIndex = i - num;
                result[num] = prevIndex;
            }
            stack.push(i);
            i++;
        }
        return result;

                
    }
}
