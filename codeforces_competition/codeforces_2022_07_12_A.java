import java.util.Scanner;

public class codeforces_2022_07_12_A {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		for(int i = scanner.nextInt(); i > 0; i--) {
			if(scanner.next().equalsIgnoreCase("yes")) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
		}
		scanner.close();
	}

}
