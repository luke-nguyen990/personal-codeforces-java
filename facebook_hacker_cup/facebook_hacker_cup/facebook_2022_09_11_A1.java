package facebook_hacker_cup;

import java.io.File;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.*;

@SuppressWarnings("unused")
public class facebook_2022_09_11_A1 {
	public static void main(String[] args) throws Exception {
		String dir = System.getProperty("user.dir");
		File input = new File(dir + "/" + "facebook_2022_09_11_A1.in");
		File output = new File(dir + "/" + "facebook_2022_09_11_A1.out");
		BufferedReader reader = new BufferedReader(new FileReader(input));
		BufferedWriter writer = new BufferedWriter(new FileWriter(output));
		int numCases = Integer.parseInt(reader.readLine());
		for (int i = 1; i <= numCases; i++) {
			String[] nk = reader.readLine().split("\\s+");
			int n = Integer.parseInt(nk[0]);
			int k = Integer.parseInt(nk[1]);
			String[] A = reader.readLine().split("\\s+");
			String[] B = reader.readLine().split("\\s+");

			int ind1 = -1, ind2 = -1;
			for (int j = 0; j < n; j++) {
				if (A[j].equals("1")) {
					ind1 = j;
				}
				if (B[j].equals("1")) {
					ind2 = j;
				}
			}
			int counter = n + 1;
			boolean valid = true;
			while (--counter > 0) {
				ind1 = (ind1 + 1) % n;
				ind2 = (ind2 + 1) % n;
				if (!A[ind1].equals(B[ind2])) {
					valid = false;
				}
			}
			if (k == 0 && !A[0].equals(B[0])) {
				valid = false;
			}
			if (A[0].equals(B[0]) && k % 2 == 1) {
				valid = false;
			}
			if (n == 2) {
				if (A[0].equals(B[0]) && k % 2 == 1) {
					valid = false;
				}
				if (!A[0].equals(B[0]) && k % 2 == 0) {
					valid = false;
				}
			}
			String ans = String.format("Case #%d: %s\n", i, valid == true ? "YES" : "NO");
			writer.write(ans);
		}
		reader.close();
		writer.flush();
		writer.close();
	}
}
