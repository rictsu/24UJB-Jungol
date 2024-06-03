package q536;

public class Main {

	public static void main(String[] args) {
		int i = 1;
		for (i = 1; i <= 15; i++) {
			System.out.print(i);
			if(i<= 14) {
				System.out.print(" ");
			}
		}
		System.out.println("");
		int j = 1;
		while (true) {
			System.out.print(j + " ");
			if (j == 14)
				break;
			j = j + 1;
		}
		System.out.print(j+1);
		System.out.println();
		int k = 1;
		do {
			System.out.print(k++ + " ");
		} while (k <= 15);

	}

}
