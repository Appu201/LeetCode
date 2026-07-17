class Solution {
    public String reverseStr(String s, int k) {
        String ans="";
        StringBuilder str=new StringBuilder();
        int idx=0, a=0;
        while(idx<s.length()){
            int end = Math.min(idx + k, s.length());
            for(int i=idx; i<end; i++){
                str.append(s.charAt(i));
            }
            if(a%2==0){
                ans+=str.reverse();
            }
            else{
                ans+=str;
            }
            idx=idx+k;
            str.setLength(0);
            a++;
        }
        return ans.toString();
    }
}