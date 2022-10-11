package codeforces_2022_09;
// https://codeforces.com/problemset/status?my=on
import java.util.Scanner;
import java.util.Arrays;

public class codeforces_1399A {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		for (int caseNum = scanner.nextInt(); caseNum > 0; caseNum--) {
			int length = scanner.nextInt();
			int[] arr = new int[length];
			for (int i = 0; i < length; i++) {
				arr[i] = scanner.nextInt();
			}
			Arrays.sort(arr);
			boolean valid = true;
			for (int i = 1; i < length; i++) {
				if (arr[i] > arr[i - 1] + 1) {
					valid = false;
					break;
				}
			}
			if (valid) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
		scanner.close();
	}

}
