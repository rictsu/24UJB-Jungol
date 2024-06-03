package q125;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();
		int j = 0;
		for (int i = 1; i <= a; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		while (++j <= a) {
			System.out.print(j + " ");
		}
		System.out.println();
		int k = 1;
		do {
			System.out.print(k + " ");

		} while (k++ < a);

	}
}
