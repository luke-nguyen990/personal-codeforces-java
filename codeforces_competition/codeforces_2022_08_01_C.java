import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.io.IOException;
 
public class codeforces_2022_08_01_C {
 
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		for (int numCases = scanner.nextInt(); numCases > 0; --numCases) {
			int n = scanner.nextInt();
			String ans = "";
			int prev = 10;
			while (n > 0) {
				int sub = Math.min(n, prev - 1);
				ans =  String.valueOf(sub) + ans;
				n -= sub;
				prev--;
			}
			writer.write(ans + "\n");
		}
		writer.flush();
		scanner.close();
	}
 
}