import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.io.IOException;
import java.util.HashSet;

public class codeforces_2022_08_01_B {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		for (int numCases = scanner.nextInt(); numCases > 0; --numCases) {
			int len = scanner.nextInt();
			int[] arr = new int[len];
			for (int i = 0; i < len; i++) {
				arr[len - 1 - i] = scanner.nextInt();
			}
			HashSet<Integer> set = new HashSet<Integer>();
			int ans = 0;
			for (int i = 0; i < len; i++) {
				if(!set.contains(arr[i])) {
					ans++;
					set.add(arr[i]);
				}
				else {
					break;
				}
			}
			writer.write((len - ans) + "\n");
		}
		writer.flush();
		scanner.close();
	}

}
