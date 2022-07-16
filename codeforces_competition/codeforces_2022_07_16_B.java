import java.util.Scanner;

public class codeforces_2022_07_16_B {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		for (int numCases = scanner.nextInt(); numCases > 0; --numCases) {
			int n = scanner.nextInt(), l = scanner.nextInt(), r = scanner.nextInt();
			int[] ans = new int[n];
			boolean doable = true;
			for (int i = 1; i <= n; i++) {
				if (r - (r % i) < l) {
					doable = false;
					break;
				} else {
					ans[i - 1] = r - (r % i);
				}
			}
			if (!doable) {
				System.out.println("NO");
			} else {
				System.out.println("YES");
				for (int a : ans) {
					System.out.print(String.format("%d ", a));
				}
				System.out.println();
			}
		}
		scanner.close();
	}

}
