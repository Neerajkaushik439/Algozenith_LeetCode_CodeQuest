class Solution {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> listOfLists = new ArrayList<>();
        ArrayList<Integer> prev = new ArrayList<>();
        prev.add(1);
        listOfLists.add(prev);


        for (int i = 0; i < numRows-1; i++) {
            ArrayList<Integer> curr = new ArrayList<>();
            curr.add(1);

            for (int j = 0; j < prev.size() - 1; j++) {
                int temp = prev.get(j) + prev.get(j + 1);
                curr.add(temp);
            }

            curr.add(1);
            listOfLists.add(curr);

            prev = curr;
        }

        return listOfLists;
    }
}
