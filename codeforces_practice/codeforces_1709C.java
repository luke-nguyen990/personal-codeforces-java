
/**
 * @author luke_nguyen
 * @link https://codeforces.com/contest/1709/problem/C
 */

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.IOException;

public class codeforces_1709C {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		for (int numCases = scanner.nextInt(); numCases > 0; --numCases) {
			char[] charsList = scanner.next().toCharArray();
			int op = 0;
			ArrayList<Integer> qIndices = new ArrayList<>();
			for (int i = 0; i < charsList.length; i++) {
				switch (charsList[i]) {
				case '(':
					op++;
					break;
				case ')':					
					break;
				default:
					qIndices.add(i);
					break;
				}
			}
			if (op == charsList.length / 2 || op + qIndices.size() == charsList.length / 2) {
				writer.write("YES\n");
				continue;
			}
			charsList[qIndices.get(charsList.length / 2 - op - 1)] = ')';
			charsList[qIndices.get(charsList.length / 2 - op)] = '(';
			op++;
			for(int i = 0; i < charsList.length; i++) {
				if(charsList[i] == '?') {
					if(op < charsList.length / 2) {
						op++; charsList[i] = '(';
					}
					else {
						charsList[i] = ')';
					}
				}				
			}
			boolean valid = true;
			int cnt = 0;
			for(char c : charsList) {
				if(c == '(') {
					cnt++;
				} else {
					if(cnt == 0) {
						valid = false;
						break;
					}
					cnt--;
				}
			}
			writer.write(valid ? "NO\n" : "YES\n");
		}
		scanner.close();
		writer.flush();
	}

}
