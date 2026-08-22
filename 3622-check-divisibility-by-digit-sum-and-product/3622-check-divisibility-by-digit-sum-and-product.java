class Solution {
    public boolean checkDivisibility(int n) {
        int org=n;
        int sum=0;
        int prod=1;
        while(n>0){
            int d=n%10;
            sum+=d;
            prod*=d;
            n/=10;
        }
        int div=sum+prod;
        return org%div==0;
    }
}