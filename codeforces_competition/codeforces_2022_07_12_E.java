import java.util.Scanner;
import java.lang.Math;

public class codeforces_2022_07_12_E {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		for (int numCase = scanner.nextInt(); numCase > 0; numCase--) {
			int length = scanner.nextInt();
			int M = length - 1;
			String[] board = new String[length];
			for (int i = 0; i < length; i++) {
				board[i] = scanner.next();
			}
			int ans = 0;
			for (int i = 0; i < length / 2; i++) {
				
				for (int j = 0; j < length / 2 + (length % 2 == 1 ? 1 : 0); j++) {
					int[] counter = new int[2];
					counter[0] = 0; counter[1]=0;
					counter[board[i].charAt(j) == '1' ? 1 : 0] += 1;
					counter[board[j].charAt(M - i) == '1' ? 1 : 0] += 1;
					counter[board[M - i].charAt(M - j) == '1' ? 1 : 0] += 1;
					counter[board[M - j].charAt(i) == '1' ? 1 : 0] += 1;
					ans += Math.min(counter[1], counter[0]);
				}				
			}
			System.out.println(ans);
		}
		scanner.close();
	}

}
