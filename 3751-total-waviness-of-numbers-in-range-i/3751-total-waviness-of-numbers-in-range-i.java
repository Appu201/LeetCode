class Solution {
    private int waviness(int x) {
        String s=Integer.toString(x);
        int count=0;
        for(int i=1; i<s.length()-1; i++) {
            char c=s.charAt(i);
            if((c>s.charAt(i-1)&&c>s.charAt(i + 1)) || (c<s.charAt(i-1)&&c<s.charAt(i+1))){
                count++;
            }
        }
        return count;
    }

    public int totalWaviness(int num1, int num2) {
        int ans=0;
        for (int x=num1; x<=num2; x++) {
            ans+=waviness(x);
        }
        return ans;
    }
}