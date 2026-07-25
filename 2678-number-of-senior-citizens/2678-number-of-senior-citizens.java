class Solution {
    public int countSeniors(String[] details) {
        int count=0;
        for(String s:details){
            String d="";
            for(int i=s.length()-4; i<s.length()-2; i++){
                d+=s.charAt(i);
            }
            int dig=Integer.valueOf(d);
            if(dig>60){
                count++;
            }
        }
        return count;
    }
}