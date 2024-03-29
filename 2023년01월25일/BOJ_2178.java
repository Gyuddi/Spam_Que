package dfs_bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_2178 {
	static int n, m;
	static int[] dx = {-1, 0, 1, 0};
	static int[] dy = {0, 1, 0, -1};
	static int[][] board, dis;
	
	class Point{
		public int x, y;
		Point(int x, int y){
			this.x = x;
			this.y = y;
		}
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		board = new int[n+1][m+1];
		dis = new int[n+1][m+1];
		
		for(int i=1; i<=n; i++) {
			String str = br.readLine();
			for(int j=1; j<=m; j++) {
				board[i][j] = str.charAt(j-1) - '0';
			}
		}
		
		dis[1][1] = 1;
		BFS(1,1);
		
		System.out.println(dis[n][m]);
	}
	
	static void BFS(int x, int y) {
		Queue<Point> q = new LinkedList<>();
		board[x][y] = 0;
		q.offer(new Point(x, y));
		
		while(!q.isEmpty()) {
			Point tmp = q.poll();
			for(int i=0; i<4; i++) {
				int nx = tmp.x + dx[i];
				int ny = tmp.y + dy[i];
				
				if(nx>=1 && nx<=n && ny>=1 && ny<=m && board[nx][ny]==1) {
					board[nx][ny] = 0;
					q.offer(new Point(nx, ny));
					dis[nx][ny] = dis[tmp.x][tmp.y] + 1; 
				}
			}
		}
	} 
	
}
