
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
		long ans = 0;
		for (l += addLen, r += addLen; l <= r; l = getParent(l), r = getParent(r)) {
			if (l == r) {
				return maxST[l];
			} else if (l % 2 == 0) {
				ans = Math.max(ans, maxST[l]);
				l++;
			} else if (r % 2 == 1) {
				ans = Math.max(ans, maxST[r]);
				r--;
			}
		}
		return ans;
	}

	public static boolean solve(long[] arr) {
		boolean ans = true;
		long[] prefixSum = new long[arr.length];
		for (int i = 0; i < arr.length; i++) {
			if (i == 0) {
				prefixSum[0] = arr[0];
			} else {
				prefixSum[i] = arr[i] + prefixSum[i - 1];
			}
		}
		int addLen = Integer.parseInt("1" + "0".repeat(Integer.toBinaryString(arr.length).length()), 2) - 1;
		if (addLen + 1 == arr.length * 2) {
			addLen = arr.length - 1;
		}
		int lenST = addLen + arr.length;
		long[] prefixMaxST = new long[lenST];
		for (int i = 0; i < lenST; i++) {
			prefixMaxST[i] = i >= addLen ? prefixSum[i - addLen] : Long.MIN_VALUE;
		}
		for (int i = lenST - 1; i > 0; i--) {
			int parentIndex = i % 2 == 1 ? (i / 2) : (i / 2) - 1;
			prefixMaxST[parentIndex] = Math.max(prefixMaxST[parentIndex], prefixMaxST[i]);
		}
		System.out.print("Arr: ");
		for (long x : arr) {
			System.out.print(x + " ");
		}
		System.out.println();
		System.out.print("ST: ");
		for (long x : prefixMaxST) {
			System.out.print(x + " ");
		}
		System.out.println();
		Stack<ArrayList<Long>> stack = new Stack<ArrayList<Long>>();
		for (int i = 0; i < arr.length; i++) {
			while (stack.size() != 0 && stack.peek().get(0) <= arr[i]) {
				stack.pop();
			}

			int l = stack.size() == 0 ? 0 : stack.peek().get(1).intValue() + 1;
			long maxInSubSegment = queryMax(l, i, addLen, prefixMaxST);
			if (l > 0) {
				maxInSubSegment -= prefixSum[l - 1];
			}
//			System.out.print("Arr: ");
//			for (long d : arr) {
//				System.out.print(d + " ");
//			}
//			System.out.println();
//			System.out.print("ST: ");
//			for (long d : prefixMaxST) {
//				System.out.print(d + " ");
//			}
//			System.out.println();
//			System.out.println(String.format("max between %d and %d is: %d", l, i, maxInSubSegment));
//			System.out.println();
			if (maxInSubSegment > arr[i]) {
				return false;
			}
			stack.add(new ArrayList<Long>(Arrays.asList(arr[i], Long.valueOf(i))));
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
			writer.write("\n\n");
			int length = scanner.nextInt();
			long[] arr = new long[length];
			for (int i = 0; i < length; i++) {
				arr[i] = scanner.nextLong();
			}
			boolean valid = solve(arr);
//			for(long a : arr) {
//				writer.write(a + " ");
//			} writer.write("\n");
			reverseArray(arr);
//			for(long a : arr) {
//				writer.write(a + " ");
//			} writer.write("\n");
			valid &= solve(arr);
			writer.write(valid ? "YES\n" : "NO\n");
		}
		scanner.close();
		writer.flush();
	}

}
