class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int max1=1;
        for(int i=nums.length-1; i>=nums.length-3; i--){
            max1*=nums[i];
        }
        int max2= nums[0]*nums[1]*nums[nums.length-1];

        return Math.max(max1,max2);
    }
}