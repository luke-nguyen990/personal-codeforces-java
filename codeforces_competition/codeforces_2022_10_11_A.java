import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.IOException;


public class codeforces_2022_10_11_A {

	public static boolean isBigger(String t1, String t2) {
		char k1 = t1.charAt(t1.length() - 1);
		char k2 = t2.charAt(t2.length() - 1);
		if (k1 == k2) {
			if (k1 == 'S') {
				return t1.length() < t2.length();
			} else {
				return t1.length() > t2.length();
			}
		}
		if (k1 == 'S') {
			return false;
		} else if (k1 == 'L') {
			return true;
		}
		return k2 == 'S' ? true : false;
	}

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		for (int numberCases = scanner.nextInt(); numberCases > 0; --numberCases) {
			String t1 = scanner.next();
			String t2 = scanner.next();
			if (t1.equals(t2)) {
				writer.write("=\n");
			} else if (isBigger(t1, t2)) {
				writer.write(">\n");
			} else {
				writer.write("<\n");
			}
		}
		writer.flush();
		scanner.close();
	}

}