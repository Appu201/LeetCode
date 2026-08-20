class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int ans[]=new int[nums.length];
        int size=0;
        for(int j=0; j<index.length; j++){
            int pos=index[j];
            for(int k=size; k>pos; k--){
                ans[k]=ans[k-1];
            }
            ans[pos]=nums[j];
            size++;
        }
        return ans;
    }
}