class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
       int n=heights.length;
       int a=0;

        String[] string =new String[n];
         for (int i = 0; i < n - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (heights[j] > heights[maxIndex]) {
                    maxIndex = j;
                }
            }

            int temp = heights[maxIndex];
            heights[maxIndex] = heights[i];
            heights[i] = temp;

            String temp2=names[maxIndex];
            names[maxIndex]=names[i];
            names[i]=temp2;

        }
        return names;
        
    }
}
