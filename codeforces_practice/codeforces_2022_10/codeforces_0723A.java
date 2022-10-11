package codeforces_2022_10;
//https://codeforces.com/problemset/problem/723/A

import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class codeforces_0723A {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Integer[] abc = new Integer[3];
		for(int i = 0; i < 3; i++) {
			abc[i] = scanner.nextInt();
		}
		int minValue = Collections.min(Arrays.asList(abc));
		int maxValue = Collections.max(Arrays.asList(abc));
		System.out.println(maxValue - minValue);
		scanner.close();
	}

}

