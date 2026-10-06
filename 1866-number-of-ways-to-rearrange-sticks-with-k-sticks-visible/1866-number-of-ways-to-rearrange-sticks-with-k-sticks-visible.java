class Solution {
    public int rearrangeSticks(int n, int k) {
        int mod=1000000007;
        int[][] dp=new int[n+1][k+1];

        dp[1][1]=1;

        for(int i=2;i<=n;i++){
            for(int j=1;j<=i&&j<=k;j++){
                long res=(long)(i-1)*dp[i-1][j];
                res=res%mod;
                res=(res+dp[i-1][j-1])%mod;

                dp[i][j]=(int)res;
            }
        }

        return dp[n][k];
    }
}