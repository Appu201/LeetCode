class Solution {
    public int[] countPoints(int[][] points, int[][] queries) {
        int n=queries.length;
        int ans[]=new int[n];
        int i=0;
        for(int q[]:queries){
            int a=q[0];
            int b=q[1];
            int c=q[2];
            int cnt=0;
            for(int p[]:points){
                int x=a-p[0];
                int y=b-p[1];
                if((x*x)+(y*y)<=c*c){
                    cnt++;
                }
            }
            ans[i++]=cnt;
        }
        return ans;
    }
}