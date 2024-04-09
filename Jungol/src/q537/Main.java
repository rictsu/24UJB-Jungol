package q537;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();
		int b = 0;
		int c = 0;
		while (b < a) {
			b++;
			c += b;

		}
		System.out.println(c);
	
	}

}
