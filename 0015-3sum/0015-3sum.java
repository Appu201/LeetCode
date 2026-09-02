class Solution { 
    public List<List<Integer>> threeSum(int[] nums) { 
        ArrayList<List<Integer>> ans=new ArrayList<>(); 
        Arrays.sort(nums);
        
        for(int i=0; i<nums.length-2; i++){ 
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            
            int j=i+1;
            int k=nums.length-1;
            
            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];
                
                if(sum==0){
                    ArrayList<Integer> l=new ArrayList<>();
                    l.add(nums[i]);
                    l.add(nums[j]);
                    l.add(nums[k]);
                    ans.add(l);
                    
                    while(j<k && nums[j]==nums[j+1]){
                        j++;
                    }
                    
                    while(j<k && nums[k]==nums[k-1]){
                        k--;
                    }
                    
                    j++;
                    k--;
                }
                else if(sum<0){
                    j++;
                }
                else{
                    k--;
                }
            }
        }
        return ans;         
    }
}






















// class Solution {
//     public List<List<Integer>> threeSum(int[] nums) {
//         Set<List<Integer>> ans = new HashSet<>();
//         for (int i=0; i<nums.length; i++) {
//             for (int j=i+1; j<nums.length; j++) {
//                 for (int k=j+1; k<nums.length; k++) {
//                     if (nums[i]+nums[j]+nums[k] == 0) {
//                         ArrayList<Integer> l = new ArrayList<>();
//                         l.add(nums[i]);
//                         l.add(nums[j]);
//                         l.add(nums[k]);
//                         Collections.sort(l);
//                         ans.add(l);
//                     }
//                 }
//             }
//         }

//         return new ArrayList<>(ans);
//     }
// }