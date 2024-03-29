package algo;

import java.util.LinkedList;
import java.util.Scanner;

/*
 * https://www.acmicpc.net/problem/2960
 */
public class Algo13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		LinkedList<Integer> list = new LinkedList<Integer>();
		int N = scan.nextInt();
		int K = scan.nextInt();
		System.out.println(solutiion(list, N, K));
	}

	static int solutiion(LinkedList<Integer> list, int N, int K) {
		int p = 2;
		int cnt = 0;
		int num = 0;

		for (int i = 2; i <= N; i++)
			list.add(i);
		while (cnt != K) {
			for (int i = 1; p * i <= N; i++) {
				if (cnt == K) break;
				if (i == 1) p = list.get(0);
				if (list.indexOf(p * i) != -1) {
					num = list.get(list.indexOf(p * i));
					list.remove(list.indexOf(p * i));
					cnt++;
				};
			}
		}
		return (num);
	}
}
