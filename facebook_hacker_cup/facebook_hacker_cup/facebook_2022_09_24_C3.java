package facebook_hacker_cup;

import java.io.File;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.*;

@SuppressWarnings("unused")
public class facebook_2022_09_24_C3 {
	public static void main(String[] args) throws Exception {
		String dir = System.getProperty("user.dir");
		File input = new File(dir + "/" + "facebook_2022_09_24_C3.in");
		File output = new File(dir + "/" + "facebook_2022_09_24_C3.out");
		BufferedReader reader = new BufferedReader(new FileReader(input));
		BufferedWriter writer = new BufferedWriter(new FileWriter(output));
		int numCases = Integer.parseInt(reader.readLine());
		for (int i = 1; i <= numCases; i++) {
			String s = reader.readLine();
			int numQueries = Integer.parseInt(reader.readLine());
//			String s = "";
//			String ans = String.format("Case #%d: %s\n", i, s);
//			writer.write(ans);
		}
		reader.close();
		writer.flush();
		writer.close();
	}
}
