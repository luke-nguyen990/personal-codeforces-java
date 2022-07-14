//https://leetcode.com/problems/length-of-last-word/

public class leetcode_0058_00_length_of_last_word {

	public int lengthOfLastWord(String s) {
		int ans = 0;
		for (int i = s.length() - 1; i >= 0; i--) {
			if (s.charAt(i) != ' ') {
				ans++;
			} else if (s.charAt(i) == ' ' && ans != 0) {
				return ans;
			}
		}
		return ans;
	}

}
