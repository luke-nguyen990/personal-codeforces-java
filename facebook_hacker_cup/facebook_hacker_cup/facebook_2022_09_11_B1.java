package facebook_hacker_cup;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class facebook_2022_09_11_B1 {
	public static void main(String[] args) throws Exception {
		String dir = System.getProperty("user.dir");
		File input = new File(dir + "/" + "facebook_2022_09_11_B1.in");
		File output = new File(dir + "/" + "facebook_2022_09_11_B1.out");
		BufferedReader reader = new BufferedReader(new FileReader(input));
		BufferedWriter writer = new BufferedWriter(new FileWriter(output));
		int numCases = Integer.parseInt(reader.readLine());
		for (int curCase = 1; curCase <= numCases; curCase++) {
			int numTrees = Integer.parseInt(reader.readLine());
			long[] xTrees = new long[numTrees];
			long[] yTrees = new long[numTrees];
			for (int i = 0; i < (int) numTrees; i++) {
				String[] xy = reader.readLine().split("\\s+");
				xTrees[i] = Long.parseLong(xy[0]);
				yTrees[i] = Long.parseLong(xy[1]);
			}
			int numWells = Integer.parseInt(reader.readLine());
			long[] xWells = new long[numWells];
			long[] yWells = new long[numWells];
			for (int i = 0; i < numWells; i++) {
				String[] xy = reader.readLine().split("\\s+");
				xWells[i] = Long.parseLong(xy[0]);
				yWells[i] = Long.parseLong(xy[1]);
			}
			long sumTreesX = 0;
			long sumTreesY = 0;
			long sumSquareTreesX = 0;
			long sumSquareTreesY = 0;
			long mod = (long) Math.pow(10, 9) + 7;
			for (int i = 0; i < numTrees; i++) {
				sumTreesX += xTrees[i];
				sumTreesY += yTrees[i];
				sumSquareTreesX += (xTrees[i] * xTrees[i]) % mod;
				sumSquareTreesY += (yTrees[i] * yTrees[i]) % mod;
				sumTreesX %= mod;
				sumTreesY %= mod;
				sumSquareTreesX %= mod;
				sumSquareTreesY %= mod;
			}
			long doubleSumTreesX = (sumTreesX * 2) % mod;
			long doubleSumTreesY = (sumTreesY * 2) % mod;

			long ans = 0;
			long toSubstract = 0;
			for (int i = 0; i < numWells; i++) {
				long calX = (xWells[i] * xWells[i]) % mod;
				calX = (calX * numTrees) % mod;
				calX += sumSquareTreesX;
				calX %= mod;

				long calY = (yWells[i] * yWells[i]) % mod;
				calY = (calY * numTrees) % mod;
				calY += sumSquareTreesY;
				calY %= mod;

				toSubstract += (doubleSumTreesX * xWells[i]) % mod;
				toSubstract += (doubleSumTreesY * yWells[i]) % mod;
				toSubstract %= mod;

				ans += calX + calY;
				ans %= mod;
			}
			ans -= toSubstract;
			if (ans < 0) {
				ans += mod;
			}
			ans %= mod;
			writer.write(String.format("Case #%d: %d\n", curCase, ans));

		}
		reader.close();
		writer.flush();
		writer.close();
	}
}
