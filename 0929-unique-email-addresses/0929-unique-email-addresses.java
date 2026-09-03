class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> set=new HashSet<>(); 
        for(String email:emails){
            String[] parts=email.split("@"); 
            String[] name=parts[0].split("\\+"); 
            set.add(name[0].replace(".", "")+"@"+parts[1]); 
        }
        return set.size();
    }
}