package q596;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		int B = sc.nextInt();
		sc.close();
		if (A.length() < B) {
			for (int i = 1; i <= A.length(); i++) {
				System.out.print(A.charAt(A.length() - i));
			}
		} else {
			for (int i = 1; i <= B && i <= A.length(); i++) {
				System.out.print(A.charAt(A.length() - i));
			}
			;
		}
	}
}
