//https://leetcode.com/problems/remove-element/


public class leetcode_0027_00_remove_element {

	public int removeElement(int[] A, int elem) {
		int m = 0;
		for(int i = 0; i < A.length; i++) {
			if(A[i] != elem) {
				A[m++] = A[i];
			}
		}
		return m;
	}

}
