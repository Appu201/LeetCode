class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int arr[]=new int[nums.length];
        int idx=0;
        for(int i=0; i<nums.length; i++){
            int in=0;
            for(int j=0; j<nums.length; j++){
                if(nums[i]>nums[j]){
                    in++;
                }
            }
            arr[idx++]=in;
        }
        return arr;
    }
}