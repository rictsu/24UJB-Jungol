package q572;

import java.util.Scanner;

class Rectangle {
	private double AR;

	public double getAR() {
		return AR;
	}

	public void setAR(int r) {
		AR = r * r * 3.14;
	}

	public void print() {
		System.out.printf("%.2f", AR);
	}
}

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		sc.close();
		Rectangle A = new Rectangle();
		A.setAR(r);
		A.print();
	}

}
