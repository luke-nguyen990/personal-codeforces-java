
/**
 * @author luke_nguyen
 * @link https://codeforces.com/contest/1703/problem/F
 */

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.io.IOException;

public class codeforces_1703F {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		for (int numCases = scanner.nextInt(); numCases > 0; --numCases) {
			int length = scanner.nextInt();
			int[] nums = new int[length];
			int[] cumValid = new int[length];
			long ans = 0;
			for (int i = 0; i < length; i++) {
				int num = scanner.nextInt();
				nums[i] = num;
				if (i > 0) {
					cumValid[i] = cumValid[i - 1];
				}
				if (num < i + 1) {
					cumValid[i]++;
					if (num - 2 >= 0) {
						ans += cumValid[num - 2];
					}
				}
			}
			writer.write(ans + "\n");
		}
		writer.flush();
		scanner.close();
	}

}
