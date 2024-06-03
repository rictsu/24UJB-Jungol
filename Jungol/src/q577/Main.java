package q577;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		result(a, b);
	}

	public static void result(int inpa, int inpb) {
		int result1 = 0;
		int result2 = 0;
		if (inpa > inpb) {
			result1 = inpa / 2;
			result2 = inpb * 2;
		} else {
			result1 = inpa * 2;
			result2 = inpb / 2;
		}
		System.out.println(result1 + " " + result2);
	}

}
