package algo;

/*
 * https://www.acmicpc.net/problem/5532
 */

import java.util.Scanner;

public class Algo16 {

	public static void main(String[] args) {
		System.out.println(solution());
	}
	
	static int solution()
	{
		Scanner scan = new Scanner(System.in);
		int L, A, B, C, D;
		int n1, n2;
		
		L = scan.nextInt();
		A = scan.nextInt();
		B = scan.nextInt();
		C = scan.nextInt();
		D = scan.nextInt();
		n1 = A / C;
		n2 = B / D;
		n1 += A % C >0 ? 1 : 0;
		n2 += B % D >0 ? 1 : 0;
		if (n1 < n2)
			return (L - n2);
		else
			return (L - n1);
	}
}