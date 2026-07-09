class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minLen = Integer.MAX_VALUE;
        int sum = 0;
        int ws = 0;
        for (int we=0; we<nums.length; we++) {
            sum+=nums[we];
            while (sum>=target) {
                minLen=Math.min(minLen, we - ws + 1);
                sum-=nums[ws];
                ws++;
            }
        }
        return minLen==Integer.MAX_VALUE?0:minLen;
    }
}