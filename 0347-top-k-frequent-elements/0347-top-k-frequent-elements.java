class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int res[] = new int[k];
        Map<Integer, Integer> m = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            m.put(nums[i], m.getOrDefault(nums[i], 0) + 1);
        }
        for (int i = 0; i < k; i++) {
            int maxFreq = 0;
            int ans = 0;
            for (int key : m.keySet()) {
                if (m.get(key) > maxFreq) {
                    maxFreq = m.get(key);
                    ans = key;
                }
            }
            res[i] = ans;
            m.remove(ans);
        }
        return res;
    }
}