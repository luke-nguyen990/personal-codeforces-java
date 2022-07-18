//https://codeforces.com/problemset/problem/1560/A

import java.util.Scanner;
import java.util.ArrayList;
public class codeforces_1560A {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> favorites = new ArrayList<>();
		for(int i = 1; favorites.size() <= 1000; i++) {
			if(i % 10 != 3 && i % 3 != 0) {
				favorites.add(i);
			}
		}
		for (int numCases = scanner.nextInt(); numCases > 0; --numCases) {
			System.out.println(favorites.get(scanner.nextInt() - 1));
		}
		scanner.close();
	}

}
