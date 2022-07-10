package date_2022_07_10;

import java.util.Scanner;

public class B {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		for (int i = scanner.nextInt(); i > 0; i--) {
			String s = scanner.next();
			int index = 0;
			int ans = 0;
			while (index < s.length()) {
				ans++;
				String used = "";
				int temp = index;
				for (int j = temp; j < s.length(); j++) {
					if (!used.contains("" + s.charAt(j))) {
						if (used.length() == 3) {
							break;
						}
						used += s.charAt(j);

					}
					index = j + 1;
				}
			}
			System.out.println(ans);
		}
		scanner.close();
	}
}
