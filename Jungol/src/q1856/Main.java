package q1856;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		sc.close();
		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				for (int j = 1; j <= m; j++) {
					System.out.print(j + m * i + " ");
				}
			} else {
				for (int j = 0; j < m; j++) {
					System.out.print(m * (i+1) -j + " ");
				}
				
			}System.out.println();
		}

	}
}
