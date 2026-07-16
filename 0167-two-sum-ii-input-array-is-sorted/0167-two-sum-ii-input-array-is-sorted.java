class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int start=0;
        int end=numbers.length-1;
        while(start<end){
            int sum=numbers[start]+numbers[end];
            if(sum==target){
                return new int[]{start+1, end+1};
            }
            else if(sum<target){
                start++;
            }
            else{
                end--;
            }
        }
        return new int[]{-1,-1};
    }
}
// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         Map<Integer, Integer> m = new HashMap<>();
//         for(int i=0; i<nums.length; i++){
//             int comp=target-nums[i];
//             if(m.containsKey(comp)){
//                 return new int[]{m.get(comp),i+1};
//             }
//             m.put(nums[i],i+1);
//         }
//         return new int[]{};
//     }
// }