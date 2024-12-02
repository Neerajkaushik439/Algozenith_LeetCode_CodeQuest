class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> ans = new ArrayList<>();
        int n = words.length;

        for (int i = 0; i < n; i++) {
            String temp = words[i];
            for (int j = 0; j < n; j++) {
                if (i != j && words[j].contains(temp)) {
                    if (!ans.contains(temp)) { 
                        ans.add(temp);
                    }
                    break; 
                }
            }
        }
        return ans;
    }

   
}
