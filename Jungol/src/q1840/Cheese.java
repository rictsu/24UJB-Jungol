package q1840;

import java.util.Scanner;

public class Cheese {
   static int dx[] = {0, 0, -1, 1};
   static int dy[] = {1, -1, 0, 0};
   static int n, m;
   static int[][] Cheese;
   static boolean[][] visited;
   static int CheeseCnt;
   
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      n = sc.nextInt();
      m = sc.nextInt();
      
      Cheese = new int[n][m];
      for(int i = 0; i < n; i ++) {
         for(int j = 0; j < m; j++) {
            Cheese[i][j] = sc.nextInt();
            if(Cheese[i][j] == 1) {
               CheeseCnt ++;
            }
         }
      }
      int time = 0;
      int LastCheeseCnt = 0;
      while(CheeseCnt != 0) {
         time ++;
         LastCheeseCnt = CheeseCnt;
         visited = new boolean[n][m];
         dfs(0, 0);
      }
      System.out.println(time);
      System.out.println(LastCheeseCnt);
      sc.close();
   }
   
//   public static void bfs() {
//      Queue<int []> queue = new LinkedList<>();
//      queue.offer(new int[] {0, 0}); // 큐에 시작지점 추가
//      visited[0][0] = true; // 시작 지점 상태표시
//      
//      while(!queue.isEmpty()) {
//         int[] current = queue.poll(); // 현재 지점을 큐에서 꺼내옴
//         int x = current[0];
//         int y = current[1];
//         
//         for(int i = 0; i < 4; i ++) {
//            int nx = x + dx[i];
//            int ny = y + dy[i];
//            
//            // 배열 범위내에 있으면서 탐색하지 않았을 때
//            if(nx >= 0 && ny >= 0 && nx < n && ny < m && !visited[nx][ny]) {
//               visited[nx][ny] = true;
//               if(Cheese[nx][ny] == 0) {  // 외부공기 일때
//                  queue.offer(new int[] {nx, ny});
//               } else if(Cheese[nx][ny] == 1) { // 치즈일때
//                  CheeseCnt --;
//                  Cheese[nx][ny] = 0;
//               }
//            }
//         }
//      }
//   }
   
   public static void dfs(int x, int y) {
      visited[x][y] = true;
      
      for(int i = 0; i < 4; i ++) {
         int nx = x + dx[i];
         int ny = y + dy[i];
         
         if (nx >= 0 && ny >= 0 && nx < n && ny < m && !visited[nx][ny]) {
            visited[nx][ny] = true;
            if(Cheese[nx][ny] == 0) {
               dfs(nx, ny);
            }else if(Cheese[nx][ny] == 1) {
               CheeseCnt --;
               Cheese[nx][ny] = 0;
            }
         }
      }
   }
}