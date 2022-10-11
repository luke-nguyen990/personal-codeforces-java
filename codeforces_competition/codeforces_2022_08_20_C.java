import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.IOException;

public class codeforces_2022_08_20_C {

	public static int getParent(int ind) {
		return ind % 2 == 0 ? ind / 2 - 1 : ind / 2;
	}

	public static long querySum(int l, int r, int addLen, long[] st) {
		long ans = 0;
		for (l += addLen, r += addLen; l <= r; l = getParent(l), r = getParent(r)) {
			if (l == r) {

			}
		}
		return ans;
	}

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = scanner.nextInt(), q = scanner.nextInt();
		int[] arr = new int[n];
		int[] ori = new int[n];
		int last = -1;
		for (int i = 0; i < n; i++) {
			int x = scanner.nextInt();
			if (i == 0)
				arr[0] = 1;
			else {
				arr[i] = arr[i - 1] + (x != last ? 1 : 0);
			}
			last = x;
			ori[i] = x;
		}
		int[] pre = new int[n];
		for (int i = 0; i < n; i++) {
			if (i == 0) {
				pre[i] = 1;
			} else {
				if (ori[i] != ori[i - 1]) {
					pre[i] = pre[i - 1] + i + 1;
				} else {
					pre[i] = pre[i - 1] + 1;
				}
			}
		}
		int addLen = Integer.parseInt("1" + "0".repeat(Integer.toBinaryString(n).length()), 2) - 1;
		if (addLen + 1 == n << 1) {
			addLen = n - 1;
		}
		int lenSt = addLen + n;
		int[] st = new int[lenSt];
		for (int i = 0; i < n; i++) {
			int index = addLen + i;
			st[index] = pre[i];
		}
		for (int i = lenSt - 1; i > 0; i--) {
			int parentInd = getParent(i);
			st[parentInd] += st[i];
		}
		int[] sumAll = new int[n];
		for (int i = 0; i < n; i++) {
			if(i == 0) {
				sumAll[i] = pre[i];
			}
			else {
				sumAll[i] = sumAll[i-1] + pre[i];
			}
		}
		for(int i : pre) writer.write(i + " ");
		writer.write("\n");
		for (int i : sumAll)
			writer.write(i + " ");
		writer.write("\n");
		for (int i = 0; i < q; i++) {
			int l = scanner.nextInt() - 1;
			int r = l + scanner.nextInt() - 1;
			if (l == 0) {
				writer.write(sumAll[r] + "\n");
			} else {
				writer.write((sumAll[r] - sumAll[l - 1]) + "\n");
			}
		}
		writer.flush();
		scanner.close();
	}

}