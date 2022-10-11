import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.IOException;


public class codeforces_2022_10_10_D {

	public static int cal(int a) {
		return a * (a + 1) / 2;
	}

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		for (int numberCases = scanner.nextInt(); numberCases > 0; --numberCases) {
			int length = scanner.nextInt();
			int[] A = new int[length];
			for (int i = 0; i < length; i++) {
				A[i] = scanner.nextInt();
			}
			long ans = 0;
			long prevLength = 0;
			for (int i = 0; i < length; i++) {
				long maxLength = A[i];
				maxLength = Math.min(maxLength, prevLength + 1);
				ans += (maxLength);
				prevLength = maxLength;
			}
			writer.write(ans + "\n");
		}
		writer.flush();
		scanner.close();
	}

}