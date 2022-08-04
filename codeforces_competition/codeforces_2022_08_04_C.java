import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.ArrayList;

public class codeforces_2022_08_04_C {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = scanner.nextInt(), k = scanner.nextInt();
		ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
		for (int i = 0; i < n; i++) {
			list.add(new ArrayList<Integer>());
		}
		for (int i = 1; i <= (k + n) / 2; i++) {
			int mul = (k + 1) % i;
			for (int j = i * mul; j <= (k + n) / 2; j += i) {
				if (j >= k + 1 && j <= k + n) {
					list.get(j - (k + 1)).add(i);
				}
			}
		}
		int[] ans = new int[n + 1];
		ans[0] = 1;
		HashMap<Integer, Integer> counter = new HashMap<Integer, Integer>();
		counter.put(0, 1);
		for (int i = 0; i < n; i++) {
			HashMap<Integer, Integer> nextCounter = new HashMap<Integer, Integer>();
			for (int j = 0; j < n; j++) {

			}
			counter = nextCounter;
		}
		writer.write("\n");
		writer.flush();
		scanner.close();
	}

}