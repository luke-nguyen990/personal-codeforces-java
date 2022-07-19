
//https://codeforces.com/problemset/problem/1399/B

import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class codeforces_1399B {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		for(int numCases = scanner.nextInt(); numCases > 0; --numCases) {
			int length = scanner.nextInt();
			int[] A = new int[length];
			int[] B = new int[length];
			int min1 = Integer.MAX_VALUE;
			int min2 = Integer.MAX_VALUE;
			for(int i = 0; i < length; i++) {
				A[i] = scanner.nextInt();
				min1 = Math.min(min1, A[i]);
			}
			for(int i = 0; i < length; i++) {
				B[i] = scanner.nextInt();
				min2 = Math.min(min2, B[i]);
			}
			long ans = 0;
			for(int i = 0; i < length; i++) {
				int diff1 = A[i] - min1;
				int diff2 = B[i] - min2;
				ans += Math.max(diff1, diff2);
			}
			writer.write(ans + "\n");
		}
		writer.flush();
		scanner.close();
	}

}
