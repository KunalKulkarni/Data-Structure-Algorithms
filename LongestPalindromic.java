class Solution {
  public String longestPalindrome(String s) {
		// start from center and expand
		if (s == null || s.length() == 0)
			return "";
		int start = 0;
		int end = 0;

		for (int i = 0; i < s.length(); i++) {
			int l1 = findLengthOfPalindromic(s, i, i);
			int l2 = findLengthOfPalindromic(s, i, i + 1);
             System.out.println("L1--"+l1+" L2--"+l2);
			int len = Math.max(l1, l2);
			if (len > end - start) {
				start = i - (len - 1) / 2;
				end = i + len / 2;
			}
        System.out.println("Start--"+start+" End--"+end);
		}
		return s.substring(start, end+1);
	
    }
     private int findLengthOfPalindromic(String s, int left,int right)
	 {
		 while(left>=0&&right<s.length()&&s.charAt(right)==s.charAt(left))
		 {
             System.out.println(s.charAt(left)+" "+s.charAt(right));
			 left--;
			 right++;
             System.out.println(left+" "+right);
		 }
		 return right-left-1;
	 }
}

//Complexity - O(n^2)
