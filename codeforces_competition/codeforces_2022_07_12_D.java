import java.util.Scanner;
import java.util.HashSet;
import java.util.ArrayList;

public class codeforces_2022_07_12_D {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		for (int numCase = scanner.nextInt(); numCase > 0; numCase--) {
			int count = scanner.nextInt();
			HashSet<String> hash = new HashSet<String>();
			ArrayList<String> arr = new ArrayList<String>();
			for (int i = 0; i < count; i++) {
				String cur = scanner.next();
				arr.add(cur);
				hash.add(cur);
			}
			String ans = "";
			for (int i = 0; i < count; i++) {
				boolean found = false;
				for (int j = 1; j < arr.get(i).length(); j++) {
					if (hash.contains(arr.get(i).substring(0, j))
							&& hash.contains(arr.get(i).substring(j, arr.get(i).length()))) {
						found = true;
					}
				}
				ans += (found ? "1" : "0");
			}
			System.out.println(ans);
		}
		scanner.close();
	}

}
