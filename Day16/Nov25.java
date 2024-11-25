class Solution {
    public String countAndSay(int n) {
        if (n == 1) {
            return "1";
        }

        String str = countAndSay(n - 1);
        int length = str.length();
        int count = 1;
        String ans = "";

        for (int i = 0; i < length; i++) {
            char temp = str.charAt(i);

            if (i == length - 1) {
                ans = ans + count + temp;
            } else if (str.charAt(i + 1) == temp) {
                count++;
            } else {
                ans = ans + count + temp;
                count = 1;
            }
        }

        return ans;
    }
}
