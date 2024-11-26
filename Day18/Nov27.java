class Solution {
    public boolean checkValidGrid(int[][] grid) {
        int cr = 0;
        int cc = 0; 
        int num = 0; 

        return check(grid, num, cr, cc);
    }

    private static boolean check(int[][] grid, int num, int cr, int cc) {
        int n = grid.length;

        if (grid[cr][cc] == n * n - 1) {
            return true;
        }


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == num + 1) { 


                    if ((i == cr - 2 && j == cc + 1) || (i == cr - 2 && j == cc - 1) ||
                        (i == cr + 2 && j == cc + 1) || (i == cr + 2 && j == cc - 1) ||
                        (i == cr + 1 && j == cc + 2) || (i == cr - 1 && j == cc + 2) ||
                        (i == cr + 1 && j == cc - 2) || (i == cr - 1 && j == cc - 2)) {

                        if (check(grid, num + 1, i, j)) {
                            return true;
                        }
                    }
                }
            }
        }

        return false;
    }
}
