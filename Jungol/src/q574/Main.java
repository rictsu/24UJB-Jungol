package q574;

import java.util.Scanner;

public class Main {

	public static void lag(int[] B) {
		int re = 0;
		for (int j = 0; j < B.length; j++) {
			if (j > 0 && B[j] >= B[j - 1]) {
				re = B[j];
			} else if (B[0] >= B[1]) {
				re = B[0];
			}
		}
		System.out.println(re);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] A = new int[3];
		for (int i = 0; i < A.length; i++) {
			A[i] = sc.nextInt();

		}
		sc.close();
		lag(A);
	}
}
