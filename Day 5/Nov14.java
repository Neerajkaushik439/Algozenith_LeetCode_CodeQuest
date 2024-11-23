

class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        HashSet<Character> bag = new HashSet<>();
        
        int start=0;
        int maxlength=0;
        

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);  

            while(bag.contains(currentChar)){
                bag.remove(s.charAt(start));
                start++;
            }
            
            bag.add(currentChar);

            maxlength=Math.max(maxlength, i - start + 1);
        }

        
        

        return maxlength;
    }
}
