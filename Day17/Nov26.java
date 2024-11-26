import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> permute(int[] nums) {
        int n = nums.length;
        boolean[] isVisited = new boolean[n];
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        generatePermutations(nums, isVisited, list, ans);
        return ans;
    }

    private void generatePermutations(int[] nums, boolean[] isVisited, List<Integer> list, List<List<Integer>> ans) {
        if (list.size() == nums.length) {
            ans.add(new ArrayList<>(list)); // Add a copy of the list to prevent modification issues
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (!isVisited[i]) {
                list.add(nums[i]);
                isVisited[i] = true;
                generatePermutations(nums, isVisited, list, ans);
                isVisited[i] = false; // Backtrack
                list.remove(list.size() - 1); // Remove the last element for backtracking
            }
        }
    }
}
