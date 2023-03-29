import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

// 숫자판 점프
public class BOJ_2210 {
	static int[] dx = {0, 1, 0, -1};
	static int[] dy = {1, 0, -1, 0};
	static int[][] board;
	static Set<String> set;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		board = new int[5][5];
		set = new HashSet<>();
		
		for(int i=0; i<5; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<5; j++) {
				board[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				DFS(Character.toString(board[i][j]), i, j);
			}
		}
		
		System.out.println(set.size());
		
	}
	
	static void DFS(String str, int x, int y) {
		if(str.length() == 6) {
			set.add(str);
		}else {
			for(int i=0; i<4; i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];
				
				if(nx>=0 && nx<5 && ny>=0 && ny<5) {
					DFS(str+board[nx][ny], nx, ny);
				}
			}
		}
	}
}
