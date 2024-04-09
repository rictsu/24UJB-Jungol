package q559;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double[] A = { 85.6, 79.5, 83.1, 80.0, 78.2, 75.0 };
		Scanner sc = new Scanner(System.in);
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();
		System.out.printf("%.1f", (double) A[b - 1] + A[c - 1]);

	}

}
