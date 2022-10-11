package codeforces_2022_09;

/**
 * @author luke_nguyen
 * @link https://codeforces.com/problemset/problem/550/A
 */

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.ArrayList;

public class codeforces_0550A {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		String s = scanner.next();
		ArrayList<Integer> AB = new ArrayList<>();
		ArrayList<Integer> BA = new ArrayList<>();
		for (int i = 1; i < s.length(); i++) {
			String sub = s.substring(i - 1, i + 1);			
			if (sub.equals("AB")) {
				AB.add(i - 1);
			}
			if (sub.equals("BA")) {
				BA.add(i - 1);
			}
		}
		if (AB.size() > 0 && BA.size() > 0) {
			if(AB.get(0) + 1 < BA.get(BA.size() - 1)) {
				writer.write("YES\n");
			}
			else if(BA.get(0) + 1 < AB.get(AB.size() - 1)) {
				writer.write("YES\n");
			}
			else {
				writer.write("NO\n");
			}
		} 
		else {
			writer.write("NO\n");
		}
		writer.flush();
		scanner.close();
	}

}
