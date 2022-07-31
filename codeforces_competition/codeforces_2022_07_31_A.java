import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class codeforces_2022_07_31_A {
	public static String reverse(String a) {
		String s = "";
		for (int i = 0; i < a.length(); i++) {
			s += a.charAt(a.length() - 1 - i);
		}
		return s;
	}

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		for (int numCases = scanner.nextInt(); numCases > 0; --numCases) {
			int lengtha = scanner.nextInt(), lengthb = scanner.nextInt();
			String a = scanner.next();
			String b = scanner.next();
			boolean valid = a.length() >= b.length() ? true : false;
			if (valid) {
				for (int ia = a.length() - 1, ib = b.length() - 1; ia >= 1 && ib >= 1; ia--, ib--) {
					if (b.charAt(ib) != a.charAt(ia)) {
						valid = false;
					}
				}
				boolean found = false;
				for (int i = 0; i < lengtha - lengthb + 1; i++) {
					if(a.charAt(i) == b.charAt(0)) {
						found = true;
					}
				}
				if(!found) {
					valid = false;
				}
			}
			writer.write(valid ? "Yes\n" : "No\n");
		}
		writer.flush();
		scanner.close();
	}
}
