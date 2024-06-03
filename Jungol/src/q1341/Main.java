package q1341;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int e = sc.nextInt();
		sc.close();
		if (s >= e) {
			for (int j = s; j >= e; j--) {
				for (int i = 1; i <= 9; i++) {
					System.out.printf("%d * %d =%3d   ", j, i, j * i);
					if (i % 3 == 0) {
						System.out.println();
					}
				}
				System.out.println();
			}
		}
		if (s < e) {
			for (int j = s; j <= e; j++) {
				for (int i = 1; i <= 9; i++) {
					System.out.printf("%d * %d =%3d   ", j, i, j * i);
					if (i % 3 == 0) {
						System.out.println();
					}
				}
				System.out.println();
			}
		}
	}
}