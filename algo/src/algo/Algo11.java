package algo;

import java.util.LinkedList;
import java.util.Scanner;

/*
 * https://www.acmicpc.net/problem/2164
 */
public class Algo11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		solution(N);
	}
	
	static int solution(int N) 
	{
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		for(int i = N; i > 0; i--)
			list.add(i);
			
		while(list.size() != 1)
		{
			list.remove(list.size() - 1);
			list.add(0, list.get(list.size() - 1));
			list.remove(list.size() - 1);
		}
		System.out.println(list.get(0));
		return (0);
	}
	
}
