import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.IOException;

public class codeforces_2022_08_20_B {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		for (int numCases = scanner.nextInt(); numCases > 0; --numCases) {
			long n = scanner.nextLong(), k = scanner.nextLong(), b = scanner.nextLong(), s = scanner.nextLong();
			long max = k * b + (k - 1) * n;
			long min = k * b;
			if (s < min || s > max) {
				writer.write("-1\n");
			} else {
				long remain = s - k * b;
				long base = b / n * k;
				long mod = b % n;
				for (int i = 0; i < n; i++) {					
					long x = base;
					if(i < mod) x+=k;
					long add = Math.min(remain, k - 1);
					x += add;
					remain -= add;
					writer.write(x + " ");
				}
				writer.write("\n");
			}
		}
		writer.flush();
		scanner.close();
	}

}