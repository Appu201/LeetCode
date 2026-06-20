class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> m = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int comp=target-nums[i];
            if(m.containsKey(comp)){
                return new int[]{m.get(comp),i+1};
            }
            m.put(nums[i],i+1);
        }
        return new int[]{};
    }
}