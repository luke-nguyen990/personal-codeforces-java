package codeforces_2022_10;

/**
 * @author luke_nguyen
 * @link https://codeforces.com/contest/1709/problem/D
 */

import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class codeforces_1709D {

	public static int getParent(int x) {
		return x % 2 == 0 ? x / 2 - 1 : x / 2;
	}

	public static int queryMax(int l, int r, int[] arr, int ceilPower2) {
		int ans = 0;
		for (l += ceilPower2 - 1, r += ceilPower2 - 1; r >= l; l = getParent(l), r = getParent(r)) {
			if (l == r) {
				return Math.max(ans, arr[l]);
			}
			if (l % 2 == 0) {
				ans = Math.max(ans, arr[l]);
				l++;
			}
			if (r % 2 == 1) {
				ans = Math.max(ans, arr[r]);
				r--;
			}
		}
		return ans;
	}

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = scanner.nextInt(), m = scanner.nextInt();
		int ceilPower2 = Integer.parseInt("1" + "0".repeat(Integer.toBinaryString(m).length()), 2);
		int sTLen = ceilPower2 - 1 + m;
		int[] sT = new int[sTLen];
		for (int i = ceilPower2 - 1; i < sTLen; i++) {
			sT[i] = scanner.nextInt();
		}
		for (int i = sT.length - 1; i >= 0; --i) {
			if (i % 2 == 0 && i / 2 > 0) {
				sT[i / 2 - 1] = Math.max(sT[i / 2 - 1], sT[i]);
			} else {
				sT[i / 2] = Math.max(sT[i / 2], sT[i]);
			}
		}
		for (int i = scanner.nextInt(); i > 0; --i) {
			int xs = scanner.nextInt(), ys = scanner.nextInt(), xf = scanner.nextInt(), yf = scanner.nextInt(),
					k = scanner.nextInt();
			if (Math.abs(xf - xs) % k != 0 || Math.abs(yf - ys) % k != 0) {
				writer.write("NO\n");
				continue;
			}
			int requiredHeight = queryMax(Math.min(ys, yf) - 1, Math.max(ys, yf) - 1, sT, ceilPower2);
			if (requiredHeight < Math.max(xs, xf)) {
				writer.write("YES\n");
			} else {
				requiredHeight += k - (((requiredHeight - Math.max(xs, xf)) % k));
				writer.write(requiredHeight <= n ? "YES\n" : "NO\n");
			}
		}
		writer.flush();
		scanner.close();
	}

}
