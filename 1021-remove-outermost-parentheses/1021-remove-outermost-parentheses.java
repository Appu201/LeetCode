class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> b = new Stack<>();
        StringBuilder sb = new StringBuilder("");
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                if(b.size()>0){
                    sb.append(s.charAt(i));
                }
                b.push(s.charAt(i));
            }
            else{
                b.pop();
                if(b.size()>0){
                    sb.append(s.charAt(i));
                }
            }
        }
        return sb.toString();
    }
}