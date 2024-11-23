import java.util.*;

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> quadruplets = new ArrayList<>();
        if (nums == null || nums.length < 4) return quadruplets;
        int n = nums.length;

        Arrays.sort(nums); // Sorting the array

        for (int i = 0; i < n - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue; // Avoid duplicates for nums[i]

            for (int j = i + 1; j < n - 2; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) continue; // Avoid duplicates for nums[j]

                int left = j + 1;
                int right = n - 1;

                while (left < right) {
                    // Use long to handle overflow in sum calculation
                    long sum = (long) nums[i] + nums[j] + nums[left] + nums[right];

                    if (sum > target) {
                        right--; // Decrease right pointer if sum is too large
                    } else if (sum < target) {
                        left++; // Increase left pointer if sum is too small
                    } else {
                        // Add quadruplet to result
                        quadruplets.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));

                        // Skip duplicates for left and right pointers
                        while (left < right && nums[left] == nums[left + 1]) left++;
                        while (left < right && nums[right] == nums[right - 1]) right--;

                        left++;
                        right--;
                    }
                }
            }
        }

        return quadruplets;
    }
}
