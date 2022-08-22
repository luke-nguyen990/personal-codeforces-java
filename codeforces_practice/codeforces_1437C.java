// https://codeforces.com/problemset/problem/1437/C

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Scanner;

public class codeforces_1437C {

  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);
    BufferedWriter writer = new BufferedWriter(
      new OutputStreamWriter(System.out)
    );
    for (int numCases = scanner.nextInt(); numCases > 0; numCases--) {
      int len = scanner.nextInt();
      int[] arr = new int[len];
      for(int i = 0; i < len; i++) {
    	  arr[i] = scanner.nextInt() - 1;
      }
      Arrays.sort(arr);
      int[][] DP = new int[len][len * 2];
      for (int i = 0; i < len * 2; i++) {
        DP[0][i] = Math.abs(i - arr[0]);
      }
      for (int i = 1; i < len; i++) {
        for (int index = i; index < len * 2; index++) {
          DP[i][index] = Integer.MAX_VALUE;
          int gap = Math.abs(index - arr[i]);
          int left = i - 1;
          int right = index - 1;
          for (int pointer = left; pointer <= right; pointer++) {
            DP[i][index] = Math.min(DP[i - 1][pointer] + gap, DP[i][index]);
          }
        }
      }
      int ans = Integer.MAX_VALUE;
      for (int i = len - 1; i < len * 2; i++) {
        ans = Math.min(ans, DP[len - 1][i]);
      }
      writer.write(ans + "\n");
    }
    writer.flush();
    scanner.close();
  }
}
