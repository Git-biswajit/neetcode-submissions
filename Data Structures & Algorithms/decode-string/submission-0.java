class Solution {
    public String decodeString(String s) {
        Stack<StringBuilder> strStack = new Stack<>();
        Stack<Integer> numStack = new Stack<>();
        int currNum = 0;
         StringBuilder currStr = new StringBuilder();
         for (char ch : s.toCharArray()) {
            if(Character.isDigit(ch)){
                currNum = currNum*10 + (ch-'0');
            }
            else if(ch == '['){
                strStack.push(currStr);
                numStack.push(currNum);
                currNum =0;
                currStr = new StringBuilder();
            }
            else if(ch == ']'){
                int count = numStack.pop();
                StringBuilder sb = strStack.pop();
                for(int i=0;i<count;i++){
                    sb.append(currStr);
                }
                currStr = sb;
            }
            else{
                currStr.append(ch);
            }
         }
         return currStr.toString();
        
    }
}