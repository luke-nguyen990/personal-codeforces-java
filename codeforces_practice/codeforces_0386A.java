
/**
 * @author luke_nguyen
 * @link https://codeforces.com/problemset/problem/386/A
 */

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class codeforces_0386A {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		int length = scanner.nextInt();		
		Integer[] arr = new Integer[length];
		for(int i = 0; i < length; i++) {
			arr[i] = scanner.nextInt();
		}
		int max = Collections.max(Arrays.asList(arr));
		int index = -1;		
		int curSecond = Integer.MIN_VALUE;
		for(int i = 0; i < length; i++) {
			if(arr[i] > curSecond && arr[i] < max) {
				curSecond = arr[i];				
			}
			if(arr[i] == max) {
				index = i;
			}
		}
		writer.write(String.format("%d %d\n", index + 1, curSecond));
		scanner.close();
		writer.flush();
	}

}
