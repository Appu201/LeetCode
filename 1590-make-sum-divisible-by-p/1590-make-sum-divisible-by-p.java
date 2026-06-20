class Solution {
    public int minSubarray(int[] nums, int p) {
        Map <Integer, Integer> m=new HashMap<>();
        m.put(0,-1);
        long sum=0, psum=0;
        int ans=nums.length;

        for(int num:nums){
            sum+=num;
        }

        int target=(int)(sum%p);
        if(target==0) return 0;

        for(int i=0; i<nums.length; i++){
            psum+=nums[i];

            int curr=(int)(psum%p);
            int need=(curr-target+p)%p;

            if(m.containsKey(need)){
                ans=Math.min(ans, i-m.get(need));
            }
            m.put(curr, i);
        }
        return ans==nums.length ? -1 : ans;
    }
}