package algo;

/*
 * https://www.acmicpc.net/problem/5532
 */
import java.util.Scanner;

public class Algo15_ {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N;
		N = scan.nextInt();
		int[][] stickers = new int[2][N];
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < N; j++) {
				stickers[i][j] = scan.nextInt();
			}
		}
		solution(stickers ,N);
	}

	static int solution(int[][] stickers, int N) {
		int sum1 = 0, sum2 = 0;

		for(int i = 0; i < N; i += 2)
		{
			sum1 += stickers[0][i];
			sum2 += stickers[1][i];
		}
		for(int i = 1; i < N; i += 2)
		{
			System.out.println(stickers[1][i]);
			sum1 += stickers[1][i];
			sum2 += stickers[0][i];
		}	
		
		System.out.println(sum1 + " " + sum2);
		return (0);
	}
}
