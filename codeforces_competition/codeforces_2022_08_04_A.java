import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.io.IOException;
import java.util.Arrays;
import java.util.ArrayList;
 
public class codeforces_2022_08_04_A {
 

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		for (int numCases = scanner.nextInt(); numCases > 0; --numCases) {
			int n = scanner.nextInt();
			if(n >= 5) {
				writer.write((n % 3 == 0 ? n / 3 : n / 3 + 1) + "\n");
			}
			else if(n == 4 || n == 1) {
				writer.write("2\n");
			}
			else {
				writer.write("1\n");
			}
		}
		writer.flush();
		scanner.close();
	}
 
}