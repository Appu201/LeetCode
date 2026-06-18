class Solution {
    public boolean isValid(String st) {
        Stack<Character> s = new Stack<>();
        for(int i=0; i<st.length(); i++){
            char c = st.charAt(i);
            if(c=='('||c=='{'||c=='['){
                s.push(c);
            }
            else if(c==')'||c=='}'||c==']'){
                if(s.isEmpty()){
                    return false;
                }
                char top = s.peek();
                s.pop();
                
                if(top=='('&&c!=')') return false;
                if(top=='{'&&c!='}') return false;
                if(top=='['&&c!=']') return false;
            }

        }
        if(!s.isEmpty()){
            return false;
        }
        return true;
    }
}