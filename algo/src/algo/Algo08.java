package algo;

/*
 * https://www.acmicpc.net/problem/1260
 */

import java.util.LinkedList;
import java.util.Scanner;

public class Algo08 {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		Scanner scan = new Scanner(System.in);
		String str;
		int x = 0;
		while(true)
		{
			str = scan.next();
			if(str.equals("push_front") || str.equals("push_back"))
				x = scan.nextInt();
			solution(list, str, x);
		}
	}
	
	static void solution(LinkedList<Integer> list, String str, int x)
	{
		int  answer = 0;
		if(str.equals("push_front"))
		{
			list.add(0,x);
			return ;
		}
		
		if(str.equals("push_back"))
		{
			list.add(list.size(), x);
			return ;
		}
		
		if(str.equals("pop_front"))
		{
			if (list.size() != 0)
			{
				answer = (list.get(0));
				list.remove(0);
			}
			else
				answer = -1;
		}
		
		if(str.equals("pop_back"))
		{
			if (list.size() != 0)
			{
				answer = (list.get(list.size() - 1));
				list.remove(list.size() -1);
			}
			else
				answer = -1;		
		}
		
		if(str.equals("size"))
		{
			answer = list.size();
		}
		
		if(str.equals("empty"))
		{
			if(list.size() == 0)
				answer = 1;
			else
				answer = 0; 
		}
		
		if(str.equals("front"))
		{
			if (list.size() != 0)
			{
				answer = (list.get(0));
			}
			else
				answer = -1;	
		}
		
		if(str.equals("back"))
		{
			if (list.size() != 0)
			{
				answer = (list.get(list.size() - 1));
			}
			else
				answer = -1;
		}
		System.out.println(answer);
	}

}
