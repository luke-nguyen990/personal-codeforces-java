import java.util.Scanner;
import java.util.Arrays;

public class codeforces_2022_07_18_B {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		for (int numCases = scanner.nextInt(); numCases > 0; numCases--) {
			int length = scanner.nextInt();
			int[] countO = new int[length];
			int[] countE = new int[length];
			int[] countF = new int[length];
			for (int i = 0; i < length; i++) {
				int x = scanner.nextInt() - 1;
				if (i % 3 == 0) {
					countO[x]++;
				}
				else if(i % 3 == 1){
					countE[x]++;
				}
				else {
					countF[x]++;
				}
			}
			for(int i = 0; i < length; i++) {
				int[] temp = {countO[i], countE[i], countF[i]};
				Arrays.sort(temp);
				System.out.print(String.format("%d ", temp[2]));
			}
			System.out.println();
		}
		scanner.close();
	}

}
