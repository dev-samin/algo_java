package algo;

import java.util.Scanner;

/*
 * https://www.acmicpc.net/problem/11123
 * 참고1 https://rebas.kr/808
 */
public class Algo23 {
	static boolean[][] check = new boolean[100][100];
	static int dx[] = { -1, 0, 1, 0 }, dy[] = { 0, 1, 0, -1 };
	static int H, W;
	static String[] grid;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		H = scan.nextInt();
		W = scan.nextInt();
		grid = new String[H];
		for (int i = 0; i < H; i++) {
			grid[i] = scan.next();

		}
		solution();
	}

	static void dfs(int x, int y) {
		check[x][y] = true;
		for (int i = 0; i < 4; i++) {
			int nx = x + dx[i], ny = y + dy[i];
			if (nx < 0 || nx >= H || ny < 0 || ny >= W)
				continue;
			if (!check[nx][ny] && grid[nx].charAt(ny) == '#')
				dfs(nx, ny);
		}
	}

	static int solution() {
		int ans = 0;
		for (int i = 0; i < H; i++) {
			for (int j = 0; j < W; j++) {
				if (!check[i][j] && grid[i].charAt(j) == '#') {
					dfs(i, j);
					ans += 1;
				}
			}
		}
		System.out.println(ans);
		return (0);
	}
}
