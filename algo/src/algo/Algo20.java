package algo;

import java.util.Arrays;
import java.util.Scanner;

/*
 * https://www.acmicpc.net/problem/5543
 */
public class Algo20 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int burger[] = new int[3];
		int soda[] = new int[2];
		for(int i = 0; i < 3; i++) 
			burger[i] = scan.nextInt();
		for(int i = 0; i < 2; i++) 
			soda[i] = scan.nextInt();
		System.out.println(solution(burger, soda));
	}
	
	static int solution(int[] burger, int[] soda)
	{
		Arrays.sort(burger);
		Arrays.sort(soda);;
		return (burger[0] + soda[0] - 50);
	}

}
