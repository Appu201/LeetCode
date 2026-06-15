class Solution {
    public String longestPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
		for(char c : s.toCharArray()) {
			sb.append("#").append(c);
		}
		sb.append("#");
		
		String s1 = sb.toString();
		int maxlen = 0, center = 0;
		int p[] = new int[s1.length()];
		
		for(int i = 0; i < s1.length(); i++) {
			int left = i - 1;
			int right = i + 1;
			
			while(left >= 0 && right < s1.length() && s1.charAt(left) == s1.charAt(right)) {
				p[i]++;
				left--;
				right++;
			}
			
			if(p[i] > maxlen) {
				maxlen = p[i];
				center = i;
			}
		}
		
		int start = (center - maxlen) / 2;
		return s.substring(start, start + maxlen);
    }
}