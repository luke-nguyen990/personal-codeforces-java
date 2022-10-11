import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.*;

public class codeforces_2022_08_16_D {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		for (int numCases = scanner.nextInt(); numCases > 0; --numCases) {
			int len = scanner.nextInt();
			int[] arr = new int[len];
			for (int i = 0; i < len; i++) {
				arr[i] = scanner.nextInt();
			}
			int ans = 0;
			HashSet<Integer> met = new HashSet<Integer>();
			met.add(0);
			for (int i = 1; i < len; i++) {
				if (met.contains(i - 1) || met.contains(i)) {
					continue;
				}
				if (arr[i] == arr[i - 1]) {
					ans += 1;
					met.add(i - 1);
					met.add(i);
				}
			}
			for (int i = 1; i < len - 1; i++) {
				if ((arr[i] ^ arr[i - 1] ^ arr[i + 1]) == 0) {
					if (arr[i] != 0 && arr[i - 1] != 0 && arr[i + 1] != 0) {
						if (!met.contains(i) && !met.contains(i - 1) && !met.contains(i + 1)) {
							ans += 2;
							met.add(i - 1);
							met.add(i);
							met.add(i + 1);
						}
					}
				}
			}
			for (int i = 0; i < len; i++) {
				if (arr[i] == 0)
					continue;
				if (!met.contains(i)) {
					if (arr[i] != 0) {
						ans++;
					}
				}
			}
			writer.write(ans + "\n");
		}
		writer.write("\n");
		writer.flush();
		scanner.close();
	}

}