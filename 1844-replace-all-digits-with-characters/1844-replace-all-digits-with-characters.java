class Solution {
    public String replaceDigits(String s) {
        String res="";
        char[] c={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isLetter(ch)){
                res=res+ch;
            }
            else{
                String dup=ch+"";
                int d=Integer.parseInt(dup);
                char pre=s.charAt(i-1);
                int index=pre-'a';
                char add=c[index+d];
                res=res+add;
            }
        }
        return res;
    }
}