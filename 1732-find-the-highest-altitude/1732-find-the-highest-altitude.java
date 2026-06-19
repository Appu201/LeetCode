class Solution {
    public int largestAltitude(int[] gain) {
        int n=gain.length;
        int alt[] = new int[n+1];
        alt[0]=0;
        int idx=1;
        int sum=0;
        int max=0;
        for(int i=0; i<n; i++){
            sum+=gain[i];
            alt[idx]=sum;
            idx++;
            max=Math.max(max,sum);
        }
        return max;
    }
}