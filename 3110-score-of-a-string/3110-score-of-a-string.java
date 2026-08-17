class Solution {
    public int scoreOfString(String s) {
        int sum=0;
        for(int i=0; i<s.length()-1; i++){
            int d=s.charAt(i);
            int e=s.charAt(i+1);
            sum+=Math.abs(d-e);
        }
        return sum;
    }
}