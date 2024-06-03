package q618;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Info {
	private String name;
	private int height;
	private double weight;

	public Info(String name, int height, double weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}

	public void print() {
		System.out.println(name + " " + height + " " + weight);
	}

	public double getHegiht() {
		return height;
	}
}

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		Info arr[] = new Info[st.countTokens()];
		int count = 0;
		while (st.hasMoreTokens()) {
			arr[count] = new Info(st.nextToken(), Integer.parseInt(st.nextToken()), Double.parseDouble(st.nextToken()));
		}
		for (int i = 0; i < count; i++) {
			System.out.println(arr[i].getHegiht());
		}
	}
}
