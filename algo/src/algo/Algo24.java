package algo;

/*
 * https://www.acmicpc.net/problem/1731 
 */
import java.util.Scanner;

public class Algo24 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[] array = new int[N];
		for (int i = 0; i < N; i++)
		{
			array[i] = scan.nextInt();
		}
		System.out.println(solution(array, N));
	}
	
	static int solution(int[] array, int N)
	{
		if (array[1] - array[0] == array[2] - array[1]) 
			return (array[N -1] += (array[1] - array[0]));
		else
			return (array[N -1] *= (array[1] / array[0]));
	}
}