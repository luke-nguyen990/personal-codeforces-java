package codeforces_2022_10;
//https://codeforces.com/contest/1705/problem/A

import java.util.Scanner;
import java.util.Arrays;

public class codeforces_1705A {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		for (int numCases = scanner.nextInt(); numCases > 0; --numCases) {
			int n = scanner.nextInt(), x = scanner.nextInt();
			int[] arr = new int[n * 2];
			for (int i = 0; i < n * 2; i++) {
				arr[i] = scanner.nextInt();
			}
			Arrays.sort(arr);
			boolean sortable = true;
			for(int i = 0; i < n; i++) {
				if(arr[i] + x > arr[i + n]) {
					sortable = false;
					break;
				}
			}
			if(sortable) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
		}
		scanner.close();
	}

}
