class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        int n = s.length();
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(ch=='}'){
                if(!stack.isEmpty() && stack.peek()=='{'){
                    stack.pop();
                }
                else{
                    return false;
                }
            }
            else if(!stack.isEmpty() && ch==')'){
                if(stack.peek()=='('){
                    stack.pop();
                }
                else{
                    return false;
                }

            }
            else if(!stack.isEmpty() && ch==']'){
            if(stack.peek()=='['){
                    stack.pop();
                }
                else{
                    return false;
                }

            }
            else{
                stack.push(ch);
            }
        }
        if(!stack.isEmpty()){
            return false;
        }
        else{
            return true;
        }
                
    }
}
