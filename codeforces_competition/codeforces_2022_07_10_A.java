

import java.util.Scanner;
public class codeforces_2022_07_10_A {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		for (int i = scanner.nextInt(); i > 0; i--) {
			int curNumber = scanner.nextInt();
			int length = Integer.toString(curNumber).length();
			String baseNumber = "1" + "0".repeat(length - 1);
			System.out.println(curNumber - Integer.parseInt(baseNumber));
		}
		scanner.close();
	}

}
