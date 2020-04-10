class Solution {
    public int lengthOfLongestSubstring(String s) {
     
        int len=s.length();
        int result=0;
        Map<Character,Integer> charMap=new HashMap<>();
        for(int i=0,j=0;j<len;j++){
            if(charMap.containsKey(s.charAt(j))){
                i=Math.max(charMap.get(s.charAt(j)),i);
            }
            result=Math.max(result,j-i+1);
            charMap.put(s.charAt(j),j+1);
        }
        return result;
    }
}
// O(n)
