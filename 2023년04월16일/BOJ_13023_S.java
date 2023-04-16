import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

//ABCDE
public class BOJ_13023 {
	static ArrayList<Integer>[] list;
	static boolean[] visited;
	static int n;
	static boolean flag;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		// 사람 수 n, 관계 수 m
		n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		list = new ArrayList[n];
		for(int i=0; i<n; i++) {
			list[i] = new ArrayList<>();
		}
		
		visited = new boolean[n];
		
		for(int i=0; i<m; i++) {
			st = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			
			list[s].add(e);
			list[e].add(s);
		}
		
		flag = false;
		int result = 0;
		for(int i=0; i<n; i++) {
			visited[i] = true;
			DFS(0, i);
			visited[i] = false;
			if(flag) {
				result = 1;
				break;
			}
		}
		
		System.out.println(result);
		
	}
	
	static void DFS(int dept, int now) {
		if(dept >= 4) {
			flag = true;
			return;
		}else {
			for(int n : list[now]) {
				if(!visited[n]) {
					visited[n] = true;
					DFS(dept+1, n);
					visited[n] = false;
				}	
			}
		}
	}
}
