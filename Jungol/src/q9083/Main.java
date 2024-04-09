package q9083;

import java.util.Scanner;

public class Main {

	public static void plus(int num) {
		num += 10;
		System.out.println("10큰 수 : " + num);
	}

	public static void minus(int num) {
		num -= 10;
		System.out.println("10작은수 : " + num);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();
		plus(a);
		minus(a);
	}
}
