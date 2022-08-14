import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.ArrayList;

public class codeforces_2022_08_13_C {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		for (int numCases = scanner.nextInt(); numCases > 0; --numCases) {
			int len = scanner.nextInt();
			int[] arr = new int[len];
			HashMap<Integer, ArrayList<Integer>> map = new HashMap<Integer, ArrayList<Integer>>();
			for (int i = 0; i < len; i++) {
				arr[i] = scanner.nextInt();
				if (!map.containsKey(arr[i])) {
					map.put(arr[i], new ArrayList<Integer>());
				}
				map.get(arr[i]).add(i);
			}
			int curMax = Integer.MAX_VALUE;
			for (int i = len - 1; i >= 0; --i) {
				if(arr[i] == curMax) {
					continue;
				}
				int size = map.get(arr[i]).size();
				int firstIndex = map.get(arr[i]).get(0);
				int lastIndex = map.get(arr[i]).get(size - 1);
				if (arr[i] > curMax || size - 1 != lastIndex - firstIndex) {
					break;
				}
				map.remove(arr[i]);
				curMax = arr[i];
			}
			writer.write(map.size() + "\n");
		}
		writer.write("\n");
		writer.flush();
		scanner.close();
	}

}