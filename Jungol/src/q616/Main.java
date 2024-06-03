package q616;

import java.util.Scanner;

class Triangle {
	private Point[] p;

	public Triangle() {
		p = new Point[3];
	}

	public void setPoint(int idx, Point point) {
		p[idx] = point;
	}

}

class Point {
	int x;
	int y;

	public Point(int x, int y) {
	}

}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Triangle tri = new Triangle();
		for (int i = 0; i < 3; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			Point p = new Point(x, y);
			tri.setPoint(i, p);
		}
		sc.close();
System.out.println();	}

}
