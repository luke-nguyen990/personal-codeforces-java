import java.util.Scanner;

public class codeforces_2022_07_16_A {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		for (int numCases = scanner.nextInt(); numCases > 0; --numCases) {
			int n = scanner.nextInt();
			int[] arr = new int[n];
			boolean doable = true;
			for (int i = 0; i < n; i++) {
				arr[i] = scanner.nextInt();
				if (arr[i] % arr[0] != 0) {
					doable = false;
				}
			}
			System.out.println(doable ? "YES" : "NO");
		}
		scanner.close();
	}

}
