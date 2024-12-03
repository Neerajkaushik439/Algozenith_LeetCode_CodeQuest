import java.util.*;

class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> result = new ArrayList<>();
        if (s == null || words == null || words.length == 0) return result;

        int wordLen = words[0].length();
        int totalLen = wordLen * words.length;
        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        for (int i = 0; i < wordLen; i++) {
            Map<String, Integer> windowCount = new HashMap<>();
            int left = i, right = i, count = 0;

            while (right + wordLen <= s.length()) {
                String word = s.substring(right, right + wordLen);
                right += wordLen;

                if (wordCount.containsKey(word)) {
                    windowCount.put(word, windowCount.getOrDefault(word, 0) + 1);
                    if (windowCount.get(word).equals(wordCount.get(word))) count++;

                    while (windowCount.get(word) > wordCount.get(word)) {
                        String leftWord = s.substring(left, left + wordLen);
                        left += wordLen;
                        if (windowCount.get(leftWord).equals(wordCount.get(leftWord))) count--;
                        windowCount.put(leftWord, windowCount.get(leftWord) - 1);
                    }

                    if (count == wordCount.size()) result.add(left);
                } else {
                    windowCount.clear();
                    count = 0;
                    left = right;
                }
            }
        }
        return result;
    }
}
