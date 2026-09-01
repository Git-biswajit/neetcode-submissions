class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        int a =0;
        int b =0;
        for(int i=0;i<tokens.length;i++){
            if(tokens[i].equals("+")){
                 a = stack.pop();
                 b = stack.pop();
                stack.push(a+b);
            }
            else if(tokens[i].equals("*")){
                 b = stack.pop();
                 a = stack.pop();
                stack.push(a*b);
            }
            else if(tokens[i].equals("/")){
                 b = stack.pop();
                 a = stack.pop();
                stack.push(a/b);
            }
            else if(tokens[i].equals("-")){
                 b = stack.pop();
                 a = stack.pop();
                stack.push(a-b);
            }
            else{
                stack.push(Integer.parseInt(tokens[i]));
            }
        }
        return stack.pop();        
    }
}
