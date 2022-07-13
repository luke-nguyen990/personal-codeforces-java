// https://leetcode.com/problems/remove-duplicates-from-sorted-array/submissions/

public class leetcode_0026_00_remove_duplicated_from_sorted_array {

	public int removeDuplicates(int[] nums) {
		int i = 0;
		for(int n : nums) {
			if(i == 0 || n > nums[i - 1]) {
				nums[i++] = n;
			}
		}
		return i;
    }

}
