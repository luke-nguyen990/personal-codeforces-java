import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.IOException;
 
public class codeforces_2022_08_13_B {
 
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		for (int numCases = scanner.nextInt(); numCases > 0; --numCases) {
			int len = scanner.nextInt();
			if (len % 2 == 1) {
				writer.write("1 ");
				for (int i = 0; i < len / 2; i++) {
					writer.write(String.format("%d %d ", i * 2 + 3, i * 2 + 2));
				}
			} else {
				for (int i = 0; i < len / 2; i++) {
					writer.write(String.format("%d %d ", i * 2 + 2, i * 2 + 1));
				}
			}writer.write("\n");
		}
		writer.write("\n");
		writer.flush();
		scanner.close();
	}
 
}