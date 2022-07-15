//https://codeforces.com/problemset/problem/1353/B

import java.util.Scanner;
import java.util.Comparator;
import java.util.PriorityQueue;

public class codeforces_1353B {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		for (int numCases = scanner.nextInt(); numCases > 0; numCases--) {
			int n = scanner.nextInt(), k = scanner.nextInt();
			PriorityQueue<Integer> A = new PriorityQueue<>();
			PriorityQueue<Integer> B = new PriorityQueue<>(Comparator.reverseOrder());
			for(int i = 0; i < n; i++) {
				A.add(scanner.nextInt());
			}
			for(int i = 0; i < n; i++) {
				B.add(scanner.nextInt());
			}
			for(int i = 0; i < k; i++) {
				int minA = A.poll();
				int maxB = B.poll();
				if(minA >= maxB) {
					A.add(minA);
					break;
				}
				A.add(maxB);
				B.add(minA);
			}
			int ans = 0;
			while(A.size() > 0) {
				ans += A.poll();
			}
			System.out.println(ans);
		}
		scanner.close();
	}

}
