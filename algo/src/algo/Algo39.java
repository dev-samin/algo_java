package algo;

/*
 * https://www.acmicpc.net/problem/4419 
 */
import java.util.LinkedList;
import java.util.Scanner;

public class Algo39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solution();
	}

	static void solution() {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String[][] candidate = new String[n][2];
		int beg = 0;
		LinkedList<Integer>[] list = new LinkedList[n];
		int[] check = new int[n];
		for (int i = 0; i < n; i++) {
			candidate[i][0] = scan.next();
			candidate[i][1] = scan.nextLine();
		}
		for (int i = 0; i < 1000; i++) {
			list[i] = new LinkedList<Integer>();
			for (int j = 0; j < n; j++) {
				 beg = scan.nextInt();
				 if (beg == 0) break;
				 list[i].add(beg);
			}
			if (beg == 0) break;
		}
		System.out.println(list[1].get(1));
		for (int i = 0; i < list.length; i++ ) {
			for (int j = 0; j < n; j++) {
				System.out.println(j);
				
			}
		}
		
		
//		System.out.println(check[0]);
		//과반수로 첫번째로 선택된후보
		//가장표가 낮은 후보 탈락
		//탈락된 표에서 선호 높은후보에게 + 1
	}
}