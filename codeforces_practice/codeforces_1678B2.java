
/**
 * @author luke_nguyen
 * @link https://codeforces.com/contest/1709/problem/E
 */

import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class codeforces_1678B2 {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		for (int numCases = scanner.nextInt(); numCases > 0; --numCases) {
			int len = scanner.nextInt();
			String s = scanner.next();
			int numSeg0 = 1;
			int numSeg1 = 1;
			int numChanges = 0;
			for (int i = 0; i < len / 2; i++) {
				int temp0 = numSeg0;
				int temp1 = numSeg1;
				if (s.charAt(i * 2) != s.charAt(i * 2 + 1)) {
					numChanges++;
					numSeg0 = Math.min(temp0, temp1 + 1);
					numSeg1 = Math.min(temp1, temp0 + 1);
				} else if (s.charAt(i * 2) == '0') {
					numSeg0 = Math.min(temp0, temp1 + 1);
					numSeg1 = len;
				} else {
					numSeg1 = Math.min(temp1, temp0 + 1);
					numSeg0 = len;
				}
			}
			writer.write(String.format("%d %d\n", numChanges, Math.min(numSeg0, numSeg1)));
		}
		scanner.close();
		writer.flush();
	}
}
