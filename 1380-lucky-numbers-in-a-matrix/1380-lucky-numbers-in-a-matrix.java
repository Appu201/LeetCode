class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();

        int m=matrix.length;
        int n=matrix[0].length;
        int k=0;
        int rowMin;
        int colMax;
        while(k<m) {
            rowMin=Integer.MAX_VALUE;
            colMax=Integer.MIN_VALUE;
            int i=k;
            int q=0;
            for(int j=0; j<n; j++) {
                if(matrix[i][j]<rowMin) {
                    rowMin=matrix[i][j];
                    q=j;
                }
            }
            for(int p=0; p<m; p++) {
                colMax=Math.max(colMax, matrix[p][q]);
            }
            if(rowMin==colMax) {
                ans.add(rowMin);
            }
            k++;
        }
        return ans;
    }
}