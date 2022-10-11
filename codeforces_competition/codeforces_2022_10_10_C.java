import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;

public class codeforces_2022_10_10_C {

	public static int cal(int a) {
		return a * (a + 1) / 2;
	}

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		for (int numberCases = scanner.nextInt(); numberCases > 0; --numberCases) {
			int length = scanner.nextInt();
			String S = scanner.next();
			ArrayList<Integer> indices0 = new ArrayList<Integer>();
			ArrayList<Integer> indices1 = new ArrayList<Integer>();
			for(int i = 0; i < length; i++) {
				if(S.charAt(i) == '0') {
					indices0.add(i);
				}
				else {
					indices1.add(i);
				}
			}
		}
		writer.flush();
		scanner.close();
	}

}