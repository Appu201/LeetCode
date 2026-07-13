class Solution {
    public static boolean isVowel(char ch) {
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
            return true;
        }
        return false;
    }

    public String reverseVowels(String s) {
        char c[] = s.toCharArray();
        int l = 0, r = s.length() - 1;

        while(l < r) {
            if(!isVowel(c[l])) {
                l++;
            }
            else if(!isVowel(c[r])) {
                r--;
            }
            else {
                char temp = c[l];
                c[l] = c[r];
                c[r] = temp;
                l++;
                r--;
            }
        }

        return new String(c);
    }
}