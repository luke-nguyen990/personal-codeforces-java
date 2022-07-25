
/**
 * @author luke_nguyen
 * @link https://codeforces.com/contest/1703/problem/G
 */

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class codeforces_1703G {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		for (int numCases = scanner.nextInt(); numCases > 0; --numCases) {
			int numChests = scanner.nextInt();
			long goodKeyCost = scanner.nextLong();
			long[] coinsInChests = new long[numChests];
			for (int i = 0; i < numChests; i++) {
				coinsInChests[i] = scanner.nextLong();
			}
			long obtainableCoins = Arrays.stream(coinsInChests).sum();
			long goodKeysCost = numChests * goodKeyCost;
			ArrayList<Long> chestsWithBadKeys = new ArrayList<>();
			long maximumCoins = obtainableCoins - goodKeysCost;			
			for (int i = numChests - 1; i >= 0; --i) {
				chestsWithBadKeys.add(coinsInChests[i]);
				ArrayList<Long> tempChestsWithBadKeys = chestsWithBadKeys;
				chestsWithBadKeys = new ArrayList<Long>();
				long coinsLost = 0;
				for (int j = 0; j < tempChestsWithBadKeys.size(); j++) {
					long halfValue = tempChestsWithBadKeys.get(j) / 2;
					coinsLost += tempChestsWithBadKeys.get(j) - halfValue;
					if (halfValue > 0) {
						chestsWithBadKeys.add(halfValue);
					}
				}
				obtainableCoins -= coinsLost;
				goodKeysCost -= goodKeyCost;				
				maximumCoins = Math.max(maximumCoins, obtainableCoins - goodKeysCost);
			}
			writer.write(maximumCoins + "\n");
		}
		writer.flush();
		scanner.close();
	}

}
