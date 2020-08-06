package algo;

import java.util.Scanner;

/*
 * 대칭차집합.
 * https://www.acmicpc.net/problem/1269 
 */
public class Algo22 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] N = new int[2];
		N[0] = scan.nextInt();
		N[1] = scan.nextInt();
		int A[] = new int[N[0]];
		int B[] = new int[N[1]];
		for (int i = 0; i < N[0]; i++)
			A[i] = scan.nextInt();
		for (int i = 0; i < N[0]; i++)
			B[i] = scan.nextInt();
		soulution(A, B);
	}

	static int soulution(int[] A, int[] B) {
		int cnt = 0;
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < B.length; j++)
			{
				if (A[i] == B[j])
				{	
					cnt++;
					break;
				}
			}
		}
		System.out.println((A.length - cnt) + (B.length - cnt));
		return (0);
	}
}
