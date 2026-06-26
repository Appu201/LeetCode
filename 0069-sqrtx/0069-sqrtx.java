class Solution {
    public int mySqrt(int x) {
        if(x==0 || x==1) return x;
        int s=0;
        for(int i=1;i<=x/i;i++){
            if(i*i==x) return i;
            if(i*i<x) s=i;
            else break;
        }
        return s;
    }
}