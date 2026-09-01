class Solution { 
    public int countOfSubstrings(String word, int k) { 
        int count=0; 
        for(int i=0; i<word.length(); i++) { 
            HashSet<Character> set=new HashSet<>(); 
            int consonants=0;
            for(int j=i; j<word.length(); j++){ 
                char ch=word.charAt(j); 
                if(ch!='a'&&ch!='e'&&ch!='i'&&ch!='o'&&ch!='u') { 
                    consonants++;
                }
                else{
                    set.add(ch);
                }
            
                if(consonants>k) {
                    break;
                }
                if(set.size()==5&&consonants==k) { 
                    count++; 
                } 
            } 
        } 
        return count; 
    } 
}