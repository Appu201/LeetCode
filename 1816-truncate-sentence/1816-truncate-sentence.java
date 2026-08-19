class Solution {
    public String truncateSentence(String s, int k) {
        String[] str=s.split(" ");
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<k-1;i++){
            ans.append(str[i] +" ");
        }
        ans.append(str[k-1]); 
        return ans.toString();
    }
}