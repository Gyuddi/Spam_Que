import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

// 상근이의 여행

public class BOJ_9372 {
	static ArrayList<Integer>[] list;
	static boolean[] visited;
	static int cnt;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int t = Integer.parseInt(br.readLine());
		
		while(t-- > 0) {
			st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			
			list = new ArrayList[n+1];
			visited = new boolean[n+1];
			cnt = 0;
			
			for(int i=1; i<n+1; i++) {
				list[i] = new ArrayList<>();
			}
			
			for(int i=0; i<m; i++) {
				st = new StringTokenizer(br.readLine());
				int s = Integer.parseInt(st.nextToken());
				int e = Integer.parseInt(st.nextToken());
				
				list[s].add(e);
				list[e].add(s);
			}
			
			DFS(1);
			
			sb.append(cnt).append("\n");
					
		}
		System.out.println(sb);

	}
	
	static void DFS(int n) {
		visited[n] = true;
		
		for(int i : list[n]) {
			if(!visited[i]) {
				cnt++;
				DFS(i);
			}
		}
		
	}
}
