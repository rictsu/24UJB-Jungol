package q528;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		sc.close();

		if (a >= 4.0 && b >= 4.0) {
			System.out.println("A");
		} else {
			if (a >= 3.0 && b > 3.0) {
				System.out.println("B");
			} else {
				System.out.println("C");

			}
		}
	}
}