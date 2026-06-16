class Solution {
    public String processStr(String s) {
        String result="";
        if (s.matches("[*#%]+")) {
            return result;
        }
        char[] ch = s.toCharArray();
        for(int i=0; i<ch.length; i++){
            char c=ch[i];
            if (c=='*') {
                if (!result.isEmpty()) {
                    result=result.substring(0, result.length()-1);
                    }
                }
            else if(c=='#'){
                result+=result;
            }
            else if(c=='%'){
                result= new StringBuilder(result).reverse().toString();
            }
            else{
                result += c;
            }
        }
        return result;
    }
}