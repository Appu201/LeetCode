class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        Map <Integer, Integer> m=new HashMap<>();
        m.put(0,1);
        int sum=0, count=0;
        for(int num:nums){
            sum+=num;
            int rem=sum%k;
            if(rem<0) rem+=k;
            count+=m.getOrDefault(rem, 0);
            m.put(rem, m.getOrDefault(rem, 0)+1);
        }
        return count;
    }
}