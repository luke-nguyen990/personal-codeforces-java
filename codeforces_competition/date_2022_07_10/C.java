//package date_2022_07_10;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class C {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		for (int caseNumber = scanner.nextInt(); caseNumber > 0; caseNumber--) {
			int n = scanner.nextInt();
			int k = scanner.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = scanner.nextInt();
			}
			HashMap<Integer, HashSet<Integer>> hash = new HashMap<Integer, HashSet<Integer>>();
			for (int i = n - 1; i >= 0; i--) {
				if (!hash.containsKey(arr[i])) {
					hash.put(arr[i], new HashSet<Integer>());
				}
				for (HashSet<Integer> set : hash.values()) {
					set.add(arr[i]);
				}
			}
			for (int i = 0; i < k; i++) {
				int a = scanner.nextInt();
				int b = scanner.nextInt();
				if(hash.containsKey(b) && hash.get(b).contains(a)) {
					System.out.println("yes");
				}
				else {
					System.out.println("no");
				}
			}
		}
		scanner.close();
	}

}
