package q9084;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int S = sc.nextInt();
		sc.close();
		for (int i = 0; i < S; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}System.out.println();
		}
	}

}
