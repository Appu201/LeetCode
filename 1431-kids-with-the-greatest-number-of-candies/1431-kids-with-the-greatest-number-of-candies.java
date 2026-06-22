class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> list = new ArrayList<>();
        int max = Arrays.stream(candies).max().getAsInt();
        for(int i=0; i<candies.length; i++){
            int curr=candies[i]+extraCandies;
            if(curr>=max){
                list.add(true);
            }
            else{
                list.add(false);
            }
        }
        return list;
    }
}