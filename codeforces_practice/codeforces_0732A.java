
//https://codeforces.com/contest/732/problem/A
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class codeforces_0732A {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferReader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stringTokenizer = new StringTokenizer(bufferReader.readLine());
		int k = Integer.parseInt(stringTokenizer.nextToken());
		int r = Integer.parseInt(stringTokenizer.nextToken());
		for (int i = 1; i <= 10; i++) {
			if ((k * i) % 10 == r || (k * i) % 10 == 0) {
				System.out.println(i);
				return;
			}
		}

	}

}