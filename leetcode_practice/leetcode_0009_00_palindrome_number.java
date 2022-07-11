

public class leetcode_0009_00_palindrome_number {
	public boolean isPalindrome(int x) {
		if (x < 0) {
			return false;
		}
		int originalX = x;
		int reversedX = 0;
		while (x > 0) {
			reversedX = reversedX * 10 + x % 10;
			x /= 10;
		}
		return reversedX == originalX;
	}
}
