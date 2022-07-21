
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class codeforces_2022_07_21_A {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));		
		for(int numCases = scanner.nextInt(); numCases > 0; --numCases) {
			int x = scanner.nextInt();
			int[] keys = new int[3];
			for(int i = 0; i < 3; i++) {
				keys[i] = scanner.nextInt();
			}
			boolean can = true;
			if(keys[x - 1] == 0 || keys[keys[x-1] - 1] == 0) {
				can = false;
			}
			writer.write(can ? "YES\n" : "NO\n");			
		}		
		writer.flush();
		scanner.close();
	}

}
