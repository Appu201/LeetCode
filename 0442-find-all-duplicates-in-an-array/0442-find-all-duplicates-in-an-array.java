class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> l=new ArrayList<>();
        int freq[]=new int[1000000];
        for(int n:nums){
            freq[n]++;
        }
        for(int i=0; i<freq.length; i++){
            if(freq[i]==2){
                l.add(i);
            }
        }
        return l;
    }
}