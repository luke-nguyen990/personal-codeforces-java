//https://codeforces.com/problemset/problem/381/A

import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.LinkedList;

public class codeforces_0381A {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		int length = scanner.nextInt();
		LinkedList<Integer> linkedList = new LinkedList<>();
		for (int i = 0; i < length; i++) {
			linkedList.add(scanner.nextInt());
		}
		int[] ans = new int[2];
		int counter = 0;
		while (!linkedList.isEmpty()) {			
			if (linkedList.getFirst() > linkedList.getLast()) {
				ans[counter % 2] += linkedList.getFirst();
				linkedList.removeFirst();
			}
			else {
				ans[counter % 2] += linkedList.getLast();
				linkedList.removeLast();
			}
			counter++;
		}
		writer.write(ans[0] + " " + ans[1] + "\n");
		scanner.close();
		writer.flush();
	}

}
