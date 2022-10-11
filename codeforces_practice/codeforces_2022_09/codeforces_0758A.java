package codeforces_2022_09;
//https://codeforces.com/problemset/problem/758/A

import java.lang.Math;
import java.util.Scanner;

public class codeforces_0758A {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int length = scanner.nextInt();
		int[] arr = new int[length];
		int maxElement = Integer.MIN_VALUE;
		for(int i = 0; i < length; i++) {
			arr[i] = scanner.nextInt();
			maxElement = Math.max(maxElement, arr[i]);
		}
		int ans = 0;		
		for(int i = 0; i < length; i++) {
			ans += maxElement - arr[i];
		}
		System.out.println(ans);
		scanner.close();
	}

}
