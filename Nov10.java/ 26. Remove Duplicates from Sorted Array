class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int i = 0; // Pointer for the next unique element
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++; // Move to the next position
                nums[i] = nums[j]; // Write the unique element
            }
        }
        return i + 1; // Number of unique elements (i is the index of the last unique element)
    }
}
