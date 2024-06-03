package q557;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] A = new char[10];
		for (int i = 0; i < A.length; i++) {
			A[i] = sc.next().charAt(0);
		}
		sc.close();
		System.out.print(A[0] + " " + A[3] + " " + A[6]);
}}