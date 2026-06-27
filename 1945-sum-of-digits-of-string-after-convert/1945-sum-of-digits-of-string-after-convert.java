class Solution {
    public int getLucky(String s, int k) {
        String num="";
        int sum=0;
        for(char ch:s.toCharArray()){
            num+=(ch-'a'+1);
        }
        while(k!=0){   
            sum=0;
            for(char ch:num.toCharArray()){
                sum+=ch-'0';
            }
            k--;
            num = String.valueOf(sum);
        }
        return sum;
    }
}