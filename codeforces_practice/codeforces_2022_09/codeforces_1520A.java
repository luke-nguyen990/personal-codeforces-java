package codeforces_2022_09;
//https://codeforces.com/problemset/problem/1520/A
 
import java.util.Scanner;
 
public class codeforces_1520A {
 
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		for (int numCases = scanner.nextInt(); numCases > 0; numCases--) {
			scanner.nextInt();
			char[] s = scanner.next().toCharArray();
			int[] used = new int[26];
			char prev = '_';
			boolean valid = true;
			for (char c : s) {
				int pos = (int) c - (int) ('A');
				if (used[pos] == 1 && c != prev) {
					valid = false;
					break;
				}
				used[pos] = 1;
				prev = c;
			}
			System.out.println(valid ? "YES" : "NO");
		}
		scanner.close();
	}
 
}