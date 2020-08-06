package algo;

import java.util.Scanner;

/*
 * https://www.acmicpc.net/problem/1309
 * 참고1 반문문사용 http://isukorea.com/blog/home/waylight3/77
 * 참고2 자바 https://jaesungbong.tistory.com/29
 * 다이나믹 프로그래밍 https://limdongjin.github.io/algorithms/DP.html
 */

public class Algo25 {

	public static void main(String[] args) {
		solution1();
	}

	static void solution1() {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[][] dp = new int[n + 1][3];		
		dp[1][0] = dp[1][1] = dp[1][2] = 1;
		
		for (int i = 2; i <= n; i++) {
			dp[i][0] = (dp[i - 1][0] + dp[i - 1][1] + dp[i - 1][2]) % 9901;
			dp[i][1] = (dp[i - 1][0] + dp[i - 1][2]) % 9901;
			dp[i][2] = (dp[i - 1][0] + dp[i - 1][1]) % 9901;
		}
		System.out.println((dp[n][0] + dp[n][1] +dp[n][2]) % 9901 );
	}
}
