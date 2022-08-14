import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.IOException;
 
public class codeforces_2022_08_13_A {
 
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		for (int numCases = scanner.nextInt(); numCases > 0; --numCases) {
			int n = scanner.nextInt(), k = scanner.nextInt();
			int counter = 0;
			for (int i = 0; i < n; i++) {
				int x = scanner.nextInt();
				if (i >= k && x <= k) {
					counter++;
				}
			}
			writer.write(counter + "\n");		}
		writer.flush();
		scanner.close();
	}
 
}