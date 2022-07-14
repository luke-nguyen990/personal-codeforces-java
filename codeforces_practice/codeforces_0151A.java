//https://codeforces.com/problemset/problem/151/A

import java.util.Scanner;
import java.util.Arrays;

public class codeforces_0151A {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt(), k = scanner.nextInt(), l = scanner.nextInt(), c = scanner.nextInt();
		int d = scanner.nextInt(), p = scanner.nextInt(), nl = scanner.nextInt(), np = scanner.nextInt();
		int[] arr = new int[3];
		arr[0] = (k * l) / nl;
		arr[1] = c * d;
		arr[2] = p / np;
		Arrays.sort(arr);
		System.out.println(arr[0] / n);
		scanner.close();
	}

}
