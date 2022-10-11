package codeforces_2022_09;
//https://codeforces.com/contest/1698/problem/A

import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class codeforces_1698A {

	public static void main(String[] args) throws IOException{
		Scanner scanner = new Scanner(System.in);
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		for(int numCases = scanner.nextInt(); numCases > 0; --numCases) {
			int length = scanner.nextInt();
			for(int i = 0; i < length; i++) {
				int x = scanner.nextInt();
				if(i == 0) {
					writer.write(x + "\n");
				}				
			}
		}
		writer.flush();
		scanner.close();
	}

}
