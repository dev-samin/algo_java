package algo;

import java.util.Scanner;

/*
 * https://www.acmicpc.net/problem/17503
 */
class beer {
	int prefer;
	int level;
}

public class Algo35_ {

	public static void main(String[] args) {
		solution();
	}

	static void solution() {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int k = scan.nextInt();
		beer[] beer = new beer[k];
		for (int i = 0; i < k; i++) {
			beer[i] = new beer();
			beer[i].prefer = scan.nextInt();
			beer[i].level = scan.nextInt();
		}
		//m을 만족하는 최소 레
		
	}
}
