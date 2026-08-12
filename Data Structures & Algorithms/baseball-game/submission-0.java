class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        int n = operations.length;
        for(int i=0;i<n;i++){
            if(operations[i].equals("+")){
             int top = stack.pop();
             int newElement = top + stack.peek();
             stack.push(top);
             stack.push(newElement);
            }
            else if(operations[i].equals("D")){
                int top = stack.peek();
                int newElement = top*2;
                stack.push(newElement);
            }
            else if(operations[i].equals("C")){
                stack.pop();
            }
            else{
                stack.push(Integer.parseInt(operations[i]));
            }
        }
        int sum =0;
        int st = stack.size();
        for(int i=0;i<st;i++){
            sum = sum+stack.pop();
        }
        return sum;        
    }
}