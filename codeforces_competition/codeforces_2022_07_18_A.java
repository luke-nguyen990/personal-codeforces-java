import java.util.Scanner;
import java.util.Arrays;
 
public class codeforces_2022_07_18_A {
 
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		for (int numCases = scanner.nextInt(); numCases > 0; --numCases) {
			int n = scanner.nextInt(), m = scanner.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = scanner.nextInt();
			}
			char[] ans = new char[m];
			Arrays.fill(ans, 'B');
			for(int i = 0; i < n; i++) {
				int posMin = (int)Math.min(arr[i], m + 1 - arr[i]) - 1;
				int posMax = (int)Math.max(arr[i], m + 1 - arr[i]) - 1;				
				if(ans[posMin] == 'A') {
					ans[posMax] = 'A';
				}
				else {
					ans[posMin] = 'A';
				}
			}
			System.out.println(String.valueOf(ans));
		}
		scanner.close();
	}
 
}