import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.io.IOException;
import java.util.Arrays;
import java.util.ArrayList;
 
public class codeforces_2022_08_01_D {
 
	public static int bound(String t, ArrayList<String> set, int cBound, ArrayList<ArrayList<Integer>> tracker) {
		ArrayList<Integer> temp = new ArrayList<Integer>();
		for (int r = Math.min(cBound + 10, t.length()); r > cBound; r--) {
			for (int l = cBound; l >= 0 && r - l <= 10; l--) {
				String sub = t.substring(l, r);
				int index = set.indexOf(sub);
				if (index != -1) {
					temp = new ArrayList<>(Arrays.asList(index + 1, l + 1));
					tracker.add(temp);
					return r;
				}
			}
		}
		return -1;
	}
 
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		for (int numCases = scanner.nextInt(); numCases > 0; --numCases) {
			String t = scanner.next();
			int setLen = scanner.nextInt();
			ArrayList<String> set = new ArrayList<String>();
			for (int i = 0; i < setLen; i++) {
				String s = scanner.next();
				set.add(s);
			}
			int bound = 0;
			ArrayList<ArrayList<Integer>> tracker = new ArrayList<ArrayList<Integer>>();
			while (bound < t.length() && bound != -1) {
				int newBound = bound(t, set, bound, tracker);
				bound = newBound;
			}
			if (bound == -1) {
				writer.write(bound + "\n");
			} else {
				writer.write(tracker.size() + "\n");
				for (int i = 0; i < tracker.size(); i++) {
					writer.write(String.format("%d %d\n", tracker.get(i).get(0), tracker.get(i).get(1)));
				}
			}
		}
		writer.flush();
		scanner.close();
	}
 
}