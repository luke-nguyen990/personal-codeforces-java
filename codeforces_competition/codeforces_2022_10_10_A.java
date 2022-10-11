import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.IOException;


public class codeforces_2022_10_10_A {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		for (int numberCases = scanner.nextInt(); numberCases > 0; --numberCases) {
			int length = scanner.nextInt();
			int[] A = new int[length];
			int[] B = new int[length];
			for(int i = 0; i < length;i++) {
				A[i] = scanner.nextInt();
			}
			for(int i = 0; i < length;i++) {
				B[i] = scanner.nextInt();
			}
			int a1 = 0, b1 = 0;
			int ans = 0;
			for(int i = 0; i < length; i++) {
				if(A[i] != B[i]) {
					ans++;
				}
				if(A[i] == 1) a1++;
				if(B[i] == 1) b1++;
			}
			ans = Math.min(ans, Math.abs(a1 - b1) + 1);
			writer.write(String.format(ans + "\n"));
		}
		writer.flush();
		scanner.close();
	}

}