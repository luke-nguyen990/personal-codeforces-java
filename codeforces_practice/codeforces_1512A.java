//https://codeforces.com/problemset/problem/1512/A

import java.util.Scanner;
import java.util.Arrays;

public class codeforces_1512A {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		for (int numCase = scanner.nextInt(); numCase > 0; numCase--) {
			int length = scanner.nextInt();
			int[] arr = new int[length];
			int[] temp = new int[3];
			for (int i = 0; i < length; i++) {
				arr[i] = scanner.nextInt();
				if (i < 3) {
					temp[i] = arr[i];
				}
			}
			Arrays.sort(temp);			
			for(int i = 0; i < length; i++) {
				if(arr[i] != temp[1]) {
					System.out.println(i + 1);
					break;
				}
			}
		}
		scanner.close();
	}

}
