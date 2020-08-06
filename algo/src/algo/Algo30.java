package algo;

import java.util.LinkedList;
import java.util.Scanner;
/*
 * 놀라운 문자열
 * https://www.acmicpc.net/problem/1972
 */

public class Algo30 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str;
		str = scan.nextLine();
		solution(str);
	}

	static void solution(String str) {
		int len = str.length();
		LinkedList<String> list = new LinkedList<String>();
		String tmp = "";
		for (int i = 1; i < len; i++) {
			list.clear();
			for (int j = 0; j < len; j++) {
				tmp = "";
				if (i + j < len) {
					tmp += str.charAt(j);
					tmp += str.charAt(i + j);
					if (list.contains(tmp)) break;
					else list.add(tmp);					
				}
			}
			if (list.contains(tmp)) break;
		}
		if(list.contains(tmp))
			System.out.println(str + " is NOT surprising.");
		else
			System.out.println(str + " is surprising.");
	}
}
