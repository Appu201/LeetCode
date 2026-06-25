class Solution {
    public int[] findDegrees(int[][] matrix) {
        int arr[]=new int[matrix.length];
        int idx=0;
        for(int ar[]:matrix){
            int sum=0;
            for(int i=0; i<ar.length;i++){
                sum+=ar[i];
            }
            arr[idx]=sum;
            idx++;
        }
        return arr;
    }
}