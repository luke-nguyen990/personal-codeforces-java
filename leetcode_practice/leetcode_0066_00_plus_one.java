//https://leetcode.com/problems/plus-one/submissions/

public class leetcode_0066_00_plus_one {

    public int[] plusOne(int[] digits) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int digit : digits) {
            min = Math.min(digit, min);
            max = Math.max(digit, max);
        }
        if(min == max && min == 9) {
            int[] ans = new int[digits.length + 1];
            ans[0] = 1;
            return ans;
        }
        for(int i = digits.length - 1; i >= 0; i--) {
            if(digits[i] == 9) {
                digits[i] = 0;
            }
            else{
                digits[i]++;
                break;
            }
        }
        return digits;
    }

}
