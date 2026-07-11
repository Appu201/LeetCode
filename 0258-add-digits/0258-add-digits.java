class Solution {
    public int addDigits(int num) {
        int dig=0;
        while(num>=10){
            int sum=0;
            while(num!=0){
                dig=num%10;
                sum= sum+dig;
                num=num/10;
            }
            num=sum;
        }
        return num;
    }
}