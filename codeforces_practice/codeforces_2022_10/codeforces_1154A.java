package codeforces_2022_10;
import java.util.Arrays;
import java.util.Scanner;

public class codeforces_1154A {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] array = new int[4];
		for (int i = 0; i < 4; i++) {
			array[i] = scanner.nextInt();
		}
		Arrays.sort(array);
		String output = String.format("%d %d %d", array[3] - array[0], array[3] - array[1], array[3] - array[2]);
		System.out.println(output);
		scanner.close();
	}

}
