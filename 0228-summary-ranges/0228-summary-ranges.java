class Solution {
    public List<String> summaryRanges(int[] nums) {
        ArrayList<String> l = new ArrayList<>();
        if (nums.length==0) return l;
        int temp=nums[0];
        for (int i=1; i<nums.length; i++) {
            if (nums[i]!=nums[i-1]+1) {
                if(temp==nums[i-1]) {
                    l.add(String.valueOf(temp));
                } 
                else{
                    l.add(temp+"->"+nums[i-1]);
                }
                temp=nums[i];
            }
        }
        if (temp==nums[nums.length-1]) {
            l.add(String.valueOf(temp));
        } 
        else {
            l.add(temp+"->"+nums[nums.length-1]);
        }
        return l;
    }
}