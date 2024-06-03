package q540;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0;
		while (a != -1) {
			a = sc.nextInt();
			if (a % 3 == 0) {
				System.out.println(a / 3);
			}

		}
		sc.close();
	}
}
