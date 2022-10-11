package facebook_hacker_cup;

import java.io.File;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.*;

@SuppressWarnings("unused")
public class facebook_2022_09_24_A1 {

	public static boolean compare(int l1, int r1, int l2, int r2, int[][] preSum) {
		int[] segment1 = new int[26];
		for (int i = 0; i < 26; i++) {
			segment1[i] = preSum[r1][i];
			if (l1 > 0) {
				segment1[i] -= preSum[l1 - 1][i];
			}
		}
		int[] segment2 = new int[26];
		for (int i = 0; i < 26; i++) {
			segment2[i] = preSum[r2][i];
			if (l2 > 0) {
				segment2[i] -= preSum[l2 - 1][i];
			}
		}
		int total = 0;
		for (int i = 0; i < 26; i++) {
			total += Math.abs(segment1[i] - segment2[i]);
		}
		return total == 1;
	}

	public static void main(String[] args) throws Exception {
		String dir = System.getProperty("user.dir");
		File input = new File(dir + "/" + "facebook_2022_09_24_A1.in");
		File output = new File(dir + "/" + "facebook_2022_09_24_A1.out");
		BufferedReader reader = new BufferedReader(new FileReader(input));
		BufferedWriter writer = new BufferedWriter(new FileWriter(output));
		int numCases = Integer.parseInt(reader.readLine());
		for (int i = 1; i <= numCases; i++) {			
			String s = reader.readLine();
			int[][] preSum = new int[s.length()][26];
			for (int j = 0; j < s.length(); j++) {
				if (j != 0) {
					for (int k = 0; k < 26; k++) {
						preSum[j][k] = preSum[j - 1][k];
					}
				}
				preSum[j][(int) s.charAt(j) - (int) 'a'] += 1;
			}
			int numQueries = Integer.parseInt(reader.readLine());
			int ans = 0;
			for (int j = 0; j < numQueries; j++) {				
				String[] lr = reader.readLine().split("\\s+");
				int l = Integer.parseInt(lr[0]) - 1;
				int r = Integer.parseInt(lr[1]) - 1;
				if (l == r) {
					ans++;
					continue;
				}
				if((r - l) % 2 == 1) continue;
				int mid1 = (l + r) / 2;
				System.out.println();
				System.out.println();
				System.out.println(l);
				System.out.println(r);
				System.out.println(mid1);
				
				boolean try1 = compare(l, mid1, mid1 + 1, r, preSum);
				boolean try2 = compare(l, mid1 - 1, mid1, r, preSum);
				if (try1 || try2) {
					ans++;
				}
			}
			String toPrint = String.format("Case #%d: %d\n", i, ans);
			writer.write(toPrint);
		}
		reader.close();
		writer.flush();
		writer.close();
	}
}
