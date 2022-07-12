import java.util.HashSet;
import java.util.Scanner;

public class codeforces_2022_07_12_B {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		for (int i = scanner.nextInt(); i > 0; i--) {
			int length = scanner.nextInt();
			String s = scanner.next();
			int ans = 0;
			HashSet<Character> used = new HashSet<>();
			for (int j = 0; j < length; j++) {
				Character c = Character.valueOf(s.charAt(j));
				if (used.contains(c)) {
					ans += 1;
				} else {
					ans += 2;
				}
				used.add(c);
			}
			System.out.println(ans);
		}
		scanner.close();
	}

}
