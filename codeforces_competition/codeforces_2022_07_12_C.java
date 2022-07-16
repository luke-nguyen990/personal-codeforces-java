import java.util.Scanner;
public class codeforces_2022_07_12_C {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		for (int caseNumber = scanner.nextInt(); caseNumber > 0; caseNumber--) {
			int length = scanner.nextInt();
			int[] wheels = new int[length];
			for (int i = 0; i < length; i++) {
				wheels[i] = scanner.nextInt();
			}
			for (int i = 0; i < length; i++) {
				int numChange = scanner.nextInt();
				String changes = scanner.next();				
				for (int j = 0; j < numChange; j++) {
					if (changes.charAt(j) == 'D') {
						wheels[i] += 1;
					} else {
						wheels[i] -= 1;
					}
					if(wheels[i] < 0) {
						wheels[i] += 10;
					}
					wheels[i] %= 10;
				}
				System.out.print(wheels[i] + " ");
			}
			System.out.println();
		}
		scanner.close();
	}

}
