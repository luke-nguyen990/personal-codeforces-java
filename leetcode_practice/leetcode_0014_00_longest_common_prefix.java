//https://leetcode.com/problems/longest-common-prefix/submissions/
public class leetcode_0014_00_longest_common_prefix {

	public String longestCommonPrefix(String[] strs) {
		if (strs.length == 0) {
			return "";
		}
		String pre = strs[0];
		for (int i = 1; i < strs.length; i++) {
			while (strs[i].indexOf(pre) != 0) {
				pre = pre.substring(0, pre.length() - 1);
			}
		}
		return pre;
	}
}
