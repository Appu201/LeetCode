import java.util.*;

class Solution {
    public int evalRPN(String[] st) {
        Stack<Integer> s = new Stack<>();

        for (int i=0; i<st.length; i++) {
            String c=st[i];

            if (c.equals("+") || c.equals("-") || c.equals("*") || c.equals("/")) {
                int b=s.pop();
                int a=s.pop();

                if (c.equals("+")) s.push(a+b);
                else if (c.equals("-")) s.push(a-b);
                else if (c.equals("*")) s.push(a*b);
                else s.push(a/b);
            } 
            else {
                s.push(Integer.parseInt(c));
            }
        }
        return s.pop();
    }
}