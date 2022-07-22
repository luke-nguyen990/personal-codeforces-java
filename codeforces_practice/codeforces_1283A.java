//https://codeforces.com/problemset/problem/1283/A

import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;



public class codeforces_1283A {

	public static void main(String[] args) throws IOException{
		Scanner scanner = new Scanner(System.in);
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		for (int numCases = scanner.nextInt(); numCases > 0; numCases--) {
			int hh = scanner.nextInt(), mm = scanner.nextInt();
			writer.write(((23 - hh) * 60 - (mm - 60)) + "\n");
		}
		writer.flush();
		scanner.close();
	}

}
