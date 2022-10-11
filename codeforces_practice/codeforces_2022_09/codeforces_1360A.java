package codeforces_2022_09;
//https://codeforces.com/problemset/problem/1360/A

import java.util.Scanner;
import java.lang.Math;

public class codeforces_1360A {

	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		for(int numCases = scanner.nextInt(); numCases > 0; --numCases) {
			int l = scanner.nextInt(), h = scanner.nextInt();
			if(l < h) {
				int temp = l;
				l = h; h = temp;
			}
			int squareSize = Math.max(l, h + h);
			System.out.println((int)Math.pow(squareSize, 2));
		}
		scanner.close();
	}

}
