package q1840;

import java.util.Scanner;

public class Main {
	static int[][] board;
	static int[][] visited;
	static int height;
	static int width;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		height = sc.nextInt();
		width = sc.nextInt();
		board = new int[height][width];
		visited = new int[height][width];

		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				board[i][j] = sc.nextInt();
			}
		}
		sc.close();
		show_board();
		show_visited();
		int count = 0;
		int time = 0;
		do {
			visit(0, 0);
			show_board();
			show_visited();
			melt();
			initialVisited();
			time++;
		} while (is_there_cheese());

		System.out.println(time);
	}

	public static void show_board() {
		System.out.println("---------Board ---------");
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void show_visited() {
		System.out.println("--------Visited --------");
		for (int i = 0; i < visited.length; i++) {
			for (int j = 0; j < visited[i].length; j++) {
				System.out.print(visited[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static boolean is_there_cheese() {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				if (board[i][j] == 1) {
					return true;
				}
			}
		}
		return false;
	}

	public static void visit(int y, int x) {
		visited[y][x] = 1;
		if (board[y][x] == 1) {
			board[y][x] = 2;
			return;
		}
		// 위로 이동.
		if (y - 1 >= 0 && visited[y - 1][x] == 0) {
			visit(y - 1, x);
		}
		// 아래로 이동.
		if (y + 1 < height && visited[y + 1][x] == 0) {
			visit(y + 1, x);
		}
		// 좌로 이동.

		if (x - 1 >= 0 && visited[y][x - 1] == 0) {
			visit(y, x - 1);
		}
		// 우로 이동
		if (x + 1 < width && visited[y][x + 1] == 0) {
			visit(y, x + 1);
		}
	}

	public static void melt() {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				if (board[i][j] == 2) {
					board[i][j] = 0;
				}
			}
		}
	}

	public static void initialVisited() {
		for (int i = 0; i < visited.length; i++) {
			for (int j = 0; j < visited[i].length; j++) {
				visited[i][j] = 0;
			}
		}
	}
}
