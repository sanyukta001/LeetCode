class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '(' || ch == '{' || ch == '[') stack.add(ch);
            else{
                if(stack.isEmpty())return false;
                char temp = stack.pop();
                if((ch == ')' && temp == '(') || (ch == ']' && temp == '[') || (ch == '}' && temp == '{'))
                    continue;
                else return false;
            }
        }
        if(stack.isEmpty())
            return true;
        else return false;
    }
}