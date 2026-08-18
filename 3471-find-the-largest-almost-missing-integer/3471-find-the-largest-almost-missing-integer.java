class Solution {
    public int largestInteger(int[] nums, int k) {
        int n=nums.length;
        if (k==1) {
            int ans=-1;
            for (int i=0; i<n; i++) {
                int count=0;
                for (int j=0; j<n; j++) {
                    if (nums[i]==nums[j]) {
                        count++;
                    }
                }
                if(count==1) {
                    ans=Math.max(ans, nums[i]);
                }
            }
            return ans;
        }

        if (k==n) {
            int ans=nums[0];
            for (int num:nums) {
                ans=Math.max(ans, num);
            }
            return ans;
        }

        
        int first=nums[0];
        int last=nums[n-1];
        int firstCnt=0;
        int lastCnt=0;
        for (int num:nums) {
            if (num==first) {
                firstCnt++;
            }
            if (num==last) {
                lastCnt++;
            }
        }
        int ans=-1;
        if (firstCnt==1) {
            ans=Math.max(ans, first);
        }
        if (lastCnt==1) {
            ans=Math.max(ans, last);
        }
        return ans;
    }
}