import java.math.BigInteger;

class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        
        BigInteger num = BigInteger.ZERO;
        BigInteger ten = BigInteger.TEN;

        for (int i = 0; i < n; i++) {
            num = num.multiply(ten).add(BigInteger.valueOf(digits[i]));
        }

        num = num.add(BigInteger.ONE);

        String numString = num.toString();

        int[] digitsArray = new int[numString.length()];

        for (int i = 0; i < numString.length(); i++) {
            digitsArray[i] = Character.getNumericValue(numString.charAt(i));
        }

        return digitsArray;
    }
}
