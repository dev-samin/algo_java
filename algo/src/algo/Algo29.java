package algo;

import java.util.Scanner;

/*
 * 크로스워드 만들기
 * https://www.acmicpc.net/problem/2804
 */
public class Algo29 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str1 = scan.next();
		String str2 = scan.next();
		solution(str1, str2);
	}
	
	static int solution(String str1, String str2)
	{
		int n = str1.length();
		int m = str2.length();
		String[] array = new String[m];
		int	n_index = 0;
		int	m_index = 0;
		
		for (int i = 0; i < array.length; i++) 
			array[i] = "";
		
		for (int i = 0; i < n; i++)
		{
			for (int j = 0; j < m; j++)
			{
				if(str1.charAt(i) == str2.charAt(j))
				{
					n_index = i;
					m_index = j;
					break;
				}
			}
			if(str1.charAt(n_index) == str2.charAt(m_index))
				break;
		}
		
		for (int i = 0; i < m; i++)
		{
			for (int j = 0; j < n; j++)
			{
				if (i == m_index)
					array[i] = str1;
				else if (j == n_index)
					array[i] += str2.charAt(i);
				else
					array[i] += '.';
			}
		}

		for (int i = 0; i < array.length; i++)
			System.out.println(array[i]);
		
		return (0);
	}
}
