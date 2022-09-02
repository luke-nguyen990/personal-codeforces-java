package facebook_hacker_cup;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class facebook_2022_08_27_B1 {
	public static void main(String[] args) throws Exception {
		String dir = System.getProperty("user.dir");
		File input = new File(dir + "/" + "facebook_2022_08_27_B1.in");
		File output = new File(dir + "/" + "facebook_2022_08_27_B1.out");
		BufferedReader reader = new BufferedReader(new FileReader(input));
		BufferedWriter writer = new BufferedWriter(new FileWriter(output));
		int numCases = Integer.parseInt(reader.readLine());
		for (int curCase = 1; curCase <= numCases; curCase++) {
			String[] RC = reader.readLine().split("\\s+");
			int r = Integer.parseInt(RC[0]);
			int c = Integer.parseInt(RC[1]);
			boolean found = false;
			for (int i = 0; i < r; i++) {
				String row = reader.readLine();
				if (row.contains("^")) {
					found = true;
				}
			}
			if(!found) {
				writer.write(String.format("Case #%d: Possible\n", curCase));
				for(int i = 0; i < r; i++) {
					String row = ".".repeat(c) + "\n";
					writer.write(row);
				}
			}
			else if(r == 1 || c == 1) {
				writer.write(String.format("Case #%d: Impossible\n", curCase));
			}			
			else {
				writer.write(String.format("Case #%d: Possible\n", curCase));
				for(int i = 0; i < r; i++) {
					String row = "^".repeat(c) + "\n";
					writer.write(row);
				}
			}
		}
		reader.close();
		writer.flush();
		writer.close();
	}
}
