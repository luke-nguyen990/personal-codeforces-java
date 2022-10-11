package codeforces_2022_10;
/**
 * @author luke_nguyen
 * @link https://codeforces.com/problemset/problem/1691/D
 */
 
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Stack;
 
public class codeforces_1691D {
 
	public static int getParent(int ind) {
		return ind % 2 == 0 ? ind / 2 - 1 : ind / 2;
	}
 
	public static long queryMax(int l, int r, int addLen, long[] maxST) {
		long ans = Long.MIN_VALUE;
		for (l += addLen, r += addLen; l <= r; l = getParent(l), r = getParent(r)) {
			if (l == r) {
				return Math.max(ans, maxST[l]);
			}
			if (l % 2 == 0) {
				ans = Math.max(ans, maxST[l]);
				l++;
			}
			if (r % 2 == 1) {
				ans = Math.max(ans, maxST[r]);
				r--;
			}
		}
		return ans;
	}
 
	public static boolean solve(long[] arr) {
		boolean ans = true;
		long[] suffixSum = new long[arr.length];
		suffixSum[arr.length - 1] = arr[arr.length - 1];
		for (int i = arr.length - 2; i >= 0; i--) {
			suffixSum[i] = arr[i] + suffixSum[i + 1];
		}
		int addLen = Integer.parseInt("1" + "0".repeat(Integer.toBinaryString(arr.length).length()), 2) - 1;
		if (addLen + 1 == arr.length << 1) {
			addLen = arr.length - 1;
		}
		int lenST = addLen + arr.length;
		long[] suffixMaxST = new long[lenST];
		for (int i = 0; i < lenST; i++) {
			suffixMaxST[i] = i >= addLen ? suffixSum[i - addLen] : Long.MIN_VALUE;
		}
		for (int i = lenST - 1; i > 0; i--) {
			int parentIndex = getParent(i);
			suffixMaxST[parentIndex] = Math.max(suffixMaxST[parentIndex], suffixMaxST[i]);
		}
		Stack<ArrayList<Long>> stack = new Stack<ArrayList<Long>>();
		for (int r = 0; r < arr.length; r++) {
			while (stack.size() != 0 && stack.peek().get(0) <= arr[r]) {
				stack.pop();
			}
			int l = stack.size() == 0 ? 0 : stack.peek().get(1).intValue() + 1;
			long maxSegment = queryMax(l, r, addLen, suffixMaxST);
			if (r < suffixSum.length - 1) {
				maxSegment -= suffixSum[r + 1];
			}
			if (maxSegment > arr[r]) {
				ans = false;
			}
			stack.add(new ArrayList<Long>(Arrays.asList(arr[r], Long.valueOf(r))));
		}
		return ans;
	}
 
	public static void reverseArray(long[] arr) {
		for (int i = 0; i < arr.length / 2; i++) {
			long temp = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = temp;
		}
	}
 
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		for (int numCases = scanner.nextInt(); numCases > 0; numCases--) {
			int length = scanner.nextInt();
			long[] arr = new long[length];
			for (int i = 0; i < length; i++) {
				arr[i] = scanner.nextLong();
			}
			boolean validL = solve(arr);
			reverseArray(arr);
			boolean validR = solve(arr);
			writer.write(validL & validR ? "YES\n" : "NO\n");
 
		}
		scanner.close();
		writer.flush();
	}
 
}