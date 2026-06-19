import java.util.*;

class Solution {
    public int longestValidParentheses(String st) {
        Stack<Integer> s = new Stack<>();
        s.push(-1);
        int maxlen = 0;

        for (int i=0; i<st.length(); i++) {
            char c = st.charAt(i);

            if (c=='(') {
                s.push(i);
            } else {
                s.pop();
                if (s.isEmpty()) {
                    s.push(i);
                } else {
                    maxlen = Math.max(maxlen, i-s.peek());
                }
            }
        }
        return maxlen;
    }
}