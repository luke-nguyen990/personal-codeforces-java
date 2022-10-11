import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Collections;

public class codeforces_2022_10_11_B {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		for (int numberCases = scanner.nextInt(); numberCases > 0; --numberCases) {
			int length = scanner.nextInt();
			int[] A = new int[length];
			int[] allPreSums = new int[length];
			long total = 0;
			for (int i = 0; i < length; i++) {
				A[i] = scanner.nextInt();
				if (i == 0) {
					allPreSums[0] = A[i];
				} else {
					allPreSums[i] = allPreSums[i - 1] + A[i];
				}
				total += A[i];
			}
			ArrayList<Integer> factors = new ArrayList<>();

			for (int i = 1; i * i <= total; i++) {
				if (total % i == 0) {
					if (total / i <= length) {
						factors.add(i);
					}
					factors.add((int) (total / i));
				}
			}
			Collections.sort(factors);
			int ans = Integer.MAX_VALUE;
			HashSet<Integer> checked = new HashSet<>();
			for (int j = 0; j < factors.size(); j++) {
				int factor = factors.get(j);
				if (checked.contains(factor)) {
					continue;
				}
				int lastIndex = -1;
				int longestCandidate = 0;
				int counter = 0;
				for (int k = 0; k < allPreSums.length; k++) {
					int preSum = allPreSums[k];
					if (preSum % factor == 0) {
						counter++;
						longestCandidate = Math.max(longestCandidate, k - lastIndex);
						lastIndex = k;
					}
				}
				if (counter >= (int) (total / factor)) {
					ans = Math.min(ans, longestCandidate);
				}
			}

			writer.write(ans + "\n");
		}
		writer.flush();
		scanner.close();
	}

}