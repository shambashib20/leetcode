class Solution {
    public boolean isValid(String s) {
        // We need a stack
        Stack<Character> st = new Stack<>();
        // iterate over all the character's available in the string
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            // if we find opening then put in the stack
            if(ch == '(' || ch == '{' || ch == '['){
                st.push(ch);
            }
            // if we find closing then there could be 3 condition's
            else if(ch == ')'){
                // if stack is empty return false
                if(st.isEmpty()) return false;
                // if the opening element we want is not equals to that present in stack return false 
                else if(st.peek() != '(') return false;
                // if it's the one we want pop it from stack
                else st.pop();
            }
            // similar for these as well
            else if(ch == ']'){
                if(st.isEmpty()) return false;
                else if(st.peek() != '[') return false;
                else st.pop();
            }
            else if(ch == '}'){
                if(st.isEmpty()) return false;
                else if(st.peek() != '{') return false;
                else st.pop();
            }
        }
        // once we have pop each and every element it's time to check, wether our stack is empty or not
        if(st.isEmpty()) return true; // if it's return true
        return false; // otherwise return false;
    }
}