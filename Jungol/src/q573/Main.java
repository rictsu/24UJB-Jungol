package q573;

import java.util.Scanner;

public class Main {
	public static int Area;

	public static void AreaRectangle(int n) {
		for (int i = 1; i <= n * n; i++) {
			System.out.print(i + " ");
			if (i % n == 0) {
				System.out.println();
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		AreaRectangle(n);

	}
}
