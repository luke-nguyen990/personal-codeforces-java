package facebook_hacker_cup;

import java.io.File;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;

public class facebook_2022_08_27_A {
	public static void main(String[] args) throws Exception {
		String dir = System.getProperty("user.dir");
		File input = new File(dir + "/" + "facebook_2022_08_27.in");
		File output = new File(dir + "/" + "facebook_2022_08_27.out");
		BufferedReader reader = new BufferedReader(new FileReader(input));
		BufferedWriter writer = new BufferedWriter(new FileWriter(output));
		int numCases = Integer.parseInt(reader.readLine());
		for (int i = 1; i <= numCases; i++) {
			String[] nk = reader.readLine().split("\\s+");
			int n = Integer.parseInt(nk[0]);
			int k = Integer.parseInt(nk[1]);
			boolean valid = k * 2 >= n;
			HashMap<String, Integer> map = new HashMap<String, Integer>();
			for (String element : reader.readLine().split("\\s+")) {
				map.put(element, map.getOrDefault(element, 0) + 1);
				valid &= map.get(element) < 3;
			}
			String ans = String.format("Case #%d: %s\n", i, valid == true ? "YES" : "NO");
			writer.write(ans);
		}
		reader.close();
		writer.flush();
		writer.close();
	}
}
